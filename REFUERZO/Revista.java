//Universidad del Valle de Guatemala	                                                                                            
//Adriana Palacios 
//CC2008 - Introducción a la Programación Orientada a Objetos 
//carné 23044
//Semestre II, 2023


/**
 * Esta clase representa una revista que extiende la clase Documento.
 * Contiene información adicional sobre el año y el número de la revista.
 */
public class Revista extends Documento {
    private int ano;
    private int numero;

    /**
     * Constructor para crear una instancia de la clase Revista.
     *
     * @param id                 El ID de la revista.
     * @param titulo             El título de la revista.
     * @param materia            La materia de la revista.
     * @param cantidadEjemplares La cantidad de ejemplares de la revista.
     * @param estado             El estado de la revista (disponible o agotado).
     * @param ano                El año de la revista.
     * @param numero             El número de la revista.
     */
    public Revista(int id, String titulo, String materia, int cantidadEjemplares, String estado, int ano, int numero) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.ano = ano;
        this.numero = numero;
    }

    /**
     * Obtiene el año de la revista.
     *
     * @return El año de la revista.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Obtiene el número de la revista.
     *
     * @return El número de la revista.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene una representación en forma de cadena de la revista.
     *
     * @return Una cadena que describe la revista, incluyendo su ID, título, materia, cantidad de ejemplares, estado, año y número.
     */
    @Override
    public String toString() {
        return "Revista [ID: " + getId() + ", Título: " + getTitulo() + ", Materia: " + getMateria()
                + ", Cantidad de Ejemplares: " + getCantidadEjemplares() + ", Estado: " + getEstado()
                + ", Año: " + ano + ", Número: " + numero + "]";
    }
}
