package lesson4.task2;

public class Boxer {

    public int age;
    public int weight;
    public int strenght;

    public Boxer(int age, int weight, int strenght) {
        this.age = age;
        this.weight = weight;
        this.strenght = strenght;
    }

    public boolean fight(Boxer anotherBoxed) {
        int ourBoxerStat = this.age + this.strenght + this.weight;
        int oponentBoxerStat = anotherBoxed.age + anotherBoxed.weight + anotherBoxed.strenght;

        return ourBoxerStat > oponentBoxerStat ? true : false;
    }

    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(1,3,5);
        Boxer anotherBoxer = new Boxer(1,30,3);

        System.out.println(ourBoxer.fight(anotherBoxer));
        System.out.println(anotherBoxer.fight(ourBoxer));
    }
}
