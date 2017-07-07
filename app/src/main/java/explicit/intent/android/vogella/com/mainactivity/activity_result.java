package explicit.intent.android.vogella.com.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Hello Stack"); //Darbojas
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String inputString = extras.getString("yourkey");
        TextView view = (TextView) findViewById(R.id.displayintentextra);
        view.setText(inputString);
    }

    public void finish(View view){
        Intent intent = new Intent();
        EditText editText= (EditText) findViewById(R.id.returnValue);
        String value = editText.getText().toString();
        intent.putExtra("returnkey", value);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}