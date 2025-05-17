package Aula_16_05;

public class Ingresso implements InterfaceIngresso{

    private float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    @Override
    public void imprimirValor() {
        System.out.println("Valor: R$" + String.format("%.2f",this.valor));
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
