package com.example.bmetzelaar16.pr4_2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    public void toggleCoin(View v) {
        TextView f = (TextView)this.findViewById(R.id.tvNotifySide);
        ImageView pic = (ImageView)this.findViewById(R.id.imageView);
        Random rnd = new Random();
        int num = rnd.nextInt(2);
        if (num == 0){
            f.setText("Heads");
            pic.setImageResource(R.drawable.heads);
        } else {
            f.setText("Tails");
            pic.setImageResource(R.drawable.tails);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
