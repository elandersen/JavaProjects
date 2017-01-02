/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersen.backendjaxrsproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.util.JSON;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Esther
 */
public class EmployeeServices {
    static private long employeeCount = 0;
    private MongoDatabase employeeDB;

    public MongoDatabase getEmployeeDB() {
        return employeeDB;
    }
   
    public EmployeeServices() {
        MongoClient mongo = new MongoClient("localhost", 27017);
        employeeDB = mongo.getDatabase("Employees");
    }

    public String addEmployee(Employee employee) {
        String jsonString = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            
            MongoCollection<Document> employeeCollection = employeeDB.getCollection("EmployeeCollection");
            employee.setId(employeeCount + 1);

            jsonString = mapper.writeValueAsString(employee);
            Document doc = Document.parse(jsonString);
            employeeCollection.insertOne(doc);

            //get the document back from the database to verify that it was added
            Bson bson = (Bson)com.mongodb.util.JSON.parse("{'id': " + employee.getId() + "}");
            
            FindIterable<Document> find = employeeCollection.find();
            FindIterable<Document> filteredQuery = find.filter(bson);
            String newString = "";
            
            for (Document document : filteredQuery) {
                newString = newString + document.toJson() + "\n";
            }            
            
            return newString;
        } catch (JsonProcessingException ex) {
            Logger.getLogger(EmployeeServices.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jsonString;
    }

    public String getAllEmployees() {

        MongoCollection<Document> employeeCollection = employeeDB.getCollection("EmployeeCollection");

        FindIterable<Document> find = employeeCollection.find();
        String returnString = "";
        for (Document document : find) {
            returnString = returnString + document.toJson() + "\n";
        }

        return returnString;

    }

    public String getEmployeebyID(String id) {

        MongoCollection<Document> employeeCollection = employeeDB.getCollection("EmployeeCollection");
        Bson bson = (Bson)com.mongodb.util.JSON.parse("{'id': " + id + "}");

        FindIterable<Document> find = employeeCollection.find();
        FindIterable<Document> filteredQuery = find.filter(bson);
        String newString = "";
        for (Document document : filteredQuery) {
            newString = newString + document.toJson() + "\n";
        }
        return newString;
    }

    public String getEmployeebyLastName(String lastName) {

        MongoCollection<Document> employeeCollection = employeeDB.getCollection("EmployeeCollection");
        Bson bson = (Bson)com.mongodb.util.JSON.parse("{'lastName': '" + lastName + "'}");

        FindIterable<Document> find = employeeCollection.find();
        FindIterable<Document> filteredQuery = find.filter(bson);
        String newString = "";
        for (Document document : filteredQuery) {
            newString = newString + document.toJson() + "\n";
        }
        return newString;
    }

    public String updateEmployee(long employeeID, String key, String updatedValue) {
        String newString = "";
        MongoCollection<Document> employeeCollection = employeeDB.getCollection("EmployeeCollection");
        ObjectMapper mapper = new ObjectMapper();

        Bson newValue = new Document(key, updatedValue);
        Bson filter = new Document("id", employeeID);
        Bson updateOperationDoc = new Document("$set", newValue);

        //Update the employee information
        UpdateResult result = employeeCollection.updateOne(filter, updateOperationDoc);
        
        //get the document back from the database to verify that it was added
        Bson bson = (Bson)com.mongodb.util.JSON.parse("{'id': " + employeeID + "}");

        FindIterable<Document> find = employeeCollection.find();
        FindIterable<Document> filteredQuery = find.filter(bson);
        for (Document document : filteredQuery) {
            newString = newString + document.toJson() + "\n";
        }            
        return newString;            
    }

    public void deleteEmployee() {

        MongoCollection<Document> employeeCollection = employeeDB.getCollection("EmployeeCollection");
        Bson bson = (Bson)com.mongodb.util.JSON.parse("{}");
        employeeCollection.deleteOne(bson);

    }

}
