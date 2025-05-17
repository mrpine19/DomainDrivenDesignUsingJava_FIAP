package Aula_16_05;

public class IngressoVip extends Ingresso{

    private float valorAdicional;

    public IngressoVip(float valor, float valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimirValor() {
        System.out.println("Valor: R$" + String.format("%.2f",(super.getValor() + this.valorAdicional)));
    }

    public float getValor() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
