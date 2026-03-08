package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios8.Automovel;
import pedro.ProjetoJava.javacore.Oexception.dominios8.Esportivo;
import pedro.ProjetoJava.javacore.Oexception.dominios8.Veiculo;
import pedro.ProjetoJava.javacore.Oexception.dominios8.interfaces.Abastecivel;
import pedro.ProjetoJava.javacore.Oexception.dominios8.ManutencaoException;
import pedro.ProjetoJava.javacore.Oexception.dominios8.interfaces.Manutivel;

public class exercicio08 {
    public static void main(String[] args) {
        Esportivo esportivo = new Esportivo("LAMBORGHINI", "Veneno", 2024);
        Automovel automovel = new Automovel("BMW", "320i", 2020);
        Veiculo[] veiculos = new Veiculo[]{esportivo, automovel};

        for (Veiculo veiculo : veiculos) {
            try {

                veiculo.ligar();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            if (veiculo instanceof Abastecivel abastecivel) {
                try {
                    abastecivel.abastecer();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (veiculo instanceof Manutivel manutivel){
                try {
                    manutivel.realizarManutencao();
                } catch (ManutencaoException e) {
                    System.out.println(e.getMessage());
                }
            }


        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Exceções de esportivo: ");
        try {
            esportivo.abastecer();
        } catch (Exception e) {
            System.out.println("erro espotivo " + e.getMessage());
        }

    }
}
