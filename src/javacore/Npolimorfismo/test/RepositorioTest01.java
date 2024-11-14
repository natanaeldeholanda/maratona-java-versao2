package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.repository.Repositorio;
import javacore.Npolimorfismo.service.RepositorioArquivo;
import javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import javacore.Npolimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorioBancoDeDados = new RepositorioBancoDeDados();
        Repositorio repositorioArquivo = new RepositorioArquivo();
        Repositorio repositorioMemoria = new RepositorioMemoria();
        repositorioBancoDeDados.salvar();
        repositorioArquivo.salvar();
        repositorioMemoria.salvar();
        System.out.println("---***---");
        List<String> lista = new LinkedList<>();
        lista.add("Rei do Java");
        lista.add("Natanael");
        lista.add("Holanda");
        System.out.println(lista);
    }
}
