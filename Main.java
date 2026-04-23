public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.agregarEjercicio(new InvertirCadena());
        menu.agregarEjercicio(new Palindromo());
        menu.agregarEjercicio(new ContarVocales());
        menu.agregarEjercicio(new InvertirEntero());
        menu.agregarEjercicio(new MayorTres());
        menu.agregarEjercicio(new Fibonacci());
        menu.agregarEjercicio(new Primo());
        menu.agregarEjercicio(new Factorial());
        menu.agregarEjercicio(new Armstrong());
        menu.agregarEjercicio(new MinMax());
        menu.agregarEjercicio(new Faltante());
        menu.agregarEjercicio(new Palabras());
        menu.agregarEjercicio(new Bisiesto());
        menu.agregarEjercicio(new NoRepetido());
        menu.agregarEjercicio(new InvertirArreglo());
        menu.agregarEjercicio(new Subcadena());
        menu.iniciar();
    }
}