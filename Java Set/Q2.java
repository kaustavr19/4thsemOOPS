import java.util.*;
class Q2 {
    public static void main(String[] args) {
    }}
interface Department{
    String deptName="ABC", deptHead="XYZ";
    public void getprint();
}
class hostel {
    String hostelName, hostelLocation;
    int numberofRooms;
    public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hostel Name : ");
        hostelName=sc.next();
        System.out.println("Enter Hostel Place : ");
        hostelLocation=sc.next();
        System.out.println("Enter Hostel Rooms Qty : ");
        numberofRooms=sc.nextInt();
    }
    public void disp()
    {
        System.out.println("Hostel Name : "+hostelName);
        System.out.println("Hostel Rooms Qty : "+numberofRooms);
        System.out.println("Hostel Palce : "+hostelLocation);
    }
}
class student extends hostel implements Department {
    String stuentName,electiveSubject;
    int regNo, avgMarks;
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        stuentName=sc.next();
        System.out.println("Enter Subject : ");
        electiveSubject=sc.next();
        System.out.println("Enter reg no and avg marks : ");
        regNo=sc.nextInt();
        avgMarks=sc.nextInt();
    }
    public void printData() {
        System.out.println("Student Name : " + stuentName);
        System.out.println("Subject : "+electiveSubject);
        System.out.println("reg no and avg marks : "+ regNo+ " , "+avgMarks);
    }
    String deptName, deptHead;
    public void getprint()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dept Name and Head : ");
        deptName=sc.next();
        deptHead=sc.next();
        System.out.println("Dept Name " +deptName);
        System.out.println("Dept Head " +deptHead);
    }
}