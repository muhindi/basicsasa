package gekos.org.basicsnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Activity2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Activity1.EXTRA_MSG);

        //set the message to button
        Button button = (Button)findViewById(R.id.btAct2);
        button.setText(message);
    }
}
