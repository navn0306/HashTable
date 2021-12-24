package com.bridge.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class HashTable {
    @Test
    public void givenSentence_WhenStringIsGiven_ShouldReturnWordFrequency() {
        String sentence = "To to be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        MyHashMap<String, Integer> hashMap = new MyHashMap();
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.add(word, value);
        }
        Integer frequency = hashMap.get("to");
        Integer expectedValue = 3;
        Assert.assertEquals(expectedValue, frequency);
    }
}