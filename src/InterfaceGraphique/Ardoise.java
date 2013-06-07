package InterfaceGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPanel;

import miniature.Miniature;


public class Ardoise extends JPanel {
		static final long serialVersionUID = 1;
		private boolean possedeDisque = true;
		public Set<Miniature> list;

		 public Ardoise() {
			setBackground(Color.WHITE);
			setPreferredSize(new Dimension(500, 500));
			list = new HashSet<Miniature>();
		 }
	
		 public void setPossedeDisque(boolean possedeDisque) {
			this.possedeDisque = possedeDisque;
		 }
	
		 public void dessiner(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(60, 35, 80, 80);
		 }
		 public void ajouter(Miniature mini) {
			 list.add(mini);
		 }
		 public void remove(Miniature mini) {
			 list.remove(mini);
		 }
		 public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (possedeDisque) dessiner(g);
			Iterator<Miniature> it = list.iterator();
			for ( int i =0; i < list.size();i++){
				Miniature mini = it.next();
				mini.dessiner(g);
			}
		 }
}

