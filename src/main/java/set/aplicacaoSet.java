package set;

public class aplicacaoSet
{
    public static void main(String [] args) {

        System.out.println("Exemplos de implementações set:" +
                "\njava.utilHashSet" +
                "\njava.utilTreeSet" +
                "\njava.utilLinkedHashSet" +
                "\nCaracterísticas" +
                "\n1- Por padrão, não garatem ordem;" +
                "\n2- Não permite itens repetidos;" +
                "\n3- Permite adição e remoção. Não possui busca por item ou update;" +
                "\n4- Não permite mudança de ordenação.");

        System.out.println("\n---HashSet---" +
                "\nUtilizar: quando não precisa manter a ordem." +
                "\nOrdenação: não ordenado e permite valores repetidos." +
                "\nPerformance: Muito perfomarmática.");

        System.out.println("\n---LinkedHashSet---" +
                "\nUtilizar: quanro precisa manter ordem de inteserção de elementos." +
                "\nOrdenação: manter a ordem de inteserção." +
                "\nPerformance: Mais lenta de todas por precisar manter a ordem.");

        System.out.println("\n---TreeSet---" +
                "\nUtilizar: Quando precisa alterar a ordem através de comparators." +
                "\nOrdenação: Mantém a ordem e por ser reordenado." +
                "\nPerformance: Rápido para leitura. Como tem que reordenar para fazer insert é lento para update.");



    }
}
