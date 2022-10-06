public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
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
        System.out.println("Vашина усилена новым оборудованием.Сила = " + jaegerOne.getStrength());
    }
}