package Assignment8;

import java.util.Scanner;

public class PoliceRegistration {
    public void fillDetails(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            if(age < 18 || age > 30){
                throw new AgeException("Age should be in between 18-30");
            }
            System.out.println("Enter your height in cms : ");
            int height = sc.nextInt();
            if(height < 165){
                throw new HeightException("Height should be greater than 165cms");
            }
            System.out.println("Enter your weight in kgs : ");
            int weight = sc.nextInt();
            if(weight < 45 || weight > 60){
                throw new WeightException("Weight should be in between 45-60kgs");
            }
            // throw new NullPointerException();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Finally blocked is executed whether exception is raised or not raised or handled or unhandled.");
        }
    }
    public static void main(String[] args){
        PoliceRegistration obj = new PoliceRegistration();
        obj.fillDetails();
    }
}
