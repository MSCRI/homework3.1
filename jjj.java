package untitled;
import java.util.Scanner;
public class jjj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 获取输入数字n
        System.out.println("请输入数字n：");
        int n = sc.nextInt();

        // 获取小于m的数字m
        System.out.println("请输入小于n的数字m：");
        int m = sc.nextInt();

        // 统计小于m的数字数量
        int count = 0;
        while (n >= m) {
            n -= m;
            count++;
        }

        // 输出统计结果
        System.out.println("数字n中小于m的数字数量为：" + count);
    }
}