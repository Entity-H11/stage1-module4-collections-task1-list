package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> oddOrEvenList = new LinkedList<>();
        sourceList.forEach(elem -> {
            if (elem % 2 == 0) {
                oddOrEvenList.addLast(elem);
            } else {
                oddOrEvenList.addFirst(elem);
            }
        });
        return oddOrEvenList;
    }
}
