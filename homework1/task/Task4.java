/*
* Задано уравнение вида q + w = e, q, w, у >= 0
Некоторые цифры могут быть заменены знаком вопроса, например
2? + ?5 = 69
Нужно восстановить все цифры (хотя бы одно решение) или сообщить, что решения нет

Что-то кажется, что постановка неполная. Не хватает ограничения на количество вопросов. Валидно ли будет такое уравнение:
??? + ? = ????
или нет?

Для начала сделаем допущение, что ? — это одна и та же цифра во всех числах
*/
package homework1.task;

public class Task4 {
    public static void run() {
        System.out.println(whatDigits("?5??5", 3));
    }


    public static int whatDigits(String testedNumber, int multi) {
        char toFind = '?';
        System.out.println(testedNumber.length());
        int power = testedNumber.length() - 1;
        int result = 0;
        for (int i = testedNumber.length() - 1; i >= 0; i--) {
            System.out.println("27 i = " + i);
            if (testedNumber.charAt(i) == toFind) {
                result += (int) (Math.pow(10, (power - i))) * multi;
                System.out.println("30 i = " + i + "result = " + result);
            } else {
                result += Character.getNumericValue(testedNumber.charAt(i)) * (Math.pow(10, (power - i)));
                System.out.println("33 i = " + i + " result = " + result);
                System.out.println("34 testedNumber.charAt(i) = " +testedNumber.charAt(i));

            }

        }
        return result;
    }
    
}
