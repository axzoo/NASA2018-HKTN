package nasa2018.app_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText firstEditText = (EditText) findViewById(R.id.editText);
        TextView resultTextView = (TextView) findViewById(R.id.textView10);



    }
}

