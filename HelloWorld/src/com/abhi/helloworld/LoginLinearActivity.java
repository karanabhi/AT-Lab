package com.abhi.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginLinearActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_linear);

		Button login = (Button) findViewById(R.id.login_linear_button_login);
		login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				EditText em = (EditText) findViewById(R.id.editText1);
				EditText ps = (EditText) findViewById(R.id.editText2);
				if (em.getText().toString().equals("aa@bb.com")
						&& ps.getText().toString().equals("pwd")) {
					Toast.makeText(getBaseContext(), "Login Successfull!",
							Toast.LENGTH_LONG).show();
				} else {
					Toast.makeText(getBaseContext(), "Invalid Credentials!",
							Toast.LENGTH_LONG).show();
				}

			}
		});// setOnclickListener
	}// onCreate()

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_linear, menu);
		return true;
	}

}
