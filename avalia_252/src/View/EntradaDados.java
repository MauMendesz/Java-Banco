package View;

import Model.Imovel;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        System.out.println("****************************** BANCO DE DADOS ******************************");
        Scanner ler = new Scanner(System.in);
        Imovel dados = new Imovel();
        System.out.println("Digite tipo do imóvel: ");
        dados.setTipo(ler.nextLine());
        System.out.println("Digite categoria imóvel: ");
        dados.setCate(ler.nextLine());
        System.out.println("Digite metragem do imóvel: ");
        dados.setMet(ler.nextDouble());
        Imovel.EnviarDados(dados);
    }
}
