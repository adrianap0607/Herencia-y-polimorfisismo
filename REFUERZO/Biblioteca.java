//Universidad del Valle de Guatemala	                                                                                            
//Adriana Palacios 
//CC2008 - Introducción a la Programación Orientada a Objetos 
//carné 23044
//Semestre II, 2023


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Documento> documentos = new ArrayList<>();

    /**
     * Agrega un nuevo documento a la lista de documentos de la biblioteca.
     *
     * @param documento El documento a agregar.
     */
    public void ingresarNuevoDocumento(Documento documento) {
        documentos.add(documento);
    }

    /**
     * Obtiene el título de una publicación por su ID.
     *
     * @param id El ID del documento a buscar.
     * @return El título del documento correspondiente al ID, o "ID no encontrado" si no se encuentra.
     */
    public String obtenerTituloPorID(int id) {
        for (Documento documento : documentos) {
            if (documento.getId() == id) {
                return documento.getTitulo();
            }
        }
        return "ID no encontrado";
    }

    /**
     * Calcula la cantidad de documentos en la biblioteca de una materia específica.
     *
     * @param materia La materia de los documentos a contar.
     * @return La cantidad de documentos relacionados a la materia.
     */
    public int calcularCantidadDocumentosPorMateria(String materia) {
        int cantidad = 0;
        for (Documento documento : documentos) {
            if (documento.getMateria().equalsIgnoreCase(materia)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * Determina la cantidad de revistas en la biblioteca de una materia específica.
     *
     * @param materia La materia de las revistas a contar.
     * @return La cantidad de revistas relacionadas a la materia.
     */
    public int determinarCantidadRevistasPorMateria(String materia) {
        int cantidad = 0;
        for (Documento documento : documentos) {
            if (documento instanceof Revista && documento.getMateria().equalsIgnoreCase(materia)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * Muestra la información de todos los libros en la biblioteca.
     */
    public void mostrarInformacionLibros() {
        for (Documento documento : documentos) {
            if (documento instanceof Libro) {
                Libro libro = (Libro) documento;
                System.out.println(libro.toString());
            }
        }
    }
}
