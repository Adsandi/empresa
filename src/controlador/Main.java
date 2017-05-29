package controlador;

import java.awt.EventQueue;
public class Main {
	/**
	 * Launch the application.
	 */
	/**
	 * Hola que ase 
	 * pues na aki el buen javadoc
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaUI frame = new ParaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



}
