package lesson6.Task1;

public class Task1 {

    public static void main(String[] args) {

        try {
            myMethod(0);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void myMethod (int number) throws MyException {
        if (number < 0)
            System.out.println("Number < 0");
        else if (number > 0)
            System.out.println("Number > 0");
        else
            throw new MyException();
    }
}


