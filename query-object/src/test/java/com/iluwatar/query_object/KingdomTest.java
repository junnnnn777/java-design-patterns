package com.iluwatar.query_object;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KingdomTest {
    @Test
    void kingdomTest(){
        Kingdom kingdom = new Kingdom("KingdomTest", new ArrayList<>());
        for (int i = 0; i < 4; i++) {
            kingdom.battalions.add(i, new Battalion(new ArrayList<>()));
        }
        assertEquals("KingdomTest",kingdom.kingdomName);
        assertEquals(4, kingdom.battalions.size());
    }
}
