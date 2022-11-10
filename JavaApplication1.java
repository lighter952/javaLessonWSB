package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication1 {

    static ArrayList<Integer>scanFile(String filename) throws FileNotFoundException{
        File file = new File("dane1.txt");
        Scanner scan = new Scanner(file);
        ArrayList <Integer> list = new ArrayList<>();
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        System.out.println(list);
        scan.close();
        return list;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list1 = scanFile("dane1.txt");
        System.out.println(list1);
        
        
    }
    
}

        //PrintWriter writer = new PrintWriter("dane1.txt");
        //Random generator = new Random();
//System.out.println(list.size());
//        list.set(5,12345);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Element n: " + i + " = " + list.get(i)); 
//        }