package Desafio_Categoria_Nadador;

import java.util.Scanner;

public class Categoria_nadador {

    public static void main(String[] args) {

        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade do nadador");
        idade = teclado.nextInt();

        if (idade >=5 && idade<=7) {
            System.out.println("Categoria Infantil A");
        } else if (idade >=8 && idade<=10) {
            System.out.println("Categoria Infantil B");
        } else if (idade >=11 && idade<=13) {
            System.out.println("Categoria Juvenil A");
        } else if (idade >=14 && idade<=17) {
            System.out.println("Categoria Juvenil B");
        } else if (idade >=18) {
            System.out.println("Categoria Adulto");
        }

    }

}
