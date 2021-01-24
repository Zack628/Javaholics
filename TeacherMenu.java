import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TeacherMenu implements ActionListener {
	
	JFrame studentFrame;
	JButton trackCovid;
	JButton addCovid;
	JLabel label;
	
	public TeacherMenu () {
		studentFrame=new JFrame ("Μενού Καθηγητών");
		studentFrame.setSize(new Dimension(700,700));
		studentFrame.setLayout(null);
		studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentFrame.setVisible(true);
		
		trackCovid=new JButton("Προβολή θετικών κρουσμάτων");
		addCovid=new JButton("Προσθήκη νέου");
		
		
		trackCovid.setBounds(150,150,300,60 );
		addCovid.setBounds(150,300,300,60 );
		
		
		trackCovid.addActionListener(this);
		addCovid.addActionListener(this);
		
		
		studentFrame.add(trackCovid);
		studentFrame.add(addCovid);
		
		 
	} 
	
public void actionPerformed (ActionEvent e) {
		
		if (e.getSource()==trackCovid) {
			CovidListMenu covidListMenu = new CovidListMenu("teacher");
			studentFrame.setVisible(false);
			studentFrame.dispose();
			
			
		}
		
		if (e.getSource()==addCovid) {
			AddCovid addCovid=new AddCovid("Teacher");
			studentFrame.setVisible(false);
			studentFrame.dispose();
		}
		
		
		
	}

}
