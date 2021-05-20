import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		double length, breadth, area, perimeter;
        area = perimeter = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle:");
        length = sc.nextDouble();
        System.out.println("Enter the Breadth of the Rectangle:");
        breadth = sc.nextDouble();
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        System.out.println("Area of the Rectangle: " + area + " Square Units");
        System.out.println("Perimeter of the Rectangle: " + perimeter + " Units");

	}

}
