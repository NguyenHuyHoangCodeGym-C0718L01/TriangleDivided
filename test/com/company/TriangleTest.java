package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void checkTriangleType() {
        String expected = "Equilateral Triangle";

        Triangle triangle = new Triangle(2,2,2);

        String result = triangle.checkTriangleType();

        assertEquals(expected, result);
    }

    @Test
    void checkTriangleType2(){
        String expected = "Isosceles Triangle";

        Triangle triangle = new Triangle(2,2,3);

        String result = triangle.checkTriangleType();

        assertEquals(expected, result);
    }

    @Test
    void checkTriangleType3(){
        String expected = "Normal Triangle";

        Triangle triangle = new Triangle(3,4,5);

        String result = triangle.checkTriangleType();

        assertEquals(expected, result);
    }

    @Test
    void checkTriangleType4(){
        String expected = "Not a triangle!";

        Triangle triangle = new Triangle(8,2,3);

        String result = triangle.checkTriangleType();

        assertEquals(expected, result);
    }

    @Test
    void checkTriangleType5(){
        String expected = "Not a triangle!";

        Triangle triangle = new Triangle(-1,2,1);

        String result = triangle.checkTriangleType();

        assertEquals(expected, result);
    }

    @Test
    void checkTriangleType6(){
        String expected = "Not a triangle!";

        Triangle triangle = new Triangle(0,1,1);

        String result = triangle.checkTriangleType();

        assertEquals(expected, result);
    }
}