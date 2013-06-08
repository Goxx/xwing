package InterfaceGraphique1;




	    
class EssaiBoutons5 {
	    public static void main(String[] arg) {
	    	
		Modele modele = new Modele();
		Vue vue = new Vue(modele);
		Controleur controleur =  new Controleur(modele, vue);

		vue.trace.addActionListener(controleur);
		vue.efface.addActionListener(controleur);
	    
	    }
}