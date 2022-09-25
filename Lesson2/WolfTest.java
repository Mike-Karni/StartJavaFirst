public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();

        wolfOne.setSex("female");
        wolfOne.setNickName("King Wolf");
        wolfOne.setWeight(50);
        wolfOne.setAge(10);
        wolfOne.setColor("White");
        System.out.println("Волк имеет пол = " + wolfOne.getSex());
        System.out.println("Имя волчицы = " + wolfOne.getNickName());
        System.out.println("Масса волчицы = " + wolfOne.getWeight());
        System.out.println("Возраст волчицы = " + wolfOne.getAge());
        System.out.println("Цвет волчицы = " + wolfOne.getColor());
    }
}
