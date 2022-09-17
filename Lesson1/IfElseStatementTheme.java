public class IfElseStatementTheme {

    public static void main(String[] args) { 
        System.out.println("Задача 1. Перевод псевдокода на язык Java");
        int age = 15;
        if(age > 20) {
            System.out.println("Вам уже идёт третий десяток :)");
        } else {
            System.out.println("Вы ещё тинэйджер :)");
        }
        boolean male = false;
        if(!male) {
            System.out.println("Вы мужик!");
        } else {
            System.out.println("Вы женщина!");
        }
        int height = 270;
        if(height < 180) {
            System.out.println("вы среднего или низкого роста");
        } else {
            System.out.println("Дядь! Достань воробушка!");
        }
        char firstNameLetter = "Mike".charAt(0);
        if(firstNameLetter == 'M') {
            System.out.println("Ваше имя начинается с буквы М");
        } else if(firstNameLetter == 'I') {
            System.out.println("Ваше имя начинается с буквы I");
        }

        System.out.println("\nЗадача 2. Поиск max и min числа");
        byte num1 = 61;
        byte num2 = 111;
        if(num1 > num2) {
            System.out.println("Первое число " + num1 + " максимальное." + " Второе число " 
                    + num2 + " минимальное");
        } else if(num1 < num2) {
            System.out.println("Второе число " + num2 + " максильманое." + " Первое число " 
                    + num1 + " минимальное");
        } else {
            System.out.println("Числа равны.");
        }

        System.out.println("\nЗадача 3. Работа с числом");
        short num3 = -11;
        if(num3 != 0) {
            if(num3 > 0) {
                System.out.println("Число " + num3 + " положительное");
            } else {
                System.out.println("Число " + num3 + " отрицательное");
            } 
            if(num3 % 2 == 0) {
                System.out.println("Число " + num3 + " чётное");
            } else {
                System.out.println("Число " + num3 + " нечётное");
            }
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах");
        int num4 = 141;
        int num5 = 121;
        int hund1 = num4 / 100;
        int ten1 = (num4 / 10) % 10;
        int one1 = num4 % 10;
        int hund2 = num5 / 100;
        int ten2 = (num5 / 10) % 10;
        int one2 = num5 % 10;
        if(hund1 == hund2) {
            System.out.println("Число " + num4 + " и число " + num5 + " имеют одинаковую цифру " 
                    + hund1 + " в третьем разряде");
        } else {
            System.out.println("Число " + num4 + " и число " + num5 + " не имеют одинаковую цифру " 
                    + " в третьем разряде");
        }
        if(ten1 == ten2) {
            System.out.println("Число " + num4 + " и число " + num5 + " имеют одинаковую цифру " 
                    + hund1 + " во втором разряде");
        } else {
            System.out.println("Число " + num4 + " и число " + num5 + " не имеют одинаковую цифру " 
                    + " вj втором разряде");
        }
        if(one1 == one2) {
            System.out.println("Число " + num4 + " и число " + num5 + " имеют одинаковую цифру " 
                    + hund1 + " во первом разряде");
        } else {
            System.out.println("Число " + num4 + " и число " + num5 + " не имеют одинаковую цифру " 
                    + " в первом разряде");
        }

        System.out.println("\nЗадача 5. Определение буквы, числа или символа по их коду");
        char codeChar = '\u0057';
        if(codeChar >= 'a' && codeChar <= 'z') {
            System.out.println("Символ " + codeChar + " является маленькой буквой");
        } else if(codeChar >= 'A' && codeChar <= 'Z') {
            System.out.println("Символ " + codeChar + " является большой буквой");
        } else if(codeChar >= '0' && codeChar <= '9') {
            System.out.println("Символ " + codeChar + " является числом");
        } else {
            System.out.println("Символ " + codeChar + " не буква и не число");
        }

        System.out.println("\nЗадача 6. Определение суммы вклада и начисленных банком %");
        float sumRub = 1_000_000;
        float profitPercentage = 0.05F;
        float profitPercentage1 = 0.07F;
        float profitPercentage2 = 0.1F;
        float finalPercentage = 0.05F;
        if(sumRub >= 100_000 && sumRub <= 300_000) {
            finalPercentage = profitPercentage1;
        } else if(sumRub > 300_000) {
            finalPercentage = profitPercentage2;
        }
        float profitSum = sumRub * finalPercentage;
        float finalSum = sumRub * (1 + finalPercentage);
        System.out.println("Сумма вклада равна " + sumRub + " , начисленные проценты равны " 
            + profitSum + " , итоговая сумма вклада равна " + finalSum);

        System.out.println("\nЗадача 7. Определение оценки по предметам");
        int historyPercent = 59;
        int codingPercent = 91;
        int historyMark = 1;
        int codingMark = 1;
        if(historyPercent <= 60) {
            historyMark = 2;
        } else if(historyPercent > 60 && historyPercent <=73) {
            historyMark = 3;
        } else if(historyPercent > 73 && historyPercent <=91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }
        if(codingPercent <= 60) {
            codingMark = 2;
        } else if(codingPercent > 60 && codingPercent <=73) {
            codingMark = 3;
        } else if(codingPercent > 73 && codingPercent <=91) {
            codingMark = 4;
        } else {
            codingMark = 5;
        }
        int evarageMark = (historyMark + codingMark) / 2;
        int evaragePercent = (historyPercent + codingPercent) / 2;
        System.out.println("У студента оценка по истории " + historyMark + " , оценка по " + 
            "программированию равна " + codingMark);
        System.out.println("Средний бал оценок по истории и программированию равен " + evarageMark);
        System.out.println("Средний процент по предметам равен " + evaragePercent);

        System.out.println("\nЗадача 8. Расчет прибыли");
        int rentMonth = 5_000;
        int evarageSales = 13_000;
        int monthExpenses = 9_000;
        int countMonth = 12;
        int annualProfit = (evarageSales - rentMonth - monthExpenses) * countMonth;
        if(annualProfit > 0) {
            System.out.println("Прибыль за год : " + " +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год : " + annualProfit + " руб.");
        }

        System.out.println("\nЗадача 9. Подсчет количества банкнот");
        int money = 567;
        int countTen = (money / 10) % 10;
        int countHund = money / 100;
        int countOne = money % 10;
        int restTen = 5;
        if(restTen < countTen) {
            countOne += (countTen - restTen) * 10;
            countTen = restTen;
        }
        money = countOne + countTen * 10 + countHund * 100;
        System.out.println("При снятии денег в этом кривом банкомате вы получите на руки " + 
                countHund + " сотенных купюр, " + countTen + " купюр номиналом 10 , " + countOne + 
                " купюр номиналом 1 ");
        System.out.println("После снятия денег в банкомате вы проверили выданную сумму, " + 
            "она составила " + money);
    }
}