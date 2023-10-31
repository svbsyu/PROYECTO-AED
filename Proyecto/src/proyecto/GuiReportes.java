package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiReportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtReportes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiReportes frame = new GuiReportes();
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
	public GuiReportes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel iblReportes = new JLabel("Tipo de reportes");
		iblReportes.setBounds(10, 11, 94, 19);
		contentPane.add(iblReportes);
		
		JButton btnReportes = new JButton("Cerrar");
		btnReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnReportes(e);
			}
		});
		
		btnReportes.setBounds(353, 11, 73, 19);
		contentPane.add(btnReportes);
		
		JComboBox<Object> cboReportes = new JComboBox<Object>();
		cboReportes.setModel(new DefaultComboBoxModel<Object>(new String[] {"Cursos matriculados por un alumno", "Cursos asignados a un docente", "Alumnos matriculados en un curso", "Docentes sin cursos asignados", "Alumnos no matriculados"}));
		cboReportes.setToolTipText("");
		cboReportes.setBounds(114, 11, 229, 19);
		contentPane.add(cboReportes);
		
		txtReportes = new JTextField();
		txtReportes.setBounds(10, 48, 416, 362);
		contentPane.add(txtReportes);
		txtReportes.setColumns(10);
	}
	protected void actionPerformedBtnReportes(ActionEvent e) {
		dispose();
	}
}
