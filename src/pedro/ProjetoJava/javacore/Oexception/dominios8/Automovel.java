package pedro.ProjetoJava.javacore.Oexception.dominios8;

import pedro.ProjetoJava.javacore.Oexception.dominios8.interfaces.Manutivel;

public class Automovel extends Veiculo implements Manutivel {
    public Automovel(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void realizarManutencao() throws ManutencaoException {
        System.out.println("Manutencao do automovel realizada com sucesso");
        throw new ManutencaoException("erro ao realizar manutencao automovel");
    }

    @Override
    public void ligar() throws RuntimeException {
        System.out.println("ligando automovel!!");
        throw new RuntimeException("Erro ao ligar automovel!");
    }
}
