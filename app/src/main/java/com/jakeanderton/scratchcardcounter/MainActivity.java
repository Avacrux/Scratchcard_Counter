package com.jakeanderton.scratchcardcounter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{

    EditText sc1;
    EditText sc2;
    EditText sc3;
    EditText sc4;
    EditText sc5;
    EditText sc6;
    EditText sc7;
    EditText sc8;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;

    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;

    static int m1 = 0;
    static int m2 = 0;
    static int m3 = 0;
    static int m4 = 0;
    static int m5 = 0;
    static int m6 = 0;
    static int m7 = 0;
    static int m8 = 0;

    static SharedPreferences.Editor sPEditor;

    private boolean isEmpty(EditText etText)
    {
        if (etText.getText().toString().trim().length() > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // getActionBar().hide();
        setContentView(R.layout.activity_main);

        sc1 = (EditText) findViewById(R.id.sc1);
        sc2 = (EditText) findViewById(R.id.sc2);
        sc3 = (EditText) findViewById(R.id.sc3);
        sc4 = (EditText) findViewById(R.id.sc4);
        sc5 = (EditText) findViewById(R.id.sc5);
        sc6 = (EditText) findViewById(R.id.sc6);
        sc7 = (EditText) findViewById(R.id.sc7);
        sc8 = (EditText) findViewById(R.id.sc8);

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        t6 = (TextView) findViewById(R.id.t6);
        t7 = (TextView) findViewById(R.id.t7);
        t8 = (TextView) findViewById(R.id.t8);

        m1 = getPreferences(Context.MODE_PRIVATE).getInt("m1", 10);
        m2 = getPreferences(Context.MODE_PRIVATE).getInt("m2", 5);
        m3 = getPreferences(Context.MODE_PRIVATE).getInt("m3", 5);
        m4 = getPreferences(Context.MODE_PRIVATE).getInt("m4", 3);
        m5 = getPreferences(Context.MODE_PRIVATE).getInt("m5", 2);
        m6 = getPreferences(Context.MODE_PRIVATE).getInt("m6", 2);
        m7 = getPreferences(Context.MODE_PRIVATE).getInt("m7", 1);
        m8 = getPreferences(Context.MODE_PRIVATE).getInt("m8", 1);

//        m1 = spM1;
//
//        if (spM1 != 10)
//        {
//
//
//        }
//        if (spM2 != 5)
//        {
//            m1 = spM2;
//        }
//        if (spM3 != 5)
//        {
//            m1 = spM3;
//        }
//        if (spM4 != 3)
//        {
//            m1 = spM4;
//        }
//        if (spM5 != 2)
//        {
//            m1 = spM5;
//        }
//        if (spM6 != 2)
//        {
//            m1 = spM6;
//        }
//        if (spM7 != 1)
//        {
//            m1 = spM7;
//        }
//        if (spM8 != 1)
//        {
//            m1 = spM8;
//        }
        System.out.println("Loading values...");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);
        System.out.println(m8);
        System.out.println("Load complete");
//        int m1 = 10;
//        int m2 = 5;
//        int m3 = 5;
//        int m4 = 3;
//        int m5 = 2;
//        int m6 = 2;
//        int m7 = 1;
//        int m8 = 1;

//        t1.setText(t1.getText() + "-");
//        t2.setText(t2.getText() + "-");
//        t3.setText(t3.getText() + "-");
//        t4.setText(t4.getText() + "-");
//        t5.setText(t5.getText() + "-");
//        t6.setText(t6.getText() + "-");
//        t7.setText(t7.getText() + "-");
//        t8.setText(t8.getText() + "-");

        sc1.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i1 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }

                if (isEmpty(sc1))
                {
                    t1.setText("1: -");
                }
                else
                {
                    t1.setText("1: " + (i1 + 1) * m1);
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        sc2.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i2 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
                if (isEmpty(sc2))
                {
                    t2.setText("2: -");

                }
                else
                {
                    t2.setText("2: " + (i2 + 1) * m2);
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        sc3.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i3 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
                if (isEmpty(sc3))
                {
                    t3.setText("3: -");
                }
                else
                {
                    t3.setText("3: " + (i3 + 1) * m3);
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        sc4.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i4 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
                if (isEmpty(sc4))
                {
                    t4.setText("4: -");

                }
                else
                {
                    t4.setText("4: " + (i4 + 1) * m4);
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        sc5.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i5 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
                if (isEmpty(sc5))
                {
                    t5.setText("5: -");
                }
                else
                {
                    t5.setText("5: " + (i5 + 1) * m5);
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        sc6.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i6 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
                if (isEmpty(sc6))
                {
                    t6.setText("6: -");
                }
                else
                {
                    t6.setText("6: " + (i6 + 1) * m6);
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        sc7.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i7 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
                if (isEmpty(sc7))
                {
                    t7.setText("7: -");
                }
                else
                {
                    t7.setText("7: " + (i7 + m7));
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

        sc8.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                try
                {
                    i8 = Integer.parseInt(s.toString());
                } catch (NumberFormatException e)
                {
                    System.out.println(e);
                }
                if (isEmpty(sc8))
                {
                    t8.setText("8: -");
                }
                else
                {
                    t8.setText("8: " + (i8 + m8));
                }

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

    }

    @Override
    protected void onStop()
    {
        saveSettings();
        super.onStop();
    }

    private void saveSettings()
    {
        sPEditor  = getPreferences(Context.MODE_PRIVATE).edit();

        sPEditor.putInt("m1", m1);
        sPEditor.putInt("m2", m2);
        sPEditor.putInt("m3", m3);
        sPEditor.putInt("m4", m4);
        sPEditor.putInt("m5", m5);
        sPEditor.putInt("m6", m6);
        sPEditor.putInt("m7", m7);
        sPEditor.putInt("m8", m8);
        sPEditor.commit();


        System.out.println("Saved to Phone : " +m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5 + " " + m6 + " " + m7 + " " + m8);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            Intent openSettingsMenu = new Intent(this, SettingsMenu.class);
            startActivity(openSettingsMenu);

        }

        return super.onOptionsItemSelected(item);
    }

}
