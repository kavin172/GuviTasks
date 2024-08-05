package Task5.Question1;

import java.util.ArrayList;
import java.util.List;

//Q1. Write a program using map() method, to convert a list of Strings into uppercase.If the given List is: Stream names = Stream.of("aBc", "d", "ef");

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("aBc", "c", "ae"));
        System.out.println("List before processing " + list);
        List<String> uppercase = list.stream().map(String::toUpperCase).toList();
        System.out.println("Upper case list " + uppercase);
    }
}


/****
 OUTPUT :
 List before processing [aBc, c, ae]
 Upper case list [ABC, C, AE]
 ****/
