package Solutions;

public class Person {
    private String type = "Homo sapiens";
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @methodDescription(whatMethodDoing = "tell about person", yearWhenMethodWasWritten = 2021, inWhichClass = "Person")
    public String tellAboutYou(){
        return "Hi, My name is " + name + ". I'm " + age + " years old. My height is " + height + ".";
    }

}


