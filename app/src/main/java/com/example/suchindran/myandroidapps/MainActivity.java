package com.example.suchindran.myandroidapps;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    public void showCapstone(View view) {
        Toast.makeText(MainActivity.this, "This Button Will Launch my CAPSTONE APP!", Toast.LENGTH_SHORT).show();
    }

    public void showXYZREADER(View view) {
        Toast.makeText(MainActivity.this, "This Button Will Launch XYZ READER!", Toast.LENGTH_SHORT).show();
    }

    public void showBUILDITBIGGER(View view) {
        Toast.makeText(MainActivity.this, "This Button Will Launch BUILD IT BIGGER!", Toast.LENGTH_SHORT).show();
    }


    public void showLibraryApp(View view) {
        Toast.makeText(MainActivity.this, "This Button Will Launch LIBRARY APP!", Toast.LENGTH_SHORT).show();
    }

    public void showSCORESAPP(View view) {
        Toast.makeText(MainActivity.this, "This Button Will Launch SCORES APP!", Toast.LENGTH_SHORT).show();
    }

    public void showSPOTIFYSTREAMER(View view) {
        Toast.makeText(MainActivity.this, "This Button Will Launch SPOTIFY STREAMER!", Toast.LENGTH_SHORT).show();
    }


}
