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

    public INode<K> delete(K key) {
        INode tempNode = head;
        if (tempNode == null) {
            return null;
        }
        while (tempNode.getNext() != null) {
            if (tempNode.getNext().getKey().equals(key)) {
                INode value = tempNode.getNext().getNext();
                tempNode.setNext(value);
            }
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }
}