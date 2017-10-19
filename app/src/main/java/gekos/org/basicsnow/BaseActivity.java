package gekos.org.basicsnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    private final String TAG = getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.i(TAG,"Called onCreate()");
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "Called onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Called onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Called onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Called onStop()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Called onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "called onDestroy()");
    }

    public String getTAG(){
        return TAG;
    }
}
