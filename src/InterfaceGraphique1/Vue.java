package InterfaceGraphique1;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import InterfaceGraphique.Ardoise;



class Vue extends JFrame implements Observer {
	    Modele modele;
	    JButton trace = new JButton("trace");
	    JButton efface = new JButton("efface");
	    Ardoise ardoise = new Ardoise();
	
	    Vue(Modele modele) {
		this.modele = modele;
		JPanel lesBoutons = new JPanel();
		
		modele.addObserver(this);
	
		lesBoutons.add(trace);
		lesBoutons.add(efface);
		add(lesBoutons, BorderLayout.NORTH);
		add(ardoise, BorderLayout.CENTER);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200,200);
		pack();
		setVisible(true);
	    }
		
	    public void update(Observable o, Object arg) {
		ardoise.setPossedeDisque(modele.getExiste());
		ardoise.repaint();
	    }
}