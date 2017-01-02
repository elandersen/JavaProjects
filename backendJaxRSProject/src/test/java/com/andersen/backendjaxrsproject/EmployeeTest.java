/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersen.backendjaxrsproject;

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
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee();
        instance.setId(1);
        long expResult = 1L;
        long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long _id = 0L;
        Employee instance = new Employee();
        instance.setId(_id);
    }

    /**
     * Test of getFirstName method, of class Employee.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Employee instance = new Employee();
        instance.setFirstName("Esther");
        String expResult = "Esther";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Employee instance = new Employee();
        instance.setFirstName(firstName);
    }

    /**
     * Test of getLastName method, of class Employee.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Employee instance = new Employee();
        instance.setLastName("Deem");
        String expResult = "Deem";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Employee instance = new Employee();
        instance.setLastName(lastName);
    }

    /**
     * Test of getMiddleName method, of class Employee.
     */
    @Test
    public void testGetMiddleName() {
        System.out.println("getMiddleName");
        Employee instance = new Employee();
        instance.setMiddleName("Lily");
        String expResult = "Lily";
        String result = instance.getMiddleName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMiddleName method, of class Employee.
     */
    @Test
    public void testSetMiddleName() {
        System.out.println("setMiddleName");
        String middleName = "";
        Employee instance = new Employee();
        instance.setMiddleName(middleName);
    }

    /**
     * Test of getEmailAddress method, of class Employee.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Employee instance = new Employee();
        instance.setEmailAddress("asd@cdf.com");
        String expResult = "asd@cdf.com";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmailAddress method, of class Employee.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "";
        Employee instance = new Employee();
        instance.setEmailAddress(emailAddress);
    }

    /**
     * Test of getPhoneNumber method, of class Employee.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Employee instance = new Employee();
        instance.setPhoneNumber("7036876922");
        String expResult = "7036876922";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class Employee.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        Employee instance = new Employee();
        instance.setPhoneNumber(phoneNumber);
    }

    /**
     * Test of getPositionCategory method, of class Employee.
     */
    @Test
    public void testGetPositionCategory() {
        System.out.println("getPositionCategory");
        Employee instance = new Employee();
        instance.setPositionCategory("Indirect");
        String expResult = "Indirect";
        String result = instance.getPositionCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPositionCategory method, of class Employee.
     */
    @Test
    public void testSetPositionCategory() {
        System.out.println("setPositionCategory");
        String positionCategory = "";
        Employee instance = new Employee();
        instance.setPositionCategory(positionCategory);
    }

    /**
     * Test of getDateHired method, of class Employee.
     */
    @Test
    public void testGetDateHired() {
        System.out.println("getDateHired");
        Employee instance = new Employee();
        instance.setDateHired("3/23/20");
        String expResult = "3/23/20";
        String result = instance.getDateHired();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateHired method, of class Employee.
     */
    @Test
    public void testSetDateHired() {
        System.out.println("setDateHired");
        String dateHired = "";
        Employee instance = new Employee();
        instance.setDateHired(dateHired);
    }

    /**
     * Test of getAddress1 method, of class Employee.
     */
    @Test
    public void testGetAddress1() {
        System.out.println("getAddress1");
        Employee instance = new Employee();
        instance.setAddress1("6120 Michener");
        String expResult = "6120 Michener";
        String result = instance.getAddress1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress1 method, of class Employee.
     */
    @Test
    public void testSetAddress1() {
        System.out.println("setAddress1");
        String address1 = "";
        Employee instance = new Employee();
        instance.setAddress1(address1);
    }

    /**
     * Test of getAddress2 method, of class Employee.
     */
    @Test
    public void testGetAddress2() {
        System.out.println("getAddress2");
        Employee instance = new Employee();
        instance.setAddress2("Apt A10");
        String expResult = "Apt A10";
        String result = instance.getAddress2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress2 method, of class Employee.
     */
    @Test
    public void testSetAddress2() {
        System.out.println("setAddress2");
        String address2 = "";
        Employee instance = new Employee();
        instance.setAddress2(address2);
    }

    /**
     * Test of getCity method, of class Employee.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Employee instance = new Employee();
        instance.setCity("Haymarket");
        String expResult = "Haymarket";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Employee.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Employee instance = new Employee();
        instance.setCity(city);
    }

    /**
     * Test of getState method, of class Employee.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Employee instance = new Employee();
        instance.setState("VA");
        String expResult = "VA";
        String result = instance.getState();
        assertEquals(expResult, result);
    }

    /**
     * Test of setState method, of class Employee.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        String state = "";
        Employee instance = new Employee();
        instance.setState(state);
    }

    /**
     * Test of getZipcode method, of class Employee.
     */
    @Test
    public void testGetZipcode() {
        System.out.println("getZipcode");
        Employee instance = new Employee();
        instance.setZipcode("20169");
        String expResult = "20169";
        String result = instance.getZipcode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setZipcode method, of class Employee.
     */
    @Test
    public void testSetZipcode() {
        System.out.println("setZipcode");
        String zipcode = "";
        Employee instance = new Employee();
        instance.setZipcode(zipcode);
    }

    /**
     * Test of getActiveFlag method, of class Employee.
     */
    @Test
    public void testGetActiveFlag() {
        System.out.println("getActiveFlag");
        Employee instance = new Employee();
        instance.setActiveFlag(Boolean.TRUE);
        Boolean expResult = Boolean.TRUE;
        Boolean result = instance.getActiveFlag();
        assertEquals(expResult, result);
    }

    /**
     * Test of setActiveFlag method, of class Employee.
     */
    @Test
    public void testSetActiveFlag() {
        System.out.println("setActiveFlag");
        Boolean activeFlag = null;
        Employee instance = new Employee();
        instance.setActiveFlag(activeFlag);
    }
    
}
