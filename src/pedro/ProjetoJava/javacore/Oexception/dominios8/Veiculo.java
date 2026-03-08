package pedro.ProjetoJava.javacore.Oexception.dominios8;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() throws Exception{}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null) {
            return;
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null) {
            return;
        }
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 0) {
            return;
        }
        this.ano = ano;
    }
}
