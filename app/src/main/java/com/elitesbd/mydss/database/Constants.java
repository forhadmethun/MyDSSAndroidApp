package com.elitesbd.mydss.database;


public class Constants {

    public static final class TABLES{
        //Table BIKES
        public static final String TABLE_DISTRICT = "district";
        public static final String TABLE_DIVISION = "division";
        public static final String TABLE_DISTRICT_OFFICER = "district_officer_table";

        public static final String COLUMN_DIVISION_ID = "id";
        public static final String COLUMN_DIVISION_NAME_EN = "name_en";
        public static final String COLUMN_DIVISION_NAME_BN = "name_bn";

        public static final String COLUMN_DISTRICT_ID = "id";
        public static final String COLUMN_DISTRICT_NAME_EN = "district_name_en";
        public static final String COLUMN_DISTRICT_NAME_BN = "district_name_bn";
        public static final String COLUMN_DISTRICT_DIVISION = "division";
        public static final String COLUMN_DISTRICT_DIVISION_BN = "division_bn";
        public static final String COLUMN_DISTRICT_DIVISION_ID = "division_id";


        public static final String COLUMN_DISTRICT_OFFICER_ID = "id";
        public static final String COLUMN_DISTRICT_OFFICER_DIVISION = "division";
        public static final String COLUMN_DISTRICT_OFFICER_DISTRICT= "district";
        public static final String COLUMN_DISTRICT_OFFICER_EMAIL= "email";
        public static final String COLUMN_DISTRICT_OFFICER_DESIGNATION= "designation";
        public static final String COLUMN_DISTRICT_OFFICER_CELL= "cell";
        public static final String COLUMN_DISTRICT_OFFICER_DIVISION_ID= "cell";
    }

    public static final class QUERY_IDENTIFIER{
        public static final int GET_DIVISION_LIST = 0;
        public static final int GET_DISTRICT_LIST = 1;
        public static final int GET_DISTRICT_OFFICER_LIST = 2;
        public static final int GET_SECTION_LIST = 3;
        public static final int GET_HEADQUERTER_LIST = 4;


    }
}
