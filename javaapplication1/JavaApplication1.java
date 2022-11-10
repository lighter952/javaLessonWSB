package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    
    
    static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element nr: " + i + " = " + list.get(i)); 
        }
    }
         
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> list1 = scanFile("dane1.txt");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        
    }
}

        //PrintWriter writer = new PrintWriter("dane1.txt");
        //Random generator = new Random();
//System.out.println(list.size());
//        list.set(5,12345);
//        