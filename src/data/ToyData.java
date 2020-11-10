package data;

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import base.Person;
import base.Location;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code
//        for(int i=0;i<bikes.length;i++){
//            bikes[i]=new Bike("000"+String.valueOf(i+1),1200+i*100);
//        }

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        for(int i=0;i<person.length;i++){
            person[i]=new Person("Mr."+String.valueOf(i),String.valueOf(i+1));
        }

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
//        for(int i=0;i<parcels.length;i++){
//            parcels[i]=new Parcel(20+i*4, ParcelStatus.DELIVERED,new Location(10+i,20+i));
//        }
//        // your code

        return parcels;
    }

    //testing
    public static void main(String[] args) {
//     //   printBike();
        printPerson();
//        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
