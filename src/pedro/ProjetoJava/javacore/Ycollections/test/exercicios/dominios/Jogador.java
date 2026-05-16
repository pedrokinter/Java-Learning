package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios;

public class Jogador  implements Comparable<Jogador>{
    private String apelido;
    private int pontuacao;

    public Jogador(String apelido, int pontuacao) {
        this.apelido = apelido;
        this.pontuacao = pontuacao;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "apelido='" + apelido + '\'' +
                ", pontuacao=" + pontuacao +
                '}';
    }

    @Override
    public int compareTo(Jogador o) {
        if (this.pontuacao < 0 || o.getPontuacao() < 0)  {
            throw new IllegalArgumentException("PONTUAÇÃO NEGATIVA!!!");
        }
        return Integer.compare(o.pontuacao, this.pontuacao);
    }
}
