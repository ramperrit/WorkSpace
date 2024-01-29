package SwingExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InsertDialog extends JDialog {
	private BoardApp boardApp;
	private JPanel pCenter, pTitle, pContent, pWriter, pSouth;
	private JTextField txtTitle, txtWriter;
	private JTextArea txtContent;
	private JButton btnOk, btnCancel;
	
	public InsertDialog(BoardApp boardApp) {
		this.boardApp = boardApp;
		this.setTitle("게시물 작성");					
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setResizable(false);	
		this.setModal(true);
		this.setSize(400, 270);
		
		this.setLocation(
			boardApp.getLocationOnScreen().x + (boardApp.getWidth()-this.getWidth())/2,
			boardApp.getLocationOnScreen().y + (boardApp.getHeight()-this.getHeight())/2
		);
		
		this.getContentPane().add(getPCenter(), BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
	}
	
	public JPanel getPCenter() {
		if(pCenter==null) {
			pCenter = new JPanel();
			
			pCenter.setLayout(new GridLayout(4,1));
			
			JPanel pTitleInput = new JPanel();
			pTitleInput.setLayout(new GridLayout(1,2));
			pTitleInput.add(new JLabel("제목",JLabel.LEFT));
			pTitleInput.add(getPTitle());
			pCenter.add(pTitleInput);
			
			JPanel pWriterInput = new JPanel();
			pWriter.setLayout(new GridLayout(1,2));
			pWriter.add(new JLabel("글쓴이",JLabel.LEFT));
			pWriter.add(getPWriter());
			pCenter.add(pWriterInput);
			
			JPanel pContentInput = new JPanel();
			pContent.setLayout(new GridLayout(1,2));
			pContent.add(new JLabel("내용",JLabel.LEFT));
			pContent.add(getPContent());
			pCenter.add(pContentInput);
			
		}
		return pCenter;
	}
	
	public JPanel getPTitle() {
		if(pTitle==null) {
			/*코드 추가*/
		}
		return pTitle;
	}	
	
	public JPanel getPWriter() {
		if(pWriter==null) {
			/*코드 추가*/
		}
		return pWriter;
	}		
	
	public JPanel getPContent() {
		if(pContent == null) {
			/*코드 추가*/
		}
		return pContent;
	}
	
	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			
			JPanel pButton = new JPanel();
			pButton.setBackground(Color.white);
			pButton.add(getBtnOk());
			pButton.add(getBtnCancel());
			pSouth.add(pButton);
		}
		return pSouth;
	}
	
	public JButton getBtnOk() {
		if(btnOk == null) {
			/*코드 추가*/
		}
		return btnOk;
	}
	
	public JButton getBtnCancel() {
		if(btnCancel == null) {
			/*코드 추가*/
		}
		return btnCancel;
	}	
}


