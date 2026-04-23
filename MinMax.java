import javax.swing.*;

class MinMax extends Ejercicio {
    public MinMax() { super("Min/Max Arreglo", "Encuentra extremos en un arreglo {10, 5, 25, 2, 30}."); }
    public void ejecutar() {
        int[] arr = {10, 5, 25, 2, 30};
        int min = arr[0], max = arr[0];
        for (int x : arr) { if (x < min) min = x; if (x > max) max = x; }
        JOptionPane.showMessageDialog(null, "Min: " + min + "\nMax: " + max);
    }
}
