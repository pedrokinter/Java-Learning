package pedro.ProjetoJava.javacore.Ycollections.test.exercicios.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exercicios.dominios.Cliente;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex002 {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Maria", LocalTime.of(17, 0)));
        clientes.add(new Cliente("Pedro", LocalTime.of(11, 0, 5)));
        clientes.add(new Cliente("Gabriel", LocalTime.of(8, 0)));
        clientes.add(new Cliente("Joao", LocalTime.of(11, 0, 10)));
        clientes.add(new Cliente("Mateus", LocalTime.now()));

        Collections.sort(clientes);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
