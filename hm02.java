package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class hm02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField01;
	private JButton btnmemory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hm02 frame = new hm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */ String m;
	 int islem,sayi;
	 ArrayList<Integer> sayilar= new ArrayList();
	public hm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField01 = new JTextField();
		textField01.setHorizontalAlignment(SwingConstants.RIGHT);
		textField01.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField01.setBounds(10, 10, 252, 29);
		contentPane.add(textField01);
		textField01.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBackground(SystemColor.scrollbar);
		btnC.setBounds(20, 49, 50, 51);
		contentPane.add(btnC);
		
		btnmemory = new JButton("M");
		btnmemory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m= textField01.getText();
				textField01.setText("");
			}
		});
		btnmemory.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnmemory.setBackground(SystemColor.scrollbar);
		btnmemory.setBounds(80, 49, 50, 51);
		contentPane.add(btnmemory);
		
		JButton btnMm = new JButton("m");
		btnMm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(m);
			}
		});
		btnMm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMm.setBackground(SystemColor.scrollbar);
		btnMm.setBounds(140, 49, 50, 51);
		contentPane.add(btnMm);
		
		JButton btntopla = new JButton("+");
		btntopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi= Integer.parseInt(textField01.getText());
				sayilar.add(sayi);
				textField01.setText("");
				islem=1;
			}
		});
		btntopla.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntopla.setBackground(SystemColor.scrollbar);
		btntopla.setBounds(200, 49, 50, 51);
		contentPane.add(btntopla);
		
		JButton btn07 = new JButton("7");
		btn07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"7");
			}
		});
		btn07.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn07.setBackground(SystemColor.scrollbar);
		btn07.setBounds(20, 120, 50, 51);
		contentPane.add(btn07);
		
		JButton btn04 = new JButton("4");
		btn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"4");
			}
		});
		btn04.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn04.setBackground(SystemColor.scrollbar);
		btn04.setBounds(20, 194, 50, 51);
		contentPane.add(btn04);
		
		JButton btn01 = new JButton("1");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+ "1");
			}
		});
		btn01.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn01.setBackground(SystemColor.scrollbar);
		btn01.setBounds(20, 266, 50, 51);
		contentPane.add(btn01);
		
		JButton btnNewButton_4_1 = new JButton("0");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"0");
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_1.setBackground(SystemColor.scrollbar);
		btnNewButton_4_1.setBounds(20, 341, 50, 51);
		contentPane.add(btnNewButton_4_1);
		
		JButton btn08 = new JButton("8");
		btn08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"8");
			}
		});
		btn08.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn08.setBackground(SystemColor.scrollbar);
		btn08.setBounds(80, 120, 50, 51);
		contentPane.add(btn08);
		
		JButton btn09 = new JButton("9");
		btn09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"9");
			}
		});
		btn09.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn09.setBackground(SystemColor.scrollbar);
		btn09.setBounds(140, 120, 50, 51);
		contentPane.add(btn09);
		
		JButton btnCikar = new JButton("-");
		btnCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sayi= Integer.parseInt(textField01.getText());
			sayilar.add(sayi);
			textField01.setText("");
			islem=2;
			}
		});
		btnCikar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCikar.setBackground(SystemColor.scrollbar);
		btnCikar.setBounds(200, 120, 50, 51);
		contentPane.add(btnCikar);
		
		JButton btn05 = new JButton("5");
		btn05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"5");
			}
		});
		btn05.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn05.setBackground(SystemColor.scrollbar);
		btn05.setBounds(80, 194, 50, 51);
		contentPane.add(btn05);
		
		JButton btn06 = new JButton("6");
		btn06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"6");
			}
		});
		btn06.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn06.setBackground(SystemColor.scrollbar);
		btn06.setBounds(140, 194, 50, 51);
		contentPane.add(btn06);
		
		JButton btnCarp = new JButton("*");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi= Integer.parseInt(textField01.getText());
				sayilar.add(sayi);
				textField01.setText("");
				islem=3;
			}
		});
		btnCarp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCarp.setBackground(SystemColor.scrollbar);
		btnCarp.setBounds(200, 194, 50, 51);
		contentPane.add(btnCarp);
		
		JButton btn02 = new JButton("2");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"2");
			}
		});
		btn02.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn02.setBackground(SystemColor.scrollbar);
		btn02.setBounds(80, 266, 50, 51);
		contentPane.add(btn02);
		
		JButton btn03 = new JButton("3");
		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText(textField01.getText()+"3");
			}
		});
		btn03.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn03.setBackground(SystemColor.scrollbar);
		btn03.setBounds(140, 266, 50, 51);
		contentPane.add(btn03);
		
		JButton btnBol = new JButton("/");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi= Integer.parseInt(textField01.getText());
				sayilar.add(sayi);
				textField01.setText("");
			}
		});
		btnBol.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBol.setBackground(SystemColor.scrollbar);
		btnBol.setBounds(200, 266, 50, 51);
		contentPane.add(btnBol);
		
		JButton btnNokta = new JButton(".");
		btnNokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField01.setText("."+textField01.getText());
			}
		});
		btnNokta.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNokta.setBackground(SystemColor.scrollbar);
		btnNokta.setBounds(80, 341, 50, 51);
		contentPane.add(btnNokta);
		
		JButton btnSonuc = new JButton("=");
		btnSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        sayi= Integer.parseInt(textField01.getText());
				sayilar.add(sayi);
				
				
				 int sonuc;
					sonuc=0;
				switch (islem) {
				case 1:
					for(int i=0;i<sayilar.size();i++) {
						sonuc+=sayilar.get(i);
						textField01.setText(Integer.toString(sonuc));
						sayilar.clear();
					}
					break;
				case 2:
					for( int j=0;j<sayilar.size();j++) {
						sonuc-=sayilar.get(j);
						textField01.setText(Integer.toString(sonuc));
						sayilar.clear();
					}
					break;
				case 3:
					for( int k=0;k<sayilar.size();k++) {
						sonuc*=sayilar.get(k);
						textField01.setText(Integer.toString(sonuc));
						sayilar.clear();
					}
					break;
				case 4:
					for( int a=0;a<sayilar.size();a++) {
						sonuc/=sayilar.get(a);
						textField01.setText(Integer.toString(sonuc));
						sayilar.clear();
					}
					break;

				default:
					break;
				}
			}
		});
		btnSonuc.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSonuc.setBackground(SystemColor.scrollbar);
		btnSonuc.setBounds(140, 341, 110, 51);
		contentPane.add(btnSonuc);
		
		
	}
}
