package com.icedwater.sleague;

import android.app.Activity;
import android.os.Bundle;

import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class FixturesActivity extends Activity
{
    /** Called when the activity is first created. */

    private InputStream OpenHttpConnection(String urlString) throws IOException
    {
        InputStream in = null;
        int response = -1;

        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();

        if (!(conn instanceof HttpURLConnection))
            throw new IOException("HTTP doesn't work here.");

        try {
            HttpURLConnection httpConn = (HttpURLConnection) conn;
            httpConn.setAllowUserInteraction(false);
            httpConn.setInstanceFollowRedirects(true);
            httpConn.setRequestMethod("GET");
            httpConn.connect();
            response = httpConn.getResponseCode();
            if (response == HttpURLConnection.HTTP_OK) {
                in = httpConn.getInputStream();
            }
        }
        catch (Exception ex)
        {
            throw new IOException("Connection error.");
        }
        
        return in;
    }

    private String DownloadText(String URL)
    {
        int BUFFER_SIZE = 2000;
        InputStream in = null;
        try {
            in = OpenHttpConnection(URL);
        } catch (IOException ioex) {
            Toast.makeText(this, ioex.getLocalizedMessage(),
                Toast.LENGTH_LONG).show();

            ioex.printStackTrace();
            return "";
        }

        InputStreamReader isr = new InputStreamReader(in);
        int charRead;
        String str = "";
        char[] inputBuffer = new char[BUFFER_SIZE];
        try {
            while ((charRead = isr.read(inputBuffer))>0)
            {
                String readString = 
                    String.copyValueOf(inputBuffer, 0, charRead);
                str += readString;
                inputBuffer = new char[BUFFER_SIZE];
            }
            in.close();
        } catch (IOException ioex1) {
            Toast.makeText(this, ioex1.getLocalizedMessage(),
                Toast.LENGTH_LONG).show();

            ioex1.printStackTrace();
            return "";
        }
        return str;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fixtures);

        Button btnMain = (Button) findViewById(R.id.btn_BackMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    	String str = DownloadText("http://bit.ly/table11");
	Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();       
    }

}
