package gekos.org.basicsnow;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.lang.invoke.MethodHandles;

public class Activity1 extends BaseActivity {


    public static final String EXTRA_MSG = "gekos.org.basicsnow.MSG1";
    private Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        initializeButton();
    }



    public void moveToNextActivity(View viewClicked){
        Intent intent = new Intent(this,Activity2.class);
        String message = "From Activity 1, Move to Next";
        intent.putExtra(EXTRA_MSG,message);
        startActivity(intent);
    }

    private void initializeButton(){
        button = (Button) findViewById(R.id.btAct1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(button);
            }
        });
    }
}
