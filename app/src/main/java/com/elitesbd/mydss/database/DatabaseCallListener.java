package com.elitesbd.mydss.database;


public interface DatabaseCallListener {

    public void beforeCallingDb(int identifier);
    public void afterReturnedFromDbcall(int identifier, Object data);
}
