package org.example;

import junit.framework.TestCase;

public class RectangularTriangleTest extends TestCase {
    public RectangularTriangle rectangularTriangle = new RectangularTriangle(3,4);
    public void testGetHypotenuseC() {
        assertEquals(5,rectangularTriangle.getHypotenuseC(),0);
    }

    public void testGetRectangularTriangleArea() {
        assertEquals(6,rectangularTriangle.getRectangularTriangleArea(),0);
    }

    public void testIsIsosceles() {
        assertEquals(false,rectangularTriangle.isIsosceles());
    }

    public void testGetPerimeter() {
        assertEquals(12,rectangularTriangle.getPerimeter(),0);
    }

    public void testGetSinAlpha() {
        assertEquals(0.6,rectangularTriangle.getSinAlpha(),0.6);
    }
}