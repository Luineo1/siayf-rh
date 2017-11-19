
package mx.gob.saludtlax.rh.nombramientos;

import static mx.gob.saludtlax.rh.util.POIUtils.remplazarCampos;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.jboss.logging.Logger;
import org.junit.Test;

/**
 * @author Daniela Hernández
 *
 */

public class ReservacionOtraDependencia {

    private static final Logger LOGGER = Logger.getLogger(NombramientoGenericoTest.class.getName());

    private static final String RUTA = "plantillas/reservacion/";
    private static final String PLANTILLA = "RESERVACION_PLAZA_CONFIANZA_OTRA_DEPENDENCIA.docx";
    private static final char SIGNO_APERTURA = '\u00AB';
    private static final char SIGNO_CIERRE = '\u00BB';

    private static final String home = System.getProperty("user.home") + System.getProperty("file.separator");
    private static final String NOMBRE_ARCHIVO = "RESERVACION_PLAZA_CONFIANZA_OTRA_DEPENDENCIA.docx";

    // Valores de Word
    private static final String asunto = "Se concede comisión externa sin goce de sueldo en el puesto con funciones de base para ocupar puesto de confianza en otra Dependencia.";
    private static final String presenteNombre = "DR. JULIO CESAR LIMA CARRO";
    private static final String presenteClaveUno = "LICJ720510B18";
    private static final String presenteClaveDos = "LICJ720510HPLMRL01";
    private static final String comunicado = "sin goce de sueldo en el puesto con funciones de base para ocupar puesto de confianza en otra Dependencia, me permito comunicarle que con fundamento en los Artículos 43 Fracción VIII de la Ley Federal de los Trabajadores al Servicio del Estado y 148 Fracción II de las Condiciones Generales de Trabajo de la Secretaría de Salud";
    private static final String fecha = "16 de julio al 31 de diciembre de 2015";
    private static final String fechaIngreso = "01 de diciembre de 1999";
    private static final String claveOriginal = "I0024161103 M01004 29004 0044";
    private static final String denominacionAlta = "Médico Especialista “A” (Federal)";
    private static final String adscripcion = "Hospital Regional “Lic. Emilio Sánchez Piedras”";
    private static final String fechaDesignacion = "16 de julio de 2015";
    private static final String denominacion = "Asesor Médico";
    private static final String posicionUno = "el Artículo 151 Párrafo Segundo de las Condiciones Generales de Trabajo, al separarse del puesto de confianza, deberá reincorporarse a su puesto de base, en su lugar de adscripción, dentro de los seis días hábiles siguientes, por lo que deberá dar aviso de reincorporación a esta Dirección, 15 días antes de que se separe del puesto de confianza";
    private static final String directoraAdministracion = "C.P. LUZ MARIA PORTILLO GARCIA";

    private XWPFDocument plantilla;
    private String nombreArchivo;

    /**
     * 
     * @param context
     * @throws IOException
     */
    private void cargarPlantilla() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(RUTA + PLANTILLA);

        plantilla = new XWPFDocument(inputStream);
    }

    /**
     * 
     * @return
     * @throws IOException
     */
    private ByteArrayOutputStream escribirArchivo() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        plantilla.write(out);
        return out;
    }

    /**
     * 
     * @param citatorio
     * @return
     */
    public ByteArrayOutputStream generar() {
        try {
            cargarPlantilla();

            Map<String, String> camposCombinar = new HashMap<>();

            camposCombinar.put(SIGNO_APERTURA + "asunto" + SIGNO_CIERRE, asunto);
            camposCombinar.put(SIGNO_APERTURA + "presenteNombre" + SIGNO_CIERRE, presenteNombre);
            camposCombinar.put(SIGNO_APERTURA + "presenteClaveUno" + SIGNO_CIERRE, presenteClaveUno);
            camposCombinar.put(SIGNO_APERTURA + "presenteClaveDos" + SIGNO_CIERRE, presenteClaveDos);
            camposCombinar.put(SIGNO_APERTURA + "comunicado" + SIGNO_CIERRE, comunicado);
            camposCombinar.put(SIGNO_APERTURA + "fecha" + SIGNO_CIERRE, fecha);
            camposCombinar.put(SIGNO_APERTURA + "fechaIngreso" + SIGNO_CIERRE, fechaIngreso);
            camposCombinar.put(SIGNO_APERTURA + "claveOriginal" + SIGNO_CIERRE, claveOriginal);
            camposCombinar.put(SIGNO_APERTURA + "denominacionAlta" + SIGNO_CIERRE, denominacionAlta);
            camposCombinar.put(SIGNO_APERTURA + "adscripcion" + SIGNO_CIERRE, adscripcion);
            camposCombinar.put(SIGNO_APERTURA + "fechaDesignacion" + SIGNO_CIERRE, fechaDesignacion);
            camposCombinar.put(SIGNO_APERTURA + "denominacion" + SIGNO_CIERRE, denominacion);
            camposCombinar.put(SIGNO_APERTURA + "posicionUno" + SIGNO_CIERRE, posicionUno);
            camposCombinar.put(SIGNO_APERTURA + "directoraAdministracion" + SIGNO_CIERRE, directoraAdministracion);

            for (XWPFParagraph parrafo : plantilla.getParagraphs()) {
                remplazarCampos(parrafo, camposCombinar);
            }

            Map<String, String> mapaTablas = new HashMap<>();

            //		remplazarCamposTablas(mapaTablas, plantilla.getTablesIterator());

            for (XWPFTable tab : plantilla.getTables()) {

                String textoPrimeraCelda = tab.getRow(0).getCell(0).getText();
                if (textoPrimeraCelda != null) {
                    if (textoPrimeraCelda.contains("Asunto:")) {

                        XWPFParagraph paragraph = tab.getRow(0).getCell(1).addParagraph();
                        paragraph.setAlignment(ParagraphAlignment.DISTRIBUTE);
                        XWPFRun run = paragraph.createRun();
                        run.setText(asunto);
                        run.setBold(false);
                        run.setFontFamily("Verdana");
                        run.setFontSize(9);

                    }
                }

            }

            return escribirArchivo();
        } catch (IOException e) {

            e.printStackTrace();
            LOGGER.info("Error: " + e.getMessage());
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
            LOGGER.error("Mensaje crítico..." + nullPointerException.getMessage());
        } catch (Exception exception) {
            exception.printStackTrace();
            LOGGER.error("Ocurrio un error al general el documento: " + exception.getMessage());
        }
        return null;
    }

    @Test
    public void testGenerar() throws IOException {

        ByteArrayOutputStream gen = generar();
        OutputStream outputStream = new FileOutputStream(home + NOMBRE_ARCHIVO);
        gen.writeTo(outputStream);
        gen.close();

        assertNotNull(gen);
    }

    /**
     * @return el campo nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @param nombreArchivo
     *            el valor de nombreArchivo a poner en el objeto.
     */
    private void setNombreArchivo(String nombreArchivo) {
        String[] nombrePlantilla = PLANTILLA.split(".docx");
        String nuevoNombreArchivo = nombreArchivo.toLowerCase().split(" ")[0].replaceAll("\\/", "-").trim();

        this.nombreArchivo = nombrePlantilla[0] + '-' + nuevoNombreArchivo + ".docx";
    }

}