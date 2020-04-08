//Этот файл должен создавать переменную V, для файла Perem

package osobya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Path_V {
	public static String TOv;
	public static String konez_Varianta="t"+Perem.T+"v"+Perem.V;
	public static void path_V() throws FileNotFoundException {
		String path = "src//fails//Komnaty";
		File file = new File(path);
		
	Scanner scanner_slov = new Scanner(file);
	String line = scanner_slov.nextLine();
	System.out.println("V"+Perem.V);
	String nomer_Varianta="T"+Perem.T+"V"+Perem.V;
	konez_Varianta="t"+Perem.T+"v"+Perem.V;
	//String konez_Varianta="t"+Perem.T+"v"+Perem.V;
	System.out.println(nomer_Varianta);
	System.out.println("Вывожу конец варианта: "+konez_Varianta);
	Path_V.TOv=line.substring(line.indexOf(nomer_Varianta)+nomer_Varianta.length()+1,line.indexOf(Path_V.konez_Varianta)); // Некоторые особые символы он не читает. Используй буквенные сочетания!
	System.out.println(Path_V.TOv);
	System.out.println();
	scanner_slov.close();
	}
	
}
