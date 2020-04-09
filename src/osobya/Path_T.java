//Этот файл должен создавать переменную T, для файла Perem

package osobya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Path_T {

    // что мы вообще тут делаем?
    // @todo переименовать во что-то отражающее суть
	public static String path_T() throws FileNotFoundException {
		String path = "src\\fails\\Komnaty";
		File file = new File(path);

		String line = readRooms(file);
		System.out.println("T" + Perem.T);
		String nomer_komnaty = "T" + Perem.T;
		String konez_komnaty = "t" + Perem.T;
		
		// что такое tok?!
	    String tok = line.substring(line.indexOf("T" + Perem.T) + nomer_komnaty.length() + 1,
				line.indexOf(konez_komnaty)); // Некоторые особые символы он не читает. Используй буквенные сочетания!
		// ВМЕСТО 3 (ТРОЙКА) ДОЛЖНО БЫТЬ ЧТО-ТО ДРУГОЕ, ВЕДЬ С 3 (ТРОЙКОЙ) ОН НЕ СМОЖЕТ
		// ПРОЧИТАТЬ ДВУЗНАЧНЫЕ НАЗВАНИЯ КОМНАТ!!!
		System.out.println(tok);
		System.out.println();
		return tok;
	}

    private static String readRooms(File file) throws FileNotFoundException {
        try(Scanner scanner_slov_1 = new Scanner(file)) {
		    return scanner_slov_1.nextLine();
		}
    }

}
