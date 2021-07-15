package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

import model.All_price;
import model.Input_Bill;
import model.Input_Bill_Rec;
import model.Order;

public class RecommendMenu {
	
	// 추천메뉴 이미지 1
	ImageIcon img1 = new ImageIcon("img/SetMenu/recommendMenu1.PNG");
	Image get_img1 = img1.getImage();
	Image scaled_img1 = get_img1.getScaledInstance(230, 230, Image.SCALE_SMOOTH);
	ImageIcon change_img1 = new ImageIcon(scaled_img1);

	ImageIcon img2 = new ImageIcon("img/SetMenu/recommendMenu2.PNG");
	Image get_img2 = img2.getImage();
	Image scaled_img2 = get_img2.getScaledInstance(230, 230, Image.SCALE_SMOOTH);
	ImageIcon change_img2 = new ImageIcon(scaled_img2);

	ImageIcon img3 = new ImageIcon("img/SetMenu/recommendMenu3.PNG");
	Image get_img3 = img3.getImage();
	Image scaled_img3 = get_img3.getScaledInstance(230, 230, Image.SCALE_SMOOTH);
	ImageIcon change_img3 = new ImageIcon(scaled_img3);

   private JFrame frame;
   private static int num;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               RecommendMenu window = new RecommendMenu(num);
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
   public RecommendMenu() {
   //   initialize();
   }
   public RecommendMenu(int num) {
		this.num = num;
//		System.out.println("테스트1"+num);
		initialize(num);
	    initialize(num);
	   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize(int num) {
	   Input_Bill_Rec in = new Input_Bill_Rec();
      frame = new JFrame();
      frame.setContentPane(new JLabel(new ImageIcon("./img/background/background_1280x700.jpg")));
      frame.pack();
      frame.setBounds(100, 100, 1280, 720);


      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(210, 180, 140));
      panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_1.setBounds(1002, 10, 250, 661);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uC8FC\uBB38\uC11C");
      lblNewLabel.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 10, 226, 70);
      panel_1.add(lblNewLabel);
      
      JTextArea textArea = new JTextArea();
      textArea.setBounds(12, 90, 226, 440);
      panel_1.add(textArea);
      

      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBounds(12, 540, 226, 50);
      panel_1.add(textArea_1);
      
      JButton btnNewButton = new JButton("\uC8FC\uBB38\uD558\uAE30");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		All_price all = new All_price();
      		Input_Bill ib = new Input_Bill();
      		Order od = new Order();
      		//int num = new savelogin().getInputnum();
      		//int num = new Login_1().getInputnum();
      		
      		System.out.println(num);
      		od.refreshPoint(ib.totPointnum(),num);
      		all.allprice(textArea);
      		textArea.setText(null);
      		textArea_1.setText(null);
      		od.refreshPoint(ib.totPointnum(),num);
      		
