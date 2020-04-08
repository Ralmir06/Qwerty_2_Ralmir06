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

import java.io.FileNotFoundException;

import osobya.Path_V;
import pervaya.Qwerty_2_class;

public class Skasat {
	public static void skasat() {
		System.out.println("Активирую Сказать");
		Perezapis_p4.perezapis();
		try {
			Perehod.perehod();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
