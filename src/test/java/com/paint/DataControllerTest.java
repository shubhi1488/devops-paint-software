package com.paint;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataControllerTest {

    @Test
    void testSaveLoad() {
        DataController dc = new DataController();

        assertDoesNotThrow(dc::saveData);
        assertDoesNotThrow(dc::loadData);
    }
    @Test
    void testDataControllerFail() {
        DataController dc = new DataController();

        // expecting null (wrong assumption)
        assertNull(dc);
    }
}