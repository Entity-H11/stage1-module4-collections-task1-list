package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator()::compare);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result = Integer.compare(equation(a), equation(b));
        if (result == 0) {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        }
        return result;
    }

    private int equation(String x) {
        return 5 * ((int) Math.pow(Integer.parseInt(x), 2)) + 3;
    }
}
