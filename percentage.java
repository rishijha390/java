import java.util.Scanner;

 class percentage {
    public static void main (String args[]){
   float eng, phy, chem, maths, comp;
   float total, average, percentage;
   Scanner rishi=new Scanner (System.in);
   System.out.println("Enter marks of five subjects... ");
   System.out.print("Enter  marks of English subjects: ");
   eng=rishi.nextFloat();
   System.out.print("Enter marks of phy subjects: ");
   phy=rishi.nextFloat();
   System.out.print("Enter marks of chem subjects: ");
   chem=rishi.nextFloat();
   System.out.print("Enter marks of maths subjects: ");
   maths=rishi.nextFloat();
   System.out.print("Enter marks of computer subjects: ");
   comp=rishi.nextFloat();

   total = eng + phy + chem + maths + comp;
   percentage=(total / 500) * 100;
   average=(total/5);
   System.out.println("Total marks ="+total);
   System.out.println("Percentage =" +percentage);
   System.out.println("average =" +average);
   rishi.close();
    }
    
}
