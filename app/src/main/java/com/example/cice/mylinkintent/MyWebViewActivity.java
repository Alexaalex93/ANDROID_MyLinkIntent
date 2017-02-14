package com.example.cice.mylinkintent;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);


        //ESTA APLICACION SIRVE PARA QUE CUANDO QUIERA ABRIR EL AS.COM DESDE FUERA DE ADROID SALGA MI APLICACION
        //DE MANERA AUTOMATICA. POR ESO HEMOS MODIFICADO EL MANIFEST.
        //EJEMPLO, CUANDO TE MANDA UN ENLACE DEL YOUTUBE, QUE TE SALGA TU APLICACION COMO CANDIDATA
        Uri uri = getIntent().getData();

        WebView wb =(WebView) findViewById(R.id.webView);

        wb.setWebViewClient(new WebViewClient());//Por defecto es el chromium
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl(uri.toString());
    }
}
