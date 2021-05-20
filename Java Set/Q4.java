import java.util.*;
public class Q4 {
static void func(String sentence) {
    String word = "";
    int len = sentence.length();
    for (int i = 0; i < len; ++i) {
        if (sentence.charAt(i) == ' '){
            System.out.println(word);
            word="";
        } else word += sentence.charAt(i);
    }
System.out.print( word);
} public static void main(String[] args){
    Scanner in = new Scanner ( System.in ) ;
    String sentence = in.nextLine();
    func(sentence);
}}