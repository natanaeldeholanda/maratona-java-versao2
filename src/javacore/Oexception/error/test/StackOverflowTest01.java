package javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }

    // StackOverflowError
    //Será executado infinitamente, pois a pilha de execução estourou
}
