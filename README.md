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
    1. Clonar el repositorio
    2. Compilar: javac *.java
    3. Ejecutar: java Main
    
## Ejercicios Incluidos
    1. Invertir una Cadena
    2. Verificar Palindromo
    3. Contar Vocales/Consonantes
    4. Invertir Entero
    5. Mayor de 3
    6. Fibaonacci
    7. Número Primo
    8. Factorial
    9. Armstrong
    10. Min/Max Arreglo
    11. Número Faltante
    12. Contar Palabras
    13. Año Bisiesto
    14. No Repetido
    15. Invertir Arreglo
    16. Verificar Subcadena
