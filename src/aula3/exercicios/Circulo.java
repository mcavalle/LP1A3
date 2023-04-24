package aula3.exercicios;

public class Circulo {
    private double raio;

    public Circulo(double raio){
        setRaio(raio);
    }

    public double calcularArea(){
        return 3.14 * raio * raio;
    }

    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }

    public void setRaio(double raio){
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser maior que zero");
        }

        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }
}
