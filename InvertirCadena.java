import javax.swing.JOptionPane;

class InvertirCadena extends Ejercicio {
    public InvertirCadena() { super("Invertir Cadena", "Invierte el texto ingresado."); }
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Ingrese una cadena:");
        if (str == null) return;
        String rev = new StringBuilder(str).reverse().toString();
        JOptionPane.showMessageDialog(null, "Original: " + str + "\nInvertida: " + rev);
    }
}
