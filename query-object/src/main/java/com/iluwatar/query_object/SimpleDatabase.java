package com.iluwatar.query_object;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Collection;

/**
 * To simplify the process, we use this class to represent a database.
 * @param <T> Object Type
 */

@RequiredArgsConstructor
public class SimpleDatabase<T> {
    public final Collection<T> entities;

    public static SimpleDatabase<Kingdom> initializeDataset() {
        Soldier soldier11 = new Soldier(10,20);
        Soldier soldier12 = new Soldier(10,30);
        Soldier soldier13 = new Soldier(20,10);
        Soldier soldier14 = new Soldier(20,40);

        Soldier soldier21 = new Soldier(30,40);
        Soldier soldier22 = new Soldier(10,20);
        Soldier soldier23 = new Soldier(20,20);
        Soldier soldier24 = new Soldier(10,20);

        Battalion battalion11 = new Battalion(Arrays.asList(soldier11,soldier12));
        Battalion battalion12 = new Battalion(Arrays.asList(soldier13,soldier14));
        Battalion battalion21 = new Battalion(Arrays.asList(soldier21,soldier22));
        Battalion battalion22 = new Battalion(Arrays.asList(soldier23,soldier24));

        Kingdom kingdom1 = new Kingdom("Uproba Dynasty",Arrays.asList(battalion11,battalion12));
        Kingdom kingdom2 = new Kingdom("Hutribet Kingdom",Arrays.asList(battalion21,battalion22));

        return new SimpleDatabase<>(Arrays.asList(kingdom1,kingdom2));
    }
}
