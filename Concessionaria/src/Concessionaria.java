public class Concessionaria {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro("Toyota", "Corolla", 2022);
        Carro meuCarro2 = new Carro("Toyota", "Supra", 1993);
        Carro meuCarro3 = new Carro("Honda", "Civic", 2025);


        meuCarro1.acelerar();
        meuCarro1.acelerar();
        meuCarro1.acelerar();

        meuCarro1.frear();
        meuCarro1.frear();

        meuCarro1.exibirInfo();

        meuCarro2.acelerar();
        meuCarro2.acelerar();
        meuCarro2.acelerar();

        meuCarro2.frear();
        meuCarro2.frear();

        meuCarro2.exibirInfo();

        meuCarro3.acelerar();
        meuCarro3.acelerar();
        meuCarro3.acelerar();

        meuCarro3.frear();
        meuCarro3.frear();

        meuCarro3.exibirInfo();
    }
}
