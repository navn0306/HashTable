package com.bridge.hashtable;

public class LinkedList<K> {
    public INode<K> head;
    public INode tail;

    public INode<K> search(K key) {
        INode tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void append(INode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }
}