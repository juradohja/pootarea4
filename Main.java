import java.util.*;

public class Main{
	public static void main(String[] args) {
		Usuario usuario = new Usuario("Nombre", "Correo", "Contrasena");
		MiVentana window = new MiVentana(usuario);

	/*	for(int i=0;i<usuario.getCarrito().getArregloLength();i++){
			System.out.println("Descripción artículo "+(i+1)+":");
			String descripcion=scanner.nextLine();
			System.out.println("Precio artículo "+(i+1)+":");
			double precio=scanner.nextDouble();
			Articulo articulo=new Articulo(descripcion, precio);
			usuario.getCarrito().agregarArticulo(articulo, i);
		}
		usuario.getCarrito().finalizarCompra(); */
	}
}