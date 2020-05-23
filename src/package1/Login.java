package package1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8692189587515752570L;
	private JLabel korisnickoLabela = new JLabel("Korisnicko ime");
	private JLabel lozinkaLabela = new JLabel("Lozinka");
	private JTextField korisnickoPolje = new JTextField();
	private JPasswordField lozinkaPolje = new JPasswordField();
	private Font font = new Font(Font.SERIF,  Font.BOLD, 20);
			
	public Login() {
		setTitle("Login");
		setSize(100, 100);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		AddComponent();
		SetFont();
	}
	private void AddComponent() {
		add(korisnickoLabela);
		add(korisnickoPolje);
		add(lozinkaLabela);
		add(lozinkaPolje);
	}
	private void SetFont() {
		korisnickoLabela.setFont(font);
		korisnickoPolje.setFont(font);
		lozinkaLabela.setFont(font);
		lozinkaLabela.setFont(font);
	}
}
