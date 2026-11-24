import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Criando o ArrayList de Strings chamado "fila"
        ArrayList<String> fila = new ArrayList<>();

        // 2. Populando a lista com 5 nomes na ordem de chegada
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");
        fila.add("Daniela");
        fila.add("Eduardo");

       // 3. Um aluno desistiu e foi embora. Remova-o informando o nome.
        String alunoDesistente = "Carlos";
        boolean foiRemovido = fila.remove(alunoDesistente);

        if (foiRemovido) {
            System.out.println(alunoDesistente + " desistiu e saiu da fila.");
        } else {
            System.out.println(alunoDesistente + " não estava na fila.");
        }

        System.out.println("Fila final: " + fila);
    }
}