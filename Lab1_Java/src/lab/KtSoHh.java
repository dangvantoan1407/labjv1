package lab;

import java.util.Scanner;

public class KtSoHh {
    public static boolean soHoanHao(int x) {
        int Sum = 0;
        for(int i = 1; i<x; i++) {
            if(x % i == 0) {
                Sum += i;
            }
        }
        if(Sum == x){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int x;
        System.out.println("Nhập số cần kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if(soHoanHao(x)) {
            System.out.println(x+ ":" + "là số hoàn hảo");
        } else {
            System.out.println(x+ ":" + "không phải là số hoàn hảo");
        }

    }
}
