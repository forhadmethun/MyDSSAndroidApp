package com.elitesbd.mydss;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.elitesbd.mydss.database.Constants;
import com.elitesbd.mydss.database.DataSource;
import com.elitesbd.mydss.database.DatabaseCallListener;
import com.elitesbd.mydss.database.DbAsyncTask;

import java.util.ArrayList;
import java.util.List;

public class ActivityDistrictOffice extends AppCompatActivity implements AdapterView.OnItemSelectedListener,DatabaseCallListener{


    private Spinner divisionSpinner, districtSpinner;ListView listView;
    private Button btnSubmit;

    //
    DbAsyncTask dbAsyncTask = null;


    //db
    private Cursor employees;
    private DataSource db;
    List<String> division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_office);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //change name of title
        ((AppCompatActivity) ActivityDistrictOffice.this).getSupportActionBar().setTitle("জেলা অফিস ");


        districtSpinner = (Spinner) findViewById(R.id.spin2);
        districtSpinner.setVisibility(View.GONE);
        divisionSpinner = (Spinner) findViewById(R.id.spin1);
        listView = (ListView)findViewById(R.id.listView);

        db = new DataSource(this);
        dbAsyncTask = new DbAsyncTask(ActivityDistrictOffice.this, this, Constants.QUERY_IDENTIFIER.GET_DIVISION_LIST);
        dbAsyncTask.execute();
        addListenerOnSpinnerItemSelection();
    }


    public void addItemsOnDistrictSpinner() {
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, division);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        divisionSpinner.setAdapter(dataAdapter2);


    }

    public void addListenerOnSpinnerItemSelection() {


        divisionSpinner.setOnItemSelectedListener(this);
        districtSpinner.setOnItemSelectedListener(this);
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


    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {

        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.spin1)
        {
            dbAsyncTask = new DbAsyncTask(ActivityDistrictOffice.this, this, Constants.QUERY_IDENTIFIER.GET_DISTRICT_LIST,parent.getItemAtPosition(pos).toString());
            dbAsyncTask.execute();
        }
        else if(spinner.getId() == R.id.spin2)
        {
            dbAsyncTask = new DbAsyncTask(ActivityDistrictOffice.this, this, Constants.QUERY_IDENTIFIER.GET_DISTRICT_OFFICER_LIST,parent.getItemAtPosition(pos).toString());
            dbAsyncTask.execute();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void beforeCallingDb(int identifier) {

    }

    @Override
    public void afterReturnedFromDbcall(int identifier, Object data) {
        if(identifier == Constants.QUERY_IDENTIFIER.GET_DIVISION_LIST) {
            if (data != null) {
                division = (ArrayList<String>) data;
                addItemsOnDistrictSpinner();
                //division.add("ঢাকা");
            }
        }

        if(identifier == Constants.QUERY_IDENTIFIER.GET_DISTRICT_LIST) {
            if (data != null) {
                ArrayList<String> list = (ArrayList<String>) data;
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                districtSpinner.setAdapter(dataAdapter);
                districtSpinner.setVisibility(View.VISIBLE);
            }
        }
        if(identifier == Constants.QUERY_IDENTIFIER.GET_DISTRICT_OFFICER_LIST) {
            if (data != null) {
                ArrayList<String> list = (ArrayList<String>) data;
                listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list));
            }
        }

    }
}
