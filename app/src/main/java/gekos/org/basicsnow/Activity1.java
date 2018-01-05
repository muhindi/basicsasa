package gekos.org.basicsnow;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
    private Button fragButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        initializeButtons();
    }



    public void moveToNextActivity(View viewClicked){
        Intent intent = new Intent(this,Activity2.class);
        String message = "From Activity 1, Move to Next";
        intent.putExtra(EXTRA_MSG,message);
        startActivity(intent);
    }

    //hides/shows the fragment
    private void toggleFragmentView(){
         android.support.v4.app.FragmentTransaction fragmentTransaction =
                 getSupportFragmentManager().beginTransaction();

        //check if fragment is being displayed and hide/show
        FragOne target = (FragOne) getSupportFragmentManager().findFragmentById(R.id.viewer1);
        if(target.isVisible() && target != null){
            fragmentTransaction.hide(target);
            fragButton.setText(R.string.tx_frag_show);
            fragmentTransaction.commit();
        }else{
            fragmentTransaction.show(target);
            fragButton.setText(R.string.tx_frag_hide);
            fragmentTransaction.commit();
        }
    }

    private void initializeButtons(){
        button = findViewById(R.id.btAct1);
        fragButton = findViewById(R.id.btFrgToggle);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(button);
            }
        });

        fragButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                toggleFragmentView();
            }
        });
    }
}
