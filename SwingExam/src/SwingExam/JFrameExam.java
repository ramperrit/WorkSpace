package SwingExam;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFrameExam extends JFrame{

	public JFrameExam() {
		this.setSize(600, 500);
		this.setIconImage(new ImageIcon(getClass().getResource("a.png")).getImage());
		this.setTitle("아무생각없음");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> {
			JFrameExam JFrame = new JFrameExam();
			JFrame.setVisible(true);
		});
	}

}
