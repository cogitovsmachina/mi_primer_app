package mx.androidtitlan.miprimerapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class ResultActivity extends FragmentActivity {

	private static final int YES = 1;
	private static final int NO = 0;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_result);
		int WAS_COOL = getIntent().getIntExtra("WAS_COOL", 0);
		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.container);

		if (fragment == null) {
			FragmentTransaction ft = fm.beginTransaction();
			if (WAS_COOL == YES) {
				ft.add(R.id.container, new WasCoolFragment());

			} else if (WAS_COOL == NO) {
				ft.add(R.id.container, new WasLameFragment());
			}
			ft.commit();
		}

	}
}