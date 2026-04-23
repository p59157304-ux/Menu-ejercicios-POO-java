# Sistema de Menú de Ejercicios con POO en Java

## Descripción
Aplicación con interfaz gráfica simple (Swing) que gestiona ejercicios mediante un menú interactivo, aplicando herencia, abstracción y polimorfismo.

## Diagrama de Clases
classDiagram
    direction TB
    class Main {
        +main(args: String[]) void
    }

    class Menu {
        -ejercicios: ArrayList~Ejercicio~
        +Menu()
        +agregarEjercicio(e: Ejercicio) void
        +iniciar() void
        +ejecutarEjercicio(opcion: int) void
    }

    class Ejercicio {
        <<abstract>>
        #nombre: String
        #descripcion: String
        +Ejercicio(n: String, d: String)
        +getNombre() String
        +getDescripcion() String
        +ejecutar()* void
        +ejecutarConInfo() void
        +mostrarError(msj: String)$ void
        +mostrarSalida()$ void
    }

    class Ejercicio1 {
        +Ejercicio1()
        +ejecutar() void
    }

    class Ejercicio2 {
        +Ejercicio2()
        +ejecutar() void
    }

    class Ejercicio3 {
        +Ejercicio3()
        +ejecutar() void
    }

    class EjercicioN {
        +EjercicioN()
        +ejecutar() void
    }

    %% Relaciones
    Main --> Menu : usa
    Menu "1" *-- "0..*" Ejercicio : contiene
    Ejercicio <|-- Ejercicio1 : hereda
    Ejercicio <|-- Ejercicio2 : hereda
    Ejercicio <|-- Ejercicio3 : hereda
    Ejercicio <|-- EjercicioN : hereda
     
## Cómo ejecutar
    Clonar el repositorio
    Compilar: javac *.java
    Ejecutar: java Main
    
## Ejercicios Incluidos
    Invertir una Cadena
    Verificar Palindromo
    Contar Vocales/Consonantes
    Invertir Entero
    Mayor de 3
    Fibaonacci
    Número Primo
    Factorial
    Armstrong
    Min/Max Arreglo
    Número Faltante
    Contar Palabras
    Año Bisiesto
    No Repetido
    Invertir Arreglo
    Verificar Subcadena
