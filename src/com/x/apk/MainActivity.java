package com.x.apk;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	private final static String tag = "MainActivity";

	private AutoCompleteTextView actv;
	private static final String[] autoStrs = new String[] { "a", "abc", "abcd", "abcde", "ba" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		actv = (AutoCompleteTextView) findViewById(R.id.actv);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, autoStrs);
		actv.setAdapter(adapter);

		Log.e(tag, "start onCreate~~~");

	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.e(tag, "start onStart~~~");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e(tag, "start onRestart~~~");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e(tag, "start onResume~~~");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.e(tag, "start OnPause~~~");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.e(tag, "start onStop~~~");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e(tag, "start onDestory~~~");
	}

}
