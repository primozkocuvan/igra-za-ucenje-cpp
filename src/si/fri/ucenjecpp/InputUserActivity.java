package si.fri.ucenjecpp;

import android.os.Bundle;
import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputUserActivity extends Activity {
	Button gumbOK;
	EditText vnosNick;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_input_user);
		
		gumbOK = (Button) findViewById(R.id.buOk);
		vnosNick = (EditText) findViewById(R.id.etVnosvzdevka);
		
		gumbOK.setOnClickListener(new View.OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    	
		    	//When the button is clicked the nickname parameter is saved in User class
		    	User.nickname = vnosNick.getText().toString();
		    	User.points = 0;
		    	
		        Intent Ingame = new Intent(getApplicationContext(), IngameActivity.class);
		        startActivity(Ingame);
		    }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.input_user, menu);
		return true;
	}

}
