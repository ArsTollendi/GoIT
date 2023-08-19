package modul9;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayListTest {
    public static void main(String[] args) {
        var myArray = new MyArrayList<Integer>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(myArray.get(i));
        }
        TestMyArrayList(myArray);


        }

    private static void TestMyArrayList(MyArrayList<Integer> myArray) {
        System.out.println("");
        System.out.println("myArray.size() = " + myArray.size());
        System.out.println("myArray.get(3) = " + myArray.get(3));
        System.out.println("myArray.remove(6) = " + myArray.remove(6));
        System.out.println("myArray.size() = " + myArray.size());
        myArray.clear();
        System.out.println("myArray.size() = " + myArray.size());
    }
}
