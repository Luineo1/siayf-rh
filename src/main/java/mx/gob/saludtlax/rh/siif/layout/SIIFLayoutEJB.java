/*
 * SIIFLayoutEJB.java
 * Creado el 26/06/2016 01:09:15 AM
 * 
 */

package mx.gob.saludtlax.rh.siif.layout;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.google.common.io.Files;
import mx.gob.saludtlax.rh.siif.EstructuraNominaDatDTO;
import mx.gob.saludtlax.rh.siif.EstructuraNominaTrailersDTO;
import mx.gob.saludtlax.rh.siif.EstructuraSeguroPopularDTO;
import mx.gob.saludtlax.rh.siif.reportarcontratos.EstructuraContratosDatDTO;
import mx.gob.saludtlax.rh.siif.reportarcontratos.EstructuraContratosTrailersDTO;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 * @author Zaid Perez
 */
@Stateless
public class SIIFLayoutEJB implements SIIFLayout {

    private static final long serialVersionUID = 721701807303054917L;
    private static final Logger LOGGER = Logger.getLogger(SIIFLayoutEJB.class.getName());

    @Inject
    private CSVService csvService;
    @Inject
    private SIIFEncabezadoService encabezadoService;
    @Inject
    private SIIFLayoutService ls;
    @Inject
    private SIIFTraService traService;
    @Inject
    private SIIFDatService datService;

