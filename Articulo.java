public class Articulo {

	private String descripcion;
	private double precio;

	Articulo(String descripcion, double precio){
		this.descripcion=descripcion;
		this.precio=precio;
	}

	public double calcularPrecioConIva(){
		double pciva=precio*1.16;
		return pciva;
	}

}