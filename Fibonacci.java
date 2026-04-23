import javax.swing.*;

class Fibonacci extends Ejercicio {
    public Fibonacci() { super("Fibonacci", "Genera la serie hasta N términos."); }
    public void ejecutar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Términos:"));
        String res = "0, 1";
        int a = 0, b = 1;
        for (int i = 2; i < n; i++) { int c = a + b; res += ", " + c; a = b; b = c; }
        JOptionPane.showMessageDialog(null, res);
    }
}
