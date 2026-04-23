import javax.swing.*;

class Bisiesto extends Ejercicio {
    public Bisiesto() { super("Año Bisiesto", "¿Es bisiesto?"); }
    public void ejecutar() {
        int y = Integer.parseInt(JOptionPane.showInputDialog("Año:"));
        boolean b = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        JOptionPane.showMessageDialog(null, b ? "Bisiesto" : "No bisiesto");
    }
}
