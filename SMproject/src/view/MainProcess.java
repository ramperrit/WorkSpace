package view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainProcess {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame main = new Main();
		});
	}

}
