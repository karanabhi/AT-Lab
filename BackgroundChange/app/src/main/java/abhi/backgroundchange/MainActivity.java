package abhi.backgroundchange;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

    RadioButton rb;
    String col="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rgrp=(RadioGroup)findViewById(R.id.radioGroup_Color);


        rgrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                rb=(RadioButton)findViewById(i);
                col=rb.getText().toString();


                if(col.equals("RED")){
                    setBackgroundColor(Color.RED);
                }else if(col.equals("BLUE")){
                    setBackgroundColor(Color.BLUE);
                }else if(col.equals("GREEN")){
                    setBackgroundColor(Color.GREEN);
                }else if(col.equals("YELLOW")){
                    setBackgroundColor(Color.YELLOW);
                }else if(col.equals("BLACK")){
                    setBackgroundColor(Color.BLACK);
                }else if(col.equals("GREY")){
                    setBackgroundColor(Color.LTGRAY);
                }else if(col.equals("CYAN")){
                    setBackgroundColor(Color.CYAN);
                }
            }
        });


    }//onCreate()

    public void setBackgroundColor(int colr){
        View view=this.getWindow().getDecorView();
        view.setBackgroundColor(colr);
    }//setBackgroundColor()



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
