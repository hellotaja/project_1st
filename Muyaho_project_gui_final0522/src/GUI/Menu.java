package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;

import model.All_price;
import model.Input_Bill;
import model.Order;
import model.Recommand_set;

public class Menu {
	//에스프레소
	// 메뉴 이미지 1
	ImageIcon img1 = new ImageIcon("img/Menu/Menu_1.jpg");
	Image get_img1 = img1.getImage();
	Image scaled_img1 = get_img1.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img1 = new ImageIcon(scaled_img1);
	
	// 메뉴 이미지 2
	ImageIcon img2 = new ImageIcon("img/Menu/Menu_2.jpg");
	Image get_img2 = img2.getImage();
	Image scaled_img2 = get_img2.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img2 = new ImageIcon(scaled_img2);
		
	// 메뉴 이미지 3
	ImageIcon img3 = new ImageIcon("img/Menu/Menu_3.jpg");
	Image get_img3 = img3.getImage();
	Image scaled_img3 = get_img3.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img3 = new ImageIcon(scaled_img3);
		
	// 메뉴 이미지 4
	ImageIcon img4 = new ImageIcon("img/Menu/Menu_4.jpg");
	Image get_img4 = img4.getImage();
	Image scaled_img4 = get_img4.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img4 = new ImageIcon(scaled_img4);
		
	// 메뉴 이미지 5
	ImageIcon img5 = new ImageIcon("img/Menu/Menu_5.jpg");
	Image get_img5 = img5.getImage();
	Image scaled_img5 = get_img5.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img5 = new ImageIcon(scaled_img5);
	
	//스무디
	ImageIcon img6 = new ImageIcon("img/Menu/Menu_6.jpg");
	Image get_img6 = img6.getImage();
	Image scaled_img6 = get_img6.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img6 = new ImageIcon(scaled_img6);
	
	ImageIcon img7 = new ImageIcon("img/Menu/Menu_7.jpg");
	Image get_img7 = img7.getImage();
	Image scaled_img7 = get_img7.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img7 = new ImageIcon(scaled_img7);
	
	ImageIcon img8 = new ImageIcon("img/Menu/Menu_8.jpg");
	Image get_img8 = img8.getImage();
	Image scaled_img8 = get_img8.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img8 = new ImageIcon(scaled_img8);
	
	ImageIcon img9 = new ImageIcon("img/Menu/Menu_9.jpg");
	Image get_img9 = img9.getImage();
	Image scaled_img9 = get_img9.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img9 = new ImageIcon(scaled_img9);
	
	ImageIcon img10 = new ImageIcon("img/Menu/Menu_10.jpg");
	Image get_img10 = img10.getImage();
	Image scaled_img10 = get_img10.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img10 = new ImageIcon(scaled_img10);
	
	//티
	ImageIcon img11 = new ImageIcon("img/Menu/Menu_11.jpg");
	Image get_img11 = img11.getImage();
	Image scaled_img11 = get_img11.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img11 = new ImageIcon(scaled_img11);
	
	ImageIcon img12 = new ImageIcon("img/Menu/Menu_12.jpg");
	Image get_img12 = img12.getImage();
	Image scaled_img12 = get_img12.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img12 = new ImageIcon(scaled_img12);
	
	ImageIcon img13 = new ImageIcon("img/Menu/Menu_13.jpg");
	Image get_img13 = img13.getImage();
	Image scaled_img13 = get_img13.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img13 = new ImageIcon(scaled_img13);
	
	ImageIcon img14 = new ImageIcon("img/Menu/Menu_14.jpg");
	Image get_img14 = img14.getImage();
	Image scaled_img14 = get_img14.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img14 = new ImageIcon(scaled_img14);
	
	ImageIcon img15 = new ImageIcon("img/Menu/Menu_15.jpg");
	Image get_img15 = img15.getImage();
	Image scaled_img15 = get_img15.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img15 = new ImageIcon(scaled_img15);
	
	//디저트
	ImageIcon img16 = new ImageIcon("img/Menu/Menu_16.jpg");
	Image get_img16 = img16.getImage();
	Image scaled_img16 = get_img16.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img16 = new ImageIcon(scaled_img16);
	
