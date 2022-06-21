package Vendas;

import java.util.Scanner;

public class Vendas {

    public static void main(String[] args) {

        double V= 0;
        double P= 0;
        double valorTotal= 0;
        int tipoCompra;
        double valorCompra;

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("Digite 1 para compra à Vista e 2 para compra a Prazo");
            tipoCompra = teclado.nextInt();
            System.out.println("Digite o valor da compra");
            valorCompra = teclado.nextDouble();
            valorTotal += valorCompra;
            if (tipoCompra == 1) {
                V += valorCompra;
            } else if (tipoCompra == 2) {
                P += valorCompra;
            }
        }
        System.out.println("O valor total foi de: R$" + valorTotal);
        System.out.println("O valor total a Vista foi de: R$" + V);
        System.out.println("O valor total a Prazo foi de: R$" + P);
    }
}
