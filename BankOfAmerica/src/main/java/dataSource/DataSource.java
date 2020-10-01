package dataSource;

import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {


    public static ConnectToSqlDB connectToSqlDB;
    public static DataReader excelReader;

    //insert data into database from Array List
    public static void insertDataIntoSQLDB() {
        List<String> list=getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"BankProduct","items");

    }
    //Bank products to be searched
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Saving Account");
        itemsList.add("Checking Account");
        itemsList.add("Credit Cards");
        return itemsList;
    }
    //Read Data from DB
    public static List<String> getItemsListFromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("BankProduct","items");
        return list;
    }

    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "../BankOfAmerica/DataTest/BankOfAmericaData.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();
        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }
}
