package modul9;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(6);
        myStack.push(27);
        myStack.push(12);
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("delete element = " + myStack.pool());
        for (int i = 0; i < myStack.size(); i++) {
            System.out.println(myStack.get(i));
        }
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.remove(2) = " + myStack.remove(2));
        myStack.clear();
        System.out.println("Clea size= " +myStack.size());
        for (int i = 0; i <=60; i++) {
            myStack.push(i);
        }
            System.out.println("myStack.peek() = " + myStack.peek());
            System.out.println("myStack.peek() = " + myStack.peek());

        }
    }

