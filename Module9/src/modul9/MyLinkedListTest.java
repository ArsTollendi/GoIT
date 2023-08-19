package modul9;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.ShouListForward();
        System.out.println("-/////////////////-");

        System.out.println("\n"+"myLinkedList.size() = " + myLinkedList.size());

        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));

        System.out.println("myLinkedList.remove(0) = " + myLinkedList.remove(0)+" size= "+myLinkedList.size());

        myLinkedList.clear();

        System.out.println("myLinkedList.size(clean) = " + myLinkedList.size());

    }
}

