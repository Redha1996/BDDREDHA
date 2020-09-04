package com.example.bddredha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoresView;
    private DatabaseManager databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoresView = (TextView) findViewById(R.id.scoresView);
        databaseManager = new DatabaseManager(this);
        databaseManager.insertPersonne("Zatout","Mohamed Redha","0771202915","12 rue didouche mourad","zatoutredha@gmail.com","generaliste");
        databaseManager.insertPersonne("Moussaoui"," Karina","0620620246"," 34 rue didouche mourad","moussaoui.karina@gmail.com","orthopediste");
        databaseManager.close();


    }
}