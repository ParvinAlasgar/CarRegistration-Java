package util;

import java.util.Scanner;

public class InputUtil {
    public static String inputText(String text){
        Scanner scan=new Scanner(System.in);
        System.out.println(text);
        String answer=scan.nextLine();
        return answer;
    }
    public static int inputNumber(String text){
        Scanner scan=new Scanner(System.in);
        System.out.println(text);
        int answer=scan.nextInt();
        return answer;
    }
}
