package modul9;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap=new MyHashMap<>();
        myHashMap.put(1,"A");
        myHashMap.put(2,"B");
        myHashMap.put(3,"C");
        myHashMap.put(4,"D");
        myHashMap.put(6,"F");
        myHashMap.put(7,"E");
        myHashMap.put(8,"O");
        myHashMap.put(9,"P");
        myHashMap.put(10,"G");
        myHashMap.put(11,"Z");
        myHashMap.put(12,"X");
        myHashMap.put(13,"CC");
        myHashMap.put(14,"Ertr");
        myHashMap.put(16,"Efgk");
        myHashMap.put(17,"fsdf");
        myHashMap.put(18,"lllkl");
        myHashMap.put(19,"dfgs");
        myHashMap.put(20,"adfs");
        myHashMap.put(21,"asda");
        myHashMap.put(22,"adfsd");
        System.out.println("myHashMap.toString() = " + myHashMap.toString());


        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.remove(2) = " + myHashMap.remove(2));
        System.out.println("myHashMap.get(4) = " + myHashMap.get(4));
        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());

    }
}
