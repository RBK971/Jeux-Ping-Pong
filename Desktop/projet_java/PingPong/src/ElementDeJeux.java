
public class ElementDeJeux {


	private int x;
	private int y;
	private int vx;
	private int vy;
	private int sensx;
	private int sensy;
	

public ElementDeJeux(int x, int y, int vx, int vy, int sensx, int sensy) {
	super();
	this.x = x;
	this.y = y;
	this.vx = vx;
	this.vy = vy;
	this.sensx = sensx;
	this.sensy = sensy;
}

//getters 


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getVx() {
		return vx;
	}

	public int getVy() {
		return vy;
	}

	public int getSensx() {
		return sensx;
	}

	public int getSensy() {
		return sensy;
	}

// setters

	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void setVx(int vx) {
		this.vx = vx;
	}


	public void setVy(int vy) {
		this.vy = vy;
	}


	public void setSensx(int sensx) {
		this.sensx = sensx;
	}


	public void setSensy(int sensy) {
		this.sensy = sensy;
	}


	public void deplacer (Terrain jeu){
		
	}


}
