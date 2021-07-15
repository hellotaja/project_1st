package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.All_price;
import model.Change_menu;

public class Manager_menu_1_1 {

	private JFrame frame;
	private JTextField tfl_nowRecNum;
	private JTextField tfl_changeRecNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_menu_1_1 window = new Manager_menu_1_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manager_menu_1_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setContentPane(new JLabel(new ImageIcon("./img/background/background_1280x700.jpg")));
		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB9E4\uCD9C \uB0B4\uC5ED");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("비트로 코어 TTF", Font.BOLD, 50));
		lblNewLabel.setBounds(36, 10, 332, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(36, 119, 700, 515);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 15));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(12, 10, 676, 495);
		panel.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 10, 676, 495);
		panel.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("\uD604\uC7AC \uCD94\uCC9C\uBA54\uB274 \uBC88\uD638 \uC785\uB825");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(776, 119, 332, 68);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uBC14\uAFC0 \uCD94\uCC9C\uBA54\uB274 \uBC88\uD638 \uC785\uB825");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(776, 275, 332, 68);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		tfl_nowRecNum = new JTextField();
		tfl_nowRecNum.setBounds(776, 197, 175, 42);
		frame.getContentPane().add(tfl_nowRecNum);
		tfl_nowRecNum.setColumns(10);
		
		tfl_changeRecNum = new JTextField();
		tfl_changeRecNum.setColumns(10);
		tfl_changeRecNum.setBounds(776, 353, 175, 42);
		frame.getContentPane().add(tfl_changeRecNum);
		
		JButton btn_changeRecommand = new JButton("\uBCC0\uACBD \uC0AC\uD56D \uC801\uC6A9");
		btn_changeRecommand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//변경사항 적용
				int now = Integer.parseInt(tfl_nowRecNum.getText());
				int change = Integer.parseInt(tfl_changeRecNum.getText());
				
				Change_menu cm = new Change_menu();
				cm.inputnew(now, change);
				JOptionPane.showMessageDialog(null, "메뉴 변경 성공");
			}
		});
		btn_changeRecommand.setBackground(Color.WHITE);
		btn_changeRecommand.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
		btn_changeRecommand.setBounds(963, 353, 157, 42);
		frame.getContentPane().add(btn_changeRecommand);
		
		JButton btn_back = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btn_back.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
		btn_back.setBackground(Color.WHITE);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_1 lg = new Login_1();
				lg.main(null);
			}
		});
		btn_back.setBounds(1147, 635, 105, 36);
		frame.getContentPane().add(btn_back);
		
		JButton btnNewButton = new JButton("\uB9E4\uCD9C\uB0B4\uC5ED\uC870\uD68C");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				All_price all = new All_price();
				all.allprice(textArea);
			}
		});
		btnNewButton.setBounds(602, 86, 134, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
