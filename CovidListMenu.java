import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CovidListMenu implements ActionListener {

	JFrame showCovidFrame;
	JButton returnMain;
	JList <String> covidList;
	JButton deleteButton;
	DefaultListModel<String> l1;
	String value;


public CovidListMenu(String value) {
	this.value=value;
	
	
	if (value=="student") {
		
		showCovidFrame=new JFrame ("Πίνακας Κρουσμάτων Μαθητών");
		 l1 = new DefaultListModel<>();  
			for (int i=0; i<CovidTracker.covidStudentList.size(); i++) {
			 
				l1.addElement(CovidTracker.covidStudentList.get(i).id + ",   " + CovidTracker.covidStudentList.get(i).firstName + ",   " + CovidTracker.covidStudentList.get(i).lastName );  
			 			 
			}
			if (CovidTracker.covidStudentList.size()==0){
			 l1.addElement("       Δεν υπάρχει επιβεβαιωμένο κρούσμα μαθητή");
			}
			covidList = new JList<>(l1);  		
	}
	
	if (value=="teacher") {
		showCovidFrame=new JFrame ("Πίνακας Κρουσμάτων Καθηγητών");

		l1 = new DefaultListModel<>();  
		for (int i=0; i<CovidTracker.covidTeacherList.size(); i++) {
		 
			l1.addElement(CovidTracker.covidTeacherList.get(i).id + ",   " + CovidTracker.covidTeacherList.get(i).firstName + ",   " + CovidTracker.covidTeacherList.get(i).lastName );  
		 			 
		}
		if (CovidTracker.covidTeacherList.size()==0){
		 l1.addElement("       Δεν υπάρχει επιβεβαιωμένο κρούσμα καθηγητή");
		}
		covidList = new JList<>(l1);  
			
	}
	
	if (value=="studentList") {
		
		showCovidFrame=new JFrame ("Πίνακας Μαθητών");
		 l1 = new DefaultListModel<>();  
			for (int i=0; i<CovidTracker.studentList.size(); i++) {
			 
				l1.addElement(CovidTracker.studentList.get(i).id + ",   " + CovidTracker.studentList.get(i).firstName + ",   " + CovidTracker.studentList.get(i).lastName );  
			 			 
			}
			if (CovidTracker.studentList.size()==0){
			 l1.addElement("       Δεν υπάρχει καταχωρημένος μαθητής");
			}
			covidList = new JList<>(l1);  
		
	}
	
	if (value=="teacherList") {
		
		showCovidFrame=new JFrame ("Πίνακας Καθηγητών");
		 l1 = new DefaultListModel<>();  
			for (int i=0; i<CovidTracker.teacherList.size(); i++) {
			 
				l1.addElement(CovidTracker.teacherList.get(i).id + ",   " + CovidTracker.teacherList.get(i).firstName + ",   " + CovidTracker.teacherList.get(i).lastName );  
			 			 
			}
			if (CovidTracker.teacherList.size()==0){
			 l1.addElement("       Δεν υπάρχει καταχωρημένος καθηγητής");
			}
			covidList = new JList<>(l1);  
		
	}
		
		JScrollPane scrollPane = new JScrollPane(covidList);
		 scrollPane.setBounds(150,30,350,400);
		 showCovidFrame.add(scrollPane);
		
		showCovidFrame.setSize(new Dimension(700,700));
		showCovidFrame.setLayout(null);
		showCovidFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		showCovidFrame.setVisible(true);
	
		returnMain=new JButton("Επιστροφή στο Κεντρικό Μενού");
		deleteButton=new JButton("Διαγραφή");
		
		returnMain.setBounds(180,580,300,60 );
		returnMain.addActionListener(this);
		deleteButton.setBounds(250,450,150,60 );
		deleteButton.addActionListener(this);
		showCovidFrame.add(returnMain);
		showCovidFrame.add(deleteButton);
		
	
	}



public void actionPerformed (ActionEvent e) {
		
		if (e.getSource()==returnMain) {
			MainMenu mainMenu = new MainMenu();
			showCovidFrame.setVisible(false);
			showCovidFrame.dispose();			
		}
		
		if (e.getSource()==deleteButton) {
			int selectedIndex = covidList.getSelectedIndex();
			l1.remove(selectedIndex);
			if (this.value=="student")
				CovidTracker.covidStudentList.remove(selectedIndex);
			if (this.value=="teacher")
				CovidTracker.covidTeacherList.remove(selectedIndex);
			if (this.value=="studentList")
				CovidTracker.studentList.remove(selectedIndex);
			if (this.value=="teacherList")
				CovidTracker.teacherList.remove(selectedIndex);
			
			
		}
		
		
	}


}
