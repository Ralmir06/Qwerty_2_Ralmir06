// Описание подпроцессов процедуры Podumat.
// Это подпроцедура №1. Её задача разделить слова из поступившей информации и включить в массив slova[], типа String. 

package podumat;

import java.util.Arrays;

public class Prochedura_1 {
	public static String [] slova;
	
	public static void prochedura_1() {
	Prochedura_1.slova = Podumat.predl.split(" ");
	System.out.print("Программа разделила предложение на слова, и получила следующий массив данных (далее через запятую): ");
	System.out.println(Arrays.toString(Prochedura_1.slova));
	Prochedura_2.prochedura_2();
	}
}
