package ru.spb.herzen.ivt3;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    App app;

    public void setUp() {
        app = new App();
    }

    public void testSum()
    {
        assertEquals(app.sum(1, -1), 0);
        assertEquals(app.sum(2, -4), -2);
        assertEquals(app.sum(1, 0), 1);

        assertEquals(app.sum("test1", "test2"), "test");
    }

    public void testMultiply()
    {
        assertEquals(app.multiply(0, 1), 0);

        assertEquals(app.multiply(2, 2), 4);
        assertEquals(app.multiply(-2, -2), 4);
        assertEquals(app.multiply(5, -5), -25);

        assertEquals(app.multiply(10, 0.1f), 1.0f, 0.001);
        assertEquals(app.multiply(0.1f, 10), 1.0f, 0.001);

        assertEquals(app.multiply(2.02f, 2f), 4.04f, 0.001);
        assertEquals(app.multiply(3f, -2.2f), -6.6f, 0.001);
        assertEquals(app.multiply(-1f, -2.2f), 2.2f, 0.001);
    }

    public void testFunction()
    {
        assertEquals(app.function(1), -14, 0.001);
        assertEquals(app.function(10), -140, 0.001);
        assertEquals(app.function(-1), 14, 0.001);

    }
}


