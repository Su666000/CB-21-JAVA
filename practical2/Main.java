import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Для показательности делаю разными методами
        System.out.printf("Примитивные типи даних y Java\n");
        System.out.printf("Тип даних int y Java використовується для представлення цілих чисел. Він може зберігати числа в діапазоні від -2147\n" +
                "483 648 до 2 147483647.\n" +
                "Розмір\nТип даних int займає 4 байти пам яті\n");
        System.out.printf("Тип даних short y Java використовується для представлення цілих чисел, які потребують меншого діапазону значень, ніж int. Він може зберігати числа в діапазоні від -32768 до 32767.\n" +
                "Розмір\nТип даних short займає 2 байти пам'яті\n");
        System.out.printf("Тип даних long y Java використовується для п які потребують більшого діапазону значень, ється для представлення 1, які потребують ніж int." +
                "Він може зберігати числа в діапазоні від " + Long.MIN_VALUE + " до " + Long.MAX_VALUE + " Всего: " + Long.BYTES + "\n");

        System.out.printf("Максимальное значение: %d байт, Min = %d Все = %d\n",
                Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.BYTES);

        System.out.printf("Тип даних char в Java призначений для зберігання окремих символів. Він використовується для представлення бу цифр, знаків пунктуації та інших символів.\n" +
                "Значення char записується в одинарних лапках. Наприклад, 'A', 'b', '1', '!' - це приклади значень типу char.\n" +
                "Розмір\nТип даних char займає 2 байти пам'яті.\n");

        System.out.printf("Тип даних boolean (булеве значення) використовується для представлення логічних значень, які можуть бути істинними (true) або хибними (false).\n" +
                "Розмір. Хоча розмір примітивного типу boolean не визначений специфікацією Java, зазвичай він займає 1 байт (8 біт) або більше залежно від конкретної реалізації JVM.\n");

        System.out.printf("Тип даних float в Java призначений для представлення чисел з плаваючою комою. Його використовують для збереження значень, які можуть мати дробову частину.\n" +
                "Наприклад, ви можете використовувати float для збереження значень висоти, ваги або температури.\n" +
                "Розмір\nТип даних float займає 4 байти пам\n");

        System.out.printf("Тип даних double в Java призначений для представлення чисел з плаваючою комою. Він використовується для зберігання дрібних чисел, таких як 3.14, 2.718, 1.618 та інших.\n" +
                "Розмір\nТип double має більшу точність, ніж тип float, і займає 8 байтів пам'яті.\n");

        System.out.printf("тип даних void в Java використовується для позначення того, що метод не повертає жодного значення. Це особливий ип, який не може зберігатися у змінних.\n" +
                "Методи з типом повернення void часто виконують завдання, які змінюють стан програми, наприклад, виводять дані на кран, записують інформацію в файл або взаємодіють з іншими компонентами програми\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Перетворення\n");

        System.out.print("Введите целое число (int) --> ");
        int intValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Вы ввели int: " + intValue);

        System.out.print("Введите длинное число (double) --> ");
        double doubleValue = Double.parseDouble(scanner.nextLine());
        System.out.println("Вы ввели double: " + doubleValue);

        System.out.print("Введите символ (char) --> ");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("Вы ввели char: " + charValue);

        System.out.print("Введите логичное значение (true/false) _--> ");
        boolean boolValue = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Вы ввели boolean: " + boolValue);

        System.out.print("Введите короткое целое число (short) --> ");
        short shortValue = Short.parseShort(scanner.nextLine());
        System.out.println("short: " + shortValue);

        System.out.print("Введите маленькое целое число (byte)--> ");
        byte byteValue = Byte.parseByte(scanner.nextLine());
        System.out.println("Вы ввели byte: " + byteValue);

        System.out.print("Введите длинное целое число (long) --> ");
        long longValue = Long.parseLong(scanner.nextLine());
        System.out.println("Вы ввели long: " + longValue);

        System.out.print("Введите дробное число (float) --> ");
        float floatValue = Float.parseFloat(scanner.nextLine());
        System.out.println("Вы ввели float: " + floatValue);

        System.out.print(":)");
    }
}
