import javax.swing.*;

class Faltante extends Ejercicio {
    public Faltante() { super("Número Faltante", "Halla el número que falta del 1 al 10 en {1,2,3,4,6,7,8,9,10}."); }
    public void ejecutar() {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int total = (10 * 11) / 2, sum = 0;
        for (int x : arr) sum += x;
        JOptionPane.showMessageDialog(null, "Faltante: " + (total - sum));
    }
}
