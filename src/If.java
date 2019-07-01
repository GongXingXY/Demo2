import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        /*
        if (条件) {
    // 条件满足时执行
}
         */
        int score = 50;

        if(score >= 90) {
            System.out.print("优秀");
        }else if(score >=60){
            System.out.print("及格了");
        }else {
            System.out.print("不及格");
        }
        System.out.print("END\n");

        /*
        判断引用类型相等
在Java中，判断值类型的变量是否相等，可以使用==运算符。
但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。
例如，下面的两个String类型，它们的内容是相同的，但是，分别指向不同的对象，用==判断，结果为false：
         */
        String s1 = "hello";
        String s2 = "Hello".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if(s1 != null && s1.equals(s2) ){ //要避免NullPointerException错误，可以利用短路运算符&&
            System.out.println("s1 == s2");
        }else {
            System.out.println("s1 != s2");
        }
        //要判断引用类型的变量内容是否相等，必须使用equals()方法：

        //Practice
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的体重，单位（kg）：");
        double weight = scanner.nextDouble();
        System.out.print("请输入您的身高，单位（m）：");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("您的体质指数BMI为：%.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("您的体重过轻");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("您的体重正常");
        } else if (bmi > 25 && bmi <= 28) {
            System.out.println("您的体重过重");
        } else if (bmi > 28 && bmi <= 32) {
            System.out.println("您的体重肥胖");
        } else {
            System.out.println("您的体重非常肥胖");
        }

        //Switch
        int option = 99;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }


    }
}
