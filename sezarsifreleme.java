package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sezarsifreleme extends JFrame {

	private JPanel contentPane;
	private JTextField metin01;
	private JTextField metin02;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sezarsifreleme frame = new sezarsifreleme();
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
	String alfabe= "abcçdefgðhýijklmnoöprsþtuüvyz";
	public sezarsifreleme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		metin01 = new JTextField();
		metin01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				metin01.setText("");
			}
		});
		metin01.setFont(new Font("Tahoma", Font.BOLD, 15));
		metin01.setText("\u015Fifrelenecek metin");
		metin01.setBounds(37, 23, 342, 25);
		contentPane.add(metin01);
		metin01.setColumns(10);
		
		metin02 = new JTextField();
		metin02.setText("\u015Fifreli metin");
		metin02.setFont(new Font("Tahoma", Font.BOLD, 15));
		metin02.setColumns(10);
		metin02.setBounds(37, 145, 342, 25);
		contentPane.add(metin02);
		
		JButton sifrele = new JButton("\u015Fifrele");
		
		sifrele.setFont(new Font("Tahoma", Font.BOLD, 15));
		sifrele.setBounds(265, 77, 85, 33);
		contentPane.add(sifrele);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(179, 81, 34, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("kayd\u0131rma say\u0131s\u0131:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(37, 80, 132, 23);
		contentPane.add(lblNewLabel);
		
		JLabel text01 = new JLabel("a b c \u00E7 d e f g \u011F h \u0131 i j k l m n o \u00F6 p r s \u015F t u \u00FC v y z");
		text01.setFont(new Font("Tahoma", Font.BOLD, 15));
		text01.setBounds(27, 190, 399, 23);
		contentPane.add(text01);
		
		JLabel text02 = new JLabel("a b c \u00E7 d e f g \u011F h \u0131 i j k l m n o \u00F6 p r s \u015F t u \u00FC v y z");
		text02.setForeground(Color.RED);
		text02.setFont(new Font("Tahoma", Font.BOLD, 15));
		text02.setBounds(27, 211, 387, 23);
		contentPane.add(text02);
		
		sifrele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ks= Integer.parseInt(textField.getText());
				int i,j,uzunluk;
				String cipher= " ";
				for(i=0;i<29;i++) {
					cipher+=alfabe.charAt((i+ks)%29)+ " ";
					text02.setText(cipher);
				}
				String sifreli="";
				String alýnan= "";
				alýnan= metin01.getText();
				uzunluk=alýnan.length();
				
				for(i=0;i<uzunluk;i++) {
					for(j=0;j<29;j++) {
						if(alýnan.charAt(i)==alfabe.charAt(j)) {
							sifreli+=alfabe.charAt((j+ks)%29);
						}
					}
				}
				metin02.setText(sifreli);
			}
		});
	}
}
