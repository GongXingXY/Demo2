public class StringTest {

    /*
     * 常见的转义字符包括：

     \" 表示字符"
     \' 表示字符'
     \\ 表示字符\
     \n 表示换行符
     \r 表示回车符
     \t 表示Tab
     * **/


    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        String S = hello + " " + world + "!";
        System.out.println(S);

        // 如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接：
        int age = 25;
        String s = "age is " + age;
        System.out.println(s);

        //Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变。考察以下代码：
        String s1 = "hello";
        String t = s1;
        s1 = "world";
        System.out.println(t); // t是"hello"还是"world"?

        // 空值null 引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象
        String s2 = null;
        System.out.println(s2);

        int a = 72;
        int b = 105;
        int c = 65281;

        String res ="" +(char)a + (char)b + (char)c;
        System.out.println(res);

        /*
        Java的字符类型char是基本类型，字符串类型String是引用类型；

基本类型的变量是“持有”某个数值，引用类型的变量是“指向”某个对象；

引用类型的变量可以是空值null；

要区分空值null和空字符串""。
         */

    }

}
