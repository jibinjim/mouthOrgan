package com.jj.mouth.organ;



import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class organ extends Activity implements OnTouchListener{
   
	 public void home_view(View V){
	    	Intent intent = new Intent(organ.this,MainActivity.class);
	    	startActivity(intent);}
	 public void about(View V){
	    	Intent intent = new Intent(organ.this,about.class);
	    	startActivity(intent);}
	/* public void exit(View V){
	    	Intent intent = new Intent(Intent.ACTION_MAIN);
	    	
	    	System.exit(0);}*/
	
	 
	 
		private MediaPlayer mp;
		private Button closeButton;
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.organ);
       
      
        
        /*closeButton=(Button)findViewById(R.id.button4);
        closeButton.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		finish();
        		System.exit(0);
        		
        	}
        });*/
        final Button Zero = (Button)this.findViewById(R.id.button2);
        Zero.setOnTouchListener((OnTouchListener) this);
        mp=MediaPlayer.create(this,R.raw.sound1);
        
        
    }
    public boolean onTouch(View v,MotionEvent event){
    	switch (event.getAction()){
    	case MotionEvent.ACTION_DOWN:
    		{mp.setLooping(true);
    		mp.start();}break;
    	case MotionEvent.ACTION_UP:
    	{	mp.pause();}
    		
    	}
    	return true;
    }
}
