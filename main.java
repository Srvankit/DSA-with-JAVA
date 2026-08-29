import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "World";
        HashSet<String> set = new HashSet<>();
        set.add(str);
        set.add(str2);
        for(int i =0; i<str2.length(); i++){
            if(set.contains(String.valueOf(str2.charAt(i)))){
                System.out.println("Character " + str2.charAt(i) + " is present in the set.");
            } else {
                System.out.println("Character " + str2.charAt(i) + " is not present in the set.");
            }
        }
    }
}