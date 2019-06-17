package lesson7.task1;

import java.lang.reflect.Method;

public class Main {
    /**
     * 1. Создать аннотацию, которая принимает параметры для метода.
     * Написать код, который вызовет метод, помеченный этой аннотацией,
     * и передаст параметры аннотации в вызываемый метод.
     */
    @TestAnnotation(a = 8, b = 13)
    public void test(int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Main m = new Main();

        Class<?> mClass = m.getClass();
        Method[] methods = mClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TestAnnotation.class)) {
                TestAnnotation testAnnotation = method.getAnnotation(TestAnnotation.class);
                try {
                    method.invoke(m, testAnnotation.a(), testAnnotation.b());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
