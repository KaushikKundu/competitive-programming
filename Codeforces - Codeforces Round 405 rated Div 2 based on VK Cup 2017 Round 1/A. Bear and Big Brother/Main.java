//  A. Bear and Big Brother

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int i=0;
        while(a <= b){
            a = a*3;
            b = b*2;
            i++;
        }
        System.out.println(i);

    }
}