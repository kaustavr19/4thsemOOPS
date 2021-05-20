import java.util.*;

public class Commission {
    int sale;

    Commission(int s) {
        sale = s;
    }

    void commission() {
        System.out.println("Commission: " + (double) (0.25 * sale));
    }
}