package reflection;

import annotation.MethodInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass=Person.class;
        Class personClass1=person.getClass();
        Class personClass2=Class.forName("reflection.Person");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+" : "+ method.getReturnType()+" : "
                    + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("////////////////////////////////////////////////////");

        Field[] fields = personClass1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+" : "+field.getType());
        }

        System.out.println("////////////////////////////////////////////////////");

        Annotation[] annotations = personClass2.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof MethodInfo){
                System.out.println("yes");
            }
        }


    }
}
