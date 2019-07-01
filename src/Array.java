public class Array {
    /*
    定义一个数组类型的变量，使用数组类型“类型[]”，例如，int[]。和单个基本类型变量不同，数组变量初始化必须使用new int[5]表示创建一个可容纳5个int元素的数组。

Java的数组有几个特点：

数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
数组一旦创建后，大小就不可改变。
要访问数组中的某一个元素，需要使用索引。数组索引从0开始，例如，5个元素的数组，索引范围是0~4。

可以修改数组中的某一个元素，使用赋值语句，例如，ns[1] = 79;。

可以用数组变量.length获取数组大小：
     */
    public static void main(String[] args) {

        // // 5位同学的成绩:
               int[] ns = new int[5];
               ns[0] = 68;
               ns[1] = 79;
               ns[2] = 91;
               ns[3] = 85;
               ns[4] = 62;
               System.out.println(ns.length);  //5
               // 还可以进一步简写为：
               int [] ns2 = {68,78,99,98,97};
               System.out.println(ns2[1]); //78
        //注意数组是引用类型，并且数组大小不可变
        //字符串数组
        //如果数组元素不是基本类型，而是一个引用类型，那么，修改数组元素会有哪些不同

        //这里注意到原来names[1]指向的字符串"XYZ"并没有改变，
        // 仅仅是将names[1]的引用从指向"XYZ"改成了指向"cat"，
        // 其结果是字符串"XYZ"再也无法通过names[1]访问到了。
        String[] names = {"ABC","XZY","zoo"};

        String s = names[1];
        names[1] = "cat";
        System.out.println(s);
        System.out.println(names[1]);
        System.out.println(names[0]);

        //小结
        //数组是同一数据类型的集合，数组一旦创建后，大小就不可变；
        //
        //可以通过索引访问数组元素，但索引超出范围将报错；
        //
        //数组元素可以是值类型（如int）或引用类型（如String），但数组本身是引用类型；


    }
}
