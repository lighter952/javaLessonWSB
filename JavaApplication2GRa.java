package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class JavaApplication1 {

    static void createFile(String fileName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            writer.println(generator.nextInt(500)+500);
        }
        writer.close();
        System.out.println("File <" + fileName +"> was created...");
    }
    
    
    static ArrayList<Integer> scanFile(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner scan = new Scanner(file);
        ArrayList <Integer> list = new ArrayList<>();
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        System.out.println("File <" + filename + "> was scanned...");  
        scan.close();
        return list;
    }
    
    
    static void printList(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
         
    static int checkIsWin(ArrayList<ArrayList<Integer>> field, int player) {
        int status = 1;
        if(field.get(0).get(0) == field.get(1).get(1) && field.get(1).get(1) == field.get(2).get(2) && field.get(2).get(2) == player && field.get(2).get(2) != 0){
            status = player;
        }
        if(field.get(0).get(2) == field.get(1).get(1) && field.get(1).get(1) == field.get(2).get(0) && field.get(2).get(0) == player && field.get(2).get(2) != 0){
            status = player;
        }
        return status;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> field = new ArrayList<ArrayList<Integer>>();
        int posX = 0, posY = 0;
        int player = 1;
        for (int i = 0; i < 3; i++) {
            field.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                field.get(i).add(0);
                
            }
        }
        int status = -1;// -1 - next step, 0 - nobody win, 1 - win 1 player, 2 - win 2 player
        while(status == -1){
            printList(field);
            System.out.println("Player Nr " + player + ". Enter position x, y: ");
            posX = scan.nextInt();
            posY = scan.nextInt();
            if(field.get(posY - 1).get(posX - 1) == 0) {
                field.get(posY - 1).set(posX - 1, player);
            } else {
                System.out.println("Position not empty. Enter another position");
                continue;
            }
            status = checkIsWin(field, player);
            if(player == 2) player = 1;
            else if(player == 1) player = 2;
        }
        if(status == 1) System.out.println("1st player win!");
        if(status == 2) System.out.println("2nd player win!");
        if(status == 0) System.out.println("The field is filled in, nobody win");
    }
}


//print matrix if 0 - dont print void 
//czypusta pole  wykonaj ruch  bool 
//sprawdz czy conec gry int 0 -1 

        //PrintWriter writer = new PrintWriter("dane1.txt");
        //Random generator = new Random();
//System.out.println(list.size());
//        list.set(5,12345);
//        
//ArrayList<Integer> list1 = scanFile("dane1.txt");
//
//        for (int i = 0; i < 3; i++) {
//            matrix.add(new ArrayList<Integer>());
//        }
//        int num = 1;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++){
//                matrix.get(i).add(num);
//                num++;
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(matrix.get(i));
//        }