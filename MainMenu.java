import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu implements ActionListener {
	

	JFrame mainFrame;
	JButton studentButton;
	JButton teacherButton;
	JButton secretaryButton;
	JLabel label;
	
	public MainMenu () {
		mainFrame=new JFrame ("Κεντρικό Μενού");
		mainFrame.setSize(new Dimension(700,700));
		mainFrame.setLayout(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		
		studentButton=new JButton("Μαθητής");
		teacherButton=new JButton("Καθηγητής");
		secretaryButton=new JButton("Γραμματεία");
		
		studentButton.setBounds(250,150,200,60 );
		teacherButton.setBounds(250,300,200,60 );
		secretaryButton.setBounds(250,450,200,60 );
		
		studentButton.addActionListener(this);
		teacherButton.addActionListener(this);
		secretaryButton.addActionListener(this);

		
		mainFrame.add(studentButton);
		mainFrame.add(teacherButton);
		mainFrame.add(secretaryButton);
		
		 
	} 
	
	
	public void actionPerformed (ActionEvent e) {
		
		if (e.getSource()==studentButton) {
			StudentMenu studentMenu =new StudentMenu();
			mainFrame.setVisible(false);
			mainFrame.dispose();
			
		}
		
		if (e.getSource()==teacherButton) {
			TeacherMenu teacherMenu =new TeacherMenu();
			mainFrame.setVisible(false);
			mainFrame.dispose();
			
		}
		
		if (e.getSource()==secretaryButton) {
			SecretaryMenu secretaryMenu =new SecretaryMenu();
			mainFrame.setVisible(false);
			mainFrame.dispose();
			
		}
		
		
	}

}
