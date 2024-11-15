package Interfaz;

import Dominio.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author pipetorrendell
 */
public class Main {

    private static final String DATA_FILE_PATH = "data/sistema.ser";

    public static void main(String[] args) {
        final Sistema sistema = inicializarSistema(); // Asignación final y única a `sistema`

        // Abrir la ventana del menú principal
        new VentanaMenu(sistema).setVisible(true);

        // Agregar hook para guardar datos al cerrar la aplicación
        Runtime.getRuntime().addShutdownHook(new Thread(() -> sistema.saveData(DATA_FILE_PATH)));
    }

    private static Sistema inicializarSistema() {
        // Preguntar al usuario si desea cargar los datos
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea cargar los datos desde el archivo de persistencia?", "Cargar datos", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            // Cargar datos desde el archivo
            Sistema sistema = Sistema.loadData(DATA_FILE_PATH);
            if (sistema == null) {
                // Si no se pudo cargar, inicializar un sistema vacío
                JOptionPane.showMessageDialog(null, "No se encontraron datos guardados o el archivo está corrupto. Se iniciará un sistema vacío.");
                return new Sistema();
            }
            return sistema;
        } else {
            // Iniciar con un sistema vacío
            return new Sistema();
        }
    }
}
