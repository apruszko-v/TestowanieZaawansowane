package pl.coderslab.test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxValueTest {

    @Test
    void getMaxValue() {
        int[] list = {1, 2, 3, 4};

        int result = MaxValue.getMaxValue(list);

        assertEquals(4, result);

    }
    @Test
    public void testGetMaxValue_negativeValues() {

        int[] list = {-5, -10, -3, -7};

        int result = MaxValue.getMaxValue(list);

        assertEquals(-3, result);
    }

}