package me.ramuta.loggaexample;

import android.app.Activity;
import android.os.Bundle;
import me.ramuta.loggaexample.utils.Logga;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Info example
        Logga.i("This is an info log that shows the name of the class and a line number.");

        // Error example
        Logga.i("This is an error log.");
    }
}
