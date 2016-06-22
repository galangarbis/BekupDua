package startings.galangarbis.com.bekupdua;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Zeroic on 6/15/2016.
 */
public class kalkulator extends AppCompatActivity {

    private EditText myedit1;
    private EditText myedit2;
    private Button myButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
//        myedit1 = (EditText) findViewById(R.id.editsatu);
//
//        final TextView tv = (TextView) findViewById(R.id.texttiga);
//
//        myedit2 = (EditText) findViewById(R.id.editdua);
//
//        myButton = (Button) findViewById(R.id.buttonsatu);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = myedit1.getText().toString();
                int valueint = Integer.parseInt(value);
                String value2 = myedit2.getText().toString();
                int valueint2 = Integer.parseInt(value2);

                int hasil;
                hasil = valueint + valueint2;
//                tv.setText(hasil+"");
            }
        });
    }
}
