import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Ejercicio> ejercicios;

    public Menu() {
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio e) {
        ejercicios.add(e);
    }

    public void iniciar() {
        int salirOpcion = ejercicios.size() + 1;
        int opcion = 0;

        while (opcion != salirOpcion) {
            StringBuilder sb = new StringBuilder(" MENÚ DE EJERCICIOS (SDET) \n");
            for (int i = 0; i < ejercicios.size(); i++) {
                sb.append((i + 1)).append(". ").append(ejercicios.get(i).getNombre()).append("\n");
            }
            sb.append(salirOpcion).append(". Salir\n\n");
            sb.append("Seleccione una opción:");

            String input = JOptionPane.showInputDialog(null, sb.toString(), "UDES - Gestión Educativa", JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                opcion = salirOpcion;
                Ejercicio.mostrarSalida();
                break;
            }

            try {
                opcion = Integer.parseInt(input);
                ejecutarEjercicio(opcion);
            } catch (NumberFormatException e) {
                Ejercicio.mostrarError("Error: Debe ingresar un número entero.");
                opcion = 0;
            }
        }
    }

    public void ejecutarEjercicio(int opcion) {
        int salirOpcion = ejercicios.size() + 1;

        if (opcion > 0 && opcion <= ejercicios.size()) {
            Ejercicio seleccionado = ejercicios.get(opcion - 1);

            JOptionPane.showMessageDialog(null,
                    "Iniciando: " + seleccionado.getNombre() + "\nDescripción: " + seleccionado.getDescripcion(),
                    "Información del Ejercicio", JOptionPane.INFORMATION_MESSAGE);

            seleccionado.ejecutar();

        } else if (opcion == salirOpcion) {
            Ejercicio.mostrarSalida();
        } else {
            Ejercicio.mostrarError("Opción inválida. Intente de nuevo.");
        }
    }
}
