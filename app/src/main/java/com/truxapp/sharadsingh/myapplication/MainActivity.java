package com.truxapp.sharadsingh.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset(this));

//            vinay singh


            // RAHUL SINGHEWREWARFEWFERWF
            String zd = obj.toString();


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.gcclist;
            //  path = "android.resource://" + getPackageName() + "/" + R.raw.gcclist;
            InputStream is = getResources().openRawResource(R.raw.gcclist);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }


}
