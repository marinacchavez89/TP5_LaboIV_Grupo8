package TP5;

import javax.swing.JFrame;

public class Principal extends JFrame {	
	 
	 public Principal() {
	        setTitle("Programa");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);
	        setLocationRelativeTo(null);	        
	    }

	public static void main(String[] args) {
		 Principal ventana = new Principal();
	        ventana.setVisible(true);
	}
}
