public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.age = 12;
        System.out.println("Возраст волка = " + wolfOne.age + " лет.");
        wolfOne.weight = 55;
        System.out.println("Волчок то наш растолстел и весит уже " + wolfOne.weight + " кг.");
        wolfOne.nickName = "King Wolf";
        System.out.println("Волк стал вожаком стаи, и теперь его кличка " + wolfOne.nickName);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}