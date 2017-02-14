package com.example.cice.mylinkintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MIRAR MANIFEST!!
        Button button = (Button) findViewById(R.id.boton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction("android.intent.action.VIEW");
                Uri uri = Uri.parse("http://www.as.com");
                i.setData(uri);

                startActivity(i);
            }
        });
    }
}
