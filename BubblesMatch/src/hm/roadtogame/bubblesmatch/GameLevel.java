package hm.roadtogame.bubblesmatch;

public class GameLevel {

	private GameLevel(int id, int timeOut, int numberOfColor, int emptyCase,
			int minScore) {
		super();
		this.id = id;
		this.timeOut = timeOut;
		this.numberOfColor = numberOfColor;
		this.emptyCase = emptyCase;
		this.minScore = minScore;
	}

	public static GameLevel getInstance(int niveau) {
		GameLevel gl = null;
		switch (niveau) {
		case 1:
			gl = new GameLevel(1, 50, 3, 25, 1680);
			break;
		case 2:
			gl = new GameLevel(2, 45, 4, 27, 1200);
			break;
		case 3:
			gl = new GameLevel(3, 40, 5, 30, 920);
			break;
		case 4:
			gl = new GameLevel(4, 30, 6, 30, 780);
			break;
		case 5:
			gl = new GameLevel(5, 25, 7, 30, 720);
			break;
		default:
			if (niveau < 1 ) {
				gl = new GameLevel(1, 50, 3, 25, 1680);
			} else {
				// niveau > 5
				gl = new GameLevel(5, 25, 7, 30, 720);
			}
			break;

		}

		return gl;
	}

	public int id;
	public int timeOut; // duree du niveau en sec
	public int numberOfColor; // nombre de couleur
	public int emptyCase; // nombre des cases vides dans la map
	public int minScore;// score minimal pour passer au suivant

}
