// Это класс-процедура для обнуления всех элементов массива Varianty[]

package podumat;

import java.util.Arrays;
import osobya.Perem;

public class Znach_massiv {
	public static void znach_massiv() {
		for (int i = 0; i < Perem.varianty.length; i++)
		{
			Perem.varianty[i]=0;
		}
		System.out.println();
		System.out.println("А теперь мы обнулили массив Вариантов. Получив: "+Arrays.toString(Perem.varianty));
	}
}
