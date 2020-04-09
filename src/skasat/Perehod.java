// Описание подпроцессов процедуры  Skasat.
// Это подпроцедура №5. Последняя и особая подпроцедура.
// Берёт переменную W и на основе её выбирает один из 10 вариантов развития событий, описанных в файле Комнаты. 
// В конце каждого варианта должен стоять символ флажок, после которого указан индивидуальный номер следующей комнаты. 
// Переход меняет переменные в классе Perem и, таким образом осуществляет передвижения игрока между "комнатами" квеста.
// В случае отсутствия файла с этим индвидуальным номером вызываются события класса Sintez. 

package skasat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import osobya.Path_T;
import osobya.Path_V;
import osobya.Perem;

public class Perehod {

    public static void perehod() throws FileNotFoundException {
        String path = "src//fails//Komnaty";
        File file = new File(path);

        Scanner scanner_slov = new Scanner(file);
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

        Perem.T = Integer.parseInt(T); // Perem.T будет РАВЕН значению из подстроки от Конца
                                       // варианта до Символа стопора, из файла Комнаты.
        try {
            Path_T.path_T();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        scanner_slov.close();
    }

}
