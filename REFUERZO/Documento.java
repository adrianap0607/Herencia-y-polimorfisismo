//Universidad del Valle de Guatemala	                                                                                            
//Adriana Palacios 
//CC2008 - Introducción a la Programación Orientada a Objetos 
//carné 23044
//Semestre II, 2023


/**
 * Esta clase representa un documento genérico en una biblioteca.
 * Contiene información sobre el ID, título, materia, cantidad de ejemplares y estado del documento.
 */
public class Documento {
    private int id;
    private String titulo;
    private String materia;
    private int cantidadEjemplares;
    private String estado;

    /**
     * Constructor para crear una instancia de la clase Documento.
     *
     * @param id                 El ID del documento.
     * @param titulo             El título del documento.
     * @param materia            La materia del documento.
     * @param cantidadEjemplares La cantidad de ejemplares del documento.
     * @param estado             El estado del documento (disponible o agotado).
     */
    public Documento(int id, String titulo, String materia, int cantidadEjemplares, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidadEjemplares = cantidadEjemplares;
        this.estado = estado;
    }

    /**
     * Obtiene el ID del documento.
     *
     * @return El ID del documento.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el título del documento.
     *
     * @return El título del documento.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la materia del documento.
     *
     * @return La materia del documento.
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Obtiene la cantidad de ejemplares del documento.
     *
     * @return La cantidad de ejemplares del documento.
     */
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    /**
     * Obtiene el estado del documento.
     *
     * @return El estado del documento (disponible o agotado).
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Obtiene una representación en forma de cadena del documento.
     *
     * @return Una cadena que describe el documento, incluyendo su ID, título, materia, cantidad de ejemplares y estado.
     */
    @Override
    public String toString() {
        return "Documento [ID: " + id + ", Título: " + titulo + ", Materia: " + materia
                + ", Cantidad de Ejemplares: " + cantidadEjemplares + ", Estado: " + estado + "]";
    }
}
