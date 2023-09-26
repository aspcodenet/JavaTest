import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
    public static void main(String [] args){

        Scanner myScanner = new Scanner(System.in); 

        int secretNumber = 34; // slumpa fram



        while(true){
            System.out.println("Mata in ett tal:");
            int userGuessedNumber = myScanner.nextInt();    
            if(userGuessedNumber > secretNumber){
                System.out.println("Datorns hemliga tal är mindre!");
            }
            else if(userGuessedNumber < secretNumber) {
                System.out.println("Datorns hemliga tal är större!");
            }else{
                System.out.println("Jaa du hade rätt!");
                break;
            }
        }


        // int userGuessedNumber;
        // do{
        //     System.out.println("Mata in ett tal:");
        //     userGuessedNumber = myScanner.nextInt();    
        //     if(userGuessedNumber > secretNumber){
        //         System.out.println("Datorns hemliga tal är mindre!");
        //     }
        //     else if(userGuessedNumber < secretNumber) {
        //         System.out.println("Datorns hemliga tal är större!");
        //     }else{
        //         System.out.println("Jaa du hade rätt!");
        //         break;
        //     }
        // } while(userGuessedNumber != secretNumber);


//        int userGuessedNumber = 0;

        // while(userGuessedNumber != secretNumber ){
        //     System.out.println("Mata in ett tal:");
        //     userGuessedNumber = myScanner.nextInt();    
        //     if(userGuessedNumber > secretNumber){
        //         System.out.println("Datorns hemliga tal är mindre!");
        //     }
        //     else if(userGuessedNumber < secretNumber) {
        //         System.out.println("Datorns hemliga tal är större!");
        //     }else{
        //         System.out.println("Jaa du hade rätt!");
        //     }
        // }

        System.out.println("Vad heter du?");
        String namn =  myScanner.nextLine();
        System.out.println("Hej kul att du heter " + namn);



        String barn1 = "Fanny";
        String barn2 = "Oliver";
        String barn3 = "Josefine";
        String customer20 = "STI";
        String customer21 = "TUC";
        //ARRAYER + LISTOR
        ArrayList<String> minaBarn = new ArrayList<>();
        //int shoeSize = 42;



        // LISTA MED 10 MILJONER 
        long h = 312132123;
            // int heltal
            // float flytta 3.1415927
            int year = 2023;
            double aerage = 123.456;
            float average = (float) 123.456;

            year = year + 12;
            System.out.println(year);




        //Program som zippar filer
        year = 2023;    
        System.out.println("Hello");        
    }
}