import java.util.Scanner;

class pattern4{  
    public static void main(String args[])
    {  
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number ");
     int N =sc.nextInt();//It is the number to calculate pattern   
     sc.close(); 
     for(int i=1; i<=N; i++)
     {
         for(int j=1; j<=i; j++)
         {
            System.out.print("*");
         }
         System.out.println("");
     }
    }  
   }  


     //Input 4
   /*Output
          *                    
          **
          ***
          ****
   */