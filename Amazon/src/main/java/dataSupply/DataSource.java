package dataSupply;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

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

}
