package javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando do arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo...");
    }
}
