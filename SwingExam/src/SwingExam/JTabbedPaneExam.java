package SwingExam;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JTabbedPaneExam extends JFrame{

	private JTabbedPane JTabbedPane;
	private JPanel tab1Panel;
	private JPanel tab2Panel;
	
	public JTabbedPaneExam() {
		this.setTitle("탭 예제");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getJTabbedPane(), BorderLayout.CENTER);
	}
	
	private JTabbedPane getJTabbedPane() {
		if(JTabbedPane == null) {
			JTabbedPane = new JTabbedPane();
			JTabbedPane.setTabPlacement(JTabbedPane.LEFT);
			JTabbedPane.addTab("탭1", getTab1Panel());
			JTabbedPane.addTab("탭2", getTab2Panel());
		}
		return this.JTabbedPane;
	}
	
	private JPanel getTab1Panel() {
		if(tab1Panel == null) {
			tab1Panel = new JPanel();
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("a.png")));
			tab1Panel.add(jLabel);
		}
		return tab1Panel;
	}
	
	private JPanel getTab2Panel() {
		if(tab2Panel == null) {
			tab2Panel = new JPanel();
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("a.png")));
			tab2Panel.add(jLabel);
		}
		return tab2Panel;
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> {
			JTabbedPaneExam jTab = new JTabbedPaneExam();
			jTab.setVisible(true);
		});
	}

}