    @Override
    public byte[] getLayoutComoZip(String periodo, int anyo) {
        SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();

        List<SIIFEncabezadoDTO> listaDetalles = this.encabezadoService.generarEncabezado(periodo, anyo);
        byte[] encabezadoXLSX = encabezadoExcel.generar(listaDetalles);

        try {
            File file = File.createTempFile("layout", ".zip");
            FileOutputStream fos = new FileOutputStream(file);

            try (ZipOutputStream zos = new ZipOutputStream(fos)) {
                ZipEntry zeEncabezado = new ZipEntry("encabezado.xlsx");
                zos.putNextEntry(zeEncabezado);
                zos.write(encabezadoXLSX);
                zos.closeEntry();

                for (SIIFEncabezadoDTO encabezadoDetalle : listaDetalles) {
                    if (null == encabezadoDetalle.getIdCuentaBancaria()) {

                        int idEncabezado = encabezadoDetalle.getIdSIIFEncabezado();
                        int idBitacora = encabezadoDetalle.getIdSIIFBitacora();
                        String nombramiento = encabezadoDetalle.getNombramiento();

                        String carpeta = encabezadoDetalle.getIdNomina() + "/";
                        //System.out.println("idEncabezado:::"+idEncabezado);
                        LOGGER.debug("idEncabezado:::" + +idEncabezado);

                        List<DatosPersonalesDTO> datosPersonales = this.ls.generarDatosPersonales(idEncabezado);
                        byte[] datosPersonalesCSV = this.csvService.getAsCSV(datosPersonales, DatosPersonalesDTO.class);

                        List<DatosLaboralesDTO> datosLaborales = this.ls.generarDatosLaborales(idEncabezado);//Pendiente de adecuar
                        byte[] datosLaboralesCSV = this.csvService.getAsCSV(datosLaborales, DatosLaboralesDTO.class);

                        List<DetalleNominaDTO> detalleNomina = this.ls.generarDetalleNomina(idEncabezado, idBitacora);
                        byte[] detalleNominaCSV = this.csvService.getAsCSV(detalleNomina, DetalleNominaDTO.class);

                        List<DetallePagoNominaDTO> detallePagoNomina = this.ls.generarDetallePagoNomina(idEncabezado, idBitacora);
                        byte[] detallePagoNominaCSV = this.csvService.getAsCSV(detallePagoNomina, DetallePagoNominaDTO.class);

                        ZipEntry zePersonales = new ZipEntry(carpeta + "datos-personales.csv");
                        zos.putNextEntry(zePersonales);
                        zos.write(datosPersonalesCSV);
                        zos.closeEntry();

                        ZipEntry zeLaborales = new ZipEntry(carpeta + "datos-laborales.csv");
                        zos.putNextEntry(zeLaborales);
                        zos.write(datosLaboralesCSV);
                        zos.closeEntry();

                        ZipEntry zeDetalleNomina = new ZipEntry(carpeta + "detalle-nomina.csv");
                        zos.putNextEntry(zeDetalleNomina);
                        zos.write(detalleNominaCSV);
                        zos.closeEntry();

                        ZipEntry zeDetallePagoNomina = new ZipEntry(carpeta + "detalle-pago-nomina.csv");
                        zos.putNextEntry(zeDetallePagoNomina);
                        zos.write(detallePagoNominaCSV);
                        zos.closeEntry();
                    } else {
                        //Si Nomina Contrato
                        //if(encabezadoDetalle.getIdCuentaBancaria()==4 || encabezadoDetalle.getIdCuentaBancaria()==7){
                        switch (encabezadoDetalle.getIdCuentaBancaria()) {
                            case 2: {
                                int idEncabezado = encabezadoDetalle.getIdSIIFEncabezado();
                                int idBitacora = encabezadoDetalle.getIdSIIFBitacora();
                                int idNomina = encabezadoDetalle.getIdNomina();
                                String carpeta = encabezadoDetalle.getIdNomina() + "/";
                                List<DatosPersonalesDTO> datosPersonales = this.ls.generarDatosPersonalesContrato(idEncabezado);
                                byte[] datosPersonalesCSV = this.csvService.getAsCSV(datosPersonales, DatosPersonalesDTO.class);
                                List<DatosLaboralesDTO> datosLaborales = this.ls.generarDatosLaboralesContrato(idEncabezado);
                                byte[] datosLaboralesCSV = this.csvService.getAsCSV(datosLaborales, DatosLaboralesDTO.class);
                                List<DetalleNominaDTO> detalleNomina = this.ls.generarDetalleContrato(idEncabezado, idBitacora);
                                byte[] detalleNominaCSV = this.csvService.getAsCSV(detalleNomina, DetalleNominaDTO.class);
                                List<DetallePagoNominaDTO> detallePagoNomina = this.ls.generarDetallePagoContrato(idEncabezado, idBitacora);
                                byte[] detallePagoNominaCSV = this.csvService.getAsCSV(detallePagoNomina, DetallePagoNominaDTO.class);
                                ZipEntry zePersonales = new ZipEntry(carpeta + "pp_" + idNomina + ".csv");
                                zos.putNextEntry(zePersonales);
                                zos.write(datosPersonalesCSV);
                                zos.closeEntry();
                                ZipEntry zeLaborales = new ZipEntry(carpeta + "pl_" + idNomina + ".csv");
                                zos.putNextEntry(zeLaborales);
                                zos.write(datosLaboralesCSV);
                                zos.closeEntry();
                                ZipEntry zeDetalleNomina = new ZipEntry(carpeta + "dn_" + idNomina + ".csv");
                                zos.putNextEntry(zeDetalleNomina);
                                zos.write(detalleNominaCSV);
                                zos.closeEntry();
                                ZipEntry zeDetallePagoNomina = new ZipEntry(carpeta + "dp_" + idNomina + ".csv");
                                zos.putNextEntry(zeDetallePagoNomina);
                                zos.write(detallePagoNominaCSV);
                                zos.closeEntry();
                                break;
                            } // Si Nomina 610 - X00
                            case 5:
                            case 6: {
                                int idEncabezado = encabezadoDetalle.getIdSIIFEncabezado();
                                int idBitacora = encabezadoDetalle.getIdSIIFBitacora();
                                // String nombramiento = encabezadoDetalle.getNombramiento();
                                String carpeta = encabezadoDetalle.getIdNomina() + "/";
                                List<DatosPersonalesDTO> datosPersonales = this.ls.generarDatosPersonales(idEncabezado);
                                byte[] datosPersonalesCSV = this.csvService.getAsCSV(datosPersonales, DatosPersonalesDTO.class);
                                //List<DatosLaboralesDTO> datosLaborales = ls.generarDatosLaborales(idEncabezado, nombramiento);
                                List<DatosLaboralesDTO> datosLaborales = this.ls.generarDatosLaborales(idEncabezado);
                                byte[] datosLaboralesCSV = this.csvService.getAsCSV(datosLaborales, DatosLaboralesDTO.class);
                                List<DetalleNominaDTO> detalleNomina = this.ls.generarDetalleNomina610(idEncabezado, idBitacora);
                                byte[] detalleNominaCSV = this.csvService.getAsCSV(detalleNomina, DetalleNominaDTO.class);
                                List<DetallePagoNominaDTO> detallePagoNomina = this.ls.generarDetallePagoNomina610(idEncabezado, idBitacora);
                                byte[] detallePagoNominaCSV = this.csvService.getAsCSV(detallePagoNomina, DetallePagoNominaDTO.class);
                                ZipEntry zePersonales = new ZipEntry(carpeta + "datos-personales.csv");
                                zos.putNextEntry(zePersonales);
                                zos.write(datosPersonalesCSV);
                                zos.closeEntry();
                                ZipEntry zeLaborales = new ZipEntry(carpeta + "datos-laborales.csv");
                                zos.putNextEntry(zeLaborales);
                                zos.write(datosLaboralesCSV);
                                zos.closeEntry();
                                ZipEntry zeDetalleNomina = new ZipEntry(carpeta + "detalle-nomina.csv");
                                zos.putNextEntry(zeDetalleNomina);
                                zos.write(detalleNominaCSV);
                                zos.closeEntry();
                                ZipEntry zeDetallePagoNomina = new ZipEntry(carpeta + "detalle-pago-nomina.csv");
                                zos.putNextEntry(zeDetallePagoNomina);
                                zos.write(detallePagoNominaCSV);
                                zos.closeEntry();
                                break;
                            }
                            default: {
                                int idEncabezado = encabezadoDetalle.getIdSIIFEncabezado();
                                int idBitacora = encabezadoDetalle.getIdSIIFBitacora();
                                //String nombramiento = encabezadoDetalle.getNombramiento();
                                String carpeta = encabezadoDetalle.getIdNomina() + "/";
                                List<DatosPersonalesDTO> datosPersonales = this.ls.generarDatosPersonales(idEncabezado);
                                byte[] datosPersonalesCSV = this.csvService.getAsCSV(datosPersonales, DatosPersonalesDTO.class);
                                //List<DatosLaboralesDTO> datosLaborales = ls.generarDatosLaborales(idEncabezado, nombramiento);
                                List<DatosLaboralesDTO> datosLaborales = this.ls.generarDatosLaborales(idEncabezado);
                                byte[] datosLaboralesCSV = this.csvService.getAsCSV(datosLaborales, DatosLaboralesDTO.class);
                                List<DetalleNominaDTO> detalleNomina = this.ls.generarDetalleNomina(idEncabezado, idBitacora);
                                byte[] detalleNominaCSV = this.csvService.getAsCSV(detalleNomina, DetalleNominaDTO.class);
                                List<DetallePagoNominaDTO> detallePagoNomina = this.ls.generarDetallePagoNomina(idEncabezado, idBitacora);
                                byte[] detallePagoNominaCSV = this.csvService.getAsCSV(detallePagoNomina, DetallePagoNominaDTO.class);
                                ZipEntry zePersonales = new ZipEntry(carpeta + "datos-personales.csv");
                                zos.putNextEntry(zePersonales);
                                zos.write(datosPersonalesCSV);
                                zos.closeEntry();
                                ZipEntry zeLaborales = new ZipEntry(carpeta + "datos-laborales.csv");
                                zos.putNextEntry(zeLaborales);
                                zos.write(datosLaboralesCSV);
                                zos.closeEntry();
                                ZipEntry zeDetalleNomina = new ZipEntry(carpeta + "detalle-nomina.csv");
                                zos.putNextEntry(zeDetalleNomina);
                                zos.write(detalleNominaCSV);
                                zos.closeEntry();
                                ZipEntry zeDetallePagoNomina = new ZipEntry(carpeta + "detalle-pago-nomina.csv");
                                zos.putNextEntry(zeDetallePagoNomina);
                                zos.write(detallePagoNominaCSV);
                                zos.closeEntry();
                                break;
                            }
                        }
                    }
                }
            }

            byte[] bytes = Files.toByteArray(file);
            file.delete();
            return bytes;
        } catch (IOException ex) {
            LOGGER.error(null, ex);
            return null;
        }
    }

