package com.example.sqlite_app;



import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper dbHelper;
    EditText etStudentId, etName, etAge;
    Button btnInsert, btnView, btnUpdate, btnDelete;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DatabaseHelper(this);

        etStudentId = findViewById(R.id.et_student_id);
        etName = findViewById(R.id.et_name);
        etAge = findViewById(R.id.et_age);
        btnInsert = findViewById(R.id.btn_insert);
        btnView = findViewById(R.id.btn_view);
        btnUpdate = findViewById(R.id.btn_update);
        btnDelete = findViewById(R.id.btn_delete);
        tvResults = findViewById(R.id.tv_results);

        btnInsert.setOnClickListener(v -> {
            String name = etName.getText().toString();
            int age = Integer.parseInt(etAge.getText().toString());
            if (dbHelper.insertStudent(name, age)) {
                Toast.makeText(MainActivity.this, "Inserted Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Insertion Failed!", Toast.LENGTH_SHORT).show();
            }
        });

        btnView.setOnClickListener(v -> {
            Cursor cursor = dbHelper.getAllStudents();
            StringBuilder result = new StringBuilder();
            while (cursor.moveToNext()) {
                result.append("ID: ").append(cursor.getInt(0))
                        .append("\nName: ").append(cursor.getString(1))
                        .append("\nAge: ").append(cursor.getInt(2))
                        .append("\n\n");
            }
            tvResults.setText(result.toString());
        });

        btnUpdate.setOnClickListener(v -> {
            int id = Integer.parseInt(etStudentId.getText().toString());
            String name = etName.getText().toString();
            int age = Integer.parseInt(etAge.getText().toString());
            if (dbHelper.updateStudent(id, name, age)) {
                Toast.makeText(MainActivity.this, "Updated Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Update Failed!", Toast.LENGTH_SHORT).show();
            }
        });

        btnDelete.setOnClickListener(v -> {
            int id = Integer.parseInt(etStudentId.getText().toString());
            if (dbHelper.deleteStudent(id)) {
                Toast.makeText(MainActivity.this, "Deleted Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Deletion Failed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
