package InterfaceGraphique;


import javax.swing.JFrame;

import pilot.Pilot;
import pilot.Ship;
import pilot.ShipName;
import simulator.DiceAttaque;
import simulator.DiceDefense;
import simulator.ResultFight;
import simulator.SimulatorFight;

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
			miniature1.setHeight(50);
			miniature1.setWidth(50);
			miniature1.setX(20);
			miniature1.setY(30);
			miniature1.setOrientation(90);
			
			Miniature miniature2 = new Miniature();
			miniature2.setHeight(20);
			miniature2.setWidth(20);
			miniature2.setX(60);
			miniature2.setY(120);
			miniature2.setOrientation(270);
			
			Miniature miniature3 = new Miniature();
			miniature3.setHeight(30);
			miniature3.setWidth(30);
			miniature3.setX(40);
			miniature3.setY(50);
			miniature3.setOrientation(0);
			
			Miniature miniature4 = new Miniature();
			miniature4.setHeight(40);
			miniature4.setWidth(40);
			miniature4.setX(200);
			miniature4.setY(250);
			miniature4.setOrientation(190);
			
			Miniature miniatureCopi =new Miniature();
			miniatureCopi.setHeight(40);
			miniatureCopi.setWidth(40);
			miniatureCopi.setX(200);
			miniatureCopi.setY(250);
			miniatureCopi.setOrientation(190);

			Ship vaisseau1 = new Ship(ShipName.TIE_FIGHTER);
			Pilot pilot1 = new Pilot(vaisseau1,0,1,5,2,2,2,null,null);// 5 dmg
			Pilot pilot2 = new Pilot(vaisseau1,0,1,4,4,2,2,null,null);// 3 dmg / 4 defense
			Mouvement mouvement = new Mouvement("test1", 50, 90, 90,0);
			Mouvement mouvement2 = new Mouvement("test2", 50, 0, 45,0);
			
			
			mouvement.setNewPosition(miniature2);
			
			mouvement2.setNewPosition(miniature4);
	
			dessin.ajouter(miniature1);
			dessin.ajouter(miniature2);
			dessin.ajouter(miniature3);
			dessin.ajouter(miniature4);
			dessin.ajouter(miniatureCopi);
			
			miniature1.setPilot(pilot1);
			miniature2.setPilot(pilot2);
			SimulatorFight simul = new SimulatorFight(miniature1, miniature2);
			
			DiceAttaque[] resultatAttaque = simul.getResultAttaque();
			DiceDefense[] resultatDefense = simul.getResultDefense();
			System.out.println("Attaque");
			for (int i = 0; i < resultatAttaque.length; i++){
				System.out.println(resultatAttaque[i]);
			}
			
			System.out.println("Defense");
			for (int i = 0; i < resultatDefense.length; i++){
				System.out.println(resultatDefense[i]);
			}
			ResultFight resultFight = simul.getResult(resultatAttaque, resultatDefense);
			resultFight.afficher();
			
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

