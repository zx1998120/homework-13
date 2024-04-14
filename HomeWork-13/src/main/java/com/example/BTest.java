package com.example;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;

public class BTest {
    @Test
    public void testG1() {
        A mockedA = Mockito.mock(A.class);
        Mockito.when(mockedA.f8(1)).thenReturn(9); // Assuming f8() returns x + 8
        B b = new B(mockedA);
        assertEquals(9, b.g1(1));
    }
}
