package hm.roadtogame.bubblesmatch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import hm.roadtogame.bubblesmatch.R;

public class GameActivity extends Activity {
	private GameView gameView;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.game);
		
		gameView = (GameView) findViewById(R.id.GameView);
		Log.e("-> onCreate <-", "before gameView");
		gameView.parentActivity = this;
		gameView.setVisibility(View.VISIBLE);

		gameView.soundOn = getIntent().getExtras().getBoolean("isSoundOn");
		Log.e("-> onCreate <-", "after gameView ");
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.e("-> onPause <-", "onPause");
		gameView.save();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e("-> onRestart <-", "onRestart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.e("-> onStop <-", "onStop");
		gameView.in = false;
		gameView.setGameThread(null);
	}

	@Override
	protected void onResume() {
		super.onResume();
		gameView.initParameters();
		Log.e("-> onResume <-", "onRessume");

	}

}
