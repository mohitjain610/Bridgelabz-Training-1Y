package com.gla.generic;

import java.util.List;

public class Q7 {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }
}
