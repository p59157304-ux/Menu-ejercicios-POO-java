import javax.swing.JOptionPane;

public abstract class Ejercicio {
    protected String nombre;
    protected String descripcion;

    public Ejercicio(String n, String d) {
        this.nombre = n;
        this.descripcion = d;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    public abstract void ejecutar();

    public static void mostrarError(String msj) {
        JOptionPane.showMessageDialog(null, msj, "Error de Selección", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarSalida() {
        JOptionPane.showMessageDialog(null, "Saliendo del programa...\n¡Hasta luego!", "Cierre de Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
}
