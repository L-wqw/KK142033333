

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.io.PrintWriter; 
import java.io.FileOutputStream; 
import java.io.File;

public class RentalSystem {
   private String firstName, lastName, gender, status, location, contact, make;
   private double fee, total, fine;
   private int time, yearModel, speed;
   Scanner sc=new Scanner(System.in);
   Scanner sc1=new Scanner(System.in);
   LocalDate dateOfRent;
   Period period;
   
   public RentalSystem() {
      firstName = "";
      lastName = "";
      gender = "";
      status = "";
      location = "";
      contact = "";
      fee=0.0;
      time=0;
      total=0.0;
      fine=0.0;  
      yearModel = 0;
      make = "";
      speed = 0; 
   }
    
   public void setS() {
      System.out.println("First name: ");
      firstName = sc.nextLine();
      System.out.println("Last name: ");
      lastName = sc.nextLine();
      System.out.println("Gender: ");
      gender = sc.nextLine();
      System.out.println("Status: ");
      status = sc.nextLine();
      System.out.println("Location: ");
      location = sc.nextLine();
      System.out.println("Contact: ");
      contact = sc.nextLine();
      System.out.println("Year model: ");
      yearModel = sc.nextInt();
      System.out.println("Make: ");
      make = sc1.nextLine();
      
   }

   //customer
   public String getFirstName() {
      return firstName;
   }
   	
   public String getLastName() {
      return lastName;
   }
   	
   public String getFullName() {
      return getFirstName() + " " + getLastName();
   }
   	
   public String getGender() {
      return gender;
   }
   	
   public String getStatus() {
      return status;
   }
   	
   public String getLocation() {
      return location;
   }
   	
   public String getContact() {
      return contact;
   }
   
   //fee
   public double calculatefee(double fee, int time, double fine){
      return fee*time+fine;
      
   }
    
   public double setFee(){
      System.out.println("Please enter fee per hour: ");
      return fee=sc.nextDouble();
   }
        
   public int setTime(){
      System.out.println("Please enter hour rented: ");
      return time=sc.nextInt();
   }
        
   public double setFine(){
      System.out.println("Please enter fine (if any): ");
      return fine=sc.nextDouble();
   }
    
   public double getTotal(){
     return calculatefee(fee, time, fine);
   }
    
   //car
   public int getYearModel(){
      return yearModel;
   }
   public String getMake(){
      return make;
   }
   /*public int getSpeed(){ //??
      return speed;
   }
   public void setYearModel(int y){
      yearModel = y;
   }
   public void setMake(String type){
      make = type;
   }
   public void accelerate(){ //??
      if ((speed >= 0) && (speed <= 210)){
         speed += 5;}
      else{
         speed -= 5;}
   }*/
    
  /* public void ArrayList<Rent> getSoonOverdueRents(Period period) {
      ArrayList<Rent> result = new ArrayList<Rent>();
      for (Customer customer : customers) {
         for (Rent rent : customer.getRentedCars()) {
            if (rent.getDateOfRent().plus(rent.getPeriod()).isAfter(LocalDate.now().minus(period))) {
               result.add(rent);
            }
         }
      }
   return result;
   }

   public ArrayList<Rent> getAllRents() {
      ArrayList<Rent> result = new ArrayList<Rent>();
         for (Customer customer : customers) {
            for (Rent rent : customer.getRentedCars()) {
               result.add(rent);
            }
         }
      return result;
   }*/
    
   public void saveToFile() throws FileNotFoundException {	
      PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Customers_Inventory.txt"), true));
      outFile.append(getFullName() + " " + getGender() + " " + getLocation() + " " + getContact() + " " + getStatus() + " "+ Double.toString(setFee()) + " " + Integer.toString(setTime()) + " " + Double.toString(setFine()) + " " + Double.toString(getTotal()) + "\n");
      outFile.close();
   }
}

