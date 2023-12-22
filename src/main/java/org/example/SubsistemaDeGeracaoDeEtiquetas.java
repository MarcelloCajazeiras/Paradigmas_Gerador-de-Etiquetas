package org.example;

import java.util.Scanner;

public class SubsistemaDeGeracaoDeEtiquetas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        LabelGenerator labelGenerator = new LabelGenerator();


        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o valor da lata: ");
        double valorLata = scanner.nextDouble();

        System.out.print("Digite o valor da caixa: ");
        double valorCaixa = scanner.nextDouble();

        scanner.nextLine();


        ProductDescription productDescription = new ProductDescription(descricao, valorLata, valorCaixa);


        System.out.print("Digite o código de barras: ");
        String codigoBarras = scanner.nextLine();


        Barcode barcode = new Barcode(codigoBarras);


        String etiqueta = labelGenerator.generateLabel(productDescription, barcode);


        System.out.println(etiqueta);


        scanner.close();
    }
}