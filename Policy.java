public class Policy
{
   // Fields
   private int age, num;
   private double height, weight, bmi = 0.0;
   private String firstNam, lastNam, smokStat, provider;
   
   //No-Arg constructor
   public PolicyHolder()
   {
      age = 0;
      num = 0;
      height = 0.0;
      weight = 0.0;
      firstNam = "";
      lastNam = "";
      smokStat = "";
      provider = "";
   }
   
   // Constructor
   public PolicyHolder(String first, String last, int polAge, String smoke, double polHeight, double polWeight, int polNum,)
   {
      firstNam = first;
      lastNam = last;
      age = polAge;
      smokStat = smoke;
      height = polHeight;
      weight = polWeight;
      num = polNum;
      provider = polProvider;
   }
   
   public void setNum(int polNum)
   {
      num = polNum;
   }
   public void setProvider(String polProvider)
   {
      provider = polProvider;
   }
      public void setPolicyHolder(PolicyHolder holder)
   {
      policyholder = new PolicyHolder(holder);
   }
   
   // Getters
   public int getNum()
   {
      return num;
   }
   public String getProvider()
   {
      return provider;
   }
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(holder);
   }
   
   
   // Calculations
   public double getTotal()
   {
      double bmiCalc = 0;
      double total = 600;
      double addFee = 0;
      
      bmiCalc = (bmi * polWeight)/(polHeight^2);
      addFee = (bmiCalc - 35) * 20;
      
      if (age > 50)
      {
         total = total + 75;
      }
      if (smokStat.equalsIgnoreCase("smoker"))
      {
         total = total + 100;
      }
      if (bmi > 35)
      {
         total = total + addFee;
      }
            return total;
   }
   
   public String toString()
   {
      return String.format("Policy Number:" + polNum + 
      "Provider Name:" + provider + 
      policyholder.toString() + 
      "Policyholder's BMI:%.2f", bmi + 
      "\nPolicy Price:$%.2f", total);
   }
   
   
}