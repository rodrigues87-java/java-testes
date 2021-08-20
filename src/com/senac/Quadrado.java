package com.senac;

public class Quadrado {
    private double base;
    private double altura;
    private double area;

    public Quadrado(double base, double altura) throws Exception {

        this.base = base;
        this.altura = altura;

        if(this.base != this.altura){
            throw new Exception("Base e altura não sao iguais");
        }

        this.getArea();
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

    public double getArea() throws Exception {
        if(this.base <= 0){
            throw new Exception("base 0 ou negativa");
        }
        if(this.altura <= 0 ){
            throw new Exception("altura 0 ou negativa");

        }
        this.area = this.altura * this.base;
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
