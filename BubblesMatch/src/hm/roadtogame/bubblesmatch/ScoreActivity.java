package hm.roadtogame.bubblesmatch;

import hm.roadtogame.bubblesmatch.R;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class ScoreActivity extends Activity {
	private TextView[] tv;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.score);
		context = this;
		initTextView();
		updateText();
	}

	private void initTextView() {
		tv = new TextView[6];
		tv[0] = (TextView) findViewById(R.id.scoreone);
		tv[1] = (TextView) findViewById(R.id.scoretwo);
		tv[2] = (TextView) findViewById(R.id.scorethree);
		tv[3] = (TextView) findViewById(R.id.scorefour);
		tv[4] = (TextView) findViewById(R.id.scorefive);
		tv[5] = (TextView) findViewById(R.id.scoresix);

	}

	private void updateText() {

		for (short i = 1; i <= 6; i++) {
			if (context != null) {
				SharedPreferences settings = context.getSharedPreferences(
						"BUBBLESMATCH", 0);
				int tmp = settings.getInt("SCORE" + i, 0);
				tv[i - 1].setText(tmp + "");
			}

		}

	}

}
