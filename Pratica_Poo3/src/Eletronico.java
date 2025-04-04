public class Eletronico extends Item{
    private String marca;
    private int voltagem;

    public Eletronico (String codigo, String descricao, String marca, int voltagem){
            super();
            this.marca = marca;
            this.voltagem = voltagem;
            this.codigo = codigo;
            this.descricao = descricao;
    }

    @Override
    void exibirDetalhes() {
    System.out.println(
            "Código: " + codigo + "; " +
            "marca: " + marca + "; " +
            "descricao: " + descricao + "; " +
            "voltagem: " + voltagem
    );
    }
}
