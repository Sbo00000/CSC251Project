public class Policy
{
   // Fields
   private int num;
   private String provider;
   private double bmi = 0;
   private PolicyHolder policyholder;
   
   public Policy(int polNum, String polProvider)
   {
      num = polNum;
      provider = polProvider;
      // Use copy constructor to avoid security holes
      policyholder = new PolicyHolder(holder);
   }
   
   // Setters
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
      
      bmiCalc = bmi - 35;
      addFee = bmiCalc * 50;
      
      if (age > 75)
      {
         total = total + 50;
      }
      if (smokStat.equalsIgnoreCase("smoker"))
      {
         total = total + 100;
      }
      if (bmi > 40)
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