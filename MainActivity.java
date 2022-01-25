package com.mycompany.login;

import android.app.Activity;
import android.os.Bundle;

import com.mycompany.login.R;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends Activity {
    
    EditText edt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
          EditText edt = (EditText) findViewById(R.id.edt);
          String edittxt = edt.getText().toString();
          btn=(Button)findViewById(R.id.btn);
          btn.setOnClickListener(new View.OnClickListener() {
										@Override
										public void onClick(View view) {
											Toast.makeText(MainActivity.this,"Accessing content",Toast.LENGTH_LONG).show();
										}
    });
}}