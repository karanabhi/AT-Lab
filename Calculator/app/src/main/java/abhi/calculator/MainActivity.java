package abhi.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    double num=0.0;
    EditText tvnum;
    char stat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add=(Button)findViewById(R.id.main_button_plus);
        Button sub=(Button)findViewById(R.id.main_button_minus);
        Button mul=(Button)findViewById(R.id.main_button_mul);
        Button div=(Button)findViewById(R.id.main_button_div);
        Button sq=(Button)findViewById(R.id.main_button_sq);
        Button pow=(Button)findViewById(R.id.main_button_pow);
        Button eql=(Button)findViewById(R.id.main_button_eq);
        Button clr=(Button)findViewById(R.id.main_button_clr);
        tvnum=(EditText)findViewById(R.id.main_editText_num);

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvnum.setText("");
                num=0;
            }
        });

        //Equal
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (stat){
                    case 'a':num+=Double.parseDouble(tvnum.getText().toString());break;
                    case 's':num -= Double.parseDouble(tvnum.getText().toString());break;
                    case 'm':num *= Double.parseDouble(tvnum.getText().toString());break;
                    case 'd':num /= Double.parseDouble(tvnum.getText().toString());break;
                }

                tvnum.setText(""+num);
            }
        });
        //Add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stat='a';
                num+=Integer.parseInt(tvnum.getText().toString());
                tvnum.setText("");
            }
        });
        //Sub
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stat = 's';
                num += Integer.parseInt(tvnum.getText().toString());
                tvnum.setText("");
            }
        });
        //Mul
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stat = 'm';
                num+=Integer.parseInt(tvnum.getText().toString());
                tvnum.setText("");
            }
        });

        //Div
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stat = 'd';
                num+=Integer.parseInt(tvnum.getText().toString());
                tvnum.setText("");
            }
        });
        //Sq
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvnum.setText("" + Math.sqrt(Double.parseDouble(tvnum.getText().toString())));
            }
        });
        //Pow
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvnum.setText("" +Math.pow(Double.parseDouble(tvnum.getText().toString()), 2));
            }
        });














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
