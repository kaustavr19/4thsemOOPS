import java.util.*;
import NoMatchFoundException;
NoMatchFoundException NoMatchFoundException;

public class Capital {
    static void check(String str) throws NoMatchFoundException {
        if (str.equals("India")) {
            System.out.println("New Delhi");
        } else if (str.equals("Sri Lanka")) {
            System.out.println("Sri Jayawardenepura Kotte");
        } else if (str.equals("Pakistan")) {
            System.out.println("Islamabad");
        } else {
            throw new NoMatchFoundException("No capital found");
        }
    }

    public static void main(String[] args) throws NoMatchFoundException {
        check(args[0]);
    }
}