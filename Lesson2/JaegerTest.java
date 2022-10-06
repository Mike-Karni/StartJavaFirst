public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("", "", "", 0f, 0f, 0, 0, 0);
        jaegerOne.setModelName("Striker Eureka.");
        System.out.println("modelName = " + jaegerOne.getModelName());
        jaegerOne.setStatus("Destroyed.");
        System.out.println("Jaeger status = " + jaegerOne.getStatus());
        jaegerOne.setOrigin("Australia.");
        System.out.println("Country origin = " + jaegerOne.getOrigin());
        jaegerOne.setHeight(76.2f);
        System.out.println("Height  = " + jaegerOne.getHeight());
        jaegerOne.setWeight(1850);
        System.out.println("Weight = " + jaegerOne.getWeight());
        jaegerOne.setSpeed(10);
        System.out.println("Speed = " + jaegerOne.getSpeed());
        jaegerOne.setStrength(10);
        System.out.println("Strength = " + jaegerOne.getStrength());
        jaegerOne.setArmor(9);
        System.out.println("Armor = " + jaegerOne.getArmor());
        jaegerOne.drift();
        jaegerOne.hit();
        jaegerOne.setStrength(20);
        System.out.println("Машина усилена новым оборудованием.Сила = " + jaegerOne.getStrength());
        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", "Destroyed", "Russia", 85.34f, 2412f,
                3, 10, 10);
        System.out.println("\nmodelName = " + jaegerTwo.getModelName());
        System.out.println("Jaeger status = " + jaegerTwo.getStatus());
        System.out.println("Country origin = " + jaegerTwo.getOrigin());
        System.out.println("Height  = " + jaegerTwo.getHeight());
        System.out.println("Weight = " + jaegerTwo.getWeight());
        System.out.println("Speed = " + jaegerTwo.getSpeed());
        System.out.println("Strength = " + jaegerTwo.getStrength());
        System.out.println("Armor = " + jaegerTwo.getArmor());
    }
}