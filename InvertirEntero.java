import javax.swing.*;

class InvertirEntero extends Ejercicio {
    public InvertirEntero() { super("Invertir Entero", "Invierte las cifras de un número."); }
    public void ejecutar() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Número entero:"));
        int rev = 0;
        while (num != 0) { rev = rev * 10 + num % 10; num /= 10; }
        JOptionPane.showMessageDialog(null, "Invertido: " + rev);
    }
}
