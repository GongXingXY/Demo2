import java.util.Scanner;

public class PrintfInput {
    public static void main(String[] args) {
        //格式化输出
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); //显示2位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数


        /*
        占位符	说明
%d	格式化输出整数
%x	格式化输出十六进制整数
%f	格式化输出浮点数
%e	格式化输出科学计数法表示的浮点数
%s	格式化字符串
         */

        //输入
        System.out.print("\n");

        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name:\n");//打印提示
        String name = scanner.nextLine(); //读取一行输入并获取字符串
        System.out.print("Input your age:\n");//打印提示
        int age = scanner.nextInt();//读取一行输入并获取字符串
        System.out.printf("Hi, %s, you are %d\n", name, age);// 格式化输出

        /*
        Java提供的输出包括：System.out.println() / print() / printf()，其中printf()可以格式化输出；

Java提供Scanner对象来方便输入，读取对应的类型可以使用：scanner.nextLine() / nextInt() / nextDouble() / ...
         */

        // Practice
        System.out.print("输入上次考试成绩：");
        int grade1 = scanner.nextInt();
        System.out.print("输入本次考试成绩：");
        int grade2 = scanner.nextInt();
        double improvement = (double)(grade2 - grade1)/(grade1) *100;
        String UpOrDown = grade2>grade1? "成绩上升了":"成绩下降了";
        System.out.printf("%s:%.2f%s\n", UpOrDown, improvement,"%");



    }
}
