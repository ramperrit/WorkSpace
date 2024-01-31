package BoardDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			pCenter.add(getPTitle());
			pCenter.add(getPWriter());
			pCenter.add(getPContent());
		}
		return pCenter;
	}
	
	public JPanel getPTitle() {
		if(pTitle==null) {
			pTitle = new JPanel();
			JLabel label = new JLabel("제목",JLabel.CENTER);
			label.setPreferredSize(new Dimension(50,30));
			pTitle.add(label);
			if(txtTitle == null) {
				txtTitle = new JTextField();
				txtTitle.setPreferredSize(new Dimension(250,30));
				txtTitle.getText();
			}
			pTitle.add(txtTitle);
		}
		return pTitle;
	}	
	
	public JPanel getPWriter() {
		if(pWriter==null) {
			pWriter = new JPanel();
			JLabel label = new JLabel("글쓴이",JLabel.CENTER);
			label.setPreferredSize(new Dimension(50,30));
			pWriter.add(label);
			if(txtWriter == null) {
				txtWriter = new JTextField();
				txtWriter.setPreferredSize(new Dimension(250,30));
				txtWriter.getText();
			}
			pWriter.add(txtWriter);
			
		}
		return pWriter;
	}		
	
	public JPanel getPContent() {
		if(pContent==null) {
			pContent = new JPanel();
			JLabel label = new JLabel("내용",JLabel.CENTER);
			label.setPreferredSize(new Dimension(50,30));
			pContent.add(label);
			if(txtContent == null) {
				txtContent = new JTextArea();
				txtContent.setPreferredSize(new Dimension(250,80));
				txtContent.getText();
			}
			pContent.add(txtContent);
			
		}
		return pContent;
	}
	
	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setBackground(Color.WHITE);
			
			JPanel pButton = new JPanel();
			pButton.setBackground(Color.WHITE);
			pButton.add(getBtnOk());
			pButton.add(getBtnCancel());
			pSouth.add(pButton);
		}
		return pSouth;
	}
	
	public JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("저장");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BoardDTO dto = new BoardDTO();
					dto.setTitle(txtTitle.getText());
					dto.setWriter(txtWriter.getText());
					dto.setContent(txtContent.getText());
					BoardDAO.getInstance().insertBoard(dto);
					boardApp.getBoardTable();
					dispose();
				}
				
			});
		}
		return btnOk;
	}
	
	public JButton getBtnCancel() {
		if(btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("취소");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnCancel;
	}	
}


