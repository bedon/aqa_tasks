package lesson7.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * "2. Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 * * который сохранит поле класса TextContainer в указанный файл."
 */

@SaveTo(path = "E:\\idea_projects\\aqa_tasks\\src\\main\\java\\lesson7\\task2\\file.txt")
public class TextContainer {

    public String text = "some text";

    @Saver
    public void save() throws IOException, NoSuchFieldException, IllegalAccessException {
        Class<?> cl = this.getClass();

        if (cl.isAnnotationPresent(SaveTo.class)) {
            SaveTo saveTo = cl.getAnnotation(SaveTo.class);
            FileWriter writer = new FileWriter(saveTo.path());

            Field field = cl.getField("text");
            try {
                writer.write((String) field.get(this));
            } finally {
                writer.close();
            }
        } else {
            System.out.println("class is not annotated");
        }
    }

    public static void main(String[] args) throws Exception {
        TextContainer container = new TextContainer();
        container.save();
    }
}
