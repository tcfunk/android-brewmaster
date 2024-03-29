package com.logorrhea.skyrimbrewmaster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.logorrhea.skyrimbrewmaster.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
    public void createEffect(View view) {
    	changeView(CreateEffectActivity.class);
    }
    
    public void createIngredient(View view) {
    	changeView(CreateIngredientActivity.class);
    }
    
    private void changeView(Class<?> klass) {
    	Intent intent = new Intent(this, klass);
    	startActivity(intent);
    }
    
}
