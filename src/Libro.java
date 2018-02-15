
public class Libro {

	// Atributos
    private String nombre;
    private String autor;
    private int ejemplares;
    private int prestados;
	
    public Libro() {
    
    }
    
    public Libro(String nombre, String autor, int ejemplares, int prestados) {
    	this.nombre = nombre;
    	this.autor = autor;
    	this.ejemplares = ejemplares;
    	this.prestados = prestados;
    }
    
    
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getPrestados() {
		return prestados;
	}
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	public boolean Prestamo() {
		if (this.ejemplares > 0){
			this.ejemplares--;
			this.prestados++;
			return true;	
		}
		else {
			System.out.println("Error: No quedan ejemplares.");
			return false;
			
		}
	}
	
	public boolean Devolucion() {
		if (this.prestados > 0){
			this.ejemplares++;
			this.prestados--;
			return true;	
		}
		else {
			System.out.println("Error: Todos los ejemplares ya han sido devueltos.");
			return false;
		}
	}
	
	public String toString (){
        String mensaje = "El libro se llama " + nombre + " y su autor es  " + autor + ". Hay: " +
                         ejemplares + " ejemplares disponibles y  " + prestados + " ejemplares prestados.";
        return mensaje;
    }
	
}
