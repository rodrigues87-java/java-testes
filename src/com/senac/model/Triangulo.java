package com.senac.model;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(double base, double altura) {
        super(base, altura);
        verificarValores();
        calcularArea(base,altura);
    }



    public void calcularArea(double base, double altura){
        super.setArea(base*altura/2);
    }
}
