package modul9;


import java.util.Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(5);
        myQueue.add(8);
        myQueue.add(17);
        myQueue.add(3);
        for (int i = 0; i < myQueue.size(); i++) {
        }
        TestQueue(myQueue);
    }
    private static void TestQueue(MyQueue<Integer> Queue){
        System.out.println("----------");
        System.out.println("myQueue.size() = " + Queue.size());
        System.out.println("----------");
        System.out.println("myQueue.peek() = " + Queue.peek());
        System.out.println("----------");
        System.out.println("myQueue.pool() = " + Queue.pool());
        System.out.println("FirstElement= "+Queue.get(0)+" Size Queue = "+Queue.size());
        System.out.println("----------");
        Queue.clear();
        System.out.println("Clear, size = " + Queue.size());
    }
}
