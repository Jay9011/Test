package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add extends AppCompatActivity {

    private EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etText = findViewById(R.id.etText);

        final Button button = findViewById(R.id.btnAdd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(etText.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String text = etText.getText().toString();
                    replyIntent.putExtra("addText", text);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}
