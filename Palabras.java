import javax.swing.*;

class Palabras extends Ejercicio {
    public Palabras() { super("Contar Palabras", "Cuenta palabras en una cadena."); }
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Frase:");
        String[] w = str.trim().split("\\s+");
        JOptionPane.showMessageDialog(null, "Palabras: " + w.length);
    }
}
