package list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

;

public class AplicacaoList {
    public static void main(String args[] ) {

        System.out.println("java.util.arrayList e java.util.Vector");
        System.out.println("Garantem ordem de inserção.\n" +
                "Permitem leitura, atualização, adição e remoção sem regras adicionais.\n" +
                "Permite ordenação através de comparator.\n");

        //instanciando a lista
        List<String> names = new ArrayList<>();

        //Insert into na lista
        names.add("Rafael");
        names.add("Camila");
        names.add("Maria");
        names.add("Claudinha");
        names.add("Aurélio");
        names.add("Josefina");
        System.out.println(names);

        //update tabela set campo=novo_valor where index=valor; index começa na posição zero
        names.set(0,"De Luca");
        System.out.println(names);

        //ordenando de forma alfabética
        Collections.sort(names);
        System.out.println("Em ordem alfabética: " + names);
        names.set(4,"Larissa");
        System.out.println("Em ordem alfabética: " + names);

        //delete from tabela where campo=valor;
        //Pode informar a posição do objeto a ser removido ou o valor do objeto
        names.remove(2);
        System.out.println("Em ordem alfabética: " + names);
        names.remove("De Luca");
        System.out.println("Em ordem alfabética: " + names);

        //select campo from tabela where index=valor;
        //vai dar erro se informar um index que não existe na lista
        String name = names.get(1);
        System.out.println("Elemento na segunda posição: " + name);
        System.out.println("Números de elementos da lista: " + names.size());

        //Contains retorna um booleano dizendo se contém o elemento na lista
        //isEmpty(): verifica se está vazia
        System.out.println(names.contains("Fernandinha"));
        System.out.println(names.contains("Larissa"));
        System.out.println("Lista está vazia? " + names.isEmpty());
        System.out.println("Qual a posição do objeto Larissa na lista: "+ names.indexOf("Larissa"));
        System.out.println("Qual a posição do objeto Luciana na lista: "+ names.indexOf("Luciana"));

        // for each
        for (String apelido: names) {
            System.out.println("Nome: " + apelido);
        }

        //método iterator hasNext() retorna um booleno true sempre que existir um elemento na lista
        // método next() chama o próximo elemento
        Iterator<String> iterator = names.iterator();
        while( iterator.hasNext()) {
            System.out.println("Nome iterado: " + iterator.next());
        }



        //limpando a lista
        names.clear();
        System.out.println("Lista está vazia? " + names.isEmpty());



    }
}
