package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class GuiRetiros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblCdAlumno;
	private JLabel lblCdCurso;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JButton btnRetirar;
	private JButton btnSalir;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiRetiros frame = new GuiRetiros();
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
	public GuiRetiros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setToolTipText("");
		panel.setBorder(new TitledBorder(null, "Datos del matriculado", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 153, 255)));
		panel.setBounds(30, 11, 395, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Cód. Matricula");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 21, 143, 23);
		panel.add(lblNewLabel);
		
		lblCdAlumno = new JLabel("Cód. Alumno");
		lblCdAlumno.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblCdAlumno.setBounds(10, 55, 143, 23);
		panel.add(lblCdAlumno);
		
		lblCdCurso = new JLabel("Cód. Curso");
		lblCdCurso.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblCdCurso.setBounds(10, 89, 143, 23);
		panel.add(lblCdCurso);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(151, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(151, 59, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(151, 93, 86, 20);
		panel.add(textField_2);
		
		comboBox = new JComboBox();
		comboBox.setBounds(274, 24, 99, 22);
		panel.add(comboBox);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setToolTipText("");
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Accion a realizar", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 153, 255)));
		panel_1.setBounds(435, 11, 144, 136);
		contentPane.add(panel_1);
		
		btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(10, 22, 124, 23);
		panel_1.add(btnNewButton);
		
		btnRetirar = new JButton("Retirar");
		btnRetirar.setBounds(10, 55, 124, 23);
		panel_1.add(btnRetirar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 89, 124, 23);
		panel_1.add(btnSalir);
	}
}
