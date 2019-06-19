package lesson7.task3;

import lesson7.task2.SaveTo;
import lesson7.task2.Saver;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

@SaveTo(path = "E:\\idea_projects\\aqa_tasks\\src\\main\\java\\lesson7\\task3\\file.txt")
public class Main {
    @Save
    public String s1 = "annotated s1";
    public String s2 = "not annotated";
    @Save
    public String s3 = "annotated s3";

    @Saver
    public void save(String path, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));

        try {
            writer.write(text);
            writer.newLine();
        } finally {
            writer.close();
        }
    }

    @Reader
    public void read(String filePath) throws IOException {
        Scanner scaner = new Scanner(new FileReader(filePath));
        while (scaner.hasNextLine()) {
            System.out.println(scaner.nextLine());
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Main main = new Main();
        Class<?> cl = main.getClass();

        if (cl.isAnnotationPresent(SaveTo.class)) {
            SaveTo saveTo = cl.getAnnotation(SaveTo.class);
            Method[] methods = cl.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Saver.class)) {
                    Field[] fields = cl.getFields();
                    for (Field field : fields) {
                        if (field.isAnnotationPresent(Save.class)){
                        method.invoke(main, saveTo.path(), field.get(main));
                        }
                    }
                }
            }
        } else {
            System.out.println("Class is not annotated");
        }

        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Reader.class)) {
                method.invoke(main, cl.getAnnotation(SaveTo.class).path());
            }
        }
    }
}
