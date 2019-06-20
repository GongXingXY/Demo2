public class Float {
    public static void main(String[] args) {
        System.out.println("学习浮点数运算");
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);
        /*
        类型提升
如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型：
         */
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);
        //需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况。例如：
        double dou = 1.2 + 24 / 5; // 5.2
        System.out.println(dou);
        /*
        溢出
整数运算在除数为0时会报错，而浮点数运算在除数为0时，不会报错，但会返回几个特殊值：

NaN表示Not a Number
Infinity表示无穷大
-Infinity表示负无穷大
例如：
         */
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        //四舍五入，可以对浮点数加上0.5再强制转型：
        double forth = 2.65;
        float n2 = (float) (forth + 0.05);
        System.out.println(n2);

        /**
         * 小结
         * 浮点数常常无法精确表示，并且浮点数的运算结果可能有误差；

         比较两个浮点数通常比较它们的绝对值之差是否小于一个特定值；

         整型和浮点型运算时，整型会自动提升为浮点型；

         可以将浮点型强制转为整型，但超出范围后将始终返回整型的最大值。
         */


    }
}
