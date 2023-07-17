package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
/*reflection.Person java.lang.String setName
* java.lang.Thread java.lang.String setName*/
public class ReflectionTest2 {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        Class class1=Class.forName(scanner.next());
        Class class2=Class.forName(scanner.next());
        String method=scanner.next();
        Method method1 = class1.getMethod(method, class2);
        Object o1 = class1.getDeclaredConstructor().newInstance();
        Object o2=class2.getConstructor(String.class).newInstance("String Value");

        method1.invoke(o1,o2);
        System.out.println(o1);


    }

}
