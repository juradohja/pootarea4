import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiVentana extends JFrame{
	
	private int width=400, height=400, cont=0;
	private JLabel desc1, desc2, desc3, total;
	private JTextField char1, char2, char3;
	private JButton addArticulo;
	private Usuario usuario;

	public MiVentana(Usuario usuario){
		setSize(width,height);
		setTitle("Tarea 4");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
		this.usuario=usuario;
	}

	public void initComponents(){
		desc1 = new JLabel("Artículo:");
		desc2 = new JLabel("Talla:");
		desc3 = new JLabel("Precio:");
		total = new JLabel();
		char1 = new JTextField(20);
		char2 = new JTextField(20);
		char2.setText("0");
		char3 = new JTextField(20);
		addArticulo = new JButton("Agregar producto");
		addArticulo.addActionListener(new ButtonListener());
		add(desc1);
		add(char1);
		add(desc2);
		add(char2);
		add(desc3);
		add(char3);
		add(addArticulo);
		add(total);
	}

	public class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(cont<5){
				String d = char1.getText();
				int t = Integer.parseInt(char2.getText());
				double p = Double.parseDouble(char3.getText());
				if(t==0){
					Articulo articulo = new Articulo(d, p);
					usuario.getCarrito().agregarArticulo(articulo, cont);
				} else {
					Articulo articulo = new Ropa(d, p, t);
					usuario.getCarrito().agregarArticulo(articulo, cont);
				}
				cont++;
			}
			char1.setText("");
			char2.setText("0");
			char3.setText("");
			if(cont==5){
				total.setText("Precio final: $"+usuario.getCarrito().calcularPrecioFinal());
			}
		}
	}

}