
public class Raquette_Souris extends Raquette {

	public Raquette_Souris(int x, int y, int vx, int vy, int sensx, int sensy,
			int hauteur, int largeur) {
		super(x, y, vx, vy, sensx, sensy, hauteur, largeur);
		// TODO Auto-generated constructor stub
	}

	public void deplacer(Terrain jeu){
		if (jeu.getPostionSouris().y<getY()){
			setSensy(-1);
			setY(getY()+ getVy() * getSensy());
					
		}
		if (jeu.getPostionSouris().y>getY()){
			setSensy(+1);
			setY(getY()+ getVy() * getSensy());
		}
	}
}
