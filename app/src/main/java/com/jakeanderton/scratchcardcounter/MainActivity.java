package com.jakeanderton.scratchcardcounter;

import android.app.Activity;
import android.content.Intent;
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

    static int m1 = 10;
    static int m2 = 5;
    static int m3 = 5;
    static int m4 = 3;
    static int m5 = 2;
    static int m6 = 2;
    static int m7 = 1;
    static int m8 = 1;


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
            Intent openSettingsMenu = new Intent(this,SettingsMenu.class);
            startActivity(openSettingsMenu);

        }

        return super.onOptionsItemSelected(item);
    }


}
