//package dataDriven;
//
//import databases.ConnectToSqlDB;
//import utility.DataReader;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//public class DataSource {
//    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//    public static DataReader excelReader = new DataReader;
//
//    //insert Data into db
//    public static void insertDataIntoDB() {
//        List<String> list = getItemValue();
//        connectToSqlDB = new ConnectToSqlDB();
//        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"amazonSearchItems", "items");
//    }
//
//    //  From Class/ Same class
//    public static List<String> getItemValue() {
//        List<String> itemsList = new ArrayList<String>();
//        itemsList.add("Cricket Bat");
//        itemsList.add("Tennis Racket");
//        itemsList.add("Pakistan National Team Shirt");
//        itemsList.add("Golf Shirt");
//        itemsList.add("Golf Shoes");
//        itemsList.add("Golf Clubs");
//        return itemsList;
//    }
//
//    //Database
//    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
//        List<String> list = new ArrayList<>();
//        list = connectToSqlDB.readDataBase("AmazonItems", "items");
//        return list;
//    }
//
//    //Excel file
////    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
////        String path = "../Amazon/DataTest/AmazonData.xlsx";
////       // String[] myStringArray = excelReader.fileReader2(path, 0);
////        for(int i=1;i<myStringArray.length; i++)
////            System.out.println(myStringArray[i] + " ");
////        ArrayList<String> list = new ArrayList<String>();
////
////        // Using add() method to add elements in array_list
////
////        for (int i = 0; i < myStringArray.length; i++) {
////            list.add(myStringArray[i]);
////            //System.out.print(list.get(i+1) + " ");
////        }
////        return list;
////    }
//
//
//
//}// ends class DataSource
