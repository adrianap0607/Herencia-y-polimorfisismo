//Universidad del Valle de Guatemala	                                                                                            
//Adriana Palacios 
//CC2008 - Introducción a la Programación Orientada a Objetos 
//carné 23044
//Semestre II, 2023




public class Articulo extends Documento {
    private String nombreArbitro;

    public Articulo(int id, String titulo, String materia, int cantidadEjemplares, String estado, String nombreArbitro) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.nombreArbitro = nombreArbitro;
    }

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    @Override
    public String toString() {
        return "Articulo [ID: " + getId() + ", Título: " + getTitulo() + ", Materia: " + getMateria()
                + ", Cantidad de Ejemplares: " + getCantidadEjemplares() + ", Estado: " + getEstado() + ", Árbitro: " + nombreArbitro + "]";
    }
}
