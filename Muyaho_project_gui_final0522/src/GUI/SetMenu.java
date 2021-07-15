package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.All_price;
import model.Input_Bill;
import model.Input_Bill_set;
import model.Order;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SetMenu {
   
   // 세트메뉴 이미지 1
   ImageIcon img1 = new ImageIcon("img/SetMenu/set1.PNG");
   Image get_img1 = img1.getImage();
   Image scaled_img1 = get_img1.getScaledInstance(230, 481, Image.SCALE_SMOOTH);
   ImageIcon change_img1 = new ImageIcon(scaled_img1);
   
   ImageIcon img2 = new ImageIcon("img/SetMenu/set2.PNG");
   Image get_img2 = img2.getImage();
   Image scaled_img2 = get_img2.getScaledInstance(230, 481, Image.SCALE_SMOOTH);
   ImageIcon change_img2 = new ImageIcon(scaled_img2);
   
   ImageIcon img3 = new ImageIcon("img/SetMenu/set3.PNG");
   Image get_img3 = img3.getImage();
   Image scaled_img3 = get_img3.getScaledInstance(230, 481, Image.SCALE_SMOOTH);
   ImageIcon change_img3 = new ImageIcon(scaled_img3);

   private JFrame frame;
   private static int num ;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               SetMenu window = new SetMenu(num);
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
   public SetMenu() {
 //     initialize();
   }
   public SetMenu(int num) {
	   this.num=num;
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
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(1002, 10, 250, 661);
      panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_1.setBackground(new Color(210, 180, 140));
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uC8FC\uBB38\uC11C");
      lblNewLabel.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 10, 226, 70);
      panel_1.add(lblNewLabel);
      

      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBounds(12, 542, 226, 49);
      panel_1.add(textArea_1);
      
      JTextArea textArea_bill = new JTextArea();
      textArea_bill.setBounds(12, 90, 226, 442);
      panel_1.add(textArea_bill);
      
      
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
      		all.allprice(textArea_bill);
      		textArea_bill.setText(null);
      		textArea_1.setText(null);
      		od.refreshPoint(ib.totPointnum(),num);
      		
      		JOptionPane.showMessageDialog(null, "결제되었습니다."+"\n"+"적립후 포인트 : "+all.memberPoint(num));
      	
      	}
      });
      btnNewButton.setBackground(new Color(255, 255, 255));
      btnNewButton.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
      btnNewButton.setBounds(12, 601, 226, 50);
      panel_1.add(btnNewButton);
      
      
      JButton btnNewButton_1 = new JButton("\u2190");
      btnNewButton_1.setBounds(12, 601, 70, 70);
      btnNewButton_1.setBackground(Color.WHITE);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //뒤로가기
            OrderMain orderMain = new OrderMain(num);
            orderMain.main(null);
            frame.dispose();
         }
      });
      btnNewButton_1.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      frame.getContentPane().add(btnNewButton_1);
      
      JButton btnNewButton_2 = new JButton("\uC138\uD2B8\uBA54\uB274");
      btnNewButton_2.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_2.setBackground(Color.WHITE);
      btnNewButton_2.setBounds(25, 20, 200, 50);
      frame.getContentPane().add(btnNewButton_2);
      
      JButton btnNewButton_2_1 = new JButton("\uCD94\uCC9C\uBA54\uB274");
      btnNewButton_2_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		RecommendMenu rec = new RecommendMenu(num);
      		rec.main(null);
      		
      	}
      });
      btnNewButton_2_1.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_2_1.setBackground(Color.WHITE);
      btnNewButton_2_1.setBounds(237, 20, 200, 50);
      frame.getContentPane().add(btnNewButton_2_1);
      
      JLabel label = new JLabel(change_img1);
      label.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {

      		//세트 2번
      		Input_Bill_set se = new Input_Bill_set();
      		se.inputset2();
      		Input_Bill in = new Input_Bill();
      		textArea_bill.setText(null);
      		in.showbill(textArea_bill);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      label.setBounds(378, 92, 230, 481);
      frame.getContentPane().add(label);
      
      JLabel label_1 = new JLabel(change_img2);
      label_1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {

      		//세트 3번
      		Input_Bill_set se = new Input_Bill_set();
      		se.inputset3();
      		Input_Bill in = new Input_Bill();
      		textArea_bill.setText(null);
      		in.showbill(textArea_bill);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      		
      	}
      });
      label_1.setBounds(676, 92, 230, 481);
      frame.getContentPane().add(label_1);
      
      JLabel label_2 = new JLabel(change_img3);
      label_2.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {

      		//세트 1번
      		Input_Bill_set se = new Input_Bill_set();
      		se.inputset1();
      		Input_Bill in = new Input_Bill();
      		textArea_bill.setText(null);
      		in.showbill(textArea_bill);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      		
      	}
      });
      label_2.setBounds(77, 92, 230, 481);
      frame.getContentPane().add(label_2);
   }
}