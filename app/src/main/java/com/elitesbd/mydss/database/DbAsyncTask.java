package com.elitesbd.mydss.database;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarik on 4/16/16.
 */
public class DbAsyncTask extends AsyncTask<String, Integer, Object> {

    Context context;
    DatabaseCallListener caller;
    int identifier;
    DataSource db;

    ProgressDialog pd;
    ArrayList<String> list;

    String name;

    public DbAsyncTask(Context context, DatabaseCallListener caller, int identifier) {
        this.context = context;
        this.caller = caller;
        this.identifier = identifier;
        this.db = new DataSource(this.context);
    }
    public DbAsyncTask(Context context, DatabaseCallListener caller, int identifier,String name) {
        this.context = context;
        this.caller = caller;
        this.identifier = identifier;
        this.db = new DataSource(this.context);
        this.name = name;
    }

    @Override
    protected void onPreExecute() {

        super.onPreExecute();
        caller.beforeCallingDb(this.identifier);
        pd = new ProgressDialog(context);
        pd.setMessage("loading");
        pd.show();
    }


    @Override
    protected Object doInBackground(String... params) {
        Object result = null;

        if(this.identifier == Constants.QUERY_IDENTIFIER.GET_DIVISION_LIST){
           // result = dataSource.getUserList();
            Cursor c = db.getDivisionsBN();
            list = new ArrayList<String>();

            if (c != null ) {
                if  (c.moveToFirst()) {
                    do {
                        String dir = c.getString(c.getColumnIndex("name_bn"));
                        // Toast.makeText(context,"--> " + dir  + " <--",Toast.LENGTH_SHORT).show();
                        list.add(dir);
                        //test.add("" + dir );

                    }while (c.moveToNext());
                }
            }
            result = (Object)list;

        }
        else if(this.identifier == Constants.QUERY_IDENTIFIER.GET_DISTRICT_LIST){
           // result = dataSource.getUserList();
            Cursor c = db.getDistrictFromDivisionName(name);
            List<String> list = new ArrayList<String>();
            if (c != null ) {
                if  (c.moveToFirst()) {
                    do {
                        String dir = c.getString(c.getColumnIndex("district_name_bn"));
                        list.add(dir);
                    }while (c.moveToNext());
                }
            }
            result = (Object)list;


        }
        else if(this.identifier == Constants.QUERY_IDENTIFIER.GET_DISTRICT_OFFICER_LIST){
           // result = dataSource.getUserList();
            Cursor c = db.getAllFromDistrictOfficerTable(name);
            List<String> list = new ArrayList<String>();

            if (c != null ) {
                if  (c.moveToFirst()) {
                    do {
                        String dir = c.getString(c.getColumnIndex("designation")) + "\n"+c.getString(c.getColumnIndex("email"))+ "\n"+c.getString(c.getColumnIndex("cell")) +"\n";
                        list.add(dir);

                    }while (c.moveToNext());
                }
            }
            result = (Object)list;

        }
        else if(this.identifier == Constants.QUERY_IDENTIFIER.GET_SECTION_LIST){
           // result = dataSource.getUserList();

            Cursor c = db.getSection();
            List<String> list = new ArrayList<String>();

            if (c != null ) {
                if  (c.moveToFirst()) {
                    do {
                        String dir = c.getString(c.getColumnIndex("name_bn"));// + "\n"+c.getString(c.getColumnIndex("email"))+ "\n"+c.getString(c.getColumnIndex("cell")) +"\n";
                        list.add(dir);

                    }while (c.moveToNext());
                }
            }
            result = (Object)list;

        }

        else if(this.identifier == Constants.QUERY_IDENTIFIER.GET_HEADQUERTER_LIST){
            // result = dataSource.getUserList();
            Cursor c = db.getHQfromSectionName(name);
            List<String> list = new ArrayList<String>();

            if (c != null ) {
                if  (c.moveToFirst()) {
                    do {
                        String dir = c.getString(c.getColumnIndex("designation_bn")) + "\n"+c.getString(c.getColumnIndex("cell_no"))+ "\n";//+c.getString(c.getColumnIndex("section"))  +"\n";
                        list.add(dir);

                    }while (c.moveToNext());
                }
            }
            result = (Object)list;

        }

        return result;
    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        caller.afterReturnedFromDbcall(this.identifier, result);

        if (pd != null)
        {
            pd.dismiss();
        }
    }
}
