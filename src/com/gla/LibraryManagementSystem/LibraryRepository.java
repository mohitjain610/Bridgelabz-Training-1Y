package com.gla.LibraryManagementSystem;

import java.util.*;

class LibraryRepository<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }

}
