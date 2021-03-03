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
    }
}

class FreshJuice {
    // 枚举限制变量只能是预先设定好的值
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}

/*
* 这是一个类，包括变量和方法
* 需要注意类变量必须声明为static
*/
class Dog{
    String breed;
    int age;
    String color;

    void make_breed(){
        breed = "DOG!!!";
    }

    void barking(){
        System.out.println(breed);
    }
}

/*
* 这是访问实例变量和调用成员方法的例子
*/
class Puppy{
    int puppyAge;
    public Puppy(String name){
        System.out.println("Passed Name is :" + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy's name is :" + puppyAge);
        return puppyAge;
    }
}

/*
* 还有一个讲import的用法
* 不想写了
*/