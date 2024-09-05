package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tela {

	private JFrame frmCalculadora;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	private JTextField txtField;
	private JButton btnC;
	private JButton btnSoma;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnIgual;
	private JButton btn0;
	private JButton btn2;
	private JButton btn5;
	private JButton btn8;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btnPonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(0, 128, 192));
		frmCalculadora.getContentPane().setForeground(new Color(192, 192, 192));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 339, 375);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 20));
		txtField.setBounds(10, 11, 303, 32);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setForeground(new Color(255, 0, 0));
		btnC.setFont(new Font("Arial", Font.BOLD, 20));
		btnC.setBounds(241, 54, 67, 41);
		frmCalculadora.getContentPane().add(btnC);
		
		btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="+";
			}
		});
		btnSoma.setForeground(new Color(255, 0, 0));
		btnSoma.setFont(new Font("Arial", Font.BOLD, 20));
		btnSoma.setBounds(241, 106, 67, 41);
		frmCalculadora.getContentPane().add(btnSoma);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="-";
			}
		});
		btnSub.setForeground(new Color(255, 0, 0));
		btnSub.setFont(new Font("Arial", Font.BOLD, 20));
		btnSub.setBounds(241, 158, 67, 41);
		frmCalculadora.getContentPane().add(btnSub);
		
		btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="*";
			}
		});
		btnMult.setForeground(new Color(255, 0, 0));
		btnMult.setFont(new Font("Arial", Font.BOLD, 20));
		btnMult.setBounds(241, 211, 67, 41);
		frmCalculadora.getContentPane().add(btnMult);
		
		btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao="/";
			}
		});
		btnDiv.setForeground(new Color(255, 0, 0));
		btnDiv.setFont(new Font("Arial", Font.BOLD, 20));
		btnDiv.setBounds(241, 263, 67, 41);
		frmCalculadora.getContentPane().add(btnDiv);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());
			}
		});
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setFont(new Font("Arial", Font.BOLD, 20));
		btn9.setBounds(164, 106, 67, 41);
		frmCalculadora.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 20));
		btn6.setBounds(164, 158, 67, 41);
		frmCalculadora.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
				
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 20));
		btn3.setBounds(164, 211, 67, 41);
		frmCalculadora.getContentPane().add(btn3);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("*")) {
					resultado = numero1*numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("/")) {
					resultado = numero1/numero2;
					txtField.setText(String.valueOf(resultado));
					
				}
			}
		});
		btnIgual.setForeground(new Color(255, 0, 0));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 20));
		btnIgual.setBounds(164, 263, 67, 41);
		frmCalculadora.getContentPane().add(btnIgual);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn0.getText());
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 20));
		btn0.setBounds(87, 263, 67, 41);
		frmCalculadora.getContentPane().add(btn0);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		btn2.setBounds(87, 211, 67, 41);
		frmCalculadora.getContentPane().add(btn2);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 20));
		btn5.setBounds(87, 158, 67, 41);
		frmCalculadora.getContentPane().add(btn5);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 20));
		btn8.setBounds(87, 106, 67, 41);
		frmCalculadora.getContentPane().add(btn8);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 20));
		btn7.setBounds(10, 106, 67, 41);
		frmCalculadora.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn4.getText());
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 20));
		btn4.setBounds(10, 158, 67, 41);
		frmCalculadora.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn1.getText());
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		btn1.setBounds(10, 211, 67, 41);
		frmCalculadora.getContentPane().add(btn1);
		
		
		btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(btnPonto.getText()+txtField.getText());
			}
		});
		btnPonto.setForeground(new Color(255, 0, 0));
		btnPonto.setFont(new Font("Arial", Font.BOLD, 20));
		btnPonto.setBounds(10, 263, 67, 41);
		frmCalculadora.getContentPane().add(btnPonto);
			
	}
}
