package com.example.papadakis.demo_thesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Sundesh ths vivlio8hkhs
import com.github.barteksc.pdfviewer.PDFView;

public class InfoMainActivity extends AppCompatActivity {

    PDFView pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_main);

        //Deixnoume to katallhlo pdf
        pdfViewer=(PDFView) findViewById(R.id.pdfviewer);
        pdfViewer.fromAsset("athanasios_papadakis_report_993.pdf").load();
    }
}
