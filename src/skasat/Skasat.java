package skasat;

import osobya.Path_V;
import osobya.Rooms;

public class Skasat {

    /**
     * Одна из основных процедур текстового квеста. Активируется при нажатии на
     * кнопку "Сказать", отсюда и название.
     * 
     * Вызывает поочерёдное срабатывания процедур: Разделка, Выборка, Замена,
     * Перезапись и Переход
     * 
     * @return номер следующей комнаты
     */
    public static int skasat(Rooms rooms) {
        System.out.println("Активирую Сказать");
        // Эта штука постоянно поганит файл Slovar, так что я пока выключу, чтобы не
        // мешалась
        // @todo осознать, что с этим делать и починить
        // Perezapis_p4.perezapis();
        return perehod(rooms);
    }

    /**
     * 
     * @return номер следующей комнаты
     */
    public static int perehod(Rooms rooms) {
        String variantMarker = Path_V.konez_Varianta;
        System.out.println("Показываю конец варианта: " + variantMarker);
        System.out.println("Показываю стопор конца варианта: " + "s" + variantMarker);

        System.out.println("Показываю вариант ведущий в комнату: " + Path_V.TOv);
        System.out.println();

        int nextRoom = rooms.getRoomNumberByVariantMarker(variantMarker);
        // nextRoom будет РАВЕН значению из подстроки от Конца
        // варианта до Символа стопора, из файла Комнаты.

        System.out.println("Показываю автоматический номер комнаты: " + nextRoom);
        // Знать бы, о чём это:
        // Некоторые особые символы он не читает.
        // Используй буквенные сочетания!

        return nextRoom;
    }

}
