package Lessons.Lesson01.Lesson00;

public class Lesson00 {
/*

                                        КРАТКИЕ ЗАПИСИ КОМАНД
    psvm + Enter => public static void main(String[] args) {}
    sout + Enter => System.out.print();


                                           СОЧИТАНИЕ КЛАВИШ


    Ctrl + S: Сохранить изменения в файле.
    Ctrl + N: Открыть окно "Поиск класса".
    Ctrl + Shift + N: Открыть окно "Поиск файла".
    Ctrl + Shift + F: Поиск по всему проекту.
    Ctrl + Shift + A: Открыть окно "Действия" для выполнения различных операций.
    Ctrl + Z: Отменить последнее действие.
    Ctrl + Shift + Z: Вернуть отменённое действие.
    Ctrl + Alt + L: Код станет красивым.
    Полный список команд в меню "Help" (Справка) -> "Keymap" (Сочетания клавиш).


                                     ЧАСТИ КОДА И ЧТО ОНИ ДЕЛАЮТ
    System.out.print(); -выводит к уонсоль то что в крулых скобках

    Scanner scanner = new Scanner(System.in); -создакт метод под названием "Scanner" после чего:
    х = scanner.nextInt();                    -записывает в переменную х значение которое вводится в консоль


                              ТИП ПЕРЕМЕННОЙ И ЕГО ПАРАМЕТРЫ


    ТИП        РАЗМЕР В ПАМЯТИ                                ДИАПАЗОН ЗНАЧЕНИЙ
    byte       08 бит                                         от -128 до 127
    short      16 бит                                         от -32768 до 32767
    char       16 бит                                         от 0 до 65536
    int        32 бита                                        от -2147483648 до 2147483647
    long       64 бита                                        от -9223372036854775808 до 9223372036854775807
    float      32 бита                                        от (2^-149) до ((2-2^-23)*2^127)
    double     64 бита                                        от (-2^63) до ((2^63) - 1)
    boolean    08 бит (при использовании в массивах),         true или false
               32 бита (при использовании не в массивах)
                                                МАСИВ
    Нумерация ячеек в масиве начинается с нуля.
                                                *ОДНОМЕРНЫЕ МАСИВЫ*
    int[] numbers1 = new int[10];
    double[] numbers2 = new double[] {1.0, 1.5, 3.6};
    char[] symbols = {'a', 'b', 'c', 'd'};
    String[] words = {"hello", "my", "friend"};
    boolean[] values = {true, false, false, true};
                                        *-КАК ДАТЬ ЗНАЧЕНИЕ ЯЧЕЙКЕ ОДНОМЕРНОГО МАСИВА-*
    numbers1[9] = 29;
    numbers1[2] = 35;
    symbols[3] = we;
                                        *-+ВЫВОД ОДНОМЕРНОГО МАСИВА В КОНСОЛЬ+-*
    System.out.println(mammals.length); -Количество ячеек в масиве
    System.out.println(mammals[0]);     -Значение ячейки под номером 0
    System.out.println(mammals[1]);     -Значение ячейки под номером 1
    System.out.println(mammals[2]);     -Значение ячейки под номером 2
                                                *ДВУХМЕРНЫЕ МАСИВЫ*
    int[][] matrix = new int[10][10];
    int[][] num = {{1, 2, 3, 4}, {3, 4, 5, 6}, {7, 8, 9, 10}};
                                        *КАК ДАТЬ ЗНАЧЕНИЕ ЯЧЕЙКЕ ДВУХМЕРНОГО МАСИВА*
    matrix[0][0] = 14;
    matrix[0][1] = 34;
                                       *-+ВЫВОД ДВУХМЕРНОГО МАСИВА В КОНСОЛЬ+-*
 -Количество ячеек в масиве
    System.out.println(mammals[0][1]);     -Значение ячейки под номером 0,1
    System.out.println(mammals[1][3]);     -Значение ячейки под номером 1,3
    System.out.println(mammals[2][9]);     -Значение ячейки под номером 2,9

     for (int i = 0; i < S1; i++) {
            for (int j = 0; j < S2; j++) {

                System.out.println(mas[i][j]);        -Вывод двухмерног масива
            }
        }

                                                *ЗНАЧЕНИЯ ПО УМОЛЧАНИЮ*
    ТИП                         ЗНАЧЕНИЕ
    boolean                     false
    byte, short, int, long      0
    float, double               0.0
    char                        \u8000' (NUL)
    Все остальное               null
                                                     ЦЫКЛ
                                                  *DO-WHILE*
    do{
    то что выполняется в цыкле
    } while (условие);
                                                    *FOR*
    for (int i = 0;условие; i++){
    то что выполняется в цыкле
    }

                                                    *MATCH*
Math.pow(a,b);                                      -a(число) b(степень в которую нужно возвести число)
Math.sqrt(a);                                       -корень квадратный от a
Math.cbrt(a);                                       -корень кубический от a
Math.random();                                      -рандомное число
Math.round(a);                                      -правильное округление
Math.floor(a);                                      -округление в меньшую сторону
Math.ceil(a);                                       -округление в большую сторону
Math.abs(a);                                        -модуль числа a
Math.
Math.
Math.
Math.

String binary = Integer.toBinaryString(a);          -перевод числа A в двоичную систему






*/
}
