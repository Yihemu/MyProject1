package szu.yui.recommender;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        HashMap<String, Integer> map = new HashMap<>();
        while(sc.hasNextLine()){
            str = sc.nextLine();
            System.out.printf("%s\n", str);
        }
    }
}
