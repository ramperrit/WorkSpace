package SwingExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JTextAreaExam extends JFrame {

	private JTextArea txtDisplay;
	private JPanel pSouth;
	private JTextField txtInput;
	private JButton btnSend;
	
	public JTextAreaExam() {
		this.setTitle("채팅형 메모장");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getTxtDisplay()),BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(),BorderLayout.SOUTH);
		this.setSize(300,200);
	}
	
	public JTextArea getTxtDisplay() {
		if(txtDisplay == null) {
			txtDisplay = new JTextArea();
			txtDisplay.setEditable(false);
		}
		return txtDisplay;
	}
	
	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setLayout(new BorderLayout());
			pSouth.add(getTxtInput(),BorderLayout.CENTER);
			pSouth.add(getBtnSend(),BorderLayout.EAST);
		}
		return pSouth;
	}
	
	public JTextField getTxtInput() {
		if(txtInput == null) {
			txtInput = new JTextField();
			txtInput.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						getTxtDisplay().append(getTxtInput().getText()+"\n");
						getTxtInput().setText("");
					}
				}
			});
		}
		return txtInput;
	}
	
	public JButton getBtnSend() {
		if(btnSend == null) {
			btnSend = new JButton();
			btnSend.setText("전송");
			btnSend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getTxtDisplay().append(getTxtInput().getText()+"\n");
					getTxtInput().setText("");
				}
			});
		}
		return btnSend;
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTextAreaExam ja = new JTextAreaExam();
				ja.setVisible(true);
			}
		});
	}
}
