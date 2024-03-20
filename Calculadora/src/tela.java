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
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

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
		frmCalculadora.getContentPane().setBackground(new Color(0, 255, 255));
		frmCalculadora.setBackground(new Color(0, 255, 255));
		frmCalculadora.getContentPane().setForeground(new Color(0, 0, 0));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 230, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 18));
		txtField.setBounds(3, 11, 210, 25);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1.setBounds(10, 173, 45, 39);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(10, 131, 45, 39);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(10, 89, 45, 39);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 18));
		btn0.setBounds(10, 213, 45, 39);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(59, 89, 45, 39);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(59, 131, 45, 39);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(59, 173, 45, 39);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btnponto = new JButton(".");
		btnponto.setForeground(new Color(255, 0, 0));
		btnponto.setFont(new Font("Arial", Font.BOLD, 18));
		btnponto.setBounds(59, 213, 45, 39);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(113, 89, 45, 39);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(113, 131, 45, 39);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(113, 173, 45, 39);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnigual = new JButton("=");
		btnigual.setForeground(new Color(255, 0, 0));
		btnigual.setFont(new Font("Arial", Font.BOLD, 18));
		btnigual.setBounds(113, 213, 45, 39);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btnsoma = new JButton("+");
		btnsoma.setForeground(new Color(255, 0, 0));
		btnsoma.setFont(new Font("Arial", Font.BOLD, 18));
		btnsoma.setBounds(168, 89, 45, 39);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnc.setForeground(new Color(255, 0, 0));
		btnc.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		btnc.setBounds(168, 47, 45, 39);
		frmCalculadora.getContentPane().add(btnc);
		
		JButton btnsub = new JButton("-");
		btnsub.setForeground(new Color(255, 0, 0));
		btnsub.setFont(new Font("Arial", Font.BOLD, 18));
		btnsub.setBounds(168, 131, 45, 39);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnmult = new JButton("X");
		btnmult.setForeground(new Color(255, 0, 0));
		btnmult.setFont(new Font("Arial", Font.BOLD, 16));
		btnmult.setBounds(168, 173, 45, 39);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("÷");
		btndiv.setForeground(new Color(255, 0, 0));
		btndiv.setFont(new Font("Arial", Font.BOLD, 18));
		btndiv.setBounds(168, 213, 45, 39);
		frmCalculadora.getContentPane().add(btndiv);
	}
}
