package org.example;

public class LabelGenerator {

    public String generateLabel(ProductDescription productDescription, Barcode barcode) {

        String descricaoFormatada = "Produto --> " + (productDescription.getDescricao().length() > 22 ?
                productDescription.getDescricao().substring(0, 22) + "..." :
                productDescription.getDescricao());


        String valorLataFormatado = String.format("Lata --> R$ %.2f", productDescription.getValorLata());


        String valorCaixaFormatado = String.format("Caixa --> R$ %.2f", productDescription.getValorCaixa());


        String mensagemFinal = "Obrigado pela Compra";


        String etiqueta = String.format("""
                ^XA
                ^CF0,60
                ^FO50,50^FD%s^FS
                ^FO50,120^FD%s^FS
                ^FO50,190^FD%s^FS
                ^FO100,350^FD%s^FS
                ^BY5,2,270
                ^FO100,400^BC^FD%s^FS
                ^XZ
                """,
                descricaoFormatada,
                valorLataFormatado,
                valorCaixaFormatado,
                mensagemFinal,
                barcode.getCodigoBarras());

        return etiqueta;
    }
}


