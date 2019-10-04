import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LoginScreen extends JFrame {

	private static final String USERNAME1="reception";
	private static final String PASSWORD1="reception";
	
	private static final String USERNAME2="bar";
	private static final String PASSWORD2="bar";
	
	private static final String USERNAME3="activities";
	private static final String PASSWORD3="activities";
	
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	public LoginScreen() {
		try { 
	        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
	        SwingUtilities.updateComponentTreeUI(this);
	    } catch(Exception ignored){}
		initialize();
	}
	
	
	private void initialize() {
	
		setVisible(true);
		setTitle("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2 \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7");
		setResizable(false);
		setBounds(100, 100, 394, 192);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2 \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7");
		label.setBounds(6, 6, 369, 25);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBackground(new Color(255, 140, 0));
		contentPane.add(label);
		
		JLabel usernameLabel = new JLabel("\u03A7\u03C1\u03AE\u03C3\u03C4\u03B7\u03C2");
		usernameLabel.setBounds(5, 42, 90, 29);
		usernameLabel.setForeground(new Color(0, 0, 0));
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(100, 42, 270, 29);
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("\u039A\u03C9\u03B4\u03B9\u03BA\u03CC\u03C2");
		passwordLabel.setBounds(5, 76, 90, 28);
		passwordLabel.setForeground(new Color(0, 0, 0));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 76, 270, 28);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2");
		loginButton.setBounds(5, 110, 290, 34);
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tempUsername = usernameField.getText();
				String tempPassword = 	String.valueOf(passwordField.getPassword());
				if(tempUsername.equals(USERNAME1) && tempPassword.equals(PASSWORD1)) {
					JOptionPane.showMessageDialog(null,"������� ��������.");
					Registry.RS.setVisible(true);
					Main.HS.setVisible(false);
					setVisible(false);
				}
				else if(tempUsername.equals(USERNAME2) && tempPassword.equals(PASSWORD2)) {
					JOptionPane.showMessageDialog(null,"������� ��������.");
					BarScreen BS = new BarScreen();						
					Main.HS.setVisible(false);
					setVisible(false);

				}
				else if(tempUsername.equals(USERNAME3) && tempPassword.equals(PASSWORD3)) {
					JOptionPane.showMessageDialog(null,"������� ��������.");
					ActivitiesScreen AS = new ActivitiesScreen();
					Main.HS.setVisible(false);
					setVisible(false);
				}
				else
					JOptionPane.showMessageDialog(null,"����� ����� ������ � �������! �������� ���������������.");
			}
		});
		loginButton.setForeground(Color.BLACK);
		loginButton.setBackground(Color.WHITE);
		contentPane.add(loginButton);
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginButton.doClick();
			}
		});
		JButton helpButton = new JButton("?");
		helpButton.setBounds(300, 110, 70, 34);
		helpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"��� ���������� ������ Username �/��� �������, � ��� �������������� ���������� ��������, ������������� �� ��� ����������� ��� ����������.");
			}
		});
		
		helpButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(helpButton);
		
		
	}
}