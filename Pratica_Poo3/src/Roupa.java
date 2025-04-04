public class Roupa extends Item{
    private String tamanho, cor;
    public Roupa (String codigo, String descricao, String tamanho, String cor){
        super();
        this.tamanho = tamanho;
        this.cor = cor;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    void exibirDetalhes() {
        System.out.println(
                        "Código: " + codigo + "; " +
                        "descricao: " + descricao + "; " +
                        "tamanho: " + tamanho + "; " +
                        "cor: " + cor
        );
    }
}
