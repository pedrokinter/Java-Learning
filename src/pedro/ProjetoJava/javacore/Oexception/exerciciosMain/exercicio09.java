package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios9.Cliente;
import pedro.ProjetoJava.javacore.Oexception.dominios9.ContaCorrente;
import pedro.ProjetoJava.javacore.Oexception.dominios9.ContaPoupanca;
import pedro.ProjetoJava.javacore.Oexception.dominios9.model.ContaAbstrata;
import pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions.CpfInvalidoException;
import pedro.ProjetoJava.javacore.Oexception.dominios9.model.TipoErro;
import pedro.ProjetoJava.javacore.Oexception.dominios9.exceptions.TransacaoException;
import pedro.ProjetoJava.javacore.Oexception.dominios9.repository.Banco;
import pedro.ProjetoJava.javacore.Oexception.dominios9.service.RelatorioService;

public class exercicio09 {
    public static void main(String[] args) throws CpfInvalidoException, TransacaoException {
        // eu lancei as duas exceções aqui para teste, sinto que se eu só lançar elas não preciso de varios try-catch
        // mas eu preferi fazer com try-catch só por questão de segurança, mesmo sabendo que não precisava.
        Banco bancoDeDados = new Banco();



        ContaPoupanca JoaoPoupanca = new ContaPoupanca(3000, "Ativo");
        ContaCorrente JoaoCorrente = new ContaCorrente(200, "Inativo");
        ContaPoupanca MariaPoupanca = new ContaPoupanca(5000, "Ativo");
        ContaCorrente MariaCorrente = new ContaCorrente(2000, "Ativo");

        JoaoPoupanca.aplicarRendimento(100);

        ContaAbstrata[] contasJoao = new ContaAbstrata[]{JoaoPoupanca, JoaoCorrente};
        ContaAbstrata[] contasMaria = new ContaAbstrata[]{MariaPoupanca, MariaCorrente};

        Cliente Joao = new Cliente("Joao", "443.564.789-89", contasJoao);
        Cliente Maria = new Cliente("Maria", "233.432.876-89", contasMaria);
        Cliente Gabriel = new Cliente("Gabriel", "324.666.311-89", contasMaria);
        bancoDeDados.adicionarCliente(Joao, 0);
        bancoDeDados.adicionarCliente(Maria, 1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Primeiramente, teste de exceções suprimidas e não suprimidas usando relatorio e uma conta" +
                " poupança!.");
        System.out.println();

        // essa demonstração serve tanto para corrente quanto para poupanca, apenas escolhi uma das duas para fazer para
        // não ficar duplicado o código, pois seguiria a mesma linha de raciocinio
        try (ContaPoupanca demonstracaoSupressed = new ContaPoupanca(100, "Ativo");
             RelatorioService relatorioDeServico = new RelatorioService()){

                demonstracaoSupressed.sacar(-1);
                relatorioDeServico.close();

        } catch (Exception e) {
            System.out.println();
            System.out.println("Teste de exceções!");
            System.out.println("Exceção Primária não-suprimida!: " + e.getMessage());
            System.out.println();
            System.out.println("Exceções Suprimidas! ");
            for (Throwable supressed : e.getSuppressed()) {
                System.out.println(supressed.getMessage());
            }
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Transações Variadas!!");
        ContaPoupanca contaTesteSemSaldo = new ContaPoupanca(0, "Ativo");
        ContaCorrente contaComSaldo = new ContaCorrente(2000, "Ativo");

        System.out.println("Saque sem saldo: ");
        try {
            contaTesteSemSaldo.sacar(10);
        } catch (TransacaoException e) {
            switch (e.getTipoErro()) {
                case SALDO_INSUFICIENTE -> TipoErro.setSaldoInsuficiente(1);
                case CONTA_INATIVA -> TipoErro.setContaInativa(1);
                case VALOR_NEGATIVO -> TipoErro.setValorNegativo(1);
            }
            System.out.println(e.getMessage());
        }

        System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-");
        System.out.println("Deposito sem saldo: ");
        try {
            contaTesteSemSaldo.depositar(100);
        } catch (TransacaoException e) {
            switch (e.getTipoErro()) {
                case SALDO_INSUFICIENTE -> TipoErro.setSaldoInsuficiente(1);
                case CONTA_INATIVA -> TipoErro.setContaInativa(1);
                case VALOR_NEGATIVO -> TipoErro.setValorNegativo(1);
            }
            System.out.println(e.getMessage());
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Saque negativo: ");
        try {
            contaComSaldo.sacar(-1);
        } catch (TransacaoException e) {
            switch (e.getTipoErro()) {
                case SALDO_INSUFICIENTE -> TipoErro.setSaldoInsuficiente(1);
                case CONTA_INATIVA -> TipoErro.setContaInativa(1);
                case VALOR_NEGATIVO -> TipoErro.setValorNegativo(1);
            }
            System.out.println(e.getMessage());
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Deposito negativo: ");
        try {
            contaComSaldo.depositar(-100);
        } catch (TransacaoException e) {
            switch (e.getTipoErro()) {
                case SALDO_INSUFICIENTE -> TipoErro.setSaldoInsuficiente(1);
                case CONTA_INATIVA -> TipoErro.setContaInativa(1);
                case VALOR_NEGATIVO -> TipoErro.setValorNegativo(1);
            }
            System.out.println(e.getMessage());
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Saque em conta inativa: ");
        try {
            JoaoCorrente.sacar(10);
        } catch (TransacaoException e) {
            switch (e.getTipoErro()) {
                case SALDO_INSUFICIENTE -> TipoErro.setSaldoInsuficiente(1);
                case CONTA_INATIVA -> TipoErro.setContaInativa(1);
                case VALOR_NEGATIVO -> TipoErro.setValorNegativo(1);
            }
            System.out.println(e.getMessage());
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Relatório final de erros de Valor_Negativo, Conta_Inativa ou Saldo_Insuficiente!: ");
        System.out.println("Valor negativo: " + TipoErro.getValorNegativo());
        System.out.println("Saldo Insuficiente: " + TipoErro.getSaldoInsuficiente());
        System.out.println("Conta Inativa: " + TipoErro.getContaInativa());
    }

}
