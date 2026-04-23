import javax.swing.*;

class Armstrong extends Ejercicio {
    public Armstrong() { super("Armstrong", "Suma de cubos de dígitos igual al número."); }
    public void ejecutar() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        int ori = num, sum = 0;
        while (num > 0) { int d = num % 10; sum += Math.pow(d, 3); num /= 10; }
        JOptionPane.showMessageDialog(null, (ori == sum) ? "Es Armstrong" : "No es Armstrong");
    }
}
