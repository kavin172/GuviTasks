package Task5.Question3;

import java.util.ArrayList;
import java.util.List;

/****

 Q3. You are a teacher in school .In your class there are 10 students, you have decided to give special gifts to those students whose names start with "A".
 you are asked to separate those students with the help of a java program.
 Requirement:
 Use List interface to store the student name
 Use a lambda expression and the Stream API to filter the students
 ****/

public class NameStartsWithA {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Arun", "Ajay", "Kavin", "Raj", "Amar", "Arjun"));
        System.out.println("Student Name List " + nameList);
        List<String> specialGift = nameList.stream().filter(a -> a.startsWith("A")).toList();
        System.out.println("Student is going to get special gift " + specialGift);
    }
}

/****
 OUTPUT :
 Student Name List [Arun, Ajay, Kavin, Raj, Amar, Arjun]
 Student is going to get special gift [Arun, Ajay, Amar, Arjun]
 ****/
