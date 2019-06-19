public class Variable {
    public static void main(String[] args) {
        // 定义变量
        int i = 0;
        System.out.println(i);
        // 重新赋值
        i = 1;
        System.out.println(i);

        int n = 100;
        int x = n + 100;
        System.out.println(n);
        System.out.println(x);

        byte b = 127;
        short s =32767;
        int i2 = 21474823;
        long l = 900000000000000000L;  // long型结尾需要加L
        System.out.println(b);
        System.out.println(s);
        System.out.println(i2);
        System.out.println(l);

        float f1 = 3.14f;
        float f2 = 3.14e38f;
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);



        char z = '中';
        char u = 'Z';// 用'' 表示 ，有且仅有一个字符, 要和双引号"的字符串类型区分开。
        System.out.println(z);
        System.out.println(u);

        // 常量
        final float PI = 3.14f;
        System.out.println(PI);







    }
}

// Java的变量分为   基本类型变量 和引用类型变量
/*
基本类型：

整数类型
byte,  1个字节  -128 ~ 127 总数 255
short,  2个字节  -32768 ~ 32767   65535
int,   4个字节  -2147483648 ~ 2147483647
long,  8个字节  -9223372036854775808 ~ 9223372036854775807  末尾需要加L
浮点数类型
float, 4个字节  后面加f后缀
double, 8个字节
字符串类型
char  2个字节
字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
布尔类型
boolean  true/ false
理论上存储布尔类型只需要1 bit，但是通常JVM内部会把boolean表示为4字节整数。


 */
// 常量
/*
定义变量的时候，如果加上final修饰符，这个变量就变成了常量：
用大写
赋值后不允许修改了

 */

// var关键字  省略变量名
// 变量的作用范围
/*
{
    ...
    int i = 0; // 变量i从这里开始定义
    ...
    {
        ...
        int x = 1; // 变量x从这里开始定义
        ...
        {
            ...
            String s = "hello"; // 变量s从这里开始定义
            ...
        } // 变量s作用域到此结束
        ...
        // 注意，这是一个新的变量s，它和上面的变量同名，
        // 但是因为作用域不同，它们是两个不同的变量:
        String s = "hi";
        ...
    } // 变量x和s作用域到此结束
    ...
} // 变量i作用域到此结束



 */

/*
小结
Java提供了两种变量类型：基本类型和引用类型

基本类型包括整型，浮点型，布尔型，字符型。

变量可重新赋值，等号是赋值语句，不是数学意义的等号。

常量在初始化后不可重新赋值，使用常量便于理解程序意图。
 */