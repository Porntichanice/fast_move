/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */

import base.*;
public class FastMoveConsoleApplication {
    
    
    public Person creatPerson(String fname,String Lname){
         Person person=new Person("Phunon","Srivoraluxkana");
         return person;
    }
    public Bike creatBike(String licensePlate, int engineCapacity){
        Bike bike=new Bike(licensePlate,engineCapacity);
        
        return bike; 
    }
    public Parcel creatParcel(double weight, ParcelStatus status, Location location){
        Parcel parcel=new Parcel( weight,  status,  location);
        return parcel;
    }
   
   
    
}//add comment
