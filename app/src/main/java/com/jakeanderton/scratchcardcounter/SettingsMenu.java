package com.jakeanderton.scratchcardcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class SettingsMenu extends Activity
{

    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    EditText et5;
    EditText et6;
    EditText et7;
    EditText et8;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_menu);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7 = (EditText) findViewById(R.id.et7);
        et8 = (EditText) findViewById(R.id.et8);

        et1.setText(Integer.toString(MainActivity.m1));
        et2.setText(Integer.toString(MainActivity.m2));
        et3.setText(Integer.toString(MainActivity.m3));
        et4.setText(Integer.toString(MainActivity.m4));
        et5.setText(Integer.toString(MainActivity.m5));
        et6.setText(Integer.toString(MainActivity.m6));
        et7.setText(Integer.toString(MainActivity.m7));
        et8.setText(Integer.toString(MainActivity.m8));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendValues(View view)
    {
        MainActivity.m1 = Integer.parseInt((et1.getText()).toString());
        MainActivity.m2 = Integer.parseInt((et2.getText()).toString());
        MainActivity.m3 = Integer.parseInt((et3.getText()).toString());
        MainActivity.m4 = Integer.parseInt((et4.getText()).toString());
        MainActivity.m5 = Integer.parseInt((et5.getText()).toString());
        MainActivity.m6 = Integer.parseInt((et6.getText()).toString());
        MainActivity.m7 = Integer.parseInt((et7.getText()).toString());
        MainActivity.m8 = Integer.parseInt((et8.getText()).toString());

    }

}
