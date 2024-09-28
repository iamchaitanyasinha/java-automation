package ArrayLists;
import java.util.*;


//ArrayList
//Syntax:
//   ArrayList<Datatype> name = new ArrayList<>();
//   Data Types: Integer, Long, Double, Float, String
//   No need to maintain the size , just an empty arraylist is created
//
// Functions of ArrayList:

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
            //Alpha@chaitanya
        }
    }

}
