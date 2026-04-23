import javax.swing.*;

class ContarVocales extends Ejercicio {
    public ContarVocales() { super("Contar Vocales/Consonantes", "Cuenta letras en una frase."); }
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Frase:").toLowerCase();
        int v = 0, c = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (ch >= 'a' && ch <= 'z') c++;
        }
        JOptionPane.showMessageDialog(null, "Vocales: " + v + "\nConsonantes: " + c);
    }
}
