package com.bridge.hashtable;

import java.util.ArrayList;

public class HashMapParagraph<K> {
    private int numOfBucket;
    ArrayList<LinkedList<K>> myBucketArray;

    public void HashMapParanoid() {
        this.numOfBucket = 10;
        this.myBucketArray = new ArrayList<>(numOfBucket);
        for (int i = 0; i < numOfBucket; i++) {
            this.myBucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numOfBucket;
        return index;
    }

    public <V> V get(K key) {
        int index = this.getBucketIndex(key);  //2
        LinkedList<K> linkedList = this.myBucketArray.get(index);
        if (linkedList == null) {
            return null;
        }
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public <V> void add(K key, V value) {
        int index = this.getBucketIndex(key);
        LinkedList<K> linkedList = this.myBucketArray.get(index);  // 2
        if (linkedList == null)
            linkedList = new LinkedList<>();
        this.myBucketArray.set(index, linkedList);   // 2 -
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MyMapNode<>(key, value);
            linkedList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }
}