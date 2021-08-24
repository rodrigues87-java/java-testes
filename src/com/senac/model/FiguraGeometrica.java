package com.senac.model;

public class FiguraGeometrica {
    private double base;
    private double altura;
    private double area;

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
        verificarValores();
        calcularArea();
    }

    public void verificarValores() {
        if(this.getBase() <= 0 || this.getAltura() <=0){
            throw new RuntimeException("Altura ou base não podem ser iguais ou menores que 0");
        }
    }



    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcularArea(){
        this.area = this.altura * this.base;
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
}
