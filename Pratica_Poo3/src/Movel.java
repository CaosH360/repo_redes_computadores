public class Movel extends Item{
    private String material;
    private double peso;

    public Movel (String codigo, String descricao, String material, double peso){
        super();
        this.material = material;
        this.peso = peso;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    void exibirDetalhes() {
        System.out.println(
                        "Código: " + codigo + "; " +
                        "descricao: " + descricao + "; " +
                        "material: " + material + "; " +
                        "peso: " + peso
        );
    }
}
