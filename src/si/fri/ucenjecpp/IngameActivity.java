package si.fri.ucenjecpp;

import java.sql.Date;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IngameActivity extends Activity {
	TextView editNickname, editTocke, editSekunde;
	int timeLeft = 30;
	Timer timerOne = new Timer();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ingame);
		
		editNickname = (TextView) findViewById(R.id.uporabnik);
		editTocke = (TextView) findViewById(R.id.tocke);
		editSekunde = (TextView) findViewById(R.id.sekunde);
		
		// Set the nickname at the beginning and points
		editNickname.setText(User.nickname);
		editTocke.setText(Integer.toString(User.points));
		
		/* Calling the inside class which calls run() 
		 * function every 1000ms.
		 */
		
		timerOne.schedule(new ProcessOne(), 0L, 1000L);

		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.ingame, menu);
		return true;
	}
	
	
	private class ProcessOne extends TimerTask {
		public void run() {
			runOnUiThread(new Runnable() {
			    public void run() {
			    	editSekunde.setText(Integer.toString(timeLeft) + "s");
			    	if (timeLeft == 0){
			    		timerOne.cancel();
			    		/* Here you add to switch to new activity
			    		 * because the game is over - timeleft = 0!
			    		 */
			    	}
			    	timeLeft--;
			    }
			});
			
        }
    }     

}
