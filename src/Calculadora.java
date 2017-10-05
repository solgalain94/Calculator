import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	/** numero tecleado //*/ 
	JTextField pantalla;

	/** guarda el resultado de la operacion anterior, o el n�mero tecleado */
	double resultado;
	double result;
	double result1;
	double result2;
	double resultado1;
	double resultado2;

	/** para guardar la operaccion a realizar */
	String operacion;
	String operacion2;
	String operacion3;
	String operacion4;
	String operacion5;String operacion6;String operacion7;

	/** Los paneles donde colocaremos los botones */
	JPanel panelNumeros;
	JPanel panelOperaciones;

	/** Indica si estamos iniciando o no una operaci�n */
	boolean nuevaOperacion = true;

	/**
	 * Constructor. Crea los botones y componentes de la calculadora
	 */
	public Calculadora() {
		super();
		setSize(250, 300);
		setTitle("Calculadora Simple");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		// Vamos a dibujar sobre el panel
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());

		pantalla = new JTextField("0", 20);
		pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
		pantalla.setFont(new Font("Arial", Font.BOLD, 25));
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setEditable(false);
		pantalla.setBackground(Color.WHITE);
		panel.add("North", pantalla);

		panelNumeros = new JPanel();
		panelNumeros.setLayout(new GridLayout(4, 3));
		panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));

		for (int n = 9; n >= 0; n--) {
			nuevoBotonNumerico("" + n);
		}

		nuevoBotonNumerico(".");

		panel.add("Center", panelNumeros);

		panelOperaciones = new JPanel();
		panelOperaciones.setLayout(new GridLayout(6, 1));
		panelOperaciones.setBorder(new EmptyBorder(4, 4, 4, 4));

		nuevoBotonOperacion("+");
		nuevoBotonOperacion("-");
		nuevoBotonOperacion("*");
		nuevoBotonOperacion("/");
		nuevoBotonOperacion("=");
		nuevoBotonOperacion("CE");

		panel.add("East", panelOperaciones);

		validate();
	}
	/**
	 * Crea un boton del teclado num�rico y enlaza sus eventos con el listener
	 * correspondiente
	 * 
	 * @param digito
	 *            boton a crear
	 */
	private void nuevoBotonNumerico(String digito) {
		JButton btn = new JButton();
		btn.setText(digito);
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				numeroPulsado(btn.getText());
			}
		});

		panelNumeros.add(btn);
	}

	/**
	 * Crea un bot�n de operacion y lo enlaza con sus eventos.
	 * 
	 * @param operacion
	 */
	private void nuevoBotonOperacion(String operacion) {
		JButton btn = new JButton(operacion);
		btn.setForeground(Color.RED);

		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				operacionPulsado(btn.getText());
			}
		});

		panelOperaciones.add(btn);
	}

	/**
	 * Gestiona las pulsaciones de teclas num�ricas
	 * 
	 * @param digito
	 *            tecla pulsada
	 */
	private void numeroPulsado(String digito) {
		if (pantalla.getText().equals("0") || nuevaOperacion) {
			pantalla.setText(digito);
		} else {
			pantalla.setText(pantalla.getText() + digito);
		}
		nuevaOperacion = false;
	}

	/**
	 * Gestiona el gestiona las pulsaciones de teclas de operaci�n
	 * 
	 * @param tecla
	 */
	private void operacionPulsado(String tecla) {
		if (tecla.equals("=")) {
			calcularResultado();
		} else if (tecla.equals("CE")) {
			resultado = 0;
			pantalla.setText("");
			nuevaOperacion = true;
		} else {
			operacion = tecla;
			if ((resultado > 0) && (!nuevaOperacion)) {
				calcularResultado();
			} else {
				resultado = new Double(pantalla.getText());
			}
		}

		nuevaOperacion = true;
	}
	private void resultObtenido(String a){
		  if (a.equals(0)){
			  String variable="0";
		  }
		  else if (a.equals(1)){
			  String variable="1";
			  }
			  
		  else if(a.equals(2)){
			  String variable="2";
		  }
		  else if(a.equals(3)){
			  String variable="3";
		  }
		  else if(a.equals(4)){
			  String variable="4";
		  }
		  else if(a.equals(5)){
			  String variable="5";
		  }
		  else if(a.equals(6)){
			  String variable="6";
		  }
		  else if(a.equals(7)){
			  String variable="7";
		  }
		  else if(a.equals(8)){
			  String variable="8";
		  }
		  else if(a.equals(9)){
			  String variable="9";
		  }
		  else if(a.equals(10)){
			  String variable="10";
		  }
		  else if(a.equals(11)){
			  String variable="11";
		  }
		  else if(a.equals(12)){
			  String variable="12";
		  }
				  
		}
	private void resultadoObtenido(String a){
	  if (a.equals(0)){
		  String variable="0";
	  }
	  else if (a.equals(1)){
			  String variable="1";
		  }
		  
	  else if(a.equals(2)){
		  String variable="2";
	  }
	  else if(a.equals(3)){
		  String variable="3";
	  }
	  else if(a.equals(4)){
		  String variable="4";
	  }
	  else if(a.equals(5)){
		  String variable="5";
	  }
	  else if(a.equals(6)){
		  String variable="6";
	  }
	  else if(a.equals(7)){
		  String variable="7";
	  }
	  else if(a.equals(8)){
		  String variable="8";
	  }
	  else if(a.equals(9)){
		  String variable="9";
	  }
	  else if(a.equals(10)){
		  String variable="10";
	  }
	  else if(a.equals(11)){
		  String variable="11";
	  }
	  else if(a.equals(12)){
		  String variable="12";
	  }
			  
	}
	private void resultObtenido3(String a){
		  if (a.equals(0)){
			  String variable="0";
		  }
		  else if (a.equals(1)){
				  String variable="1";
			  }
			  
		  else if(a.equals(2)){
			  String variable="2";
		  }
		  else if(a.equals(3)){
			  String variable="3";
		  }
		  else if(a.equals(4)){
			  String variable="4";
		  }
		  else if(a.equals(5)){
			  String variable="5";
		  }
		  else if(a.equals(6)){
			  String variable="6";
		  }
		  else if(a.equals(7)){
			  String variable="7";
		  }
		  else if(a.equals(8)){
			  String variable="8";
		  }
		  else if(a.equals(9)){
			  String variable="9";
		  }
		  else if(a.equals(10)){
			  String variable="10";
		  }
		  else if(a.equals(11)){
			  String variable="11";
		  }
		  else if(a.equals(12)){
			  String variable="12";
		  }
				  
		}
	private void resultObtenido2(String a){
		  if (a.equals(0)){
			  String variable="0";
		  }
		  else if (a.equals(1)){
				  String variable="1";
			  }
			  
		  else if(a.equals(2)){
			  String variable="2";
		  }
		  else if(a.equals(3)){
			  String variable="3";
		  }
		  else if(a.equals(4)){
			  String variable="4";
		  }
		  else if(a.equals(5)){
			  String variable="5";
		  }
		  else if(a.equals(6)){
			  String variable="6";
		  }
		  else if(a.equals(7)){
			  String variable="7";
		  }
		  else if(a.equals(8)){
			  String variable="8";
		  }
		  else if(a.equals(9)){
			  String variable="9";
		  }
		  else if(a.equals(10)){
			  String variable="10";
		  }
		  else if(a.equals(11)){
			  String variable="11";
		  }
		  else if(a.equals(12)){
			  String variable="12";
		  }
				  
		}

	/**
	 * Calcula el resultado y lo muestra por pantalla
	 */
	private void calcularResultado() {
		if (operacion.equals("+")) {
			resultado += new Double(pantalla.getText());
		} else if (operacion.equals("-")) {
			resultado -= new Double(pantalla.getText());
		} else if (operacion.equals("/")) {
			resultado /= new Double(pantalla.getText());
		} else if (operacion.equals("*")) {
			resultado *= new Double(pantalla.getText());
		}

		pantalla.setText("" + resultado);
		operacion = "";
	}
}

