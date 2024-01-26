package SwingExam;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GridLayoutExam extends JFrame {

	private JButton[][] btn;
	private JLabel centerImg;
	
	//메인 윈도우
	public GridLayoutExam() {
		setTitle("Griddddddddddd");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//GridLayout
		setLayout(new GridLayout(3,3));
		for(int r = 0; r<3; r++) {
			for(int c = 0; c<3; c++) {
				if(r==1 && c==1) {
					getContentPane().add(getCenterImg());
				} else {
					getContentPane().add(getBtn()[r][c]);
					
				}
			}
		}
	}
	//그림
	public JLabel getCenterImg() {
		if(centerImg == null) {
			centerImg = new JLabel();
			centerImg.setIcon(new ImageIcon(getClass().getResource("a.png")));
		}
		return centerImg; 
	}
	
	
	//버튼
	public JButton[][] getBtn(){
		if(btn == null) {
			btn = new JButton[3][3];
			for(int r =0; r<3; r++) {
				for(int c=0;c<3;c++) {
					if(r == 1 && c == 1) {
						btn[r][c] = null;
						continue;
					}
					btn[r][c] = new JButton();
					btn[r][c].setText("["+r+"]"+"["+c+"]");
				}
			}
		}
		return btn;
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GridLayoutExam gl = new GridLayoutExam();
				gl.setVisible(true);
			}
		});
	}

}
