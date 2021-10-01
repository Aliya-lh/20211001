package NowCoder;

import java.util.Scanner;

public class NewCoder {
    //从键盘输入a, b, c的值，编程计算并输出一元二次方程ax2 + bx + c = 0的根，
    // 当a = 0时，输出“Not quadratic equation”，当a ≠ 0时，根据△ = b2 - 4*a*c的三种情况计算并输出方程的根。
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if(a==0){
                System.out.println("Not quadratic equation");
                System.exit(0);
            }else{
                double d =(b*b)-(4*a*c);
                if(d==0){
                    double x = (-b)/(2*a);
                    System.out.println("x1=x2="+String.format("%.2f",x));
                }else if(d>0){
                    double x1 = (double)(((-b)+(Math.sqrt(d)))/(2*a));
                    double x2 = (double)(((-b)-(Math.sqrt(d)))/(2*a));
                    if(x1<x2){
                        System.out.println("x1="+String.format("%.2f",x1)+";"+"x2="+String.format("%.2f", x2));

                    }else{
                        double tmp = x1;
                        x1 = x2;
                        x2 = tmp;
                        System.out.println("x1="+String.format("%.2f", x1)+";"+"x2="+String.format("%.2f", x2));
                    }
                }else{

                    double s = (-b)/(2*a);
                    double x = (double)(Math.sqrt(-d)/(2*a));
                    System.out.println("x1="+String.format("%.2f", s)+"-"+String.format("%.2f", x)+"i;x2="+String.format("%.2f", s)+"+"+String.format("%.2f", x)+"i");
                }
            }
        }
    }

    public static void main2(String[] args) {
        //KiKi想获得某年某月有多少天，请帮他编程实现。输入年份和月份，计算这一年这个月有多少天。
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int year = sc.nextInt();
                int month = sc.nextInt();
                switch(month){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("31");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30");
                        break;
                    case 2:
                        if(year%4==0){
                            System.out.println("29");
                        }else{
                            System.out.println("28");
                            break;
                        }
                }
            }

    }


    public static void main3(String[] args) {
        //二维数组
        int[][] array =  {{1,2,3},{4,5,6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main4(String[] args) {
        //找出数组当中只出现一次的数字
        //程序分析：使用位运算符当中的异或 ^
        //^:两个相同的数字进行异或，结果为 0 且 0 异或任何数字  结果都是任何数字
        //注意！异或运算遵循交换分配率
        int[] arr = {1,2,4,1,4};
        int ret = 0;//用ret来保存异或后的值
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i];
        }
        System.out.println(ret);
    }


    //类和对象
class Person{
    //字段-》成员变量
    String name;
    int age;
    //方法-》行为
    public void eat(){
        System.out.println("eat()!");
    }
    public void sleep(){
        System.out.println("sleep()");
    }
}









}
