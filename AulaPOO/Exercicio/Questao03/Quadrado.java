package AulaPOO.Exercicio.Questao03;

public class Quadrado implements FormaGeometrica{

    private String cor;
    private String quantidadeDeLados;

    public Quadrado() {
    }

    public Quadrado(String cor, String quantidadeDeLados) {
        this.cor = cor;
        this.quantidadeDeLados = quantidadeDeLados;
    }

    @Override
    public String cor() {
        return cor;
    }

    @Override
    public String quantidadeDeLados() {
        return quantidadeDeLados;
    }

    @Override
    public double area(double a, double b) {
        return a * b;
    }
}
