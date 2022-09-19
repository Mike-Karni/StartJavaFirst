public class Person {
    public static void main(String[] args) {
        String sex = "man";
        String name = "Mike";
        int height = 179;
        float weight = 79.4f;
        int age = 34;

        void walk() {
            System.out.println("Каждый день Mike проходит не менее 10000 шагов.");
        }

        void sit() {
            System.out.println("Каждый день Mike сидит, работая за компьютером.");
        }

        boolean run() {
            System.out.println("Mike быстро бегает!");
            return true;
        }

        void talk() {
            System.out.println("Каждый день Mike говорит по телефону.");
        }

        String learnJava() {
            return "Каждый день Mike учит JAVA усердно";
        }
    }

}