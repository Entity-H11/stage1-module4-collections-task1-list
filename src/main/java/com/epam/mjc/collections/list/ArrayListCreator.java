package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> duplicatedWords = new ArrayList<>();
        IntStream.range(0, sourceList.size()).filter(index -> (index + 1)%3==0).forEach(indexDivisible ->{
            duplicatedWords.add(sourceList.get(indexDivisible));
            duplicatedWords.add(sourceList.get(indexDivisible));
        });
        return duplicatedWords;
    }
}
