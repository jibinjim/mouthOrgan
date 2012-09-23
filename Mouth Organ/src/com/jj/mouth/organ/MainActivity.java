package com.jj.mouth.organ;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	

    
 
   // private Button closeButton;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        /*this.setContentView(R.layout.activity_main);
        this.closeButton=(Button)this.findViewById(R.id.button4);
        this.closeButton.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		android.os.Process.killProcess(android.os.Process.myPid());
        		System.exit(0);
        	}
        });*/
      
        Button btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
			
        	public void onClick(View v){
        		Intent intent=new Intent(MainActivity.this,organ.class);
				startActivity(intent);
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
