/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersen.backendjaxrsproject;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.bson.Document;

/**
 *
 * @author Esther
 */
@Path("/employees")
public class EmployeeResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String addEmployee(@FormParam("firstName") String firstName,
                              @FormParam("middleName") String middleName,
                              @FormParam("lastName") String lastName,
                              @FormParam("email") String email,
                              @FormParam("phone") String phone,
                              @FormParam("position") String position,
                              @FormParam("date") String date,
                              @FormParam("address1") String address1,
                              @FormParam("address2") String address2,
                              @FormParam("city") String city,
                              @FormParam("state") String state,
                              @FormParam("zipcode") String zipcode,
                              @FormParam("activeFlag") boolean activeFlag)
    {
        Employee newEmployee = new Employee();
        newEmployee.setFirstName(firstName);
        newEmployee.setMiddleName(middleName);
        newEmployee.setLastName(lastName);
        newEmployee.setEmailAddress(email);
        newEmployee.setPhoneNumber(phone);
        newEmployee.setPositionCategory(position);
        newEmployee.setDateHired(date);
        newEmployee.setAddress1(address1);
        newEmployee.setAddress2(address2);
        newEmployee.setCity(city);
        newEmployee.setState(state);
        newEmployee.setZipcode(zipcode);
        newEmployee.setActiveFlag(activeFlag);
        EmployeeServices employeeService = new EmployeeServices();
        String addedEmployee = employeeService.addEmployee(newEmployee);
        return addedEmployee;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public String getAllEmployees() {
        EmployeeServices employeeService = new EmployeeServices();
        return employeeService.getAllEmployees();
               
    }
    
    @POST
    @Path("/getById")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getEmployee(@FormParam("id") String id) {
        EmployeeServices employeeService = new EmployeeServices();
        String employeeDoc = employeeService.getEmployeebyID(id);

        return employeeDoc;
    }

    @POST
    @Path("/getBylastName")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String getEmployeeLastName(@FormParam("lastName") String lastName) {
        EmployeeServices employeeService = new EmployeeServices();
        String employeeDoc = employeeService.getEmployeebyLastName(lastName);

        return employeeDoc;
    }

   
    @PUT
    @Path("/updateEmployee")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String UpdateEmployee(@FormParam("id") long employeeID, 
                                 @FormParam("key") String key, 
                                 @FormParam("value") String updatedValue) {

        EmployeeServices employeeService = new EmployeeServices();
        employeeService.updateEmployee(employeeID, key, updatedValue);
        return "update procedure";
    }
    
    
    @DELETE
    @Path("/deleteEmployee")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void deleteEmployee() {
        EmployeeServices employeeService = new EmployeeServices();
        employeeService.deleteEmployee();
    } 

}
