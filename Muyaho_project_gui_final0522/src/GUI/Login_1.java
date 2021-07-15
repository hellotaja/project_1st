package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Member_order;
import model.savelogin;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Login_1 {
	int inputnum ;

	private JFrame frame;
	private JTextField tfl_manager;
	private JTextField tfl_inputnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_1 window = new Login_1();
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
	public Login_1() {
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
		
		JPanel pan_member = new JPanel();
		pan_member.setBackground(new Color(210, 180, 140));
		pan_member.setBounds(200, 200, 300, 330);
		frame.getContentPane().add(pan_member);
		pan_member.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C \uC6D0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("비트로 프라이드 TTF", Font.BOLD, 40));
		lblNewLabel_1.setBounds(12, 10, 274, 100);
		pan_member.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uD68C\uC6D0 \uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694.");
		lblNewLabel_2.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(12, 151, 274, 39);
		pan_member.add(lblNewLabel_2);
		
		tfl_inputnum = new JTextField();
		tfl_inputnum.setBounds(98, 203, 188, 29);
		pan_member.add(tfl_inputnum);
		tfl_inputnum.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uD68C\uC6D0 \uBC88\uD638 : ");
		lblNewLabel_3.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(12, 202, 74, 29);
		pan_member.add(lblNewLabel_3);
		
		JButton btn_order_member = new JButton("\uC8FC\uBB38 \uD558\uAE30");
		btn_order_member.setBackground(Color.WHITE);
		btn_order_member.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
		btn_order_member.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			    inputnum = Integer.parseInt(tfl_inputnum.getText());
			    savelogin sv = new savelogin();
			    //sv.setInputnum(inputnum);
			    System.out.println(sv.getInputnum());
				Member_order mo = new Member_order();
				boolean result = mo.login_member(inputnum);
				if (result) {
					//번호 잘 입력하면 다음 페이지
					OrderMain om = new OrderMain(inputnum);
					om.main(null);
					frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "회원 번호를 다시 입력하세요");
				}				
				//
			}
		});
		btn_order_member.setBounds(12, 270, 276, 50);
		pan_member.add(btn_order_member);
		

		
		JPanel pan_notmember = new JPanel();
		pan_notmember.setBackground(new Color(210, 180, 140));
		pan_notmember.setBounds(700, 200, 300, 330);
		frame.getContentPane().add(pan_notmember);
		pan_notmember.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44 \uD68C \uC6D0");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("비트로 프라이드 TTF", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(12, 10, 276, 100);
		pan_notmember.add(lblNewLabel_1_1);
		
		JButton btn_join = new JButton("\uD68C\uC6D0 \uAC00\uC785");
		btn_join.setBackground(Color.WHITE);
		btn_join.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원가입 창 이동
				Join_2 join = new Join_2();
				Join_2.main(null);
			}
		});
		btn_join.setBounds(12, 150, 276, 50);
		pan_notmember.add(btn_join);
		
		JButton btn_order_notmember = new JButton("\uBE44\uD68C\uC6D0 \uC8FC\uBB38");
		btn_order_notmember.setBackground(Color.WHITE);
		btn_order_notmember.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
		btn_order_notmember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Member_order mo = new Member_order();
				inputnum = 9999;
				OrderMain om = new OrderMain();
				om.main(null);
			}
		});
		btn_order_notmember.setBounds(12, 230, 276, 50);
		pan_notmember.add(btn_order_notmember);
		
		JLabel lbl_cafename = new JLabel("\uBB34\uC57C\uD638 \uCE74\uD398");
		lbl_cafename.setForeground(Color.WHITE);
		lbl_cafename.setFont(new Font("비트로 코어 TTF", Font.PLAIN, 67));
		lbl_cafename.setBounds(48, 31, 444, 96);
		frame.getContentPane().add(lbl_cafename);
		
		JLabel lblNewLabel = new JLabel("\uAD00\uB9AC\uC790 \uBC88\uD638 \uC785\uB825 : ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 15));
		lblNewLabel.setBounds(897, 621, 112, 38);
		frame.getContentPane().add(lblNewLabel);
		
		tfl_manager = new JTextField();
		tfl_manager.setBounds(1015, 630, 124, 21);
		frame.getContentPane().add(tfl_manager);
		tfl_manager.setColumns(10);
		
		JButton btn_enter_manager = new JButton("\uC785\uB825\uC644\uB8CC");
		btn_enter_manager.setBackground(Color.WHITE);
		btn_enter_manager.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 15));
		btn_enter_manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int manager_id = Integer.parseInt(tfl_manager.getText());
				if(manager_id == 1111) {
					Manager_menu_1_1 mm = new Manager_menu_1_1();
					Manager_menu_1_1.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "관리자 번호를 다시 입력하세요");
				}
			}
		});
		btn_enter_manager.setBounds(1151, 630, 101, 23);
		frame.getContentPane().add(btn_enter_manager);
		
	}
//	public int getInputnum() {
//		return Integer.parseInt(tfl_inputnum.getText());
//	}


	
	
	
}
