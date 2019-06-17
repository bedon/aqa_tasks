package lesson7.task1;

import java.lang.reflect.Method;

public class Main {

    @TestAnnotation(a = 8, b = 13)
    public void test(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Main m = new Main();

        try {
            Class<?> mClass = m.getClass();
            Method method = mClass.getMethod("test", int.class, int.class);
            TestAnnotation testAnnotation = method.getAnnotation(TestAnnotation.class);

            m.test(testAnnotation.a(), testAnnotation.b());
        } catch (NoSuchMethodException e) {
            System.out.println("No such method");
        }

    }
}
