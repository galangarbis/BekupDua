package startings.galangarbis.com.bekupdua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by galsdev on 6/22/2016.
 */
public class listActivity extends AppCompatActivity {
    List<String> names = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        names.add("Tadpolano");
        names.add("Tadpolana");
        names.add("Inday");
        listView = (ListView) findViewById(R.id.list);
        adapter adapter = new adapter(this,android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);
    }
}
