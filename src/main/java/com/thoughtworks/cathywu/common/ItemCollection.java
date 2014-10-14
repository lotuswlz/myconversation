package com.thoughtworks.cathywu.common;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thoughtworks.cathywu.model.KeyItem;

import java.util.List;
import java.util.Map;

/**
 * Created by lzwu on 10/14/14.
 */
public class ItemCollection<T extends KeyItem> {

    private Map<String, T> itemMap = null;

    public ItemCollection() {
        itemMap = Maps.newHashMap();
    }

    public void addItem(T item) {
        itemMap.put(item.getName(), item);
    }

    public T getItem(String key) {
        return itemMap.get(key);
    }

    public List<T> getAllItems() {
        return Lists.newArrayList(itemMap.values());
    }

}
