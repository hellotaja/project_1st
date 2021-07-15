package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.MemberDAO;
import model.MemberDTO;

public class Join_2 {
	

	private JFrame frame;
	private JTextField tfl_membernum;
	private JTextField tfl_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join_2 window = new Join_2();
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
	public Join_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 625);
		
		
//		Background panel = new Background(new ImageIcon("./img/background/background_join.png").getImage());
		frame.setContentPane(new JLabel(new ImageIcon("./img/background/background_join.png")));
//		frame.getContentPane().add(panel);
		frame.pack();

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0  \uAC00\uC785");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("비트로 코어 TTF", Font.BOLD, 50));
		lblNewLabel.setBounds(12, 40, 413, 100);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0 \uBC88\uD638 : ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("비트로 프라이드 TTF", Font.BOLD, 30));
		lblNewLabel_1.setBounds(70, 230, 143, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC131\uD568 : ");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("비트로 프라이드 TTF", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(93, 290, 120, 47);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		tfl_membernum = new JTextField();
		tfl_membernum.setBounds(225, 230, 174, 47);
		frame.getContentPane().add(tfl_membernum);
		tfl_membernum.setColumns(10);
		
		tfl_name = new JTextField();
		tfl_name.setColumns(10);
		tfl_name.setBounds(225, 290, 174, 47);
		frame.getContentPane().add(tfl_name);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
		btnNewButton.setBounds(63, 470, 150, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btn_join = new JButton("\uAC00\uC785 \uC644\uB8CC");
		btn_join.setBackground(Color.WHITE);
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int membernum = Integer.parseInt(tfl_membernum.getText());
         		String name = tfl_name.getText();
         		if(membernum!=0 && !name.equals("")) {
         				MemberDTO dto = new MemberDTO(membernum, name);
         				MemberDAO dao = new MemberDAO();
         				
         				boolean result = dao.join(dto);
         				if(result == true) {JOptionPane.showMessageDialog(null, "회원가입 성공");
         				// 로그인 페이지로 돌아가기
         				Login_1 login = new Login_1();
         				login.main(null);
         				frame.dispose();
         				}
         				else {JOptionPane.showMessageDialog(null, "다른 회원번호를 입력하세요");}
         		
         		}
         		else {
         		JOptionPane.showMessageDialog(null, "모든 정보를 입력하세요","회원가입",JOptionPane.ERROR_MESSAGE);
         		}
         		
         	}
				
		});
		
		btn_join.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
		btn_join.setBounds(225, 470, 165, 56);
		frame.getContentPane().add(btn_join);
	}
}
