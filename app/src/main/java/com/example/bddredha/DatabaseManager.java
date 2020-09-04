package com.example.bddredha;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="Personne.db";
    private static final int DATABASE_VERSION=1;

    public DatabaseManager (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String strSql="create table T_personne("
                +"  idPersonne integer primary key ,"
                +"  nom text not null,"
                +"  prenom text not null,"
                +"  numero text not null,"
                +"  mail text not null,"
                +"  adresse text not null,"
                +"  specialite text not null"
                +")";
        db.execSQL(strSql);
        Log.i("DATABASE","onCreate invoked") ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertPersonne (String nom, String prenom, String numero, String adresse, String mail, String specialite) {

        String strSql = "insert into T_personne (nom, prenom, numero, mail, adresse, specialite) values ('"
    +nom+ "'," + prenom +"," + numero +"," + mail +"," + adresse +", " + specialite +")";
    this.getWritableDatabase().execSQL(strSql);
        Log.i("DATABASE","insertpersonne invoked") ;
    }

    public List<ScoreData> readTop10(){
        List<ScoreData> scores= new ArrayList<>();
        String strSql = "select * from T_personne";
        Cursor cursor = this.getReadableDatabase().rawQuery(strSql,null);
        cursor.moveToFirst();
        while(! cursor.isAfterLast() ){
            ScoreData score = new ScoreData(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6));
            score.add(score);
            cursor.moveToNext();
            cursor.close();
        }


        return scores;
    }


}
