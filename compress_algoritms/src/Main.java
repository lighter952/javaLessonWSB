public class Main {
    public static void main(String[] args) {
        String text = "ABBCCCDDDD";
        //System.out.println(compress(text));

        System.out.println(bin_compress("!AB*"));

    }


    static String compress(String text) {
        String compressed_text = "";
        int i = 0, j = 1;

        while(i < text.length() - 1){

            if(text.charAt(i) == text.charAt(i+1)) {
                j++;
            } else {
                compressed_text += j;
                compressed_text += text.charAt(i);

            }
            i++;
        }
        return compressed_text;
    }

    static String bin_compress(String text) {
        String compressed_text = "";
        int[] codes = new int[text.length()];

        for(int i = 0; i < text.length(); i++) {
            codes[i] = (int)text.charAt(i);
        }

        for (int i = 0; i < codes.length; i++) {
            compressed_text += toBianry(codes[i]);
        }
        System.out.println(compressed_text.length());
        return compressed_text;
    }
    static String toBianry(int number) {
        int[] binaryNum = new int[1000];
        int[] binaryNum2 = new int[8];
        int i = 0;
        String result = "";
        while(number > 0) {
            binaryNum[i] = number % 2;
            number = number / 2;
            i++;
        }

        if(binaryNum.length < 8){
            for(i = binaryNum.length - 8; i < 8; i++) {
                if(8 - i < binaryNum.length) {
                    binaryNum2[i] = 0;
                }
            }
        } else {
            binaryNum2 = binaryNum;
        }


        for (int j = i - 1; j >= 0; j--) {
            //System.out.print(binaryNum[j]);
            result += binaryNum2[j];
        }
        return result;
    }

}