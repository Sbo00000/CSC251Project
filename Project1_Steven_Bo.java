// Steven Bo Project Two Demo Class
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project1_Steven_Bo
{
   public static void main(String[] args)
   {   
      try
      {
         //create instance of file class
         File file = new File("PolicyInformation.txt"); 
         
         Scanner inputFile = new Scanner(file);
         //variables
         int polNum, age;
         int numOfSmoker = 0;
         int numOfNonSmoker = 0;
         double height, weight;
         String provider, firstNam, lastNam, smokStat;
         
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         while(inputFile.hasNext())
         {
            //get variables from file
            polNum = inputFile.nextInt();
            // Clear buffer
            inputFile.nextLine();
            provider = inputFile.nextLine();
            firstNam = inputFile.nextLine();
            lastNam = inputFile.nextLine();
            age = inputFile.nextInt();
            // Clear buffer
            inputFile.nextLine();
            smokStat = inputFile.nextLine().toLowerCase();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            //skip the blank line if we have not reached the end of the file
            if(inputFile.hasNext())
            {
               inputFile.nextLine();
            }
            //Send to class
            Policy pol = new Policy(polNum, provider, firstNam, lastNam, age, smokStat, height, weight);
            //Append to array
            policies.add(pol); 
         }
         inputFile.close(); // Close the file now that we're done
         
         for(int i = 0; i < policies.size(); i++)
         {
            // Print out everything including bmi and price
            System.out.println("\nPolicy Number:" + policies.get(i).getNum());
            System.out.println("Provider Name:" + policies.get(i).getProvider());
            System.out.println("Policyholder's First Name:" + policies.get(i).getFirst());
            System.out.println("Policyholder's Last Name:" + policies.get(i).getLast());
            System.out.println("PolicyHolder's Age:" + policies.get(i).getAge());
            System.out.println("Policyholder's Smoking Status:" + policies.get(i).getSmoke());
            System.out.println("Policyholder's Height:" + policies.get(i).getHeight());
            System.out.println("Policyholder's Weight:" + policies.get(i).getWeight());
            System.out.printf("Policyholder's BMI:%.2f", policies.get(i).getBMI());
            System.out.printf("\nPolicy Price:$%.2f", policies.get(i).getTotal());
            
            //keep track of smokers and non-smokers
            if(policies.get(i).getSmoke().equalsIgnoreCase("non-smoker"))
            {
               numOfNonSmoker++;//Add non-smoker
            }
            else if(policies.get(i).getSmoke().equalsIgnoreCase("smoker"))
            {
               numOfSmoker++;//Add smoker
            }
         }//Close loop
         
         //print out non-smokers and smokers
         System.out.println("The Number of Policies with a smoker is:" + numOfSmoker);
         System.out.println("The number of policies with a non-smoker is:" + numOfNonSmoker);
         
      }// try closed
      catch(IOException ex)//If something goes wrong an ioexception is given to us and this deals with it
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
   }//Close main container
}//Close class container