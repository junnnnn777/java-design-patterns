package com.iluwatar.query_object;

import java.util.function.Predicate;

/**
 * The interface of Query Object.
 * @param <T> Object Type
 */
public interface QueryObject<T> {
    Predicate<T> query();
}
