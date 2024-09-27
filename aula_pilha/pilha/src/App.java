import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // tipo stack(pilha), é uma string e se utiliza <>
        Stack <String> pilha_pratos = new Stack<>();

        // adicionando pratos
        pilha_pratos.push("Prato Laranja");
        pilha_pratos.push("Prato Azul");
        pilha_pratos.push("Prato Verde");
        pilha_pratos.push("Prato Vermelho");

        // tamanho da pilha
        int tam = pilha_pratos.size();
        System.out.println("O tamanho da pilha é: "+tam);

        // verificar o topo da pilha
        String topo = pilha_pratos.peek();
        System.out.println("O prato no topo é: " +topo);

        // removendo o que está no topo
        String rem = pilha_pratos.pop();
        System.out.println("O item removido foi: "+rem);

        topo = pilha_pratos.peek();
        System.out.println("O elemento que está no topo é: "+topo);

        System.out.println("");
        System.out.println("Utilizando conceito LIFO, ultimo a entrar, primeiro a sair");
        for(int i = pilha_pratos.size()-1;i>=0;i--){
            System.out.println(pilha_pratos.get(i));
        }
    }
}