      		JOptionPane.showMessageDialog(null, "결제되었습니다."+"\n"+"적립후 포인트 : "+all.memberPoint(num));
      	
      	
      	}
      });
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
      btnNewButton.setBounds(12, 601, 226, 50);
      panel_1.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("\u2190");
      btnNewButton_1.setBackground(Color.WHITE);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //뒤로가기
            OrderMain orderMain = new OrderMain();
            orderMain.main(null);
            frame.dispose();
         }
      });
      btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
      btnNewButton_1.setBounds(12, 621, 70, 50);
      frame.getContentPane().add(btnNewButton_1);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(12, 10, 978, 601);
      frame.getContentPane().add(panel_2);
      panel_2.setLayout(null);
      
      JButton btnNewButton_2 = new JButton("\uC138\uD2B8\uBA54\uB274");
      btnNewButton_2.setBackground(Color.WHITE);
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //세트메뉴
            SetMenu setMenu = new SetMenu();
            setMenu.main(null);
            frame.dispose();
         }
      });
      btnNewButton_2.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_2.setBounds(12, 10, 200, 50);
      panel_2.add(btnNewButton_2);
      
      
      
      JPanel panel_3 = new JPanel();
      panel_3.setBackground(Color.WHITE);
      panel_3.setBounds(24, 82, 954, 509);
      panel_2.add(panel_3);
      panel_3.setLayout(null);
      
      JPanel panel_4 = new JPanel();
      panel_4.setBounds(12, 10, 230, 501);
      panel_3.add(panel_4);
      panel_4.setLayout(null);
      
      JButton btnNewButton_3 = new JButton(change_img1);
      btnNewButton_3.setBackground(Color.WHITE);
      btnNewButton_3.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill_Rec is = new Input_Bill_Rec();
      		is.inputbill(1);
      		Input_Bill in = new Input_Bill();
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      		
//      		in.showbill(textArea);
//      		textArea_1.setText(null);
//      		in.totPrice(textArea_1);
      	}
      });
      btnNewButton_3.setBounds(0, 0, 230, 400);
      panel_4.add(btnNewButton_3);
      
      JTextArea textArea_2 = new JTextArea();
      textArea_2.setBounds(0, 401, 230, 100);
      panel_4.add(textArea_2);
      
      JPanel panel_4_1 = new JPanel();
      panel_4_1.setBounds(712, 10, 230, 501);
      panel_3.add(panel_4_1);
      panel_4_1.setLayout(null);
      
      JButton btnNewButton_5 = new JButton(change_img3);
      btnNewButton_5.setBackground(Color.WHITE);
      btnNewButton_5.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill_Rec is = new Input_Bill_Rec();
      		is.inputbill(3);
      		Input_Bill in = new Input_Bill();
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      		
//      		in.showbill(textArea);
//      		textArea_1.setText(null);
//      		in.totPrice(textArea_1);
      	}
      });
      btnNewButton_5.setBounds(0, 0, 230, 400);
      panel_4_1.add(btnNewButton_5);
      
      JTextArea textArea_4 = new JTextArea();
      textArea_4.setBounds(0, 401, 230, 100);
      panel_4_1.add(textArea_4);
      
      JPanel panel_4_1_1 = new JPanel();
      panel_4_1_1.setBounds(362, 10, 230, 501);
      panel_3.add(panel_4_1_1);
      panel_4_1_1.setLayout(null);
      
      JButton btnNewButton_4 = new JButton(change_img2);
      btnNewButton_4.setBackground(Color.WHITE);
      btnNewButton_4.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill_Rec is = new Input_Bill_Rec();
      		is.inputbill(2);
      		Input_Bill in = new Input_Bill();
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      		
//      		in.showbill(textArea);
//      		textArea_1.setText(null);
//      		in.totPrice(textArea_1);
      	}
      });
      btnNewButton_4.setBounds(0, 0, 230, 400);
      panel_4_1_1.add(btnNewButton_4);
      
      JTextArea textArea_3 = new JTextArea();
      textArea_3.setBounds(0, 400, 230, 101);
      panel_4_1_1.add(textArea_3);
      
      //추천메뉴버튼
      JButton btnNewButton_2_1 = new JButton("\uCD94\uCC9C\uBA54\uB274");
      btnNewButton_2_1.setBackground(Color.WHITE);
      btnNewButton_2_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //추천메뉴
//            RecommendMenu recommendMenu = new RecommendMenu();
//            recommendMenu.main(null);
//            frame.dispose();
            
 			Input_Bill_Rec in = new Input_Bill_Rec();

			textArea_2.setText(null);
			in.show_1(textArea_2);
			textArea_3.setText(null);
			in.show_2(textArea_3);
			textArea_4.setText(null);
			in.show_3(textArea_4);
         }
      });
      btnNewButton_2_1.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_2_1.setBounds(224, 10, 200, 50);
      panel_2.add(btnNewButton_2_1);
   }
}