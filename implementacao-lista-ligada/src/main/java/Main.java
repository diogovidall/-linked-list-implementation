public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        // Testando inserção
        lista.insereNode(5);
        lista.insereNode(10);
        lista.insereNode(15);

        // Exibindo valores
        System.out.println("==> Valores na lista <==");
        lista.exibe();

        // Testando buscaNode e removeNode
        Node encontrado = lista.buscaNode(10);
        if (encontrado != null) {
            System.out.println("\nValor encontrado: " + encontrado.getInfo());
        } else {
            System.out.println("\nValor não encontrado.\n");
        }

        System.out.println("\nRemovendo o valor 10: " + lista.removeNode(10));
        System.out.println("Valores após remoção:");
        lista.exibe();

        // Testando o método getTamanho
        System.out.println("\nTamanho da lista: " + lista.getTamanho());
    }
}
