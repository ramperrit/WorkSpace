package SwingExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import SwingExam.BoardDAO;
import SwingExam.BoardDTO;

public class ViewDialog extends JDialog {
	private BoardApp boardApp;
	private JPanel pCenter, pTitle, pContent, pWriter, pSouth;
	private JTextField txtTitle, txtWriter;
	private JTextArea txtContent;
	private JButton btnUpdate, btnDelete, btnClose;
	private int bno;
		
	
	public ViewDialog(BoardApp boardApp, int bno) {
		this.boardApp = boardApp;
		this.bno = bno;
		System.out.println(bno);
		this.setTitle("게시물 보기");					
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
		this.setBoard();
	}
	
	public JPanel getPCenter() {
		if(pCenter==null) {
			pCenter = new JPanel();
			
			
			JPanel pTitleUpdate = new JPanel();
			JLabel label = new JLabel("제목",JLabel.CENTER);
			label.setPreferredSize(new Dimension(50,30));
			pTitleUpdate.add(label);
			pTitleUpdate.add(getTxtTitle());
			pCenter.add(pTitleUpdate);
			
			JPanel pWriterUpdate = new JPanel();
			label = new JLabel("글쓴이",JLabel.CENTER);
			label.setPreferredSize(new Dimension(50,30));
			pWriterUpdate.add(label);
			pWriterUpdate.add(getTxtWriter());
			pCenter.add(pWriterUpdate);
			
			JPanel pContentUpdate = new JPanel();
			label = new JLabel("내용",JLabel.CENTER);
			label.setPreferredSize(new Dimension(50,30));
			pContentUpdate.add(label);
			pContentUpdate.add(getTxtContent());
			pCenter.add(pContentUpdate);
			
		}
		return pCenter;
	}
	
	
	public JTextField getTxtTitle() {
		if(txtTitle == null) {
			txtTitle = new JTextField();
			txtTitle.setPreferredSize(new Dimension(250,30));
		}
		return txtTitle;
	}
	
	public JTextField getTxtWriter() {
		if(txtWriter == null) {
			txtWriter = new JTextField();
			txtWriter.setPreferredSize(new Dimension(250,30));
		}
		return txtWriter;
	}
	
	public JTextArea getTxtContent() {
		if(txtContent == null) {
			txtContent = new JTextArea();
			txtContent.setPreferredSize(new Dimension(250,80));
		}
		return txtContent;
	}

	public JPanel getPTitle() {
		if(pTitle==null) {
			pTitle = new JPanel();
		}
		return pTitle;
	}	
	
	public JPanel getPWriter() {
		if(pWriter==null) {
			pWriter = new JPanel();
		}
		return pWriter;
	}		
	
	public JPanel getPContent() {
		if(pContent == null) {
			pContent = new JPanel();
		}
		return pContent;
	}

	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setBackground(Color.WHITE);
			
			JPanel pButton = new JPanel();
			pButton.setBackground(Color.WHITE);
			pButton.add(getBtnUpdate());
			pButton.add(getBtnDelete());
			pButton.add(getBtnClose());
			pSouth.add(pButton);
		}
		return pSouth;
	}
	
	public void setBoard() {
		/*코드 추가*/
	}
	
	public JButton getBtnUpdate() {
		if(btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setText("수정");
		}
		return btnUpdate;
	}
	
	public JButton getBtnDelete() {
		if(btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("삭제");
		}
		return btnDelete;
	}	
	
	public JButton getBtnClose() {
		if(btnClose == null) {
			btnClose = new JButton();
			btnClose.setText("닫기");
			dispose();
		}
		return btnClose;
	}	
}



