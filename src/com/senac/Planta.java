package com.senac;

public class Planta {
    private double base;
    private double altura;

    private Triangulo triangulo;
    private Quadrado quadrado;

    public Planta(double base, double altura) throws Exception {
        this.base = base;
        this.altura = altura;
        gerarPlanta();
    }

    public void gerarPlanta() throws Exception {
        this.triangulo = new Triangulo(this.base, this.altura);
        this.quadrado = new Quadrado(this.base, this.altura);

    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public Quadrado getQuadrado() {
        return quadrado;
    }

    public void setQuadrado(Quadrado quadrado) {
        this.quadrado = quadrado;
    }
}
