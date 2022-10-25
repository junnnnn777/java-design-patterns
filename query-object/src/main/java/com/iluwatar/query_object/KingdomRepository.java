package com.iluwatar.query_object;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * A repository that stores the data retrieved from the simple database.
 * Data shall be queried through this class.
 *
 * @param <T> object type
 */

public class KingdomRepository<T> {

    public final Collection<T> dbKingdoms;

    public KingdomRepository(Collection<T> dbKingdoms) {
        this.dbKingdoms = dbKingdoms;
    }

    @SafeVarargs
    public final Collection<T> query(QueryObject<T>... criteria) {
        var initStream = dbKingdoms.stream();
        for (var criterion : criteria) {
            initStream = initStream.filter(criterion.query());
        }
        return initStream.collect(Collectors.toList());
    }
}
