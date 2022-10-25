package com.iluwatar.query_object;


import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

/**
 * Query object representing the query's criterion: whether the sum of strength of all soldiers
 * serve in all battalions of this Kingdom is larger than a given number.
 */
@RequiredArgsConstructor
public class KingdomsWithTotalStrengthLargerThan implements QueryObject<Kingdom>{
    public final int totalStrength;

    @Override
    public Predicate<Kingdom> query() {
        return kingdom -> kingdom.battalions.stream().mapToInt(
                battalion -> battalion.soldiers.stream().mapToInt(
                        soldier -> soldier.strength
                ).sum()
        ).sum() > totalStrength;
    }
}
