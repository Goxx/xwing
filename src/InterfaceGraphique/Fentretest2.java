package InterfaceGraphique;


import javax.swing.JFrame;

import pilot.Pilot;
import pilot.Ship;

import deplacement.Mouvement;

import miniature.Miniature;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

	public class Fentretest2 {
		
		 public static void main(String[] arg) { 
			Frame cadre = new javax.swing.JFrame("Un disque");
			Ardoise dessin = new Ardoise();
			((JFrame) cadre).setContentPane(dessin);
			cadre.setLocation(400, 300);
			cadre.pack();
			cadre.setVisible(true);
			((JFrame) cadre).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Miniature miniature1 = new Miniature();
			miniature1.setHeight(10);
			miniature1.setWidth(10);
			miniature1.setX(20);
			miniature1.setY(30);
			miniature1.setOrientation(90);
			
			Miniature miniature2 = new Miniature();
			miniature2.setHeight(10);
			miniature2.setWidth(33);
			miniature2.setX(60);
			miniature2.setY(120);
			miniature2.setOrientation(270);
			
			Miniature miniature3 = new Miniature();
			miniature3.setHeight(33);
			miniature3.setWidth(33);
			miniature3.setX(40);
			miniature3.setY(50);
			miniature3.setOrientation(0);
			
			Miniature miniature4 = new Miniature();
			miniature4.setHeight(45);
			miniature4.setWidth(10);
			miniature4.setX(200);
			miniature4.setY(250);
			miniature4.setOrientation(190);
			
			Miniature miniatureCopi =new Miniature();
			miniatureCopi.setHeight(45);
			miniatureCopi.setWidth(10);
			miniatureCopi.setX(200);
			miniatureCopi.setY(250);
			miniatureCopi.setOrientation(190);

			Ship vaisseau1 = new Ship();
			Pilot pilot = new Pilot(vaisseau1);
			Mouvement mouvement = new Mouvement("test1", 50, 90, 90);
			Mouvement mouvement2 = new Mouvement("test2", 50, 0, 45);
			

			mouvement.setNewPosition(miniature2);
			
			mouvement2.setNewPosition(miniature4);
	
			dessin.ajouter(miniature1);
			dessin.ajouter(miniature2);
			dessin.ajouter(miniature3);
			dessin.ajouter(miniature4);
			dessin.ajouter(miniatureCopi);
			
cadre.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					System.out.println(e.getX() + "     " + e.getY());
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
		 }
	}

