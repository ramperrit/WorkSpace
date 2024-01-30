package SwingExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class BoardApp extends JFrame {
	private BoardApp board;
	private JTable jTable;
	private JPanel pSouth;
	private JButton btnInsert;
	
	public BoardApp() {
		this.board = this;
		this.setTitle("게시판 리스트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getBoardTable()), BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setSize(600, 450);
		locationCenter();
	}
	
	public JTable getBoardTable() {
		if(jTable == null) {
			jTable = new JTable();
			final DefaultTableModel tableModel = (DefaultTableModel)jTable.getModel();
			tableModel.addColumn("번호");
			tableModel.addColumn("제목");
			tableModel.addColumn("글쓴이");
			tableModel.addColumn("날짜");
			tableModel.addColumn("조회수");
			
			jTable.getColumn("번호").setPreferredWidth(50);
			jTable.getColumn("제목").setPreferredWidth(300);
			jTable.getColumn("글쓴이").setPreferredWidth(100);
			jTable.getColumn("날짜").setPreferredWidth(100);
			jTable.getColumn("조회수").setPreferredWidth(50);
			
			jTable.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
//					jTable.setBackground(Color.YELLOW); 선택 열로 수정필요
					ViewDialog vd = new ViewDialog(board, jTable.getSelectedRow()+1);
					vd.setVisible(true);
				}
				
			});
		}
		return jTable;
	}
	
	public JPanel getPSouth() {
		if(pSouth == null) {
			pSouth = new JPanel();
			pSouth.setLayout(new BorderLayout());
			pSouth.add(getBtnInsert(),BorderLayout.CENTER);
		}
		return pSouth;
	}

	public JButton getBtnInsert() {
		if(btnInsert == null) {
			btnInsert = new JButton();
			btnInsert.setText("추가");
			btnInsert.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					InsertDialog id = new InsertDialog(BoardApp.this);
					id.setVisible(true);
				}
			});
		}
		return btnInsert;
	}
	
	private void locationCenter() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Point centerPoint = ge.getCenterPoint();
		int leftTopX = centerPoint.x - this.getWidth()/2;
		int leftTopY = centerPoint.y - this.getHeight()/2;
		this.setLocation(leftTopX, leftTopY);
	}
	
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
        	BoardApp board = new BoardApp();
        	board.setVisible(true);
	    });
	}	
}
