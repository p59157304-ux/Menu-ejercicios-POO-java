import javax.swing.*;

class Factorial extends Ejercicio {
    public Factorial() { super("Factorial", "Calcula n!."); }
    public void ejecutar() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        long f = 1;
        for (int i = 1; i <= num; i++) f *= i;
        JOptionPane.showMessageDialog(null, "Factorial: " + f);
    }
}
