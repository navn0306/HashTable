package com.bridge.hashtable;

public class MyHashMap<K, V> {
    LinkedList<K> linkedList;

    public MyHashMap() {
        this.linkedList = new LinkedList<>();
    }

    public V get(K key) {
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.linkedList.search(key);
        if (mapNode == null)
            return null;
        return mapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MyMapNode<>(key, value);
            this.linkedList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    public V remove(K key) {
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.linkedList.delete(key);
        if (mapNode == null) {
            System.out.println("Word is not present phrase");
        }
        return mapNode.getValue();
    }
}