import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecretaryMenu implements ActionListener {
	JFrame mainFrame;
	JButton addStudentButton;
	JButton addTeacherButton;
	JButton viewStudentButton;
	JButton viewTeacherButton;
	JButton viewStudentCovid;
	JButton viewTeacherCovid;
	
	JLabel label;
	
	public SecretaryMenu() {
	mainFrame=new JFrame ("Μενού Γραμματείας");
	mainFrame.setSize(new Dimension(700,700));
	mainFrame.setLayout(null);
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainFrame.setVisible(true);
	
	addStudentButton=new JButton("Προσθήκη Μαθητή");
	viewStudentButton=new JButton("Προβολή Μαθητών");
	addTeacherButton=new JButton("Προσθήκη Καθηγητή");
	viewTeacherButton=new JButton("Προβολή Καθηγητών");
	viewStudentCovid=new JButton("Προβολή Κρουσμάτων Μαθητών");
	viewTeacherCovid=new JButton("Προβολή Κρουσμάτων Καθηγητών");
	
	
	
	addStudentButton.setBounds(200,80,250,60 );
	viewStudentButton.setBounds(200,160,250,60 );
	addTeacherButton.setBounds(200,240,250,60 );
	viewTeacherButton.setBounds(200,320,250,60 );
	viewStudentCovid.setBounds(200,400,250,60 );
	viewTeacherCovid.setBounds(200,480,250,60 );
	
	addStudentButton.addActionListener(this);
	viewStudentButton.addActionListener(this);
	addTeacherButton.addActionListener(this);
	viewTeacherButton.addActionListener(this);
	viewStudentCovid.addActionListener(this);
	viewTeacherCovid.addActionListener(this);

	
	mainFrame.add(addStudentButton);
	mainFrame.add(addTeacherButton);
	mainFrame.add(viewStudentButton);
	mainFrame.add(viewTeacherButton);
	mainFrame.add(viewStudentCovid);
	mainFrame.add(viewTeacherCovid);
	
	
	 
} 


public void actionPerformed (ActionEvent e) {
	
	if (e.getSource()==addStudentButton) {
		AddCovid addStudent = new AddCovid ("StudentAdd");
		mainFrame.setVisible(false);
		mainFrame.dispose();
		
	}
	
	if (e.getSource()==viewStudentButton) {
		CovidListMenu covidListMenu = new CovidListMenu ("studentList");
		mainFrame.setVisible(false);
		mainFrame.dispose();
		
	}
	
	if (e.getSource()==addTeacherButton) {
		AddCovid addStudent = new AddCovid ("TeacherAdd");
		mainFrame.setVisible(false);
		mainFrame.dispose();
		
	}
	
	if (e.getSource()==viewTeacherButton) {
		CovidListMenu covidListMenu = new CovidListMenu ("teacherList");
		mainFrame.setVisible(false);
		mainFrame.dispose();
		
	}
	
	if (e.getSource()==viewStudentCovid) {
		CovidListMenu covidListMenu = new CovidListMenu ("student");
		mainFrame.setVisible(false);
		mainFrame.dispose();
		
	}
	
	if (e.getSource()==viewTeacherCovid) {
		CovidListMenu covidListMenu = new CovidListMenu ("teacher");
		mainFrame.setVisible(false);
		mainFrame.dispose();
		
	}
}


}
