import java.util.*;
class gradingsystem
{
   public static void main(String args[]) 
     {
	float percentage;
	char grade;
	Scanner in= new Scanner(System.in);
      	System.out.print("Enter the Percentage : ");
      	percentage=in.nextFloat();	
	if(percentage>=90)
         grade = 'A';
      	else if(percentage>=80 && percentage<90)
         grade = 'B';
      	else if(percentage>=70 && percentage<80)
         grade = 'C';
      	else if(percentage>=60 && percentage<70) 
         grade = 'D';
	else if(percentage>=40 && percentage<60)
         grade ='E';
       	else
	 grade='F';
	System.out.println("The student has got grade "+grade);
     }
}
