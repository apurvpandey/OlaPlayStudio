package com.apurv.olaplay.network;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.apurv.olaplay.MyApplication;

/**
 * Created by Apurv Pandey on 16/12/17.
 * mailapurvpandey@gmail.com
 * Contact No. - +91-8377887369
 */

public class VolleySingleton {

    static VolleySingleton instance = null;
    private RequestQueue requestQueue;


    private VolleySingleton() {
        requestQueue = Volley.newRequestQueue(MyApplication.getContext());
    }


    public static VolleySingleton getInstance() {

        if (instance == null)
            instance = new VolleySingleton();

        return instance;
    }


    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
