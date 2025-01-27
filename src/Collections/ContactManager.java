package Collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactManager {

    ArrayList<String> contactName = new ArrayList<>();
    HashMap<String,String> phoneNumber = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addContact(){
        System.out.println("Enter how many contacts what to register: ");
        int num = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=num; i++){
            System.out.println("Enter Contact Name: ");
            String cName = sc.nextLine();
            System.out.println("Enter Phone Number: ");
            String pNum = sc.nextLine();
            contactName.add(cName);
            phoneNumber.put(cName,pNum);
            if(i<num){
                System.out.println("=====> Enter for New user <=====");
            }
        }
    }
    public void displayOnlyNames(){
        System.out.println("=====> All Contacts Names <=====");
        contactName.forEach(eachName-> System.out.println("Name: " + eachName));
    }
    public void displayContacts(){
        System.out.println("=====> All Contacts <=====");
        //Streams with lambda function
        phoneNumber.forEach((k,v)-> System.out.println("Name: " + k + " and PhoneNumber: " + v));

        /*//For each loop for an arrayList
        for(String name: contactName){
            System.out.println(name);
        }

        //forEach loop for Hash Map
        for(Map.Entry<String,String> newData: phoneNumber.entrySet()){
            System.out.println("Name: "  + newData.getKey() + " " + " PhoneNumber: " +newData.getValue());
        }*/
    }
}
