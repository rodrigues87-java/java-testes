package com.senac.model;

public class Planta extends FiguraGeometrica{

    private Triangulo triangulo;
    private Quadrado quadrado;

    public Planta(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void verificarValores() {
        super.verificarValores();
        if(super.getAltura() != super.getBase()){
            throw new RuntimeException("Base não pode ser diferete da altura");
        }
    }
}
