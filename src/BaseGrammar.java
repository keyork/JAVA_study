/*
* 记录学习JAVA基本语法的练手的代码
*/
import java.util.*;
import java.text.*;

public class BaseGrammar {
    public static void main(String []args) {

        System.out.println("Hello World");

        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice.size);

        Dog little_dog = new Dog();
        little_dog.make_breed();
        little_dog.barking();

        Puppy my_puppy = new Puppy("Moon");
        my_puppy.setAge(12);
        my_puppy.getAge();
        System.out.println("my puppy's age is :" + my_puppy.puppyAge);

        APrivateDemo private_demo = new APrivateDemo();
        private_demo.setFormat("PRIVATE");
        System.out.println(private_demo.getFormat());

        OperatorDemo operator_demo = new OperatorDemo();
        operator_demo.condition();
        operator_demo.type_confirm();

        StrongLoop loop_demo = new StrongLoop();
        loop_demo.loop();

        NumberDemo number_demo = new NumberDemo();
        number_demo.number_run();
        number_demo.math_run();

        ArrayDemo array_demo = new ArrayDemo();
        array_demo.set_array();

        DateDemo date_demo = new DateDemo();
        date_demo.get_date();
    }
}

class FreshJuice {
//    枚举限制变量只能是预先设定好的值
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}

/*
* 这是一个类，包括变量和方法
* 需要注意类变量必须声明为static
*/
class Dog {
    String breed;
    int age;
    String color;

    void make_breed() {
        breed = "DOG!!!";
    }

    void barking() {
        System.out.println(breed);
    }
}

/*
* 这是访问实例变量和调用成员方法的例子
*/
class Puppy {
    int puppyAge;
    public Puppy(String name) {
        System.out.println("Passed Name is :" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's name is :" + puppyAge);
        return puppyAge;
    }
}

/*
* 还有一个讲import的用法
* 不想写了
*/

/*
* 这是访问修饰符的例子
* 默认修饰符：不使用任何关键字
* private：方法、变量和构造方法只能被所属类访问
* public：公有的，啥都能干
* protected：同一个包中的任何其他类以及不同包中的子类访问
* 在继承时，是不能够继承private的
*/

class APrivateDemo {
    /*
    * 为了让其他类能够操作format的值
    * 定义了两个public的方法
    */
    private String format;
    public String getFormat() {
        return this.format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
}

/*
* 还有非访问修饰符
* static：静态，变量只有一份拷贝，独立于对象，静态方法不能用类的非静态变量
* final：能被显式地初始化并且只能初始化一次，对象不可以变但是值可以变，常与static一起使用
* abstract：抽象类
* synchronized：同一时间只能被一个线程访问
* transient：略
* volatile：成员变量每次被线程访问时，都强迫从共享内存中重读
*/

/*
* 运算符，两个比较特殊的
*/

class OperatorDemo {
    int a, b;

    public void condition() {
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println(b);
        b = (a == 10) ? 20 : 30;
        System.out.println(b);
    }

    public void type_confirm() {
        String name = "James";
        boolean result = name instanceof String;
        System.out.println(result);
    }
}

/*
* 增强循环
*/

class StrongLoop {
    public int [] numbers = {10, 20, 30, 40, 50};

    public void loop() {
        for (int x : numbers){
            System.out.println(x);
        }
    }
}

/*
* Math和Number类
* 反正就是有很多方法啦
*/

class NumberDemo {
    public void number_run() {
        Integer x = 5;
        x = x + 10;
        System.out.println(x);
    }
    public void math_run() {
        System.out.println("0度的余弦值：" + Math.cos(0));
    }
}

/*
* Character和String也有很多的方法
* 但是不想写了
*/

/*
* 数组
*/

class ArrayDemo {
    int data[] = new int[3];
////    等价于这种方式：
//    int data[] = null;
//    data = new int[3];
    public void set_array() {
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}

/*
* JAVA可以使用Date类、SimpleDateFormat类、
* Calendar类、GregorianCalendar类
* 获取和设置特定格式的时间
*/

class DateDemo {
    public void get_date() {
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat ft =
                new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(date));
    }
}
