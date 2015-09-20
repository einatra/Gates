package com.example.einat.gates.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Einat on 11/09/2015.
 */
public class DBmanager extends SQLiteOpenHelper {

    public final String GATES_TABLE = "gates";
    public final String _ID_COL = "_id";
    public final String NAME_COL = "name";
    public final String TEL_COL = "tel";
    public final String LATLON_COL = "latlon";
    public final String DIST_COL = "dist";

    public DBmanager(Context context, int version) {
        super(context, "gates.db", null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREAT TABLE " + GATES_TABLE + "( " + _ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NAME_COL + " TEXT, " + TEL_COL + " TEXT," + LATLON_COL + " TEXT," + DIST_COL + " TEXT)");
    }

    public void insertGate(Gate gate){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME_COL, gate.getName());
        values.put(TEL_COL, gate.getTel());
        values.put(LATLON_COL, gate.getLatlon());
        values.put(DIST_COL, gate.getDist());
        db.insert(GATES_TABLE, null, values);
        db.close();
    }

    public void delGateById(long id){
        SQLiteDatabase db = getWritableDatabase();
        db.delete(GATES_TABLE, _ID_COL + "=" + id, null);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