	ImageIcon img17 = new ImageIcon("img/Menu/Menu_17.jpg");
	Image get_img17 = img17.getImage();
	Image scaled_img17 = get_img17.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img17 = new ImageIcon(scaled_img17);
	
	ImageIcon img18 = new ImageIcon("img/Menu/Menu_18.jpg");
	Image get_img18 = img18.getImage();
	Image scaled_img18 = get_img18.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img18 = new ImageIcon(scaled_img18);
	
	ImageIcon img19 = new ImageIcon("img/Menu/Menu_19.jpg");
	Image get_img19 = img19.getImage();
	Image scaled_img19 = get_img19.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img19 = new ImageIcon(scaled_img19);
	
	ImageIcon img20 = new ImageIcon("img/Menu/Menu_20.jpg");
	Image get_img20 = img20.getImage();
	Image scaled_img20 = get_img20.getScaledInstance(190, 501, Image.SCALE_SMOOTH);
	ImageIcon change_img20 = new ImageIcon(scaled_img20);

   private JFrame frame;
   private static int num ;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Menu window = new Menu(num);
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
   public Menu() {
//      initialize();
   }
   public Menu(int num) {
	   this.num = num;
	   System.out.println("test2  "+num);
	      initialize(num);
	   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize(int num) {
      frame = new JFrame();
      frame.setBounds(100, 100, 1280, 720);
      frame.setResizable(false);
      frame.setContentPane(new JLabel(new ImageIcon("./img/background/background_1280x700.jpg")));
      frame.pack();

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JButton btnNewButton_1_1 = new JButton("\u2190");
      btnNewButton_1_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		OrderMain orderMain = new OrderMain();
      		orderMain.main(null);
      		frame.dispose();
      	}
      });
      btnNewButton_1_1.setBackground(Color.WHITE);
      btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
      btnNewButton_1_1.setBounds(12, 621, 70, 50);
      frame.getContentPane().add(btnNewButton_1_1);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(210, 180, 140));
      panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_1.setLayout(null);
      panel_1.setBounds(1012, 10, 250, 661);
      frame.getContentPane().add(panel_1);
      
      JLabel lblNewLabel = new JLabel("\uC8FC\uBB38\uC11C");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      lblNewLabel.setBounds(12, 10, 226, 70);
      panel_1.add(lblNewLabel);
      
      JTextArea textArea = new JTextArea();
      textArea.setBounds(12, 90, 226, 440);
      panel_1.add(textArea);
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBounds(12, 538, 226, 50);
      panel_1.add(textArea_1);
      
      // 주문하기
      JButton btnNewButton_5 = new JButton("\uC8FC\uBB38\uD558\uAE30");
      btnNewButton_5.addActionListener(new ActionListener() {
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
      btnNewButton_5.setBackground(Color.WHITE);
      btnNewButton_5.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 20));
      btnNewButton_5.setBounds(12, 601, 226, 50);
      panel_1.add(btnNewButton_5);
      
      JPanel panel_menu = new JPanel();
      panel_menu.setBounds(12, 20, 978, 50);
      frame.getContentPane().add(panel_menu);
      panel_menu.setLayout(new GridLayout(1, 0, 0, 0));
      
      //에스프레소
      JPanel menu1page = new JPanel();
      menu1page.setBounds(22, 101, 950, 501);
      frame.getContentPane().add(menu1page);
      menu1page.setLayout(new GridLayout(0, 5, 0, 0));
      
