package launcher;

import interfazGrafica.LoginWindowBuilderPro;

import java.awt.EventQueue;

public class Launcher {
	public static void main(final String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindowBuilderPro frame = new LoginWindowBuilderPro();
					frame.mostrarVentana();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}