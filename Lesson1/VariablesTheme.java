public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их на консоль");
        byte countCores = 4;
        short win = 10;
        int hdMemory = 476;
        long compCost = 49000;
        float cpuFrq = 2.4F;
        double ram = 8.0;
        char fileLocation = 'C';
        boolean isMine = false;
        System.out.println("Мой компьютер имеет " + countCores + " ядра");
        System.out.println("Версия Windows " + win +", " + "Память " + hdMemory + " GB");
        System.out.println("Стоимость компьютера около " + compCost + " рублей");
        System.out.println("Частота процессора " + cpuFrq + " Ghz, "+ "Оп.память " + ram + "ГБ");
        System.out.println("Все данные на компьютере находятся в папке " + fileLocation);
        System.out.println("То, что этот компьютер принадлежит мне является " + isMine);
        System.out.println();

        System.out.println("Задача 2:Расчет стоимости товара со скидкой");
        float penPrice = 100F;
        float bookPrice = 200F;
        float sumPrice = penPrice + bookPrice;
        float percentageDiscount = 0.11F;
        float discount = sumPrice * percentageDiscount;
        float discountPrice = sumPrice - discount;
        System.out.println("Сумма скидки за ручку и книгу равна " + discount + " рубля.");
        System.out.println("Сумма ручки и книги со скидкой равна " + discountPrice + " рублей.");
        System.out.println();

        System.out.println("Задача 3 : Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a ");
        System.out.println();

        System.out.println("Задача 4 : Отображение min и max значений числовых типов данных");
        byte byteMax1 = 127;
        System.out.println("Макс. значение byte числа равно " + byteMax1);
        byteMax1++;
        System.out.println("Макс. значение byte числа после инкремента равно " + byteMax1);
        byteMax1--;
        System.out.println("Макс. значение byte числа после декремента равно " + byteMax1);
        short shortMax2 = 32_767;
        System.out.println("Макс. значение short числа равно " + shortMax2);
        shortMax2++;
        System.out.println("Макс. значение short числа после инкремента равно " + shortMax2);
        shortMax2--;
        System.out.println("Макс. значение short числа после декремента равно " + shortMax2);
        int intMax3 = 2_147_483_647;
        System.out.println("Макс. значение int числа равно " + intMax3);
        intMax3++;
        System.out.println("Макс. значение int числа после инкремента равно " + intMax3);
        intMax3--;
        System.out.println("Макс. значение int числа после декремента равно " + intMax3);
        long longMax4 = 9_223_372_036_854_775_807L;
        System.out.println("Макс. значение long числа равно " + longMax4);
        longMax4++;
        System.out.println("Макс. значение long числа после инкремента равно " + longMax4);
        longMax4--;
        System.out.println("Макс. значение long числа после декремента равно " + longMax4);
        System.out.println(); 

        System.out.println("Задача 5 : Перестановка значений переменных");
        System.out.println("Перестановка значений с использование дополнительной переменной");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходное значение переменной num1 равно " + num1);
        System.out.println("Исходное значение переменной num2 равно " + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("после перестановки num1 равно " + num1);
        System.out.println("после перестановки num2 равно " + num2);
        System.out.println("Перестановка значений с использование арифметической операции");
        System.out.println("Исходное значение переменной num1 равно " + num1);
        System.out.println("Исходное значение переменной num2 равно " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("после перестановки num1 равно " + num1);
        System.out.println("после перестановки num2 равно " + num2);
        System.out.println("Перестановка значений с использование побитовой операции");
        System.out.println("Исходное значение переменной num1 равно " + num1);
        System.out.println("Исходное значение переменной num2 равно " + num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("после перестановки num1 равно " + num1);
        System.out.println("после перестановки num2 равно " + num2);
        System.out.println();

        System.out.println("Задача 6 : Вывод символов и их кодов");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println((int) codeChar1 + " = " + codeChar1);
        System.out.println((int) codeChar2 + " = " + codeChar2);
        System.out.println((int) codeChar3 + " = " + codeChar3);
        System.out.println((int) codeChar4 + " = " + codeChar4);
        System.out.println((int) codeChar5 + " = " + codeChar5); 
        System.out.println();

        System.out.println("Задача 7 : Отображение количества сотен, десятков и единиц числа");
        int num3 = 123;
        int countHund = num3 / 100;
        int countTen = (num3 / 10) % 10;
        int countOne = num3 % 10;
        System.out.println("Число " + num3 + " содержит " + countHund + " сотню.");
        System.out.println("Число " + num3 + " содержит " + countTen + " десятка.");
        System.out.println("Число " + num3 + " содержит " + countOne + " единицы.");
        System.out.println();

        System.out.println("Задача 8 : Вывод на консоль ASCII-арт Дюка");
        char space = 0;
        char slash = 47;
        char backSlash = 92;
        char oBracket = 40;
        char cBracket = 41;
        char underline = 95;
        System.out.println("" + space + space + space + space + slash + backSlash);
        System.out.println("" + space + space + space + slash + space + space + backSlash);
        System.out.println("" + space + space + slash + underline + oBracket + space + cBracket + 
                backSlash);
        System.out.println("" + space + slash + space + space + space + space + space + space + 
                backSlash);
        System.out.println("" + slash + underline + underline + underline + underline + slash + 
                backSlash + underline + underline + backSlash);
        System.out.println("");

        System.out.println("Задача 9 : Произведение и сумма цифр числа");
        int num4 = 345;
        int digit1 = num4 / 100;
        int digit2 = (num4 / 10) % 10;
        int digit3 = num4 % 10;
        int sumDigits = digit1 + digit2 + digit3;
        int multDigits = digit1 * digit2 * digit3;
        System.out.println("Сумма цифр числа " + num4 + " равна " + sumDigits);
        System.out.println("Произведение цифр числа " + num4 + " равна " + multDigits);
        System.out.println();
        
        System.out.println("Задача 10 : Преобразование секунд");
        int amountSec = 86399;
        int amountHours = amountSec / 3600;
        int amountMin = (amountSec / 60) % 60;
        int amountSec1 = amountSec % 60;
        System.out.println(amountHours + ":" + amountMin + ":" + amountSec1);
        System.out.println();
    }
}