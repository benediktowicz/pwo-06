package pwo.app;

/**
 * Główna klasa programu, która odpowiada za uruchamianie określonej sekwencji w
 * zależności od liczby podanych argumentów
 *
 * @author Darya Benedziktovich
 * @version 1.0.0
 */

public class Sequence {

    /**
     * Pierwsza funkcja uruchamiana podczas startu programu.
     *
     * @param args
     */
    
    public static void main(String[] args) {

        switch (args.length) {
            case 3 -> (new SeqToOutApp()).run(args);
            case 4 -> (new SeqToFileApp()).run(args);
            default -> System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}