package com.thoughtworks.cathywu.common;

import com.google.common.collect.Maps;
import com.thoughtworks.cathywu.model.KeyItem;

import java.util.Map;

public class ItemPool {
    private Map<Class, ItemCollection> items = null;

    private static ItemPool pool = null;

    private ItemPool() {
        items = Maps.newHashMap();
    }

    public static ItemPool getPool() {
        if (pool == null) {
            pool = new ItemPool();
        }
        return pool;
    }

    public <T extends KeyItem> ItemCollection<T> getItems(Class cls) {
        return items.get(cls);
    }

    public void addCollection(Class cls, ItemCollection collection) {
        items.put(cls, collection);
    }
}
