import java.util.*;

public class Main{
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Nombre:");
		String nombre=scanner.nextLine();
		System.out.println("Correo electrónico:");
		String correo=scanner.nextLine();
		System.out.println("Contraseña:");
		String contrasena=scanner.nextLine();
		Usuario usuario = new Usuario(nombre, correo, contrasena);

		for(int i=0;i<usuario.getCarrito().getArregloLength();i++){
			System.out.println("Descripción artículo "+(i+1)+":");
			String descripcion=scanner.nextLine();
			System.out.println("Precio artículo "+(i+1)+":");
			double precio=scanner.nextDouble();
			Articulo articulo=new Articulo(descripcion, precio);
			usuario.getCarrito().agregarArticulo(articulo, i);
		}

		usuario.getCarrito().finalizarCompra();
	}
}