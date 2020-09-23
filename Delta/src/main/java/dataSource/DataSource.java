package dataSource;

import base.CommonAPI;
import databases.ConnectToSqlDB;
import utility.DataReader;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends CommonAPI {

    public static ConnectToSqlDB connectToSqlDB;
    public static DataReader excelReader;

    //insert data into database from Array List
    public static void insertDataIntoSQLDB() {
        List<String> list=getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"Destinations","items");

    }

    //Destinations  Cities to be searched
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Toronto");
        itemsList.add("LosVegas");
        itemsList.add("Calgary");
        return itemsList;
    }
    //Read Data from DB
    public static List<String> getItemsListFromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("Destinations","items");
        return list;
    }

}
