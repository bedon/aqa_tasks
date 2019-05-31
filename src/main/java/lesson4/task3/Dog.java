package lesson4.task3;

public class Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(""))
            System.out.println("Name can't be empty");
        else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age <= 0)
           System.out.println("Age should be > 0");
       else
           this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(0);
        dog.setAge(-4);
        dog.setAge(3);

        dog.setName("");
        dog.setName("Sirko");
    }
}
