package com.lg.mavenupload;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lg.filelibrary.FileUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FileUtil.getExtensionName("abc.txt");
    }
}
