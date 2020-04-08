// Описание подпроцессов процедуры Podumat.
// Это подпроцедура №3. Её задача сложить значения массивов varyanty[] и slova_plus[].

package podumat;

import java.util.Arrays;

import osobya.Perem;

public class Prochedura_3 {
	public static void prochedura_3() {
		//Prochedura_2.slova_plus=Perem.varianty;
		for (int i = 0; i < Perem.varianty.length; i++)
		{
			Perem.varianty[i]=Prochedura_2.slova_plus[i]+Perem.varianty[i];
		}
		System.out.println();
		System.out.println("Мы добавляем данные в массив данных Варианты. Получая: "+Arrays.toString(Perem.varianty));
		System.out.println();
		Proch_massiv.proch_massiv();
	}
}
