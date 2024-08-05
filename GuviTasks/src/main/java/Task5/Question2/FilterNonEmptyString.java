package Task5.Question2;

import java.util.ArrayList;
import java.util.List;

/****
 Q2. Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings.
 If the given List is: Liststrings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
 ****/

public class FilterNonEmptyString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("abc", "", "bc", "ef", "abcd", "", "jkl"));
        System.out.println("String before processing" + list);
        List<String> newList = list.stream().filter(a -> !a.isEmpty()).toList();
        System.out.println("String after processing" + newList);
    }
}

/****
 OUTPUT :
 String before processing[abc, , bc, ef, abcd, , jkl]
 String after processing[abc, bc, ef, abcd, jkl]
 ****/

