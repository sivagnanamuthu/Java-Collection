import java.util.*;

public class CrackArrayList {
    // Array List contains duplicate values
    // Array list allow null values
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add(null);

        // Print the whole array list
        System.out.println(list_Strings);

        ArrayList<Integer> list_Integers = new ArrayList<Integer>();
        list_Integers.add(12);
        list_Integers.add(8);
        list_Integers.add(16);
        list_Integers.add(22);
        list_Integers.add(22);
        System.out.println(list_Integers);

        //Print arraylist one by one using foreach loop
        for(String strName : list_Strings){
            System.out.print(strName+",");
        }

        System.out.println("");

        //Print arraylist one by one using for loop
        for(int i=0;i<list_Integers.size();i++){
            System.out.print(list_Integers.get(i)+",");
        }
    }
}
