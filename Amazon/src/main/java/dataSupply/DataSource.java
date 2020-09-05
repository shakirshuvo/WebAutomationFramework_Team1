package dataSupply;

import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();

    public static List<String> getItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Matcha Green Tea");
        itemsList.add("Rage Against The Machine");

        return itemsList;
    }
    //Database

    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("movie", "title");
        return list;
    }

    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("movie", "title");
        System.out.println(list.get(0));
    }

    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "../Amazon/DataTest/AmazonData.xlsx";
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
