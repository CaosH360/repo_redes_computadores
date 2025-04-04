public abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double vencimento();

    public String getNome() {
        return nome;
    }

    public double getVencimento() {
        return vencimento();
    }
}