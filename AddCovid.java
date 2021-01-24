import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddCovid implements ActionListener{


	JFrame addCovidFrame;
	JButton returnMain;
	JTextField id;
	JTextField firstName;
	JTextField lastName;
	JButton addButton;
	String value;
	JLabel idLabel;
	JLabel firstNameLabel;
	JLabel lastNameLabel;
 
	public AddCovid(String value) {
		this.value=value;
		if (value=="Student") {
		
		addCovidFrame=new JFrame ("Προσθήκη Νέου Κρούσματος Μαθητή");
		
		}
		if (value=="Teacher") {
			
			addCovidFrame=new JFrame ("Προσθήκη Νέου Κρούσματος Καθηγητή");
			
		}
		if (value=="StudentAdd") {
		
		addCovidFrame=new JFrame ("Προσθήκη Νέου Μαθητή");
		
		}
		if (value=="TeacherAdd") {
		
		addCovidFrame=new JFrame ("Προσθήκη Νέου Καθηγητή");
		
		}
	
		
		addCovidFrame.setSize(new Dimension(700,700));
		
		addCovidFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addCovidFrame.setVisible(true);
		addCovidFrame.setLayout(null);
		idLabel=new JLabel("ID ");
		idLabel.setBounds(130, 150, 30, 30);
		addCovidFrame.add(idLabel);
		firstNameLabel=new JLabel("Όνομα ");
	    firstNameLabel.setBounds(130, 200, 50, 30);
		addCovidFrame.add(firstNameLabel);
		lastNameLabel=new JLabel("Επώνυμο ");
		lastNameLabel.setBounds(130, 250, 60, 30);
		addCovidFrame.add(lastNameLabel);
		
		id=new JTextField(100);
		id.setBounds(210, 150, 250, 30);
		addCovidFrame.add(id);
		firstName=new JTextField(100);
		firstName.setBounds(210, 200, 250, 30);
		addCovidFrame.add(firstName);
		lastName=new JTextField(10);
		lastName.setBounds(210, 250, 250, 30);
		addCovidFrame.add(lastName);
		
		returnMain=new JButton("Επιστροφή στο Κεντρικό Μενού");
		addButton=new JButton("Προσθήκη");
		
		returnMain.setBounds(180,580,300,60 );
		returnMain.addActionListener(this);
	
		addButton.setBounds(250,450,150,60 );
		addButton.addActionListener(this);
		addCovidFrame.add(returnMain);
		addCovidFrame.add(addButton);
	
		
		
	}
	
	

	public void actionPerformed (ActionEvent e) {
	
		if (e.getSource()==returnMain) {
			MainMenu mainMenu = new MainMenu();
			addCovidFrame.setVisible(false);
			addCovidFrame.dispose();
		
			
		}
		if (e.getSource()==addButton) {
			 String idValue = id.getText();
			 String firstNameValue = firstName.getText();
			 String lastNameValue = lastName.getText();
			 if (this.value=="Student")
				 CovidTracker.covidStudentList.add(new Student(Integer.parseInt(idValue),firstNameValue,lastNameValue));
			 if (this.value=="Teacher")
				 CovidTracker.covidTeacherList.add(new Teacher(Integer.parseInt(idValue),firstNameValue,lastNameValue));
			 if (this.value=="StudentAdd")
				 CovidTracker.studentList.add(new Student(Integer.parseInt(idValue),firstNameValue,lastNameValue));
			 if (this.value=="TeacherAdd")
				 CovidTracker.teacherList.add(new Teacher(Integer.parseInt(idValue),firstNameValue,lastNameValue));
			 
		
		}
	
	
	
	}
	
}
