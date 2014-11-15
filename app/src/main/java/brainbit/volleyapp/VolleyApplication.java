package brainbit.volleyapp;

import android.app.Application;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by UKGC on 09/11/2014.
 */
public class VolleyApplication extends Application {

    private static VolleyApplication sInstance;

    private RequestQueue mRequestQueue;

    private TextView nameString;

    @Override
    public void onCreate() {
        super.onCreate();

        mRequestQueue = Volley.newRequestQueue(this);

        sInstance = this;
    }

    public synchronized static VolleyApplication getInstance() {
        return sInstance;
    }

    public RequestQueue getRequestQueue() {
        return mRequestQueue;
    }

    public void onNameSearchButtonClicked() {

        nameString.setText("Derp");

    }
}
