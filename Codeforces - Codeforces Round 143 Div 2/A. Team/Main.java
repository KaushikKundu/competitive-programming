//  A. Team

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int ans = 0;
        while(n > 0){
            for (int i = 0; i < 3; i++) {
                int val = sc.nextInt();
                    sum += val;
            }
            if(sum >= 2){
                ans++;
            }
            sum = 0;
            n--;
        }
        System.out.println(ans);
    }
}