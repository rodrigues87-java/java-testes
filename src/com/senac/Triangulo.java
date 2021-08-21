package com.senac;

public class Triangulo{
    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

        if(this.base <=0 || this.altura <= 0){
            throw new RuntimeException("Não sao permitidos valores negativos");
        }
        calcularArea();
    }



    public void calcularArea(){
        this.area = this.altura * this.base / 2;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
