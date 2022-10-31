// Steven Bo Project Three Demo Class
import java.util.Scanner;

public class Project1_Steven_Bo
{
   public static void main(String[] args)
   {
      int polNum, age;
      double height, weight;
      String provider, firstNam, lastNam, smokStat;
      
      // Create scanner object to obtain keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Get user input
      System.out.print("Please enter the Policy Number:");
      polNum = keyboard.nextInt();
      
      // Clear buffer
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name:");
      provider = keyboard.nextLine();
      
      System.out.print("Please enter Policyholder's First Name:");
      firstNam = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last name:");
      lastNam = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age:");
      age = keyboard.nextInt();
      
      // Clear buffer
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker):");
      smokStat = keyboard.nextLine().toLowerCase();
      
      System.out.print("Please enter the Policyholder's Height(in inches):");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight(in pounds):");
      weight = keyboard.nextDouble();
      
      // Create an instance of the policy class and pass the information through to it
      Policy pol = new Policy(polNum, provider, firstNam, lastNam, age, smokStat, height, weight);
      
      // Print out everything
      System.out.println("\nPolicy Number:" + pol.getNum());
      System.out.println("Provider Name:" + pol.getProvider());
      System.out.println("Policyholder's First Name:" + pol.getFirst());
      System.out.println("Policyholder's Last Name:" + pol.getLast());
      System.out.println("PolicyHolder's Age:" + pol.getAge());
      System.out.println("Policyholder's Smoking Status:" + pol.getSmoke());
      System.out.println("Policyholder's Height:" + pol.getHeight());
      System.out.println("Policyholder's Weight:" + pol.getWeight());
      System.out.printf("Policyholder's BMI:%.2f", pol.getBMI());
      System.out.printf("\nPolicy Price:$%.2f", pol.getTotal());
   }
}

