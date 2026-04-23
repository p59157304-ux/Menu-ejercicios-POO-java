import javax.swing.*;

class NoRepetido extends Ejercicio {
    public NoRepetido() { super("No Repetido", "Busca el primer carácter único."); }
    public void ejecutar() {
        String s = JOptionPane.showInputDialog("Cadena:");
        char res = '-';
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) { res = c; break; }
        }
        JOptionPane.showMessageDialog(null, "Primer no repetido: " + res);
    }
}
