import javax.swing.*;

class Subcadena extends Ejercicio {
    public Subcadena() { super("Verificar Subcadena", "¿Contiene una cadena a otra?"); }
    public void ejecutar() {
        String main = JOptionPane.showInputDialog("Cadena principal:");
        String sub = JOptionPane.showInputDialog("Subcadena a buscar:");
        JOptionPane.showMessageDialog(null, main.contains(sub) ? "Sí la contiene" : "No la contiene");
    }
}
