package pedro.ProjetoJava.javacore.Oexception.dominios8;

import pedro.ProjetoJava.javacore.Oexception.dominios8.interfaces.Abastecivel;

public class Esportivo extends Automovel implements Abastecivel {
    public Esportivo(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void realizarManutencao() throws ManutencaoException {
        // se eu tentar colocar throws exception aqui o código nem roda
        System.out.println("Fazendo manutencao...");
        throw new ManutencaoException("Erro na manutencao esportivo!!");
        // isso aqui é invalido, ele sempre tem que passar a exceção listada, não pode alterar (principalmente pra uma
        // mais genérica)
    }

    @Override
    public void abastecer() throws Exception {
        System.out.println("Abastecendo!!");
        throw new Exception("Erro ao abastecer esportivo");

    }

    @Override
    public void ligar() {
        // runtimeexception é unchecked, então é permitido na sobrescrita
        // mesmo que veiculo declare exception que é mais ampla

        System.out.println("ligando esportivo!...");
        throw new RuntimeException("Erro ao ligar esportivo");
    }
}
