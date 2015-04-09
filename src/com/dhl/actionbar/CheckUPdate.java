package com.dhl.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class CheckUPdate extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.check_update);

		ActionBar actionBar = getActionBar();
		actionBar.setIcon(R.drawable.ic_action_usb);
		actionBar.setDisplayHomeAsUpEnabled(true);
	}
}
