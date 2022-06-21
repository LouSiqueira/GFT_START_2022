package Concessionaria;

import java.util.Scanner;

public class Concessionaria {

    public static void main(String[] args) {

        double valor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do carro");
        valor = teclado.nextDouble();

        System.out.println("Preço Final - Número de Parcelas - Valor da Parcela");
        System.out.println("R$" + (valor*0.8) + "    -       A vista      - Parcela única");
        System.out.println("R$" + (valor*1.03) + "   -          6         - " + "R$" + (valor*1.03/6));
        System.out.println("R$" + (valor*1.06) + "   -         12         - " + "R$" + (valor*1.06/12));
        System.out.println("R$" + (valor*1.09) + "   -         18         - " + "R$" + (valor*1.09/18));

    }

}

