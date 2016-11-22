
public class Raquette_Clavier extends Raquette {
	
	 
	public Raquette_Clavier(int x, int y, int vx, int vy, int sensx, int sensy,
			int hauteur, int largeur) {
		super(x, y, vx, vy, sensx, sensy, hauteur, largeur);
		// TODO Auto-generated constructor stub
	}

	public void deplacer (Terrain jeu){
		
		if (jeu.getToucheEnfonce()==38){
			setSensy(-1);
			setY(getY()+ getVy() * getSensy());
			
		}
		if (jeu.getToucheEnfonce()== 40){
			setSensy(1);
			setY(getY()+ getVy() *getSensy());
		}
	}

}
