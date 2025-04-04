import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o código do Eletronico: ");
        String codigoEletro = scanner.nextLine();
        System.out.print("Digite a descrição do Eletrinico: ");
        String descricaoEletro = scanner.nextLine();
        System.out.print("Digite a marca do Eletronico: ");
        String marca = scanner.nextLine();
        System.out.print("Digite a voltagem do Eletrinico: ");
        int voltagem = scanner.nextInt();
        scanner.nextLine();

        Eletronico eletronico = new Eletronico(codigoEletro, descricaoEletro, marca, voltagem);

        System.out.print("Digite o código do Movel: ");
        String codigoMovel = scanner.nextLine();
        System.out.print("Digite a descrição do Movel: ");
        String descricaoMovel = scanner.nextLine();
        System.out.print("Digite o material do Movel: ");
        String material = scanner.nextLine();
        System.out.print("Digite o peso do Movel: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        Movel movel = new Movel(codigoMovel, descricaoMovel, material, peso);


        System.out.print("Digite o código da Roupa: ");
        String codigoRoupa = scanner.nextLine();
        System.out.print("Digite a descrição da Roupa: ");
        String descricaoRoupa = scanner.nextLine();
        System.out.print("Digite o tamanho da Roupa: ");
        String tamanho = scanner.nextLine();
        System.out.print("Digite a cor da Roupa: ");
        String cor = scanner.nextLine();
        Roupa roupa = new Roupa(codigoRoupa, descricaoRoupa, tamanho, cor);

        eletronico.exibirDetalhes();
        movel.exibirDetalhes();
        roupa.exibirDetalhes();
    }
}