
import java.awt.Point;

import javax.swing.*;
import java.awt.*;



public class Terrain  extends JFrame {
	
	public static Terrain fen;
	
	JPanel page = new JPanel();
	
	private JMenuBar bMenus;
	private JMenu jeu;
	private JMenuItem nouvelle;
	private JPanel coordonnees;
	
	/* dessiné le terrain*/
	protected int largLine ;
	protected int longLine ;
	protected int mediane;
	protected int med;
	protected String score;
	
	
	

	public Terrain (){
		setTitle ("PING PONG");
		setSize(800,600);
		
		score = "0";
		
		page.setLayout(new BorderLayout());
		
	
		
		/* menu */ 
		bMenus = new JMenuBar();
		setJMenuBar(bMenus);
		
		jeu = new JMenu("JEU");
		bMenus.add(jeu);
		
		nouvelle = new JMenuItem("Nouvelle partie");
		jeu.add(nouvelle);
		
		/*affiche les coordonnées*/
		coordonnees = new JPanel();
		coordonnees.setBackground(Color.BLUE);
		
		/* dimmenssion des panneaux */
		 coordonnees.setPreferredSize(new Dimension (200,58));
	
		 /* disposition des eléments presents */
		 coordonnees.setLayout(new FlowLayout(FlowLayout.LEFT));
		 
		
		
		/* contruction du terrain */
		//this.largLine = 580;
		//this.longLine = 385;
		this.mediane =  472;
		this.med = 680;
		
		
	}	
		/* Rectangle */
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(100,100,600,400);
		
		
		/* lignes de la table */
		
		g.setColor(Color.WHITE);
		//g.drawRect (60,60,largLine,longLine);
		g.drawLine(400,120,400, mediane);
		g.drawLine(120,120,med,120);
		g.drawLine(120,470,med,470);
		g.drawString(score,350, 150);
		g.drawString(score,450,150);
	}

		
		

	

	
 /* .......Methodes............. */	
	int getLargeurInterface (){
		return -1;
   }
	int gethauteurInterface(){
		return -1;
		
	}
	int getToucheEnfonce(){
		return -1;
	}
	 Point getPostionSouris(){
		return null;
		
	}
	Balle  getBalle(){
		return null;
	}
	
	public void afiiche (Terrain score){
		
	}
	
	
	public static void main(String[] args) {
		fen = new Terrain();
		fen.setVisible(true);
		

 }
}


