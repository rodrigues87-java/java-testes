package com.senac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    void getArea() throws Exception {
        Quadrado quadrado = new Quadrado(2,3);
        assertEquals(4,quadrado.getArea());
        System.out.println("dfsdfsadfsadf");
    }
}