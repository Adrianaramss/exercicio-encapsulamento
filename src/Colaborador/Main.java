package Colaborador;

public class Main {
        public static void main(String[] args) {
            Colaborador colaborador1 = new Colaborador("Sebastiana", "Ramos", 2000.0);
            Colaborador colaborador2 = new Colaborador("Endi", "Souza", 1000.0);

            System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
            System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());
            colaborador1.aplicarAumentoSalario(10);
            colaborador2.aplicarAumentoSalario(10);
            System.out.println("Salário anual atualizado de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + ": " + colaborador1.calcularSalarioAnual());
            System.out.println("Salário anual atualizado de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + ": " + colaborador2.calcularSalarioAnual());
        }
    }
