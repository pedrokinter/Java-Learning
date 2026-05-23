package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.dominios.ex011;

import java.util.*;

public class Biblioteca {
    private Map<String, Livro> acervo = new HashMap<>();
    private LinkedHashMap<String, List<String>> historicoEmprestimo = new LinkedHashMap<>(); // chave -> usuario valor -> titulos ja emprestados
    private PriorityQueue<Livro> devolucoes = new PriorityQueue<>();

    public void adicionarLivro(Livro livro){
        if (livro == null){
            throw new IllegalArgumentException("livro nulo ou vazio");
        }

        acervo.put(livro.getIsbn(), livro);
    }

    public void emprestarLivro(String isbn, String usuario) {
        Livro livro = acervo.get(isbn);
        if (livro == null || !livro.isDisponivel()){
            throw new IllegalArgumentException("livro nulo ou vazio");
        } else {
            List<String >titulos = historicoEmprestimo.getOrDefault(usuario, new ArrayList<>());
            titulos.add(livro.getTitulo());
            historicoEmprestimo.put(usuario, titulos);
            livro.setDisponivel(false);
        }
    }

    public void devolverLivro(String isbn, String usuario) {
        Livro livro  = acervo.get(isbn);
        if (livro == null || livro.isDisponivel()){
            throw new IllegalArgumentException("livro nulo ou não está disponível para devolver");
        }
        historicoEmprestimo.get(usuario).add(livro.getTitulo() + " devolvido");
        livro.setDisponivel(true);
        devolucoes.offer(livro);
    }

    public List<Livro> listarDisponiveis() {
        List<Livro> livros = new ArrayList<>();
        for (Livro livro : acervo.values()) {
            if (livro.isDisponivel()) {
                livros.add(livro);
            }
        }
        livros.sort(Comparator.comparing(Livro::getTitulo));
        return livros;
    }

    public List<String> historicoUsuario(String usuarioBuscado) {
        if (historicoEmprestimo.containsKey(usuarioBuscado)) {
            return historicoEmprestimo.get(usuarioBuscado);
        } else {
            throw new IllegalArgumentException("Usuario nao existe");
        }
    }
}
