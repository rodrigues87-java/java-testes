package com.senac;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void somar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(1,2);
        assertEquals(3,resultado);

        int resultadoSub = calculadora.somar(-1,2);
        assertEquals(1,resultadoSub);
        System.out.println("somar");



    }




    @BeforeEach
    void setUp() {
        System.out.println("setUP");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");

    }
}