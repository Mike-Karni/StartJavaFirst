public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 50;
        int playersNumber = 30;
        if(compNumber == playersNumber) {
            System.out.println("Вы победили!");
        } else {
            while(playersNumber != compNumber) {
                if(playersNumber > compNumber) {
                    System.out.println("Число " + playersNumber + " больше загаданного компьютером");
                } else {
                    System.out.println("Число " + playersNumber + " меньше загаданного компьютером");
                }
                break;
            }
        }

    }
}