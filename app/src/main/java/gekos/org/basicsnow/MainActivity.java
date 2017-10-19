package gekos.org.basicsnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import gekos.org.basicsnow.global.AppGlobal;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Called onCreate()");
    }

    @Override
    protected void onStart(){
        Log.i(TAG,"Called onStart()");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.i(TAG,"Called onResume()");
        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.i(TAG,"Called onPause()");
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"Called onStop()");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"Called onRestart()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"called onDestroy()");
    }






}
