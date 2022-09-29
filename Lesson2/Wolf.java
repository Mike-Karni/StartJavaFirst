public class Wolf {

    private String sex;
    private String nickName;
    private int weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Серый волк крадётся за добычей.");
    }

    public void sit() {
        System.out.println("Серый волк сидит в засаде на зверя.");
    }

    public void run() {
        System.out.println("Серый волк бежит за охотником.");
    }

    public void howl() {
        System.out.println("Серый волк воет на Луну!");
    }

    public void hunt() {
        System.out.println("Серый волк охотится только когда голоден.");
    }
}