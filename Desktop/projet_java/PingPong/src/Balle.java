
public class Balle extends ElementDeJeux {

	private int rayon;


	public Balle(int x, int y, int vx, int vy, int sensx, int sensy, int r) {
		super(x, y, vx, vy, sensx, sensy);
		rayon = r;
	}

	public int getRayon() {
		return rayon;
	}


	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public void deplacer (Terrain jeu){
	
	setX(getX()+getVx() * getSensx());
	setY(getY()+getVy() * getSensy());
	
	}


}