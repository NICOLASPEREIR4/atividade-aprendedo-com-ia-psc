import java.util.Scanner;

import validarCPF.ValidaCPF;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        // Validar CPF

        System.out.print("CPF: ");
        String CPF = scanner.nextLine();

        if (ValidaCPF.isCPF(CPF) == true){
            System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));  
        } else System.out.println("Erro: CPF inválido! \n");


        System.out.print("CEP: ");
        String cep = scanner.nextLine();
    
        System.out.print("Salário Bruto: ");
        String salarioB = scanner.nextLine();
        double salarioBruto = Double.parseDouble(salarioB);

        System.out.println("Desconto INSS: ");
        String descontoInss = scanner.nextLine();
        double descontoInssValue = Double.parseDouble(descontoInss);

        System.out.println("Número de Dependentes: ");
        String dependentes = scanner.nextLine();
        int numDependentes = Integer.parseInt(dependentes);

        System.out.println("Valor total de descontos cabíveis para dedução de IRRF: ");
        String totalDescontos = scanner.nextLine();
        double totalDescontosValue = Double.parseDouble(totalDescontos);



        // Calcular IRRF e retornar o valor do salário liquido

        if (salarioBruto <= 1412.00) {
            descontoInssValue = salarioBruto * 0.075;
        } else if (salarioBruto > 1412.01 && salarioBruto < 2666.68) {
            descontoInssValue = salarioBruto * 0.090;
        } else if (salarioBruto > 2666.68 && salarioBruto < 4000.03) {
            descontoInssValue = salarioBruto * 0.12;
        } else {
            descontoInssValue = salarioBruto * 0.14;
        }



        



        // Implementar a validação do CPF





        // Implementar a validação do CEP e retornar o endereço associado ao CEP





        // Exibir os dados fornecidos pelo usuário

        //System.out.println("Nome: " + nome);
        //System.out.println("CPF: " + cpf);
        //System.out.println("CEP: " + cep);
        //System.out.println("Salário Bruto: " + salarioBruto);
        //System.out.println("Desconto INSS: " + descontoInssValue);
        //System.out.println("Número de Dependentes: " + numDependentes);
        //System.out.println("Valor total de descontos cabíveis para dedução de IRRF: " + totalDescontosValue);
        


        scanner.close();
    }
}