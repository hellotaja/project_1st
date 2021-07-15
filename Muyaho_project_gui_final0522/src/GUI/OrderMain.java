package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class OrderMain {

   private JFrame frame;
   private static int num;
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               OrderMain window = new OrderMain(num);
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
   public OrderMain() {
  //    initialize();
   }

	public OrderMain(int num) {
		this.num = num;
//		System.out.println("테스트1"+num);
		initialize(num);
	}

   /**
    * Initialize the contents of the frame.
    */
   private void initialize(int num) {
      frame = new JFrame();
      frame.setBounds(100, 100, 1280, 720);
      frame.setContentPane(new JLabel(new ImageIcon("./img/background/background_1280x700.jpg")));
      frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("\uB2E8\uC77C\uBA54\uB274");
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
				System.out.println(num);
				Menu menu = new Menu(num);
				menu.main(null);
				// 단일메뉴
         }
      });
      btnNewButton.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 40));
      btnNewButton.setBounds(240, 240, 200, 200);
      frame.getContentPane().add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("<html>\uC138\uD2B8\uBA54\uB274  <br/>\r\n\uCD94\uCC9C\uBA54\uB274</html>");
      btnNewButton_1.setBackground(Color.WHITE);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
				// 세트메뉴, 추천메뉴
				System.out.println(num);
				SetMenu setMenu = new SetMenu(num);
				setMenu.main(null);
				frame.dispose();
         }
      });
      btnNewButton_1.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 40));
      btnNewButton_1.setBounds(540, 240, 200, 200);
      frame.getContentPane().add(btnNewButton_1);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(210, 180, 140));
      panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), null));
      panel_1.setBounds(1002, 10, 250, 661);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uC8FC\uBB38\uC11C");
      lblNewLabel.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 10, 226, 70);
      panel_1.add(lblNewLabel);
      
      JButton btnNewButton_2 = new JButton("\uC8FC\uBB38\uD558\uAE30");
      btnNewButton_2.setBackground(Color.WHITE);
      btnNewButton_2.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
      btnNewButton_2.setBounds(12, 601, 226, 50);
      panel_1.add(btnNewButton_2);
      
      JList list = new JList();
      list.setBounds(12, 90, 226, 501);
      panel_1.add(list);
      
      JTextArea textArea = new JTextArea();
      textArea.setBounds(243, 268, 5, 24);
      frame.getContentPane().add(textArea);
      
      JButton btnNewButton_3 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
      btnNewButton_3.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Login_1 lg = new Login_1();
      		lg.main(null);
      	}
      });
      btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 20));
      btnNewButton_3.setBackground(Color.WHITE);
      btnNewButton_3.setBounds(25, 627, 166, 46);
      frame.getContentPane().add(btnNewButton_3);
   }
}