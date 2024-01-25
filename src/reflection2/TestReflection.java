package reflection2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        //name_class1 name_class2 name_method
        Class classobj1 = Class.forName(scanner.next());
        Class classobj2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method method = classobj1.getMethod(methodName, classobj2);
        Object o1 = classobj1.newInstance();
        Object o2 = classobj2.getConstructor(String.class).newInstance("String value");
        method.invoke(o1, o2);

        System.out.println(o1);
    }
}
