import java.util.*;

public class testCommission {

    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sale amount: ");
        s = sc.nextInt();
        if (s > 0) {
            Commission ob = new Commission(s);
            ob.commission();
        } else if(s<0)
            System.out.print("Invalid Input");
        else
        	System.exit(0);
    }
}