package com.jakeanderton.scratchcardcounter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    @Override
    protected void onStop()
    {
        saveSettings();
        super.onStop();
    }

    private void saveSettings()
    {
        MainActivity.sPEditor = getPreferences(Context.MODE_PRIVATE).edit();

        MainActivity.sPEditor.putInt("m1", MainActivity.m1);
        MainActivity.sPEditor.putInt("m2", MainActivity.m2);
        MainActivity.sPEditor.putInt("m3", MainActivity.m3);
        MainActivity.sPEditor.putInt("m4", MainActivity.m4);
        MainActivity.sPEditor.putInt("m5", MainActivity.m5);
        MainActivity.sPEditor.putInt("m6", MainActivity.m6);
        MainActivity.sPEditor.putInt("m7", MainActivity.m7);
        MainActivity.sPEditor.putInt("m8", MainActivity.m8);
        MainActivity.sPEditor.commit();


        System.out.println("Saved to Phone : "+ MainActivity.m1 + " " + MainActivity.m2 + " " + MainActivity.m3 + " " + MainActivity.m4 + " " + MainActivity.m5 + " " + MainActivity.m6 + " " + MainActivity.m7 + " " + MainActivity.m8);






    }

    public void sendValues(View view)
    {
        try
        {
//            EditText[] etCollection = {et1, et2, et3, et4, et5, et6, et7, et8};
//            int[] intCollection = {MainActivity.m1, MainActivity.m2, MainActivity.m3, MainActivity.m4, MainActivity.m5, MainActivity.m6, MainActivity.m7, MainActivity.m8};
//
//            for (int index = 0; index <= 7; index++)
//            {
//                if (!(etCollection[index].getText()).toString().equals(""))
//                {
//                    intCollection[index] = Integer.parseInt((etCollection[index].getText()).toString());
//                }
//                else
//                {
//                    intCollection[index] = 0;
//                }
//            }

            MainActivity.m1 = Integer.parseInt((et1.getText()).toString());
            MainActivity.m2 = Integer.parseInt((et2.getText()).toString());
            MainActivity.m3 = Integer.parseInt((et3.getText()).toString());
            MainActivity.m4 = Integer.parseInt((et4.getText()).toString());
            MainActivity.m5 = Integer.parseInt((et5.getText()).toString());
            MainActivity.m6 = Integer.parseInt((et6.getText()).toString());
            MainActivity.m7 = Integer.parseInt((et7.getText()).toString());
            MainActivity.m8 = Integer.parseInt((et8.getText()).toString());
        } catch (NumberFormatException exception)
        {
        }

        System.out.println("Submitted: " + MainActivity.m1 + " " + MainActivity.m2 + " " + MainActivity.m3 + " " + MainActivity.m4 + " " + MainActivity.m5 + " " + MainActivity.m6 + " " + MainActivity.m7 + " " + MainActivity.m8);

        Toast.makeText(getApplicationContext(), "Saved!", Toast.LENGTH_LONG).show();

    }

}
