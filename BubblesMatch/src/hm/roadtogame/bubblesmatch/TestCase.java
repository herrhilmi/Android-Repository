package hm.roadtogame.bubblesmatch;

public class TestCase {

	public TestCase(int x, int y, int couleur, int localisaton) {
		super();
		this.x = x;
		this.y = y;
		this.couleur = couleur;
		this.doitdisparetre = false;
		this.localisaton = localisaton;
	}

	public TestCase(int x, int y, int couleur) {
		super();
		this.x = x;
		this.y = y;
		this.couleur = couleur;
	}

	int x,y;// coordonnées de la case a tester
	int couleur;
	boolean doitdisparetre;
	int localisaton;

}
