public class Comissionado extends Funcionario {
    private double totalVendas;
    private double percentualComissao;

    public Comissionado(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double vencimento() {
        return totalVendas * (percentualComissao / 100);
    }
}