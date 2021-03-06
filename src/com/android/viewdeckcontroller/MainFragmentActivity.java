package com.android.viewdeckcontroller;

import com.android.widget.viewdeckcontroller.ViewDeckController;
import com.android.widget.viewdeckcontroller.ViewDeckControllerAdapter;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainFragmentActivity extends FragmentActivity {

	private ViewDeckController mViewDeck;
	private ViewDeckControllerAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setUpView();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private void setUpView() {
		mViewDeck = (ViewDeckController) findViewById(R.id.viewdeck);
		mAdapter = new ViewDeckControllerAdapter(getSupportFragmentManager());
		mViewDeck.setAdapter(mAdapter);
	}
}
