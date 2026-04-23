import javax.swing.*;

class MayorTres extends Ejercicio {
    public MayorTres() { super("Mayor de 3", "Encuentra el mayor entre tres valores."); }
    public void ejecutar() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("N1:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("N2:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("N3:"));
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        JOptionPane.showMessageDialog(null, "El mayor es: " + max);
    }
}
