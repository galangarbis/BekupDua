package startings.galangarbis.com.bekupdua;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by galsdev on 6/22/2016.
 */
public class adapter extends ArrayAdapter<String> {
    public adapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }
}
