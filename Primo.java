import javax.swing.*;

class Primo extends Ejercicio {
    public Primo() { super("Número Primo", "Verifica si el número es primo."); }
    public void ejecutar() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        boolean isP = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) { isP = false; break; }
        JOptionPane.showMessageDialog(null, isP ? "Es primo" : "No es primo");
    }
}