    @Override
    public byte[] getLayoutComoZipRH(Integer idProductoNomina) {
        SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();

        List<SIIFEncabezadoDTO> listaDetalles = this.encabezadoService.consultarEncabezadoRH(idProductoNomina);
        byte[] encabezadoXLSX = encabezadoExcel.generar(listaDetalles);

        try {
            File file = File.createTempFile("layout", ".zip");
            FileOutputStream fos = new FileOutputStream(file);

            try (ZipOutputStream zos = new ZipOutputStream(fos)) {
                ZipEntry zeEncabezado = new ZipEntry("encabezado.xlsx");
                zos.putNextEntry(zeEncabezado);
                zos.write(encabezadoXLSX);
                zos.closeEntry();

                for (SIIFEncabezadoDTO encabezadoDetalle : listaDetalles) {

                    String carpeta = encabezadoDetalle.getIdNomina() + "/";
                    int idNomina = encabezadoDetalle.getIdNomina();
                    int idPrograma = encabezadoDetalle.getIdNombramiento();
                    //System.out.println("idEncabezado:::"+idEncabezado);
                    LOGGER.debug("idProductoNomina:::" + idProductoNomina + "idProductoNomina:::" + idNomina);
                    List<DatosPersonalesDTO> datosPersonales = null;
                    if (idPrograma == 23 || idPrograma == 27) {
                        datosPersonales = this.ls.generarDatosPersonalesRH(idProductoNomina, idPrograma);
                    } else {
                        datosPersonales = this.ls.generarDatosPersonalesRhCont(idProductoNomina, idPrograma);
                    }
                    byte[] datosPersonalesCSV = this.csvService.getAsCSV(datosPersonales, DatosPersonalesDTO.class);

                    List<DatosLaboralesDTO> datosLaborales = this.ls.generarDatosLaboralesRH(idProductoNomina);//Pendiente de adecuar
                    byte[] datosLaboralesCSV = this.csvService.getAsCSV(datosLaborales, DatosLaboralesDTO.class);

                    List<DetalleNominaDTO> detalleNomina = this.ls.generarDetalleNominaRH(idProductoNomina);
                    byte[] detalleNominaCSV = this.csvService.getAsCSV(detalleNomina, DetalleNominaDTO.class);

                    List<DetallePagoNominaDTO> detallePagoNomina = this.ls.generarDetallePagoNominaRH(idProductoNomina);
                    byte[] detallePagoNominaCSV = this.csvService.getAsCSV(detallePagoNomina, DetallePagoNominaDTO.class);

                    ZipEntry zePersonales = new ZipEntry(carpeta + "datos-personales.csv");
                    zos.putNextEntry(zePersonales);
                    zos.write(datosPersonalesCSV);
                    zos.closeEntry();

                    ZipEntry zeLaborales = new ZipEntry(carpeta + "datos-laborales.csv");
                    zos.putNextEntry(zeLaborales);
                    zos.write(datosLaboralesCSV);
                    zos.closeEntry();

                    ZipEntry zeDetalleNomina = new ZipEntry(carpeta + "detalle-nomina.csv");
                    zos.putNextEntry(zeDetalleNomina);
                    zos.write(detalleNominaCSV);
                    zos.closeEntry();

                    ZipEntry zeDetallePagoNomina = new ZipEntry(carpeta + "detalle-pago-nomina.csv");
                    zos.putNextEntry(zeDetallePagoNomina);
                    zos.write(detallePagoNominaCSV);
                    zos.closeEntry();

                }
            }

            byte[] bytes = Files.toByteArray(file);
            file.delete();
            return bytes;
        } catch (IOException ex) {
            LOGGER.error(null, ex);
            return null;
        }
    }

