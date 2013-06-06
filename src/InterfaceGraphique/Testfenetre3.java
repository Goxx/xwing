package InterfaceGraphique;


	import javax.swing.JFrame;
	
	
public class Testfenetre3 {
	
	public static void main(String[] arg) {
	      JFrame monCadre = new JFrame();
	      monCadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      monCadre.setLocation(200,200);
	      monCadre.setContentPane(new Boutons1());
	      monCadre.pack();
	      monCadre.setVisible(true);
	}
	
}
