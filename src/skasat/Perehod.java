// Описание подпроцессов процедуры  Skasat.
// Это подпроцедура №5. Последняя и особая подпроцедура.
// Берёт переменную W и на основе её выбирает один из 10 вариантов развития событий, описанных в файле Комнаты. 
// В конце каждого варианта должен стоять символ флажок, после которого указан индивидуальный номер следующей комнаты. 
// Переход меняет переменные в классе Perem и, таким образом осуществляет передвижения игрока между "комнатами" квеста.
// В случае отсутствия файла с этим индвидуальным номером вызываются события класса Sintez. 

package skasat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import osobya.Rooms;
import osobya.Path_V;
import osobya.Perem;

public class Perehod {

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
