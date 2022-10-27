package com.iluwatar.query_object;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {
    @Test
    void appTest(){
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
