public class CarritoDeCompras{

	private Articulo arreglo[];
	private double precioFinal;

	CarritoDeCompras(){
		arreglo=new Articulo[5];
	}

	public int getArregloLength(){
		return arreglo.length;
	}

	public double calcularPrecioFinal(){
		precioFinal=0;
		for(int i=0;i<arreglo.length;i++){
			precioFinal=precioFinal+arreglo[i].calcularPrecioConIva();
		}
		return precioFinal;
	}

	public void agregarArticulo(Articulo articulo, int i){
		arreglo[i]=articulo;
	}

	public void finalizarCompra(){
		System.out.println("Gracias por su compra.");
		System.out.println("Precio Final: $"+calcularPrecioFinal());
	}
}