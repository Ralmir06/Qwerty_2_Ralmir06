// Одна из основных процедур текстового квеста. Активируется при нажатии на кнопку "Сказать", отсюда и название.

// Вызывает поочерёдное срабатывания процедур:
/*
Разделка
Выборка
Замена
Перезапись
Переход
 */

package skasat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import osobya.Path_V;

public class Skasat {

    /**
     *
     * @return номер следующей комнаты
     */
    public static int skasat() {
        System.out.println("Активирую Сказать");
        // Эта штука постоянно поганит файл Slovar, так что я пока выключу, чтобы не мешалась
        // @todo осознать, что с этим делать и починить
        // Perezapis_p4.perezapis();
        return perehod();
    }

    /**
     *
     * @return номер следующей комнаты
     */
    public static int perehod() {
        // что? почему опять читаем тот же файл?
        String path = "src//fails//Komnaty";
        File file = new File(path);

        // @todo избавиться от дублирования с Rooms
        // а пока просто перевыбросим исключение
        Scanner scanner_slov = createScanner(file);
        String line = scanner_slov.nextLine();
        System.out.println("Переменную Т");
        System.out.println("Показываю конец варианта: " + Path_V.konez_Varianta);
        System.out.println("Показываю стопор конца варианта: " + "s" + Path_V.konez_Varianta);
        String T = line.substring(
                line.indexOf(Path_V.konez_Varianta) + Path_V.konez_Varianta.length() + 1,
                line.indexOf("s" + Path_V.konez_Varianta) + -1);
        /*
         * String zT="s"+Path_V.konez_Varianta; System.out.println(zT); int
         * rT=Path_V.konez_Varianta.length()+1; String
         * T=line.substring(line.indexOf(Path_V.konez_Varianta),line.indexOf("s"+Path_V.
         * konez_Varianta));
         */
        System.out.println("Показываю автоматическим номер комнаты БЕЗ ОБРАБОТКИ в число: " + T);
        Integer.parseInt(T);
        System.out.println("Показываю автоматический номер комнаты: " + T);// Некоторые особые
                                                                           // символы он не читает.
                                                                           // Используй буквенные
                                                                           // сочетания!

        System.out.println("Показываю вариант ведущий в комнату: " + Path_V.TOv);
        System.out.println();

        int nextRoom = Integer.parseInt(T); // Perem.T будет РАВЕН значению из подстроки от Конца
                                       // варианта до Символа стопора, из файла Комнаты.

        // @todo надо использовать try with resources
        // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        scanner_slov.close();

        return nextRoom;
    }

    private static Scanner createScanner(File file) {
        try {
            return new Scanner(file);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

}
