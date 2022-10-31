public class PolicyHolder
{
   // Fields
   private int age;
   private double height, weight;
   private String firstNam, lastNam, smokStat;
   
   // Constructor
   public PolicyHolder(String first, String last, int age, String smoke, double polHeight, double polWeight)
   {
      firstNam = first;
      lastNam = last;
      age = polAge;
      smokStat = smoke;
      height = polHeight;
      weight = polWeight;
   }
   
   // Copy of the constructor that copies the PolicyHolder class in order to avoid security holes
   public PolicyHolder(PolicyHolder object2)
   {
      firstNam = object2.firstNam;
      lastNam = object2.lastNam;
      age = object2.age;
      smokStat = object2.smokStat;
      height = object2.smokStat;
      weight = object2.weight;
   }
   
   // Setters
   public void setFirst(String first)
   {
      firstNam = first;
   }
   public void setLast(String last)
   {
      lastNam = last;
   } 
   public void setAge(int polAge)
   {
      age = polAge;
   }
   public void setSmoke(String smoke)
   {
      smokStat = smoke;
   }
   public void setHeight(double polHeight)
   {
      height = polHeight;
   }
   public void setWeight(double polWeight)
   {
      weight = polWeight;
   }
   
   // Getters
   public String getFirst()
   {
      return firstNam;
   }
   public String getLast()
   {
      return lastNam;
   }
   public int getAge()
   {
      return age;
   }
   public String getSmoke()
   {
      return smokStat;
   }
   public double getHeight()
   {
      return height;
   }
   public double getWeight()
   {
      return weight;
   }

   
   public String toString()
   {
      return String.format("Policyholder's First Name:" + firstNam + 
      "\nPolicyholder's Last Name:" + lastNam + 
      "\nPolicyholder's Age:" + age +
      "\nPolicyholder's Smoking Status (Y/N):" + smokStat +
      "\nPolicyholder's Height:" + height + 
      "\nPolicyholder's Weight:" + weight
   }
   
}