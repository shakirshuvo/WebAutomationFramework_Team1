package home;

import org.testng.annotations.BeforeMethod;

public class HartfordHomepageWebElements {
    //header tab
    public static final String autoTabWebElementXpath = "//a[@title='Auto']/span";
    public static final String homeTabWebElementXpath = "//a[@title='Home']/span";
    public static final String businessTabWebElementXpath = "//a[@title='Business']/span";
    public static final String employeeBenfitsTabWebElementXpath = "//a[@title='Employee Benefits']/span";
    public static final String aboutUsTabWebElementXpath = "//a[@title='About Us']/span";

    // elements under homeTab mouseOver elements
    public static final String condoInsurnaceElementXpath = "//a[@title='Condo Insurance']";
    public static final String rentersInsurnaceElementXpath = "//a[@title='Renters Insurance']";
    public static final String floodInsurnaceElementXpath = "//a[@title='Flood Insurance']";
    public static final String umbrellaInsurnaceElementXpath = "//a[@title='Umbrella Insurance']";

    // elements under auto tab. mouse hover
    public static final String classicCarInsurnaceElementXpath = "//a[@title='Classic Car Insurance']";
    public static final String allVehiclesInsurnaceElementXpath = "//a[@title='All Vehicles']";
    public static final String homeownersInsurnaceElementXpath = "//a[@title='Homeowners Insurance']";


}