    @Override
    public byte[] getLayoutFinalComoZip(String quincena, int anyo) {
        SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();

        List<SIIFEncabezadoDTO> listaDetalles = this.encabezadoService.consultarEncabezadoFinal(quincena, anyo);
        LOGGER.debug("Encabezado Service:::" + listaDetalles.size());
        byte[] encabezadoXLSX = encabezadoExcel.generarFinal(listaDetalles);

        try {
            File file = File.createTempFile("layout", ".zip");
            FileOutputStream fos = new FileOutputStream(file);

            try (ZipOutputStream zos = new ZipOutputStream(fos)) {
                ZipEntry zeEncabezado = new ZipEntry("encabezado.xlsx");
                zos.putNextEntry(zeEncabezado);
                zos.write(encabezadoXLSX);
                zos.closeEntry();

                for (SIIFEncabezadoDTO encabezadoDetalle : listaDetalles) {
                    int idCuentaBancaria = encabezadoDetalle.getIdCuentaBancaria();
                    int idTipoNomina = encabezadoDetalle.getIdTipoNomina();
                    String idTipoEmisionNomina = encabezadoDetalle.getIdTipoEmisionNomina();

                    String carpeta = encabezadoDetalle.getIdNomina() + "/";

                    List<DatosPersonalesDTO> datosPersonales = this.ls.generarDatosPersonalesFinal(idCuentaBancaria, idTipoNomina, idTipoEmisionNomina);
                    byte[] datosPersonalesCSV = this.csvService.getAsCSV(datosPersonales, DatosPersonalesDTO.class);

                    List<DatosLaboralesDTO> datosLaborales = this.ls.generarDatosLaboralesFinal(idCuentaBancaria, idTipoNomina, idTipoEmisionNomina);
                    byte[] datosLaboralesCSV = this.csvService.getAsCSV(datosLaborales, DatosLaboralesDTO.class);

                    List<DetalleNominaDTO> detalleNomina = this.ls.generarDetalleNominaFinal(idCuentaBancaria, idTipoNomina, idTipoEmisionNomina);
                    byte[] detalleNominaCSV = this.csvService.getAsCSV(detalleNomina, DetalleNominaDTO.class);

                    List<DetallePagoNominaDTO> detallePagoNomina = this.ls.generarDetallePagoNominaFinal(idCuentaBancaria, idTipoNomina, idTipoEmisionNomina);
                    byte[] detallePagoNominaCSV = this.csvService.getAsCSV(detallePagoNomina, DetallePagoNominaDTO.class);

                    ZipEntry zePersonales = new ZipEntry(carpeta + "datos-personales.csv");
                    zos.putNextEntry(zePersonales);
                    zos.write(datosPersonalesCSV);
                    zos.closeEntry();

                    ZipEntry zeLaborales = new ZipEntry(carpeta + "datos-laborales.csv");
                    zos.putNextEntry(zeLaborales);
                    zos.write(datosLaboralesCSV);
                    zos.closeEntry();

                    ZipEntry zeDetalleNomina = new ZipEntry(carpeta + "detalle-nomina.csv");
                    zos.putNextEntry(zeDetalleNomina);
                    zos.write(detalleNominaCSV);
                    zos.closeEntry();

                    ZipEntry zeDetallePagoNomina = new ZipEntry(carpeta + "detalle-pago-nomina.csv");
                    zos.putNextEntry(zeDetallePagoNomina);
                    zos.write(detallePagoNominaCSV);
                    zos.closeEntry();
                }
            }

            byte[] bytes = Files.toByteArray(file);
            file.delete();
            return bytes;
        } catch (IOException ex) {
            LOGGER.error(null, ex);
            return null;
        }
    }

