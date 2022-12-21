package Test_1;

import java.util.Scanner;

/**
 * @author 伊雷娜
 * @version 1.0
 * @date 2022/9/19 10:53
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        printX(i1);
    }

    public static void printX(int i){
        System.out.println("请输入一个数字：" + i);
        for (int x = 0; x < i; x++) {
            System.out.print("*");
        }
    }
}
