package InterfaceGraphique;


import javax.swing.JFrame;
import java.awt.Frame;

	
	
	
	

	public class Fentretest2 {
		
		 public static void main(String[] arg) { 
			Frame cadre = new javax.swing.JFrame("Un disque");
			((JFrame) cadre).setContentPane(new Ardoise());
			cadre.setLocation(400, 300);
			cadre.pack();
			cadre.setVisible(true);
			((JFrame) cadre).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
	}

