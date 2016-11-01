import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGui {

	private JFrame frmCalculator;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGui window = new CalculatorGui();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(189, 94, 196, 22);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 59, 196, 22);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNumber = new JLabel("number1:");
		lblNumber.setBounds(94, 62, 56, 16);
		frmCalculator.getContentPane().add(lblNumber);
		
		JLabel lblNumber_1 = new JLabel("number2:");
		lblNumber_1.setBounds(94, 107, 56, 16);
		frmCalculator.getContentPane().add(lblNumber_1);
		
		JLabel lblResult = new JLabel("result:");
		lblResult.setBounds(53, 160, 56, 16);
		frmCalculator.getContentPane().add(lblResult);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(121, 204, 44, 25);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("-");
		button.setBounds(178, 204, 44, 25);
		frmCalculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(234, 204, 44, 25);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.setBounds(292, 204, 44, 25);
		frmCalculator.getContentPane().add(button_2);
	}
}
