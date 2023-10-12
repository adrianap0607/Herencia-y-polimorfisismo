//Universidad del Valle de Guatemala	                                                                                            
//Adriana Palacios 
//CC2008 - Introducción a la Programación Orientada a Objetos 
//carné 23044
//Semestre II, 2023




import java.util.Scanner;

/**
 * Esta clase representa una aplicación de biblioteca que permite interactuar con documentos.
 */
public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializa un objeto Scanner para la entrada del usuario
        Biblioteca biblioteca = new Biblioteca(); // Crea una instancia de la clase Biblioteca

        int opcion;
        do {
            System.out.println("----- Menú de la Biblioteca -----");
            System.out.println("1. Ingresar nuevo documento");
            System.out.println("2. Devolver título de una publicación por ID");
            System.out.println("3. Calcular cantidad de documentos de una materia");
            System.out.println("4. Determinar cantidad de revistas de una materia");
            System.out.println("5. Mostrar información de todos los libros");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt(); // Lee la opción elegida por el usuario
            scanner.nextLine(); // Limpia el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del documento: ");
                    int nuevoID = scanner.nextInt(); // Lee el ID del nuevo documento
                    scanner.nextLine(); // Limpia el salto de línea
                    System.out.print("Ingrese el título del documento: ");
                    String nuevoTitulo = scanner.nextLine(); // Lee el título del nuevo documento

                    System.out.print("Ingrese el autor (o presione Enter si no es aplicable): ");
                    String nuevoAutor = scanner.nextLine(); // Lee el autor del nuevo documento

                    System.out.print("Ingrese la editorial (o presione Enter si no es aplicable): ");
                    String nuevaEditorial = scanner.nextLine(); // Lee la editorial del nuevo documento

                    System.out.print("Ingrese la materia: ");
                    String nuevaMateria = scanner.nextLine(); // Lee la materia del nuevo documento

                    System.out.print("Ingrese la cantidad de ejemplares: ");
                    int nuevaCantidadEjemplares = scanner.nextInt(); // Lee la cantidad de ejemplares del nuevo documento
                    scanner.nextLine(); // Limpia el salto de línea

                    System.out.print("Ingrese el estado (disponible o agotado): ");
                    String nuevoEstado = scanner.nextLine(); // Lee el estado del nuevo documento

                    System.out.print("Tipo de documento (Libro, Revista o Articulo): ");
                    String tipoDocumento = scanner.nextLine(); // Lee el tipo de documento

                    Documento nuevoDocumento = null;

                    if (tipoDocumento.equalsIgnoreCase("Libro")) {
                        nuevoDocumento = new Libro(nuevoID, nuevoTitulo, nuevoAutor, nuevaEditorial, nuevaMateria, nuevaCantidadEjemplares, nuevoEstado);
                    } else if (tipoDocumento.equalsIgnoreCase("Revista")) {
                        System.out.print("Ingrese el año de la revista: ");
                        int anoRevista = scanner.nextInt(); // Lee el año de la revista
                        scanner.nextLine(); // Limpia el salto de línea
                        System.out.print("Ingrese el número de la revista: ");
                        int numeroRevista = scanner.nextInt(); // Lee el número de la revista
                        scanner.nextLine(); // Limpia el salto de línea
                        nuevoDocumento = new Revista(nuevoID, nuevoTitulo, nuevaMateria, nuevaCantidadEjemplares, nuevoEstado, anoRevista, numeroRevista);
                    } else if (tipoDocumento.equalsIgnoreCase("Articulo")) {
                        System.out.print("Ingrese el nombre del árbitro: ");
                        String nombreArbitro = scanner.nextLine(); // Lee el nombre del árbitro
                        nuevoDocumento = new Articulo(nuevoID, nuevoTitulo, nuevaMateria, nuevaCantidadEjemplares, nuevoEstado, nombreArbitro);
                    } else {
                        System.out.println("Tipo de documento no válido.");
                        break; // Sale del bucle
                    }

                    biblioteca.ingresarNuevoDocumento(nuevoDocumento); // Agrega el nuevo documento a la biblioteca
                    System.out.println("Documento ingresado con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese el ID de la publicación: ");
                    int idBuscado = scanner.nextInt(); // Lee el ID de la publicación a buscar
                    scanner.nextLine(); // Limpia el salto de línea
                    String titulo = biblioteca.obtenerTituloPorID(idBuscado); // Obtiene el título de la publicación por ID
                    System.out.println("Título: " + titulo); // Imprime el título
                    break;

                case 3:
                    System.out.print("Ingrese la materia: ");
                    String materiaCalculo = scanner.nextLine(); // Lee la materia para calcular la cantidad de documentos
                    int cantidadDocumentos = biblioteca.calcularCantidadDocumentosPorMateria(materiaCalculo); // Calcula la cantidad de documentos por materia
                    System.out.println("Cantidad de documentos de " + materiaCalculo + ": " + cantidadDocumentos); // Imprime la cantidad de documentos
                    break;

                case 4:
                    System.out.print("Ingrese la materia: ");
                    String materiaRevistas = scanner.nextLine(); // Lee la materia para determinar la cantidad de revistas
                    int cantidadRevistas = biblioteca.determinarCantidadRevistasPorMateria(materiaRevistas); // Determina la cantidad de revistas por materia
                    System.out.println("Cantidad de revistas de " + materiaRevistas + ": " + cantidadRevistas); // Imprime la cantidad de revistas
                    break;

                case 5:
                    biblioteca.mostrarInformacionLibros(); // Muestra información de todos los libros en la biblioteca
                    break;

                case 6:
                    System.out.println("Saliendo del programa."); // Imprime un mensaje de salida
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida."); // Imprime un mensaje de opción no válida
                    break;
            }
        } while (opcion != 6); // Repite el bucle hasta que la opción sea 6 (Salir)
        scanner.close(); // Cierra el objeto Scanner
    }
}
