
public class Raquette extends ElementDeJeux {

	private int hauteur;
	private int largeur;
	public Raquette(int x, int y, int vx, int vy, int sensx, int sensy,
			int hauteur, int largeur) {
		super(x, y, vx, vy, sensx, sensy);
		
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	
//getters 	
	public int getHauteur() {
		return hauteur;
	}
	public int getLargeur() {
		return largeur;
	}
	
//setters
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void deplacer(Terrain jeu){
		
		
	}
	
	/*public boolean collision (Balle b) {
	 if ( getLargeur() > b.getX() && getLargeur () < b.getX() + b.getVx()){
		 if (getHauteur() > b.getY()&& getHauteur () < b.getY() + b.getVy()){
			 
		 }
	 }
		
		
	}*/
}
