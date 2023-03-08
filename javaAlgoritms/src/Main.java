import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File p = new File("dane.txt");
        Scanner scan = new Scanner(p);

        ArrayList<Integer> lista = new ArrayList<>();

        while (scan.hasNext()) {
            lista.add(scan.nextInt());
        }

        System.out.println(lista);
        scan.close();
        System.out.println("Minimal value in array is: " + max_value(lista));
        System.out.println("Maximal value in array is: " + min_value(lista));
        System.out.println("Sorted array: " + sort_array(lista));
        binary_search(sort_array(lista), lista.get(10));

    }

    public static int max_value(ArrayList<Integer> list) {
        int max_value = list.get(0), i = 0;
        while(i < list.size()) {
            if(list.get(i) > max_value){
                max_value = list.get(i);
            }
            i++;
        }
        return max_value;
    }

    public static int min_value(ArrayList<Integer> list) {
        int min_value = list.get(0), i = 0;
        while(i < list.size()){
            if(min_value > list.get(i)) {
                min_value = list.get(i);
            }
            i++;
        }
        return min_value;
    }


    public static ArrayList<Integer> sort_array(ArrayList<Integer> sorted_list) {
        //ArrayList<Integer> sorted_list = new ArrayList<>();

        for(int i = sorted_list.size(); i >= 0; i--) {
            for(int j = 1; j < i; j++) {
                if(sorted_list.get(j - 1) > sorted_list.get(j)) {
                    int buffer = sorted_list.get(j - 1);
                    sorted_list.set(j - 1, sorted_list.get(j));
                    sorted_list.set(j, buffer);
                }
            }
        }

        return sorted_list;
    }


    public static int binary_search ( ArrayList<Integer> list, int search_value) {
        int current_value = 0, index_of_searched_element = 0;
        int minimal_of_range = 0, max_of_range = list.size() - 1;

        while(max_of_range - minimal_of_range > 1) {
            int mid = minimal_of_range + ((max_of_range - minimal_of_range) / 2);

            if(search_value == list.get(mid)) {
                index_of_searched_element = mid;
                System.out.println("Element: " + search_value + ", have index: " + index_of_searched_element);
                return index_of_searched_element;
            } else if(search_value > list.get(mid)) {
                minimal_of_range = mid;
            }   else if (search_value < list.get(mid)) {
                max_of_range = mid;
            }

        }

        System.out.println("Element: " + search_value + ", have index: " + index_of_searched_element);
        return index_of_searched_element;
    }

}