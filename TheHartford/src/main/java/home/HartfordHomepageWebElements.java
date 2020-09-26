package home;

import org.testng.annotations.BeforeMethod;

public class HartfordHomepageWebElements {
    //header tab
    public static final String autoTabWebElementXpath = "//a[@title='Auto']/span";
    public static final String homeTabWebElementXpath = "//a[@title='Home']/span";
    public static final String businessTabWebElementXpath = "//a[@title='Business']/span";
    public static final String employeeBenefitsTabWebElementXpath = "//a[@title='Employee Benefits']/span";
    public static final String aboutUsTabWebElementXpath = "//a[@title='About']/span";

    // elements under homeTab mouseOver elements
    public static final String condoInsurnaceElementXpath = "//a[@title='Condo Insurance']";
    public static final String rentersInsurnaceElementXpath = "//a[@title='Renters Insurance']";
    public static final String floodInsurnaceElementXpath = "//a[@title='Flood Insurance']";
    public static final String umbrellaInsurnaceElementXpath = "//a[@title='Umbrella Insurance']";

    // elements under auto tab. mouse hover
    public static final String classicCarInsurnaceElementXpath = "//a[@title='Classic Car Insurance']";
    public static final String allVehiclesInsurnaceElementXpath = "//a[@title='All Vehicles']";
    public static final String homeownersInsurnaceElementXpath = "//a[@title='Homeowners Insurance']";

    //elements under business tab for mouse hover actions
    public static final String businessOwnersPolicyElementXpath = "//a[@title='Business Owner’s Policy']";
    public static final String generalLiabilityElementXpath = "//a[@title='General Liability Insurance']";
    public static final String workersCompensationElementXpath = "//a[@title='Workers’ Compensation Insurance']";
    public static final String commercialAutoInsuranceElementXpath = "//*[@id=\"primary-nav\"]//div[2]/div/div[2]/article/div/div/div[4]/a";


    // elements under Employee benefits tab
    public static final String forEmployersElementXpath = "//a[@title='For Employers']";
    public static final String benefitPlansElementXpath = "//a[@title='Benefit Plans']";
    public static final String absenceManagementElementXpath = "//a[@title='Absence Management']";
    public static final String industrySolutionsElementXpath = "//a[@title='Industry Solutions']";

    //benefits for employers
    public static final String insuranceForEmployeesElementXpath = "//a[@title='Insurance for Employees']";
    public static final String valueAddedServicesElementXpath = "//a[@title='Value Added Services']";
    public static final String startAClaimElementXpath = "//a[@title='Start a Claim']";
    public static final String stateGuideElementXpath = "//a[@title='PFML State Guide']";

    // for agents and producers
    public static final String forAgentsNProducersElementXpath = "//a[@title='For Agents & Producers']";
    public static final String resourcesElementXpath = "//a[@title='Resources']";
    public static final String benefitsTechnologyElementXpath = "//a[@title='Benefits Technology Partners']";


}
