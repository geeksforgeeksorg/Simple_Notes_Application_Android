package org.geeksforgeeks.simple_notes_application_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        EditText editText = findViewById(R.id.editTextNote);
        Button buttonAdd = findViewById(R.id.buttonAddNote);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newNote = editText.getText().toString().trim();
                if (!newNote.isEmpty()) {
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("NEW_NOTE", newNote);
                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            }
        });
    }
}
