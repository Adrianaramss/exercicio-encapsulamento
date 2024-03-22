package Suprimentos;

public class Main {

        public static void main(String[] args) {
            Suprimentos suprimento = new Suprimentos(1, "Monitor 22", 1, 950.00);
            Suprimentos suprimento1 = new Suprimentos(2, "Mouse Vertical Ergonômico", 2, 110.00);

            System.out.println("Número do item: " + suprimento.getNumeroItem());
            System.out.println("Descrição do item: " + suprimento.getDescricaoItem());
            System.out.println("Quantidade: " + suprimento.getQuantidade());
            System.out.println("Preço unitário: " + suprimento.getPrecoUnitario());
            System.out.println("Valor da fatura: " + suprimento.getInvoiceAmount());
            System.out.println("=================================================");
            System.out.println("Número do item: " + suprimento1.getNumeroItem());
            System.out.println("Descrição do item: " + suprimento1.getDescricaoItem());
            System.out.println("Quantidade: " + suprimento1.getQuantidade());
            System.out.println("Preço unitário: " + suprimento1.getPrecoUnitario());
            System.out.println("Valor da fatura: " + suprimento1.getInvoiceAmount());
            System.out.println("=================================================");


        }

    }



