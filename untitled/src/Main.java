
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        PrintWriter nowy = new PrintWriter("nowy.txt");
        Scanner odczyt = new Scanner(file);
        ArrayList <Integer> lista = new ArrayList<>();

        while(odczyt.hasNext()) {
            if(odczyt.hasNextInt()) {
                int a = odczyt.nextInt();
                nowy.println(a);
                lista.add(a);
                //System.out.println(a);
            }
            else {
                String t = odczyt.next();
            }
        }
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.get(23));

        odczyt.close();
        nowy.close();

    }
}



//        Random rnd = new Random();
//        rnd.setSeed(2);
//        System.out.println(rnd.nextInt());
//        PrintWriter writer = new PrintWriter("plik.txt");
//        int k = rnd.nextInt(111) + 10;
//
//        for(int i = 0; i < k; i++) {
//            writer.print(rnd.nextInt(100) + " ");
//        }

//        writer.close();

//        for(int i =0; i < 36; i++) {
//            int a = odczyt.nextInt();
//            System.out.println(a);
//        }