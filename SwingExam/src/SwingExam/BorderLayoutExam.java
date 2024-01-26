package SwingExam;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BorderLayoutExam extends JFrame{

	private JTextField txtNorth;
	private JLabel imgCenter;
	private JButton btnSouth;
	
	//메인 윈도우
	public BorderLayoutExam() {
		this.setTitle("LayOUUUUUUUUUUUUUUUUUUUUUUUUT");
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//배치
		this.getContentPane().add(getTxtNorth(), BorderLayout.NORTH);
		this.getContentPane().add(getImgCenter(), BorderLayout.CENTER);
		this.getContentPane().add(getBtnSouth(), BorderLayout.SOUTH);
	}
	
	//JTextField 생성
	private JTextField getTxtNorth() {
		if(txtNorth == null) {
			txtNorth = new JTextField();
			txtNorth.setText("북북북북북");
			txtNorth.setBackground(Color.GREEN);
		}
		return txtNorth;
	}
	
	private JButton getBtnSouth() {
		if(btnSouth == null) {
			btnSouth = new JButton();
			btnSouth.setText("남남남남남남남");
			btnSouth.setBackground(Color.RED);
		}
		return btnSouth;
	}
	
	private JLabel getImgCenter() {
		if(imgCenter == null) {
			imgCenter = new JLabel();
			imgCenter.setIcon(new ImageIcon(getClass().getResource("a.png")));
		}
		return imgCenter;
	}
	
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BorderLayoutExam jb = new BorderLayoutExam();
				jb.setVisible(true);
			}
		});
		
		
	}

}
