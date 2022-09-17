public class CycleTheme {

    public static void main(String[] args) {
        System.out.println("\nЗадача 1. Подсчет суммы четных и нечетных чисел");
        int counter = - 10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а сумма нечетных = " + sumOdd + ".");

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num2;
        if(num2 > num1) {
            maxNum = num2;
        } else if (num3 > num1) {
            maxNum = num3;
        }
        if(num1 < minNum) {
            minNum = num1;
        } else if (num3 < minNum) {
            minNum = num3;
        }
        System.out.println("Числа в порядке убывания : ");
        for(int i = maxNum-1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sumDigits = 0;
        System.out.print("Реверсивное число равно ");
        while(num4 != 0) {
            int lastDigit = num4 % 10;
            sumDigits += lastDigit; 
            System.out.print(lastDigit);
            num4 /= 10;
        }
        System.out.println("\n" + "Сумма цифр числа равна " + sumDigits);

        System.out.println("\nЗадача 4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int intervalLength = 23;
        for(int i = 1; i <= intervalLength; i += 2) {
            count++;
            System.out.printf("% 3d", i);
            if(count % 5 == 0) {
                System.out.println();
            }
        }
        int numZeros = intervalLength % 5;
        for(int j = 0; j < numZeros; j++)
            System.out.printf("% 3d", 0);

        System.out.println("\nЗадача 5. Проверка количества единиц на четность");
        int num5 = 3141591;
        int copyNum5 = num5;
        int countOnes = 0;
        while(copyNum5 > 0) {
            int lastDigit = copyNum5 % 10;
            if(lastDigit == 1) {
                countOnes++;
            }
            copyNum5 /= 10;
        }
        if(countOnes % 2 == 0) {
            System.out.println("Число " + num5 + " содержит " + countOnes + "(чётное) количество" + 
                    " единиц");
        } else {
            System.out.println("Число " + num5 + " содержит " + countOnes + "(нечётное) количество " + 
                    " единиц");
        }

        System.out.println("\nЗадача 6. Отображение фигур в консоли");
        int countChars = 0;
        for(int i = 1; i < 51; i++) {
            countChars++;
            System.out.print("*");
            if(countChars % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int countChars2 = 5;
        while(countChars2 != 0) {
            System.out.printf("%1." + countChars2 + "s\n", "#####");
            countChars2--;
        }
        System.out.println();
        
        int countRows = 1;
        int maxCountRows = 5;
        int maxCountSymbols = 3;
        do {
            if(countRows <= 3) {
                System.out.printf("%1." + countRows + "s\n", "$$$");
            } else {
                maxCountSymbols--;
                System.out.printf("%1." + maxCountSymbols + "s\n", "$$$");
            }
            countRows++;
        } while(countRows <= maxCountRows);

        System.out.println("\nЗадача 7. Отображение ASCII-символов");
        System.out.printf("%13s\n" , "Dec Char");
        for(char i = 1; i < 48; i += 2) {
            System.out.printf("%10s\n" ,(int) i + " = " + i);
        } 
        for(char j = 98; j < 123; j += 2) {
            System.out.printf("%10s\n" ,(int) j + " = " + j); 
        }

        System.out.println("\nЗадача 8. Проверка, является ли число палиндромом");
        int num8 = 1234321;
        int copyNum8 = num8;
        int reversedNumber = 0;
        while(copyNum8 != 0) {
            int lastDigit = copyNum8 % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            copyNum8 /= 10;
        }
        if(num8 == reversedNumber) {
            System.out.println("Число " + num8 + " является палиндромом.");
        } else {
            System.out.println("Число " + num8 + " не является палиндромом."); 
        }

        System.out.println("\nЗадача 9. Определение, является ли число счастливым");
        int luckyNum = 561644;
        int copyLuckyNum = luckyNum;
        int sumFirst3Digits = 0;
        int sumSecond3Digits = 0;
        int countDigits = 1;
        while(copyLuckyNum != 0) {
            int lastDigit = copyLuckyNum % 10;
            if(countDigits < 4) {
                sumFirst3Digits += lastDigit;
            } else {
                sumSecond3Digits += lastDigit;
            }
            copyLuckyNum /= 10;
            countDigits++;
        }
        if(sumFirst3Digits == sumSecond3Digits) {
            System.out.println("Число " + luckyNum + " является счастливым.");
        } else {
            System.out.println("Число " + luckyNum + " не является счастливым.");
        }

        System.out.println("\nЗадача 10. Вывод таблицы умножения Пифагора\n");
        System.out.printf("%35s %n", "ТАБЛИЦА   ПИФАГОРА\n");
        System.out.printf("%5s", "|");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%5d", i);
        }

        System.out.println("\n---------------------------------------------");
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.printf("%5s", j * i + "|");
                } else {
                    System.out.printf("%5d",j * i);
                }
            }
            System.out.println("");
        } 
    }
}