//      JButton btnNewButton_7 = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178");
      // 메뉴 선택 시
      JButton btnNewButton_7 = new JButton(change_img1);
      btnNewButton_7.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill in = new Input_Bill();
      		in.inputbill(1);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	}
      });
      menu1page.add(btnNewButton_7);
      
      JButton btnNewButton_8 = new JButton(change_img2);
      btnNewButton_8.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill in = new Input_Bill();
      		in.inputbill(2);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	}
      });
      menu1page.add(btnNewButton_8);
      
      JButton btnNewButton_9 = new JButton(change_img3);
      btnNewButton_9.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill in = new Input_Bill();
      		in.inputbill(3);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	}
      });
      menu1page.add(btnNewButton_9);
      
      JButton btnNewButton_10 = new JButton(change_img4);
      btnNewButton_10.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill in = new Input_Bill();
      		in.inputbill(4);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	}
      });
      menu1page.add(btnNewButton_10);
      
      JButton btnNewButton_11 = new JButton(change_img5);
      btnNewButton_11.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill in = new Input_Bill();
      		in.inputbill(5);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	}
      });
      menu1page.add(btnNewButton_11);
      
      //스무디
      JPanel menu2page = new JPanel();
      menu2page.setBounds(22, 101, 950, 501);
      frame.getContentPane().add(menu2page);
      menu2page.setLayout(new GridLayout(1, 0, 0, 0));
      
      JButton btnNewButton_12 = new JButton(change_img6);
      btnNewButton_12.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill in = new Input_Bill();
      		in.inputbill(6);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	}
      });
      menu2page.add(btnNewButton_12);
      
      JButton btnNewButton_13 = new JButton(change_img7);
      btnNewButton_13.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		Input_Bill in = new Input_Bill();
      		in.inputbill(7);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	}
      });
      menu2page.add(btnNewButton_13);
      
      JButton btnNewButton_14 = new JButton(change_img8);
      btnNewButton_14.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(8);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu2page.add(btnNewButton_14);
      
      JButton btnNewButton_15 = new JButton(change_img9);
      btnNewButton_15.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(9);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu2page.add(btnNewButton_15);
      
      JButton btnNewButton_16 = new JButton(change_img10);
      btnNewButton_16.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(10);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu2page.add(btnNewButton_16);
      menu2page.setVisible(false);
      
      //티
      JPanel menu3page = new JPanel();
      menu3page.setBounds(22, 101, 950, 501);
      frame.getContentPane().add(menu3page);
      menu3page.setLayout(new GridLayout(1, 0, 0, 0));
      
      JButton btnNewButton_17 = new JButton(change_img11);
      btnNewButton_17.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(11);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu3page.add(btnNewButton_17);
      
      JButton btnNewButton_18 = new JButton(change_img12);
      btnNewButton_18.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(12);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu3page.add(btnNewButton_18);
      menu3page.setVisible(false);
      
      JButton btnNewButton_19 = new JButton(change_img13);
      btnNewButton_19.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(13);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu3page.add(btnNewButton_19);
      menu3page.setVisible(false);
      
      JButton btnNewButton_20 = new JButton(change_img14);
      btnNewButton_20.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(14);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu3page.add(btnNewButton_20);
      menu3page.setVisible(false);
      
      JButton btnNewButton_21 = new JButton(change_img15);
      btnNewButton_21.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

      		Input_Bill in = new Input_Bill();
      		in.inputbill(15);
      		textArea.setText(null);
      		in.showbill(textArea);
      		textArea_1.setText(null);
      		in.totPrice(textArea_1);
      		in.totPoint(textArea_1);
      	
      	}
      });
      menu3page.add(btnNewButton_21);
      menu3page.setVisible(false);
      
      //디저트
      JPanel menu4page = new JPanel();
      menu4page.setBounds(22, 101, 950, 501);
      frame.getContentPane().add(menu4page);
      menu4page.setLayout(new GridLayout(1, 0, 0, 0));
      
      JButton btnNewButton_22 = new JButton(change_img16);
      btnNewButton_22.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

    		Input_Bill in = new Input_Bill();
    		Recommand_set rs = new Recommand_set();
    		in.inputbill(16);
    		int cnt = rs.change_set();
    		textArea.setText(null);
    		in.showbill(textArea);
    		if(cnt == 1) {JOptionPane.showMessageDialog(null, "자동 할인이 적용 되었습니다.");
}
    		textArea_1.setText(null);
    		in.totPrice(textArea_1);
    		in.totPoint(textArea_1);
    	
      	}
      });
      menu4page.add(btnNewButton_22);
      
      JButton btnNewButton_23 = new JButton(change_img17);
      btnNewButton_23.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

    		Input_Bill in = new Input_Bill();
    		Recommand_set rs = new Recommand_set();
    		in.inputbill(17);
    		int cnt = rs.change_set();
    		textArea.setText(null);
    		in.showbill(textArea);
    		if(cnt == 1) {JOptionPane.showMessageDialog(null, "자동 할인이 적용 되었습니다.");
}
    		textArea_1.setText(null);
    		in.totPrice(textArea_1);
    		in.totPoint(textArea_1);
    	
      	}
      });
      menu4page.add(btnNewButton_23);
      
      JButton btnNewButton_24 = new JButton(change_img18);
      btnNewButton_24.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

    		Input_Bill in = new Input_Bill();
    		Recommand_set rs = new Recommand_set();
    		in.inputbill(18);
    		int cnt = rs.change_set();
    		textArea.setText(null);
    		in.showbill(textArea);
    		if(cnt == 1) {JOptionPane.showMessageDialog(null, "자동 할인이 적용 되었습니다.");
}
    		textArea_1.setText(null);
    		in.totPrice(textArea_1);
    		in.totPoint(textArea_1);
    	
      	}
      });
      menu4page.add(btnNewButton_24);
      menu4page.setVisible(false);
      
      JButton btnNewButton_25 = new JButton(change_img19);
      btnNewButton_25.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

    		Input_Bill in = new Input_Bill();
    		Recommand_set rs = new Recommand_set();
    		in.inputbill(19);
    		int cnt = rs.change_set();
    		textArea.setText(null);
    		in.showbill(textArea);
    		if(cnt == 1) {JOptionPane.showMessageDialog(null, "자동 할인이 적용 되었습니다.");
}
    		textArea_1.setText(null);
    		in.totPrice(textArea_1);
    		in.totPoint(textArea_1);
    	
      	}
      });
      menu4page.add(btnNewButton_25);
      menu4page.setVisible(false);
      
      JButton btnNewButton_26 = new JButton(change_img20);
      btnNewButton_26.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Input_Bill in = new Input_Bill();
        		Recommand_set rs = new Recommand_set();
        		in.inputbill(20);
        		int cnt = rs.change_set();
        		textArea.setText(null);
        		in.showbill(textArea);
        		if(cnt == 1) {JOptionPane.showMessageDialog(null, "자동 할인이 적용 되었습니다.");
  }
        		textArea_1.setText(null);
        		in.totPrice(textArea_1);
        		in.totPoint(textArea_1);
        	}
        });
      menu4page.add(btnNewButton_26);
      menu4page.setVisible(false);
      
      JButton btnNewButton_1 = new JButton("\uC5D0\uC2A4\uD504\uB808\uC18C");
      btnNewButton_1.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_1.setBackground(Color.WHITE);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu1page.setVisible(true);
            menu2page.setVisible(false);
            menu3page.setVisible(false);
            menu4page.setVisible(false);
         }
      });
      panel_menu.add(btnNewButton_1);
      
      JButton btnNewButton_2 = new JButton("\uC2A4\uBB34\uB514");
      btnNewButton_2.setBackground(Color.WHITE);
      btnNewButton_2.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu1page.setVisible(false);
            menu2page.setVisible(true);
            menu3page.setVisible(false);
            menu4page.setVisible(false);
         }
      });
      panel_menu.add(btnNewButton_2);
      
      JButton btnNewButton_3 = new JButton("\uD2F0");
      btnNewButton_3.setBackground(Color.WHITE);
      btnNewButton_3.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu1page.setVisible(false);
            menu2page.setVisible(false);
            menu3page.setVisible(true);
            menu4page.setVisible(false);
         }
      });
      panel_menu.add(btnNewButton_3);
      
      JButton btnNewButton_4 = new JButton("\uB514\uC800\uD2B8");
      btnNewButton_4.setBackground(Color.WHITE);
      btnNewButton_4.setFont(new Font("비트로 프라이드 TTF", Font.PLAIN, 30));
      btnNewButton_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu1page.setVisible(false);
            menu2page.setVisible(false);
            menu3page.setVisible(false);
            menu4page.setVisible(true);
         }
      });
      panel_menu.add(btnNewButton_4);
   
      
   }
}