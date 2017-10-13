package tanvir.testsharenew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.Button);
        editText = (EditText) findViewById(R.id.Input);
    }

    public void Share(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");


        String ShareBody = editText.getText().toString();

        intent.putExtra(Intent.EXTRA_TEXT,ShareBody);

        startActivity(Intent.createChooser(intent,"Sharing Using"));




    }
}
