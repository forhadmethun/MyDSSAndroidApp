package com.elitesbd.mydss.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by forhadmethun on 11/2/16.
 */

public class DataSource extends SQLiteAssetHelper {

    //DB info
    private static final String DB_NAME = "mydss.sqlite";
    private static final int DB_VERSION = 1;


    private Context mContext;

    public DataSource(Context context, String name, String storageDirectory, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, storageDirectory, factory, version);
    }

    //change here
    public DataSource(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        mContext = context;
    }


    public Cursor getDivisionsBN() {

        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("select * from division",null);
        c.moveToFirst();
        return c;

    }
    public Cursor getSection() {

        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM `sections`",null);
        c.moveToFirst();
        return c;

    }
    public Cursor getDistrictFromDivisionName(String district_name)
    {
        Cursor c;SQLiteDatabase db = getReadableDatabase();
        c = db.rawQuery("select district_name_bn from district where (division_id =  (select id from division where name_bn = "+"\"" + district_name+ "\"))",null);//'রাজশাহী'))
        c.moveToFirst();
        return c;
    }

    public Cursor getHQfromSectionName(String district_name)
    {
        Cursor c;SQLiteDatabase db = getReadableDatabase();
        //c = db.rawQuery("select district_name_bn from district where (division_id =  (select id from division where name_bn = "+"\"" + district_name+ "\"))",null);//'রাজশাহী'))
        c = db.rawQuery("SELECT * from contacts where section_id = (SELECT id from sections where ( name_bn = "+"\"" + district_name+ "\"))",null);//'রাজশাহী'))
        c.moveToFirst();
        return c;
    }
    public Cursor getAllFromDistrictOfficerTable(String district_name)
    {
        Cursor c;SQLiteDatabase db = getReadableDatabase();
        c = db.rawQuery("select * from district_officer_table where (district_id =  (select id from district where district_name_bn = "+"\"" + district_name+ "\"))",null);//'রাজশাহী'))
        c.moveToFirst();
        return c;
    }

}
