import javax.swing.*;

class InvertirArreglo extends Ejercicio {
    public InvertirArreglo() { super("Invertir Arreglo", "Invierte {1, 2, 3, 4, 5}."); }
    public void ejecutar() {
        int[] arr = {1, 2, 3, 4, 5};
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) res += arr[i] + " ";
        JOptionPane.showMessageDialog(null, "Original: 1 2 3 4 5\nInvertido: " + res);
    }
}
