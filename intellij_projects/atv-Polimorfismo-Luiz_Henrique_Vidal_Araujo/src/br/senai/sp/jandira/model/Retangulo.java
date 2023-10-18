package br.senai.sp.jandira.model;

public class Retangulo extends FormaGeometrica{
    public double altura, largura;
    public void calcularArea(){
        super.calcularArea();
        area = (altura*largura);
    }

    @Override
    public void calcularPerimetro() {
        super.calcularPerimetro();
        perimetro = altura+altura+largura+largura;
    }
}
