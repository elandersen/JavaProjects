/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersen.backendjaxrsproject;

import com.mongodb.client.result.UpdateResult;
import org.bson.conversions.Bson;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esther
 */
public class EmployeeServicesTest {
    
    public EmployeeServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
 
    }
    
    @AfterClass
    public static void tearDownClass() {
        //cleanup delete both entries
        EmployeeServices instance = new EmployeeServices();
        instance.deleteEmployee();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        EmployeeServices instance = new EmployeeServices();
        Bson bson = (Bson)com.mongodb.util.JSON.parse("{}");
        instance.getEmployeeDB().getCollection("EmployeeCollection").deleteMany(bson);
        //instance.deleteEmployee();
    }

    /**
     * Test of addEmployee method, of class EmployeeServices.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        EmployeeServices instance = new EmployeeServices();
        //Add an employees to test with
        Employee addEmployee1 = new Employee();
        addEmployee1.setFirstName("Esther");
        addEmployee1.setMiddleName("Lily");
        addEmployee1.setLastName("Deem");
        addEmployee1.setEmailAddress("fake@fake.com");
        addEmployee1.setPhoneNumber("7036877933");
        addEmployee1.setPositionCategory("Direct");
        addEmployee1.setDateHired("12/21/16");
        addEmployee1.setAddress1("6120 Michener Dr");
        addEmployee1.setAddress2("");
        addEmployee1.setCity("Haymarket");
        addEmployee1.setState("VA");
        addEmployee1.setZipcode("20196");
        addEmployee1.setActiveFlag(true); 
        
        long expResult = 1;
        String Addresult = instance.addEmployee(addEmployee1);
        long result = instance.getEmployeeDB().getCollection("EmployeeCollection").count();
        
        assertEquals(expResult, result);
        //cleanup
        instance.deleteEmployee();
   
    }

    /**
     * Test of getAllEmployees method, of class EmployeeServices.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        EmployeeServices instance = new EmployeeServices();
         //Add employee 1 to test with
        Employee addEmployee1 = new Employee();
        addEmployee1.setFirstName("Esther");
        addEmployee1.setMiddleName("Lily");
        addEmployee1.setLastName("Deem");
        addEmployee1.setEmailAddress("fake@fake.com");
        addEmployee1.setPhoneNumber("7036877933");
        addEmployee1.setPositionCategory("Direct");
        addEmployee1.setDateHired("12/21/16");
        addEmployee1.setAddress1("6120 Michener Dr");
        addEmployee1.setAddress2("");
        addEmployee1.setCity("Haymarket");
        addEmployee1.setState("VA");
        addEmployee1.setZipcode("20196");
        addEmployee1.setActiveFlag(true); 
        String addemployeeResult = instance.addEmployee(addEmployee1);
        //Add employee2
        Employee addEmployee2 = new Employee();
        addEmployee2.setFirstName("John");
        addEmployee2.setMiddleName("Doe");
        addEmployee2.setLastName("Smith");
        addEmployee2.setEmailAddress("fake@fake.com");
        addEmployee2.setPhoneNumber("7123456789");
        addEmployee2.setPositionCategory("Indirect");
        addEmployee2.setDateHired("12/21/16");
        addEmployee2.setAddress1("");
        addEmployee2.setAddress2("");
        addEmployee2.setCity("Chantilly");
        addEmployee2.setState("VA");
        addEmployee2.setZipcode("20154");
        addEmployee2.setActiveFlag(false); 
        addemployeeResult = instance.addEmployee(addEmployee2);
        //with MongoDB adding _id and i don't know that value and it changes each time I add one I am testing the number of employees
        //added to the database.
        long result = instance.getEmployeeDB().getCollection("EmployeeCollection").count();
        long expResult = 2;
        String allEmployeeResult = instance.getAllEmployees();
        assertEquals(expResult, result);
        //cleanup
        instance.deleteEmployee();
        instance.deleteEmployee();
   
    }

    /**
     * Test of getEmployeebyID method, of class EmployeeServices.
     */
    @Test
    public void testGetEmployeebyID() {
        System.out.println("getEmployeebyID");
        EmployeeServices instance = new EmployeeServices();
       
        //Add employee 1 to test with
        Employee addEmployee1 = new Employee();
        addEmployee1.setFirstName("Esther");
        addEmployee1.setMiddleName("Lily");
        addEmployee1.setLastName("Deem");
        addEmployee1.setEmailAddress("fake@fake.com");
        addEmployee1.setPhoneNumber("7036877933");
        addEmployee1.setPositionCategory("Direct");
        addEmployee1.setDateHired("12/21/16");
        addEmployee1.setAddress1("6120 Michener Dr");
        addEmployee1.setAddress2("");
        addEmployee1.setCity("Haymarket");
        addEmployee1.setState("VA");
        addEmployee1.setZipcode("20196");
        addEmployee1.setActiveFlag(true); 
        String addemployeeResult = instance.addEmployee(addEmployee1);
        
        String id = "1";
        String expResult = "\"id\" : 1 }"; //586a9a9d1446045ccd35c2f8  "firstName" : "Esther", "lastName" : "Deem", "middleName" : "Lily", "emailAddress" : "fake@fake.com", "phoneNumber" : "7036877933", "positionCategory" : "Direct", "dateHired" : "12/21/16", "address1" : "6120 Michener Dr", "address2" : "", "city" : "Haymarket", "state" : "VA", "zipcode" : "20196", "activeFlag" : true, "id" : 1 }
        String getResult = instance.getEmployeebyID(id);
        String result = getResult.substring(getResult.indexOf("\"id\""), getResult.length() - 1);
        assertEquals(expResult, result);
           //cleanup
        instance.deleteEmployee();
 }

    /**
     * Test of getEmployeebyLastName method, of class EmployeeServices.
     */
    @Test
    public void testGetEmployeebyLastName() {
        System.out.println("getEmployeebyLastName");
        String lastName = "Deem";
        EmployeeServices instance = new EmployeeServices();

        Employee addEmployee1 = new Employee();
        addEmployee1.setFirstName("Esther");
        addEmployee1.setMiddleName("Lily");
        addEmployee1.setLastName("Deem");
        addEmployee1.setEmailAddress("fake@fake.com");
        addEmployee1.setPhoneNumber("7036877933");
        addEmployee1.setPositionCategory("Direct");
        addEmployee1.setDateHired("12/21/16");
        addEmployee1.setAddress1("6120 Michener Dr");
        addEmployee1.setAddress2("");
        addEmployee1.setCity("Haymarket");
        addEmployee1.setState("VA");
        addEmployee1.setZipcode("20196");
        addEmployee1.setActiveFlag(true); 
        String addemployeeResult = instance.addEmployee(addEmployee1);
        //Add employee2
        Employee addEmployee2 = new Employee();
        addEmployee2.setFirstName("John");
        addEmployee2.setMiddleName("Doe");
        addEmployee2.setLastName("Smith");
        addEmployee2.setEmailAddress("fake@fake.com");
        addEmployee2.setPhoneNumber("7123456789");
        addEmployee2.setPositionCategory("Indirect");
        addEmployee2.setDateHired("12/21/16");
        addEmployee2.setAddress1("");
        addEmployee2.setAddress2("");
        addEmployee2.setCity("Chantilly");
        addEmployee2.setState("VA");
        addEmployee2.setZipcode("20154");
        addEmployee2.setActiveFlag(false); 
        addemployeeResult = instance.addEmployee(addEmployee2);
         

        String expResult = "\"lastName\" : \"Deem\"";
        String getResult = instance.getEmployeebyLastName(lastName);
        String result = getResult.substring(getResult.indexOf("\"lastName\""), getResult.indexOf(", \"middleName\""));
        assertEquals(expResult, result);
            //cleanup
        instance.deleteEmployee();
        instance.deleteEmployee();
   }

    /**
     * Test of updateEmployee method, of class EmployeeServices.
     */
    @Test
    public void testUpdateEmployee() {
        EmployeeServices instance = new EmployeeServices();

        Employee addEmployee1 = new Employee();
        addEmployee1.setFirstName("Esther");
        addEmployee1.setMiddleName("Lily");
        addEmployee1.setLastName("Deem");
        addEmployee1.setEmailAddress("fake@fake.com");
        addEmployee1.setPhoneNumber("7036877933");
        addEmployee1.setPositionCategory("Direct");
        addEmployee1.setDateHired("12/21/16");
        addEmployee1.setAddress1("6120 Michener Dr");
        addEmployee1.setAddress2("");
        addEmployee1.setCity("Haymarket");
        addEmployee1.setState("VA");
        addEmployee1.setZipcode("20196");
        addEmployee1.setActiveFlag(true); 
        String addemployeeResult = instance.addEmployee(addEmployee1);

        System.out.println("updateEmployee");
        String expResult = "\"firstName\" : \"Esther\", \"lastName\" : \"Andersen\", \"middleName\" : \"Lily\"";
     
        String updateResult = instance.updateEmployee(1, "lastName", "Andersen");
        String result = updateResult.substring(updateResult.indexOf("\"firstName\""), updateResult.indexOf(", \"emailAddress\""));
        assertEquals(expResult, result);
        //cleanup delete both entries
        instance.deleteEmployee();
    }

    /**
     * Test of deleteEmployee method, of class EmployeeServices.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee");
        EmployeeServices instance = new EmployeeServices();
        instance.deleteEmployee();
   }
    
}
