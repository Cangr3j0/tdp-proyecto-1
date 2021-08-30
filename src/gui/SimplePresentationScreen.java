package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Rectangle;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private LocalDateTime fecha;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		fecha=fecha.now();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(640, 302));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSize(new Dimension(800,600));
		tabInformation = new JPanel();
		tabInformation.setMaximumSize(new Dimension(32767, 30767));
		tabInformation.setPreferredSize(new Dimension(425, 280));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		lblNewLabel = new JLabel("LU");
		
		lblNewLabel_1 = new JLabel("Apellido");
		
		lblNewLabel_2 = new JLabel("Nombre");
		
		lblNewLabel_3 = new JLabel("E-mail");
		
		lblNewLabel_4 = new JLabel("Github URL");
		
		textField = new JTextField(""+studentData.getId());
		textField.setColumns(10);
		
		textField_1 = new JTextField(studentData.getLastName());
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(studentData.getFirstName());
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(studentData.getMail());
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(studentData.getGithubURL());
		textField_4.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		
		URL url = getClass().getResource(studentData.getPathPhoto());
		JLabel lblNewLabel_5 = new JLabel(new ImageIcon(url));
		
		JLabel lblNewLabel_6 = new JLabel("Esta ventana fue generada el "+ 
		fecha.getDayOfMonth() +"/"+fecha.getMonthValue()+"/"+fecha.getYear()+
		" a las "+fecha.toLocalTime().getHour()+":"+fecha.toLocalTime().getMinute()+":"+
		fecha.toLocalTime().getSecond());
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tabbedPane, Alignment.LEADING))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
