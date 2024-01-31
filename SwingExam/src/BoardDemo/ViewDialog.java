package BoardDemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

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
			BoardDTO dto = new BoardDAO().getInstance().getBoardByBno(bno);
			if(txtTitle == null) {
				txtTitle = new JTextField();
				txtTitle.setPreferredSize(new Dimension(250,30));
				txtTitle.setText(dto.getTitle());
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
			BoardDTO dto = new BoardDAO().getInstance().getBoardByBno(bno);
			if(txtWriter == null) {
				txtWriter = new JTextField();
				txtWriter.setPreferredSize(new Dimension(250,30));
				txtWriter.setText(dto.getWriter());
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
			BoardDTO dto = new BoardDAO().getInstance().getBoardByBno(bno);
			if(txtContent == null) {
				txtContent = new JTextArea();
				txtContent.setPreferredSize(new Dimension(250,80));
				txtContent.setText(dto.getContent());
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
			pButton.add(getBtnUpdate());
			pButton.add(getBtnDelete());
			pButton.add(getBtnClose());
			pSouth.add(pButton);
		}
		return pSouth;
	}
	
	//조회수
	public void setBoard() {
		
	}
	
	//dao.updateboard
	public JButton getBtnUpdate() {
		if(btnUpdate == null) {
			btnUpdate = new JButton();
			btnUpdate.setText("수정");
		}
		return btnUpdate;
	}
	
	//dao.deleteboard
	public JButton getBtnDelete() {
		if(btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("삭제");
			btnDelete.addActionListener(e -> {BoardDAO.getInstance().deleteBoard(bno); dispose();});
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



