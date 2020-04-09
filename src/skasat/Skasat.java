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

public class Skasat {

    public static void skasat() {
        System.out.println("Активирую Сказать");
        Perezapis_p4.perezapis();
        Perehod.perehod();
    }

}