    @Override
    public byte[] getLayoutComoDatTra(String quincena) {
        //SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();

        List<EstructuraNominaTrailersDTO> listaDetallesTra = this.encabezadoService.consultarTra(quincena, 2016);
        LOGGER.debug("TRA Service:::" + listaDetallesTra.size());
        byte[] fileTra = this.traService.generarTra(listaDetallesTra);

        List<EstructuraNominaDatDTO> listaDetallesDat = this.encabezadoService.consultarDat(quincena, 2016);
        LOGGER.debug("TRA Service:::" + listaDetallesDat.size());
        byte[] fileDat = this.datService.generarDat(listaDetallesDat);

        try {
            File file = File.createTempFile("datytra", ".zip");
            FileOutputStream fos = new FileOutputStream(file);

            try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                ZipEntry zipTra = new ZipEntry("PRDO.tra");
                zos.putNextEntry(zipTra);
                zos.write(fileTra);
                zos.closeEntry();

                ZipEntry zipDat = new ZipEntry("PRDO.dat");
                zos.putNextEntry(zipDat);
                zos.write(fileDat);
                zos.closeEntry();
            }

            byte[] bytes = Files.toByteArray(file);
            file.delete();
            return bytes;
        } catch (IOException ex) {
            LOGGER.error(null, ex);
            return null;
        }
    }

    @Override
    public byte[] getDatTraContrato(String quincena) {
        byte[] bytes;
        SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();

        List<String> productos = this.encabezadoService.listProductos(quincena);

        try {
            File file = File.createTempFile("datytraContrato", ".zip");
            FileOutputStream fos = new FileOutputStream(file);

            try (ZipOutputStream zos = new ZipOutputStream(fos)) {
                for (String producto : productos) {
                    LOGGER.debug("Producto=" + producto);

                    List<EstructuraContratosTrailersDTO> listaDetallesTra = this.encabezadoService.consultarTraCont(producto);
                    LOGGER.debug("TRA Service:::" + listaDetallesTra.size());
                    byte[] fileTras = encabezadoExcel.generarTraCont(listaDetallesTra, producto);

                    List<EstructuraContratosDatDTO> listaDetallesDat = this.encabezadoService.consultarDatCont(producto);
                    LOGGER.debug("DAT Service:::" + listaDetallesDat.size());
                    byte[] fileDat = encabezadoExcel.generarDatCont(listaDetallesDat, producto);

                    ZipEntry zipTra = new ZipEntry(producto + ".tra");
                    zos.putNextEntry(zipTra);
                    zos.write(fileTras);
                    zos.closeEntry();

                    ZipEntry zipDat = new ZipEntry(producto + ".dat");
                    zos.putNextEntry(zipDat);
                    zos.write(fileDat);
                    zos.closeEntry();
                }
            }

            bytes = Files.toByteArray(file);

            file.delete();
            return bytes;
        } catch (IOException ex) {
            LOGGER.error(null, ex);
            return null;
        }
    }

    @Override
    public byte[] getDatTra(Integer idBitacora) {
        try {
            // Generacion del archivo DAT
            List<EstructuraNominaDatDTO> listaDetallesDat = this.encabezadoService.consultarDatN(idBitacora);
            LOGGER.debugv("Cantidad de elementos en el DAT: {0}", listaDetallesDat.size());
            byte[] dat = this.datService.generarDat(listaDetallesDat);

            // Generacion del archivo TRA
            List<EstructuraNominaTrailersDTO> listaDetallesTra = this.encabezadoService.consultarTraN(idBitacora);
            LOGGER.debugv("Cantidad de elementos en el TRA: {0}", listaDetallesTra.size());
            byte[] tra = this.traService.generarTra(listaDetallesTra);

            // Generación del archivo zip
            File file = File.createTempFile("dat-tra", ".zip");

            try (FileOutputStream fos = new FileOutputStream(file)) {
                try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                    ZipEntry zipDat = new ZipEntry("prdo.dat");
                    zos.putNextEntry(zipDat);
                    zos.write(dat);
                    zos.closeEntry();

                    ZipEntry zipTra = new ZipEntry("prdo.tra");
                    zos.putNextEntry(zipTra);
                    zos.write(tra);
                    zos.closeEntry();
                }

                byte[] bytes = Files.toByteArray(file);
                file.delete();
                return bytes;
            }
        } catch (IOException ex) {
            LOGGER.error(ex);
            return null;
        }
    }

    @Override
    public byte[] getDatTraRH(Integer idBitacora) {
        try {
            // Generacion del archivo DAT
            List<EstructuraNominaDatDTO> listaDetallesDat = this.encabezadoService.consultarDatRH(idBitacora);
            LOGGER.debugv("Cantidad de elementos en el DAT: {0}", listaDetallesDat.size());
            byte[] dat = this.datService.generarDat(listaDetallesDat);

            // Generacion del archivo TRA
            List<EstructuraNominaTrailersDTO> listaDetallesTra = this.encabezadoService.consultarTraRH(idBitacora);
            LOGGER.debugv("Cantidad de elementos en el TRA: {0}", listaDetallesTra.size());
            byte[] tra = this.traService.generarTra(listaDetallesTra);

            // Generación del archivo zip
            File file = File.createTempFile("dat-tra", ".zip");

            try (FileOutputStream fos = new FileOutputStream(file)) {
                try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                    ZipEntry zipDat = new ZipEntry("prdo.dat");
                    zos.putNextEntry(zipDat);
                    zos.write(dat);
                    zos.closeEntry();

                    ZipEntry zipTra = new ZipEntry("prdo.tra");
                    zos.putNextEntry(zipTra);
                    zos.write(tra);
                    zos.closeEntry();
                }

                byte[] bytes = Files.toByteArray(file);
                file.delete();
                return bytes;
            }
        } catch (IOException ex) {
            LOGGER.error(ex);
            return null;
        }
    }

    @Override
    public byte[] getLayoutSeguroPopular(String quincena) {

        SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();

        List<EstructuraSeguroPopularDTO> listaDetallesTra = this.encabezadoService.consultarSeguroPopular(quincena, 2016);
        LOGGER.debug("Seguro Popular Service:::" + listaDetallesTra.size());
        byte[] fileSegPop = encabezadoExcel.generarSeguroPopular(listaDetallesTra);

        try {
            File file = File.createTempFile("SeguroPopular", ".zip");
            FileOutputStream fos = new FileOutputStream(file);

            try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                ZipEntry zipTra = new ZipEntry("pantillaSegPop.xlsx");
                zos.putNextEntry(zipTra);
                zos.write(fileSegPop);
                zos.closeEntry();
            }

            byte[] bytes = Files.toByteArray(file);
            file.delete();
            return bytes;
        } catch (IOException ex) {
            LOGGER.error(null, ex);
            return null;
        }
    }

    @Override
    public byte[] getDatTraProdNom(Integer idProductoNomina) {
        try {
            // Generacion del archivo DAT
            List<EstructuraContratosDatDTO> listaDetallesDat = this.encabezadoService.consultarDatProdNom(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos en el DAT: {0}", listaDetallesDat.size());
            SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
            byte[] dat = encabezadoExcel.generarDatCont(listaDetallesDat, "prdc");
            // Generacion del archivo TRA
            List<EstructuraContratosTrailersDTO> listaDetallesTra = this.encabezadoService.consultarTraProdNom(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos en el TRA: {0}", listaDetallesTra.size());
            byte[] tra = encabezadoExcel.generarTraCont(listaDetallesTra, "prdc");

            // Generación del archivo zip
            File file = File.createTempFile("dat-tra", ".zip");

            try (FileOutputStream fos = new FileOutputStream(file)) {
                try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                    ZipEntry zipDat = new ZipEntry("prdo.dat");
                    zos.putNextEntry(zipDat);
                    zos.write(dat);
                    zos.closeEntry();

                    ZipEntry zipTra = new ZipEntry("prdo.tra");
                    zos.putNextEntry(zipTra);
                    zos.write(tra);
                    zos.closeEntry();
                }

                byte[] bytes = Files.toByteArray(file);
                file.delete();
                return bytes;
            }
        } catch (IOException ex) {
            LOGGER.error(ex);
            return null;
        }
    }

    @Override
    public byte[] getDatTraProdNomRH(Integer idProductoNomina) {
        try {
            // Generacion del archivo DAT
            List<EstructuraContratosDatDTO> listaDetallesDat = this.encabezadoService.consultarDatProdNomRH(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos consultados en el DAT: {0}", listaDetallesDat.size());
            SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
            byte[] dat = encabezadoExcel.generarDatCont(listaDetallesDat, "prdc");

            // Generacion del archivo TRA
            List<EstructuraContratosTrailersDTO> listaDetallesTra = this.encabezadoService.consultarTraProdNomRH(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos consultados en el TRA: {0}", listaDetallesTra.size());
            byte[] tra = encabezadoExcel.generarTraCont(listaDetallesTra, "prdc");

            // Generación del archivo zip
            File file = File.createTempFile("dat-tra", ".zip");

            try (FileOutputStream fos = new FileOutputStream(file)) {
                try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                    ZipEntry zipDat = new ZipEntry("prdo.dat");
                    zos.putNextEntry(zipDat);
                    zos.write(dat);
                    zos.closeEntry();

                    ZipEntry zipTra = new ZipEntry("prdo.tra");
                    zos.putNextEntry(zipTra);
                    zos.write(tra);
                    zos.closeEntry();
                }

                byte[] bytes = Files.toByteArray(file);
                file.delete();
                return bytes;
            }
        } catch (IOException ex) {
            LOGGER.error(ex);
            return null;
        }
    }

    @Override
    public byte[] getDatTraProdNomRH_Cont(Integer idProductoNomina) {
        try {
            // Generacion del archivo DAT
            List<EstructuraContratosDatDTO> listaDetallesDat = this.encabezadoService.consultarDatProdNomRHCont(idProductoNomina, 23);
            LOGGER.debugv("Cantidad de elementos consultados en el DAT: {0}", listaDetallesDat.size());
            SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
            byte[] dat = encabezadoExcel.generarDatCont(listaDetallesDat, "prdc");

            // Generacion del archivo TRA
            List<EstructuraContratosTrailersDTO> listaDetallesTra = this.encabezadoService.consultarTraProdNomRHCont(idProductoNomina, 23);
            LOGGER.debugv("Cantidad de elementos consultados en el TRA: {0}", listaDetallesTra.size());
            byte[] tra = encabezadoExcel.generarTraCont(listaDetallesTra, "prdc");

            // Generacion del archivo DAT
            List<EstructuraContratosDatDTO> listaDetallesDatFort = this.encabezadoService.consultarDatProdNomRHCont(idProductoNomina, 27);
            LOGGER.debugv("Cantidad de elementos consultados en el DAT: {0}", listaDetallesDatFort.size());
            //SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
            byte[] datFort = encabezadoExcel.generarDatCont(listaDetallesDatFort, "prdc");

            // Generacion del archivo TRA
            List<EstructuraContratosTrailersDTO> listaDetallesTraFort = this.encabezadoService.consultarTraProdNomRHCont(idProductoNomina, 27);
            LOGGER.debugv("Cantidad de elementos consultados en el TRA: {0}", listaDetallesTraFort.size());
            byte[] traFort = encabezadoExcel.generarTraCont(listaDetallesTraFort, "prdc");

            // Generacion del archivo DAT
            List<EstructuraContratosDatDTO> listaDetallesDatCont = this.encabezadoService.consultarDatProdNomRHContrato(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos consultados en el DAT: {0}", listaDetallesDatCont.size());
            //SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
            byte[] datCont = encabezadoExcel.generarDatCont(listaDetallesDatCont, "prdc");

            // Generacion del archivo TRA
            List<EstructuraContratosTrailersDTO> listaDetallesTraCont = this.encabezadoService.consultarTraProdNomRHContrato(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos consultados en el TRA: {0}", listaDetallesTraCont.size());
            byte[] traCont = encabezadoExcel.generarTraCont(listaDetallesTraCont, "prdc");

            // Generacion del archivo DAT
            List<EstructuraContratosDatDTO> listaDetallesDatContSP = this.encabezadoService.consultarDatProdNomRHContSegPop(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos consultados en el DAT: {0}", listaDetallesDatCont.size());
            //SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
            byte[] datContSP = encabezadoExcel.generarDatCont(listaDetallesDatContSP, "prdc");

            // Generacion del archivo TRA
            List<EstructuraContratosTrailersDTO> listaDetallesTraContSP = this.encabezadoService.consultarTraProdNomRHContSegPop(idProductoNomina);
            LOGGER.debugv("Cantidad de elementos consultados en el TRA: {0}", listaDetallesTraCont.size());
            byte[] traContSP = encabezadoExcel.generarTraCont(listaDetallesTraContSP, "prdc");

            // Generación del archivo zip
            File file = File.createTempFile("dat-tra", ".zip");

            try (FileOutputStream fos = new FileOutputStream(file)) {
                try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                    ZipEntry zipDat = new ZipEntry("PRDOAS.dat");
                    zos.putNextEntry(zipDat);
                    zos.write(dat);
                    zos.closeEntry();

                    ZipEntry zipTra = new ZipEntry("PRDOAS.tra");
                    zos.putNextEntry(zipTra);
                    zos.write(tra);
                    zos.closeEntry();

                    ZipEntry zipDatFort = new ZipEntry("PRDOFA.dat");
                    zos.putNextEntry(zipDatFort);
                    zos.write(datFort);
                    zos.closeEntry();

                    ZipEntry zipTraFort = new ZipEntry("PRDOFA.tra");
                    zos.putNextEntry(zipTraFort);
                    zos.write(traFort);
                    zos.closeEntry();

                    ZipEntry zipDatCont = new ZipEntry("PRDOCON.dat");
                    zos.putNextEntry(zipDatCont);
                    zos.write(datCont);
                    zos.closeEntry();

                    ZipEntry zipTraCont = new ZipEntry("PRDOCON.tra");
                    zos.putNextEntry(zipTraCont);
                    zos.write(traCont);
                    zos.closeEntry();

                    ZipEntry zipDatContSP = new ZipEntry("PRDOSP.dat");
                    zos.putNextEntry(zipDatContSP);
                    zos.write(datContSP);
                    zos.closeEntry();

                    ZipEntry zipTraContSP = new ZipEntry("PRDOSP.tra");
                    zos.putNextEntry(zipTraContSP);
                    zos.write(traContSP);
                    zos.closeEntry();

                }

                byte[] bytes = Files.toByteArray(file);
                file.delete();
                return bytes;
            }
        } catch (IOException ex) {
            LOGGER.error(ex);
            return null;
        }
    }

    @Override
    public void crearDatTraProdNom(Integer idProductoNomina) {

        // Creacion del DAT
        List<EstructuraContratosDatDTO> listaDetallesDat = this.encabezadoService.crearDatProdNom(idProductoNomina);
        LOGGER.debugv("Cantidad de elementos creados en el DAT: {0}", listaDetallesDat.size());
        //SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
        this.encabezadoService.actualizarEstructuraDat(listaDetallesDat);
        // Creacion del TRA
        List<EstructuraContratosTrailersDTO> listaDetallesTra = this.encabezadoService.crearTraProdNom(idProductoNomina);
        LOGGER.debugv("Cantidad de elementos creados en el TRA: {0}", listaDetallesTra.size());
        //byte[] tra = encabezadoExcel.generarTraCont(listaDetallesTra, "prdc");
        this.encabezadoService.actualizarEstructuraTra(idProductoNomina);
        this.encabezadoService.actualizarNoTrailer(idProductoNomina);

    }

    //crearLayoutNominaContrato
    @Override
    public void crearLayoutNominaContrato(Integer idProductoNomina) {

        // Creacion encabezados y layouts contratro
        List<SIIFEncabezadoDTO> listaDetalles = this.encabezadoService.crearLayoutNominaContrato(idProductoNomina);
        LOGGER.debugv("Cantidad de encabezados-layouts creados: {0}", listaDetalles.size());

    }

    @Override
    public void crearLayoutsRH(Integer idProductoNomina) {
        SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();
        List<SIIFEncabezadoDTO> listaDetalles = this.encabezadoService.generarEncabezadoRH(idProductoNomina);

        for (SIIFEncabezadoDTO encabezadoDetalle : listaDetalles) {

            LOGGER.debug("idProductoNomina:::" + idProductoNomina);
            int idNomina = encabezadoDetalle.getIdNomina();

            List<DatosPersonalesDTO> datosPersonales = this.ls.generarDatosPersonalesRH(idProductoNomina, idNomina);
            byte[] datosPersonalesCSV = this.csvService.getAsCSV(datosPersonales, DatosPersonalesDTO.class);

            List<DatosLaboralesDTO> datosLaborales = this.ls.generarDatosLaboralesRH(idProductoNomina);//Pendiente de adecuar
            byte[] datosLaboralesCSV = this.csvService.getAsCSV(datosLaborales, DatosLaboralesDTO.class);

            List<DetalleNominaDTO> detalleNomina = this.ls.generarDetalleNominaRH(idProductoNomina);
            byte[] detalleNominaCSV = this.csvService.getAsCSV(detalleNomina, DetalleNominaDTO.class);

            List<DetallePagoNominaDTO> detallePagoNomina = this.ls.generarDetallePagoNominaRH(idProductoNomina);
            byte[] detallePagoNominaCSV = this.csvService.getAsCSV(detallePagoNomina, DetallePagoNominaDTO.class);

        }

    }

    @Override
    public int verificaProductoNomina(Integer idProductoNomina) {
        return this.encabezadoService.verificaProductoNomina(idProductoNomina);
    }

    @Override
    public int verificaLayoutNomina(Integer idProductoNomina) {
        return this.encabezadoService.verificaLayoutNomina(idProductoNomina);
    }

    @Override
    public byte[] getLayoutSeguroPopularRH(Integer idProductoNomina) {

        SIIFEncabezadoExcel encabezadoExcel = new SIIFEncabezadoExcel();

        List<EstructuraSeguroPopularDTO> listaDetallesTra = this.encabezadoService.consultarSeguroPopularRH(idProductoNomina);
        LOGGER.debug("Seguro Popular Service:::" + listaDetallesTra.size());
        byte[] fileSegPop = encabezadoExcel.generarSeguroPopular(listaDetallesTra);

        try {
            File file = File.createTempFile("SeguroPopular", ".zip");
            FileOutputStream fos = new FileOutputStream(file);

            try (ZipOutputStream zos = new ZipOutputStream(fos)) {

                ZipEntry zipTra = new ZipEntry("pantillaSegPop.xlsx");
                zos.putNextEntry(zipTra);
                zos.write(fileSegPop);
                zos.closeEntry();
            }

            byte[] bytes = Files.toByteArray(file);
            file.delete();
            return bytes;
        } catch (IOException ex) {
            LOGGER.error(null, ex);
            return null;
        }

    }

}
