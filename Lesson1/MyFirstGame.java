public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 50;
        int playerNumber = 55;
        while(playerNumber != compNumber) {
            if(playerNumber > compNumber) {
                System.out.println("Число " + playerNumber + " больше загаданного компьютером");
                playerNumber--;
            } else {
                System.out.println("Число " + playerNumber + " меньше загаданного компьютером");
                playerNumber++;
            }
        }
        System.out.println("Вы угадали число! Поздравляем!");
    }
}