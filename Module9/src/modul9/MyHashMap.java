package modul9;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private Node[] bucket;
    private int size;
   private int capacity=8;
    MyHashMap() {
       bucket = new Node[capacity];
    }


    static class Node<K, V> {
        K key;
        V value;
        Node next;


        Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }


        @Override
        public String toString() {
            return "node - {" +
                    "key = " + key +
                    ", value = " + value + '}';
        }
    }

    public void put(K key, V value) {
        addItems(key, value);
        if (size >= bucket.length) {
            resizeMap();
        }
        size++;
    }

    public void addItems(K key, V value) {
        Node<K,V>newNode=new Node<>(key, value);
        int hashIndex = Math.abs(key.hashCode()) % capacity;
        if (bucket[hashIndex]==null){
            bucket[hashIndex]= newNode;
        }else{
            Node<K,V>prev=null;
            Node<K,V>current = bucket[hashIndex];
            while (current!=null){
                if (current.key.equals(key)){
                    current.value=value;
                    return;
                }
                prev=current;
                current=current.next;
                if (prev!=null){
                    prev.next=newNode;
                }
            }
        }

    }

    public void resizeMap() {
        capacity *= 2;
        Node<K, V>[] oldBucket = Arrays.copyOf(bucket, bucket.length);
        bucket = new Node[capacity];
        for (Node<K, V> node : oldBucket) {
            while (node != null) {
                addItems(node.key, node.value);
                node=node.next;
            }
        }
    }

    public V get(K key) {
        Node getting = bucket[key.hashCode() % size];
        if (getting == null) {
            return null;
        }
        if (getting.key.equals(key)) {
            return (V) getting.value;
        } else {
            if (getting.next == null) {
                return null;
            }
        }
        return (V) key;
    }

    public Object remove(K key) {
        Node removingNode = bucket[key.hashCode() % size];
        if (removingNode == null) {
            return null;
        }
        if (removingNode.key.equals(key)) {
            bucket[key.hashCode() % size] = removingNode.next;
            size--;
            return removingNode.value;
        }
        if (removingNode.next == null) {
            return null;
        }
        if (removingNode.next.key.equals(key)) {
            Object returningNodeValue = removingNode.next.value;
            removingNode.next = removingNode.next.next;
            removingNode.next.next = null;
            return returningNodeValue;
        }
        return key;
    }

    public int size() {

        return size;
    }

    public void clear() {
        size = 0;
        bucket = new Node[size];
    }

    @Override
    public String toString() {
        return "MyHashMap " + Arrays.toString(bucket);
    }
}



