public class Math {
    public static void main(String[] args) {

        int i = (100 + 200) * (99 -88);
        int n = 7 * (5 + (i - 9));
        System.out.println(i);
        System.out.println(n);
        //除法
        int x = 1237 / 34;
        System.out.println(x);
        // 取余
        //  注意运算溢出的问题
        //简写  +=, -=, *=, /=
        x += 100;  //  x = x +100;
        System.out.println(x);
        // 自增自减  ++  --
        int y = 100;
        y++;
        int y1 = y;
        System.out.println(y);
        System.out.println(y1);

        y--;
        System.out.println(y);

        // 移位运算 ，就是二进制的移位
        int e = 7;       // 00000000 0000000 0000000 00000111
        int a = e << 1;  // 00000000 0000000 0000000 00001110 <= 14
        int b = e << 2;  // 00000000 0000000 0000000 00011100 <= 28
        int c = e << 28; // 01110000 0000000 0000000 00000000 <= 1879048192
        int d = e << 29; // 11100000 0000000 0000000 00000000 <= -536870912
        System.out.println(e);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // 位运算， 与 或 非

        /*
        运算优先级
在Java的计算表达式中，运算优先级从高到低依次是：

()
! ~ ++ --
* / %
+ -
<< >> >>>
&
|
+= -= *= /=
         */
        //类型自动提升与强制转型, 两个类型不一致，结果为比较大的类型

        // 强制转换类型
        int var = 12345;
        short s = (short)var;
        System.out.println(s);

        int nn = 100;
        int sum = ((1+nn)*nn)/2;
        System.out.println(sum);
        int sum2 = 0;
        for (int k = 0; k<=100; k++) {
            sum2 += k;
        }
        System.out.println(sum2);

    }
}
