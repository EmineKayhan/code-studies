package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class frm01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	int s1,s2,islem;
	int sonuc;
	
	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(15, 34, 287, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn07 = new JButton("7");
		btn07.setBackground(SystemColor.scrollbar);
		btn07.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btn07.setBounds(28, 99, 50, 63);
		contentPane.add(btn07);
		
		JButton btn08 = new JButton("8");
		btn08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+8);
			}
		});
		btn08.setBackground(SystemColor.scrollbar);
		btn08.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn08.setBounds(98, 99, 50, 63);
		contentPane.add(btn08);
		
		JButton btn09 = new JButton("9");
		btn09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btn09.setBackground(SystemColor.scrollbar);
		btn09.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn09.setBounds(166, 99, 50, 63);
		contentPane.add(btn09);
		
		JButton btnCarp = new JButton("x");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1= Integer.parseInt(textField.getText());
				textField.setText("");
				islem=3;
			}
		});
		btnCarp.setBackground(SystemColor.scrollbar);
		btnCarp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCarp.setBounds(240, 99, 50, 63);
		contentPane.add(btnCarp);
		
		JButton btn04 = new JButton("4");
		btn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btn04.setBackground(SystemColor.scrollbar);
		btn04.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn04.setBounds(28, 190, 50, 63);
		contentPane.add(btn04);
		
		JButton btn05 = new JButton("5");
		btn05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btn05.setBackground(SystemColor.scrollbar);
		btn05.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn05.setBounds(98, 190, 50, 63);
		contentPane.add(btn05);
		
		JButton btn06 = new JButton("6");
		btn06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btn06.setBackground(SystemColor.scrollbar);
		btn06.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn06.setBounds(166, 190, 50, 63);
		contentPane.add(btn06);
		
		JButton btn01 = new JButton("1");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btn01.setBackground(SystemColor.scrollbar);
		btn01.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn01.setBounds(28, 278, 50, 63);
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("2");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btn02.setBackground(SystemColor.scrollbar);
		btn02.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn02.setBounds(98, 278, 50, 63);
		contentPane.add(btn02);
		
		JButton btn03 = new JButton("3");
		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btn03.setBackground(SystemColor.scrollbar);
		btn03.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn03.setBounds(166, 278, 50, 63);
		contentPane.add(btn03);
		
		JButton btn00 = new JButton("0");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btn00.setBackground(SystemColor.scrollbar);
		btn00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn00.setBounds(28, 365, 50, 63);
		contentPane.add(btn00);
		
		JButton btnDel = new JButton("C");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnDel.setForeground(new Color(255, 204, 51));
		btnDel.setBackground(SystemColor.scrollbar);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDel.setBounds(98, 365, 50, 63);
		contentPane.add(btnDel);
		
		JButton btnBol = new JButton("/");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem=4;
				s1= Integer.parseInt(textField.getText());
				textField.setText("");
			}
		});
		btnBol.setBackground(SystemColor.scrollbar);
		btnBol.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBol.setBounds(240, 190, 50, 63);
		contentPane.add(btnBol);
		
		JButton btnTopla = new JButton("+");
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem=1;
				s1= Integer.parseInt(textField.getText());
				textField.setText("");
			}
		});
		btnTopla.setBackground(SystemColor.scrollbar);
		btnTopla.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTopla.setBounds(240, 278, 50, 63);
		contentPane.add(btnTopla);
		
		JButton btnCikar = new JButton("-");
		btnCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				islem=2;
				s1= Integer.parseInt(textField.getText());
				textField.setText("");
			}
		});
		btnCikar.setBackground(SystemColor.scrollbar);
		btnCikar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCikar.setBounds(240, 365, 50, 63);
		contentPane.add(btnCikar);
		
		JButton btnS = new JButton("=");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s2=Integer.parseInt(textField.getText());
				textField.setText("");
				if(islem==1) {
					sonuc=s1+s2; 
					textField.setText(Integer.toString(sonuc));
				}else if(islem==2) {
					sonuc=s1-s2;
					textField.setText(Integer.toString(sonuc));
				}else if(islem==3) {
					sonuc=s1*s2;
					textField.setText(Integer.toString(sonuc));
				}else if(islem==4){
					sonuc=s1/s2;
					textField.setText(Integer.toString(sonuc));
				}
			}
		});
		btnS.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnS.setBackground(new Color(255, 255, 153));
		btnS.setBounds(166, 365, 50, 63);
		contentPane.add(btnS);
		
		JLabel lblNewLabel = new JLabel("001");
		lblNewLabel.setForeground(SystemColor.scrollbar);
		lblNewLabel.setBounds(259, 449, 43, 13);
		contentPane.add(lblNewLabel);
	}
}
