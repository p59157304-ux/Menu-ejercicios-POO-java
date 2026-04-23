import javax.swing.*;

class Palindromo extends Ejercicio {
    public Palindromo() { super("Verificar Palíndromo", "Revisa si una palabra se lee igual al revés."); }
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Palabra:").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        JOptionPane.showMessageDialog(null, str.equals(rev) ? "Es palíndromo" : "No es palíndromo");
    }
}
