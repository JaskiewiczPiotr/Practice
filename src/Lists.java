import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lists {

    public static void main(String[]args){
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");


        List<String> list2 = new ArrayList<>();
        list2.add("cherry");
        list2.add("date");

        //#option1
        list1.addAll(list2);

        //#option2
        List<String> combinedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        //#option3
        List<String> combinedList2 = new ArrayList<>(list1);
        combinedList2.addAll(list2);



        System.out.println("combined list from simply addAll method" + list1);
        System.out.println("combined list from java streams" + combinedList);
        System.out.println("combined list using list constructor" + combinedList2);


    }

}
