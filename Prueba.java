/**
 


 * Arrays y colecciones:
 * Crea un array de 10 números enteros aleatorios.
* Imprime el array original.
/Ordena el array de menor a mayor utilizando el algoritmo de burbuja. 
 * Imprime el array ordenado
 * 
*/

/** 
  Orientación a objetos:
 * Crea una clase "Persona" con atributos nombre, edad y una lista de hobbies.
 * Crea un método para agregar hobbies a la lista.
 * Crea una clase "Estudiante" que herede de "Persona" y agregue un atributo "carrera".
 * Crea un objeto de tipo "Estudiante" y muestra toda su información.
 * 
*/


/** 
 * Excepciones:
 * Escribe un programa que pida al usuario un número y lo divida entre otro número 
 * ingresado por el usuario.
 * Maneja la excepción ArithmeticException en caso de que el divisor sea cero.
 * 
*/

/**
 * Interfaces y polimorfismo:
 * Crea una interfaz "Animal" con métodos "hacerRuido" y "comer".
 * Crea clases "Perro", "Gato" y "Pajaro" que implementen la interfaz "Animal".
 * Crea un array de objetos de tipo "Animal" y llama a los métodos de cada objeto.
 * 
 * 
*/

/**
 * Ficheros:
 * Escribe un programa que lea una línea de un archivo de texto y la imprima en consola.
 * Maneja la excepción IOException en caso de que ocurra algún error al leer el archivo.
 * 
*/



/**
 *
Consejos adicionales:
 * Eficiencia: Intenta optimizar tu código para que sea lo más eficiente posible.
 * Legibilidad: Utiliza nombres de variables y métodos descriptivos.
 * Modularidad: Divide tu código en funciones más pequeñas y reutilizables.
Justificación de la dificultad:
 * Algoritmos: Se introduce el algoritmo de burbuja para evaluar la comprensión de algoritmos básicos de ordenamiento.
 * POO Avanzado: Se profundiza en la herencia, polimorfismo e interfaces.
 * Manejo de excepciones: Se solicita un manejo más elaborado de excepciones.
 * Entrada/Salida: Se incluye la lectura de archivos para evaluar el manejo de recursos externos.
Consideraciones:
 * Tiempo: Aumenta el tiempo de la prueba para permitir abordar problemas más complejos.
 * Herramientas: Puedes utilizar herramientas de control de versiones como Git para evaluar las habilidades del candidato en este ámbito.
 * Entorno: Puedes simular un entorno de trabajo real proporcionando un proyecto base con 
 * una estructura definida.
*/

/**

 *  * Crea un array de 10 números enteros aleatorios.
* Imprime el array original.
Ordena el array de menor a mayor utilizando el algoritmo de burbuja. 
 * Imprime el array ordenado
 


 // import java.util.Random;

public class Prueba {
//      public static void main(String[] args) {
//          // Crear un array de 10 números enteros aleatorios
//          int[] array = new int[10];
//          Random random = new Random();
         
//          for (int i = 0; i < array.length; i++) {
//              array[i] = random.nextInt(100); // Generar números aleatorios entre 0 y 99
//          }
         
//          // Imprimir el array original
//          System.out.println("Array original:");
//          imprimirArray(array);
         
//          // Ordenar el array de menor a mayor utilizando el algoritmo de burbuja
//          ordenarBurbuja(array);
         
//          // Imprimir el array ordenado
//          System.out.println("Array ordenado:");
//          imprimirArray(array);
//      }
     
//      // Método para ordenar el array utilizando el algoritmo de burbuja
//      public static void ordenarBurbuja(int[] array) {
//          int n = array.length;
//          for (int i = 0; i < n - 1; i++) {
//              for (int j = 0; j < n - 1 - i; j++) {
//                  if (array[j] > array[j + 1]) {
//                      // Intercambiar array[j] y array[j + 1]
//                      int temp = array[j];
//                      array[j] = array[j + 1];
//                      array[j + 1] = temp;
//                  }
//              }
//          }
//      }
     
//      // Método para imprimir el array
//      public static void imprimirArray(int[] array) {
//          for (int i : array) {
//              System.out.print(i + " ");
//          }
//          System.out.println();
//      }
//  }
// 
//  
//   * Crea una clase "Persona" con atributos nombre, edad y una lista de hobbies.
//  * Crea un método para agregar hobbies a la lista.
//   
*/
/** 
public class Prueba {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, "Ingeniería");
        estudiante.agregarHobby("Leer");
        estudiante.agregarHobby("Correr");
        estudiante.mostrarInformacion();
    }
}

*/

/** 
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            double numerador = scanner.nextDouble();

            System.out.print("Ingrese el denominador: ");
            double denominador = scanner.nextDouble();

            double resultado = dividir(numerador, denominador);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }

    public static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero");
        }
        return numerador / denominador;
    }
}
*//** 
public class Prueba {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Pajaro();

        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.comer();
            System.out.println();
        }
    }
}
*/

/** 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prueba {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt"; // Nombre del archivo a leer

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea = br.readLine();
            if (linea != null) {
                System.out.println("Primera línea del archivo: " + linea);
            } else {
                System.out.println("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
*/