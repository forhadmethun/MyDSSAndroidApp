package com.elitesbd.mydss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.elitesbd.mydss.database.Constants;
import com.elitesbd.mydss.database.DatabaseCallListener;
import com.elitesbd.mydss.database.DbAsyncTask;

import java.util.ArrayList;
import java.util.List;

public class ActivityHeadQuarter extends AppCompatActivity implements AdapterView.OnItemSelectedListener, DatabaseCallListener{
    DbAsyncTask dbAsyncTask = null;
    private Spinner sectionSpinner;
    ListView headQuarterList;
    List<String> section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_quarter);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //change name of title
        ((AppCompatActivity) ActivityHeadQuarter.this).getSupportActionBar().setTitle(" হেড কোয়ার্টার");
        sectionSpinner = (Spinner)findViewById(R.id.section_spinner);
        headQuarterList = (ListView)findViewById(R.id.head_quarter_list);

        dbAsyncTask = new DbAsyncTask(ActivityHeadQuarter.this, this, Constants.QUERY_IDENTIFIER.GET_SECTION_LIST);
        dbAsyncTask.execute();

        addListenerOnSpinnerItemSelection();




    }
    public void addListenerOnSpinnerItemSelection() {


        sectionSpinner.setOnItemSelectedListener(this);

    }

    //for back button in toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void beforeCallingDb(int identifier) {

    }

    @Override
    public void afterReturnedFromDbcall(int identifier, Object data) {

        if(identifier == Constants.QUERY_IDENTIFIER.GET_SECTION_LIST) {
            if (data != null) {
                section = (ArrayList<String>) data;
                addItemsOnSectionSpinner();
                //division.add("ঢাকা");
            }
        }
      else if(identifier == Constants.QUERY_IDENTIFIER.GET_HEADQUERTER_LIST) {
            if (data != null) {
               ArrayList<String> list_data = (ArrayList<String>) data;
                //addItemsOnSectionSpinner();
                //division.add("ঢাকা");
                /*
                for(int i=0;i<5;i++){
                    Toast.makeText(this,list_data.get(i) + " --- ",Toast.LENGTH_LONG).show();
                }
                */
                headQuarterList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list_data));
            }
        }
    }
    public void addItemsOnSectionSpinner(){
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, section);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sectionSpinner.setAdapter(dataAdapter2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.section_spinner) {
            dbAsyncTask = new DbAsyncTask(ActivityHeadQuarter.this, this, Constants.QUERY_IDENTIFIER.GET_HEADQUERTER_LIST, parent.getItemAtPosition(position).toString());
            dbAsyncTask.execute();
            //Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
