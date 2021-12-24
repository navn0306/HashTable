package com.bridge.hashtable;

public class MyMapNode<K, V> implements INode {

    K key;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(Object key) {
        this.key = (K) key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<K, V>) next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
