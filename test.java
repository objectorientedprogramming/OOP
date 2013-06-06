import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class login extends JFrame{
  TextField f1=new TextField("",10);
	TextField f2=new TextField("",10);
	
	public login(){
		
	
		GridBagLayout grid=new GridBagLayout();
		GridBagLayout grid2=new GridBagLayout();
		GridBagConstraints gc=new GridBagConstraints();
		GridBagConstraints gc2=new GridBagConstraints();
		Color main_color=new Color(50,155,0);
		Panel p=new Panel();
		p.setLayout(grid);
		
		
		Panel p1=new Panel(new BorderLayout());
		Panel p2=new Panel();
		p2.setLayout(grid2);
		p1.setBackground(main_color);
		gc.gridwidth=GridBagConstraints.REMAINDER;
		gc.fill=GridBagConstraints.BOTH;
		gc.weightx=1;
		gc.weighty=2;
		grid.setConstraints(p1, gc);
		
		gc.weighty=4;
		grid.setConstraints(p2, gc);
		p2.setBackground(Color.WHITE);
		
		
		Label l=new Label("    CLUE NO. 1");
		Font font1=new Font("Sans-serif",Font.BOLD,50);
		f1.setFont(font1);
		f2.setFont(font1);
		l.setFont(font1);
		l.setForeground(Color.WHITE);
		p1.add(l,BorderLayout.WEST);
		Font font2=new Font("Sans-serif",Font.BOLD,50);
		Label l1=new Label("NICKNAME   ");
		Label l2=new Label("SERVER   ");
		l1.setFont(font2);
		l2.setFont(font2);
		l1.setForeground(main_color);
		l2.setForeground(main_color);
		gc2.gridheight=1;
		gc2.gridy=1;
		gc2.gridx=1;
		grid2.setConstraints(l1, gc2);
		gc2.gridx=2;
		grid2.setConstraints(f1, gc2);
		gc2.gridy=2;
		gc2.gridx=1;
		grid2.setConstraints(l2, gc2);
		gc2.gridx=2;
		grid2.setConstraints(f2, gc2);
		p2.add(l1);
		p2.add(f1);
		p2.add(l2);
		p2.add(f2);
	//	JButton b1=new JButton(">>");
		//gc2.gridwidth=GridBagConstraints.REMAINDER;
		
		Image image;
		File sourceimage=new File("./next.png");
		
		JButton next_button=null;
		try {
			image=ImageIO.read(sourceimage);
			next_button=new JButton(new ImageIcon(image));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		gc2.gridy=1;
		gc2.gridx=3;
		gc2.gridheight=2;
		gc2.insets=new Insets(0,100,2,2);
		gc2.fill=GridBagConstraints.VERTICAL;
			
		grid2.setConstraints(next_button, gc2);
		next_button.setBackground(Color.WHITE);
		next_button.setBorder(new EmptyBorder(1,0,0,0));
		
		p2.add(next_button);
		
		
		
		
		p.add(p1);
		p.add(p2);
		add(p);
		Next next=new Next();
		
		next_button.addActionListener(next);
		
	}
	
	class Next implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String id=f1.getText();
			String server=f2.getText();
			
			
		}
		
	}
	public static void main(String[] args){
		//frame object 생성
		login frame=new login();
		//제목
		frame.setTitle("login");
		//크기
		frame.setSize(1200,800);
		//위치
		frame.setLocationRelativeTo(null);
		//종료방법
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//보일지아닐지여부
		frame.setVisible(true);
		//창크기고정
		frame.setResizable(false);
	}
}
