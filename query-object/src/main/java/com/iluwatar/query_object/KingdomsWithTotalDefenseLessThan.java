package com.iluwatar.query_object;

import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

/**
 * Query object representing the query's criterion: whether the sum of defense of all soldiers
 * serve in all battalions of this Kingdom is less than a given number.
 */
@RequiredArgsConstructor
public class KingdomsWithTotalDefenseLessThan implements QueryObject<Kingdom>{
    public final int totalDefense;
    @Override
    public Predicate<Kingdom> query() {
        return kingdom -> kingdom.battalions.stream().mapToInt(
                battalion -> battalion.soldiers.stream().mapToInt(
                        soldier -> soldier.defence
                ).sum()
        ).sum() < totalDefense;
    }
}
