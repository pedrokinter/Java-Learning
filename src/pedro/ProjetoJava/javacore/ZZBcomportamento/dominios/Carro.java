package pedro.ProjetoJava.javacore.ZZBcomportamento.dominios;

public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }
}


