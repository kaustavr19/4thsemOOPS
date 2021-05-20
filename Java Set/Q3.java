class Q3 {
    public static void main(String args[]) {
        Increment n1 = new Increment();
        Increment n2 = new Increment();
        Driver d = new Driver();
        Driver.printCount();
    }}
class Increment {
    static int cnt = 0;
    Increment() {
        cnt++;
    }}
class Driver extends Increment {
    static void printCount() {
        System.out.println(cnt - 1);
    }}