package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


	public class Boutons1 extends JPanel implements ActionListener {  
	
		private static final long serialVersionUID = 1L;
		private JButton trace = new JButton("trace");
		private JButton efface = new JButton("efface");
		private Ardoise  ardoise = new Ardoise();

		public Boutons1() {
		      setLayout(new BorderLayout(5, 5));
		      JPanel lesBoutons = new JPanel();
		      lesBoutons.add(trace);
		      lesBoutons.add(efface);
		      add(lesBoutons, BorderLayout.NORTH);
		      add(ardoise, BorderLayout.CENTER);
		      trace.addActionListener(this);
		      efface.addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
		      if (e.getSource() == trace) ardoise.setPossedeDisque(true);
		      else if (e.getSource() == efface) ardoise.setPossedeDisque(false);
		      ardoise.repaint();      
		}
		
}
