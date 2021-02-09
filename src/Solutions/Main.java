package Solutions;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class personClass = Person.class;

        Person person = new Person("Ivan", 27, 189);
        System.out.println(person.tellAboutYou());

        Method [] method = personClass.getMethods();
        for(Method m : method){
            System.out.println(m);
            System.out.println(Arrays.toString(m.getAnnotations()));
        }

        Field [] fields = personClass.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f);
        }
    }
}
