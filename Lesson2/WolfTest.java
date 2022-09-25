public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        // wolfOne.age = 12;
        System.out.println("Возраст волка = " + wolfOne.age + " лет.");
        // wolfOne.weight = 55;
        System.out.println("Волчок то наш растолстел и весит уже " + wolfOne.weight + " кг.");
        // wolfOne.nickName = "King Wolf";
        System.out.println("Волк стал вожаком стаи, и теперь его кличка " + wolfOne.nickName);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();

        wolfOne.setSex("female");
        wolfOne.setNickName("King Wolf");
        wolfOne.setWeight(50);
        wolfOne.setAge(7);
        wolfOne.setColor("White");
        System.out.println(wolfOne.getSex());
        System.out.println(wolfOne.getNickName());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());

    }
}