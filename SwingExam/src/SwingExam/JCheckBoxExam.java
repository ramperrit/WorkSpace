package SwingExam;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JCheckBoxExam extends JFrame{

	private JPanel pWest;
	private JCheckBox cbImg1;
	private JCheckBox cbImg2;
	private JLabel lblPicture;
	
	public JCheckBoxExam() {
		this.setTitle("쳌박");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getPWest(), BorderLayout.WEST);
		this.getContentPane().add(getLblPicture(),BorderLayout.CENTER);
		this.pack();
	}
	
	public JPanel getPWest() {
		if(pWest == null) {
			pWest = new JPanel(new GridLayout(2,1));
			pWest.add(getCbImg1());
			pWest.add(getCbImg2());
		}
		return pWest;
	}
	
	public JCheckBox getCbImg1() {
		if(cbImg1 == null) {
			cbImg1 = new JCheckBox();
			cbImg1.setText("인생");
			cbImg1.addActionListener(actionListener);
		}
		return cbImg1;
	}
	
	public JCheckBox getCbImg2() {
		if(cbImg2 == null) {
			cbImg2 = new JCheckBox();
			cbImg2.setText("헤");
			cbImg2.addActionListener(actionListener);
		}
		return cbImg2;
	}
	
	public JLabel getLblPicture() {
		if(lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("a.png")));
		}
		return lblPicture;
	}
	
	private ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(cbImg1.isSelected()&&cbImg2.isSelected()) {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("d.png")));
			}else if(cbImg1.isSelected()) {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("c.png")));
			}else if(cbImg2.isSelected()) {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("b.png")));
			}else {
				lblPicture.setIcon(new ImageIcon(getClass().getResource("a.png")));
			}
		}
	};
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JCheckBoxExam jc = new JCheckBoxExam();
				jc.setVisible(true);
			}
		});
	}

}
