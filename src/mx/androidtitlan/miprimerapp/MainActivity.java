package mx.androidtitlan.miprimerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	private int NO = 0;
	private int YES = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void wasIncredible(View view) {
		startActivity(new Intent(MainActivity.this, ResultActivity.class)
				.putExtra("WAS_COOL", YES));
	}

	public void wasMeh(View view) {
		startActivity(new Intent(MainActivity.this, ResultActivity.class)
				.putExtra("WAS_COOL", NO));
	}

}
