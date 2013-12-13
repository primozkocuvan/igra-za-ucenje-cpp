package si.fri.ucenjecpp;

import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity{
	
	Button gumbStart, gumbScore, gumbNavodila, gumbExit;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		// User code - Add buttons etc. here
		
		
		gumbStart = (Button) findViewById(R.id.buZacni);
		gumbScore = (Button) findViewById(R.id.buRezultati);
		gumbNavodila = (Button) findViewById(R.id.buNavodila);
		gumbExit = (Button) findViewById(R.id.buIzhod);
		
		gumbStart.setOnClickListener(new View.OnClickListener() {

		    @Override
		    public void onClick(View v) {
		         gumbStart.setBackgroundColor(color.white);
		         Intent userActivity = new Intent(getApplicationContext(), InputUserActivity.class);
		         startActivity(userActivity);
		    }
		});
		
		gumbExit.setOnClickListener(new View.OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    	
		    	// Fix the coloring of the button when pressed
		         //gumbExit.setBackgroundColor(color.white);
		         StartActivity.this.finish();
		    }
		});
		
		gumbScore.setOnClickListener(new View.OnClickListener() {

		    @Override
		    public void onClick(View v) {
		         //gumbScore.setBackgroundColor(color.white);
		         Intent scoreActivity = new Intent(getApplicationContext(), ScoreActivity.class);
		         startActivity(scoreActivity);
		    }
		});
		
		gumbNavodila.setOnClickListener(new View.OnClickListener() {

		    @Override
		    public void onClick(View v) {
		         //gumbScore.setBackgroundColor(color.white);
		         Intent instruActivity = new Intent(getApplicationContext(),InstructionsActivity.class);
		         startActivity(instruActivity);
		    }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}
	

}

