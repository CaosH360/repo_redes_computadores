import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Funcionário CLT
            System.out.print("Digite o nome do funcionário CLT: ");
            String nomeCLT = scanner.nextLine();
            System.out.print("Digite o CPF do funcionário: ");
            String cpfCLT = scanner.nextLine();
            CLT clt = new CLT(nomeCLT, cpfCLT);

            System.out.print("Digite o salário mensal do CLT: ");
            clt.setSalarioMensal(scanner.nextDouble());
            scanner.nextLine(); // Consumir a quebra de linha

            // Funcionário Horista
            System.out.print("Digite o nome do funcionário Horista: ");
            String nomeHorista = scanner.nextLine();
            System.out.print("Digite o CPF do funcionário: ");
            String cpfHorista = scanner.nextLine();
            Horista horista = new Horista(nomeHorista, cpfHorista);

            System.out.print("Digite o salário por hora: ");
            horista.setSalarioPorHora(scanner.nextDouble());
            System.out.print("Digite as horas trabalhadas: ");
            horista.setHorasTrabalhadas(scanner.nextInt());
            scanner.nextLine(); // Consumir a quebra de linha

            // Funcionário Comissionado
            System.out.print("Digite o nome do funcionário Comissionado: ");
            String nomeComissionado = scanner.nextLine();
            System.out.print("Digite o CPF do funcionário: ");
            String cpfComissionado = scanner.nextLine();
            Comissionado comissionado = new Comissionado(nomeComissionado, cpfComissionado);

            System.out.print("Digite o total de vendas: ");
            comissionado.setTotalVendas(scanner.nextDouble());
            System.out.print("Digite a porcentagem de comissão: ");
            comissionado.setPercentualComissao(scanner.nextDouble());
            scanner.nextLine(); // Consumir a quebra de linha

            // Exibir vencimentos
            System.out.println("\nVencimentos dos funcionários:");
            System.out.println("CLT: " + clt.getNome() + " - R$ " + clt.vencimento());
            System.out.println("Horista: " + horista.getNome() + " - R$ " + horista.vencimento());
            System.out.println("Comissionado: " + comissionado.getNome() + " - R$ " + comissionado.vencimento());

            scanner.close();
        }
    }
