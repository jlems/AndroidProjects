package com.jlemus.myapplication;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView myTextView = (TextView) findViewById(R.id.myTextView);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Log.d("hey", "mytagfffff");
        //String link = "http://www.73.69.57.117/testdb.php";


        //String url = "http://73.69.57.117/testdb";


//        try {
//            URL url = new URL("http://73.69.57.117/testdb");
//
//
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setDoOutput(true);
//            connection.setRequestMethod("GET");
//
//            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
//            int responseCode = connection.getResponseCode();
//
//
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(connection.getInputStream())
//            );
//
//            String inputLine;
//
//            StringBuffer response = new StringBuffer();
//
//            while((inputLine = in.readLine()) != null){
//                response.append(inputLine);
//            }
//
//            in.close();
//
//            myTextView.setText(response);
//
//
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (ProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



                try {
                    URL url = new URL("http://73.69.57.117/testdb.php");


                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setDoOutput(true);
                    connection.setRequestMethod("GET");

                    connection.setRequestProperty("User-Agent", "Mozilla/5.0");
                    int responseCode = connection.getResponseCode();


                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(connection.getInputStream())
                    );

                    String inputLine;

                    StringBuffer response = new StringBuffer();

                    while((inputLine = in.readLine()) != null){
                        response.append(inputLine);
                        Log.d("myTag", "hey");
                    }

                    in.close();

                    myTextView.setText(response);



                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (ProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                myTextView.getText();
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
