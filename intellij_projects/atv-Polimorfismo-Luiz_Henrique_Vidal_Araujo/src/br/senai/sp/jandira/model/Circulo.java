package br.senai.sp.jandira.model;

public class Circulo extends FormaGeometrica{
    public double raio, pi = 3.1416, diametro = raio*2;

    public void calcularArea(){
        super.calcularArea();
        area = pi*Math.pow(raio,2);
    }
    public void calcularPerimetro(){
        super.calcularPerimetro();
        perimetro = 2*pi*raio;
    }
}
