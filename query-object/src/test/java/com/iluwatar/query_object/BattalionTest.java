package com.iluwatar.query_object;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattalionTest {
    @Test
    void testAdd(){
        Battalion battalion = new Battalion(new ArrayList<>());
        for (int i = 0; i < 4; i++) {
            battalion.soldiers.add(new Soldier(i,i));
        }
        for (int i = 0; i < 4; i++) {
            assertEquals(i,battalion.soldiers.get(i).defence);
            assertEquals(i,battalion.soldiers.get(i).strength);
        }
        assertEquals (4, battalion.soldiers.size());
    }
}
