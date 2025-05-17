package Aula_16_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Bilheteria {
    public static void main(String[] args) {

        Ingresso ingresso1 = new Ingresso(100);
        Ingresso ingresso2 = new Ingresso(100);
        Ingresso ingresso3 = new Ingresso(100);

        IngressoVip ingressoVip1 = new IngressoVip(100, 50);
        IngressoVip ingressoVip2 = new IngressoVip(100, 70);

        Ingresso[] lista = {ingresso1, ingresso2, ingresso3, ingressoVip1, ingressoVip2};

        float soma = 0;
        for (int i = 0; i < lista.length; i++){
            lista[i].imprimirValor();
        }
    }
}