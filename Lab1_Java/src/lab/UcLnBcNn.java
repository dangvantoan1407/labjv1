package lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UcLnBcNn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b = sc.nextInt();
        int max = 0;
        if ( a>b) {
            for(int i=1; i<=b; i++){
                if(a%i == 0 && b%i == 0) {
                    if(max<i)
                        max=i;
                }
            }
        } else if(a==b) {
            for (int i=1; i<=a; i++) {
                if(a%i == 0 && b%i == 0) {
                    if(max<i)
                        max=i;
                }
            }
        }
        else {
            for(int i=1; i<=a; i++){
                if(a%i == 0 && b%i == 0) {
                    if(max<i)
                        max=i;
                }
            }
        }
        System.out.println("Uoc chung lon nhat cua " + a + "va " + b+ "la:" +max);
        System.out.println("Boi chung nho nhat cua " + a + "va " + b+ "la:" + (a*b)/max);//BCNN= tích hai so chia cho UCll
    }
}
