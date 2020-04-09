// Описание подпроцессов процедуры Podumat.
// Это подпроцедура №2. Её задача взять слово из массива Slova, добавить к нему индивидуальный номер комнаты и искать получившуюся смесь букв и цифр в файле Словарь.

// Если таковая смесь встречается, то отступить от неё один символ,взять десять чисел, что там будут (до символа-стопора), и превратить их в числовой массив Slova+[],
// заметим, что значения не прибавляются, а присваиваются, чем заменяют предыдущие значения массива Slova+[], избавляя от необходимости обнуления переменной.
// Выполнить процедуру № 3 и вернуться к выполнению процедуры 2, пока массив Slova не будет окончен.

// Если таковая смесь не встречается, то создать оную используя слово из массива Slova, добавив к нему индивидуальный номер комнаты и, отступив пробел 10 (десять) 
// нулей через запятую, добавив в конце символ-стопор (подумать какой это будет символ; пока что никакого стопора я не добавлял, тупо отсчитал нужное кол-во знаков).
// А СТОПОР ТО НУЖЕН! Иначе он не сможет работать с числами кроме тех, что состоят из одной цифры.


package podumat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

import osobya.Rooms;
import osobya.Perem;

public class Prochedura_2 {
	//Podumat.predl
	//Prochedura_1.slova
	public static int [] slova_plus; //ВОТ ЗДЕСЬ первое появление МАССИВА slova_plus!
	
	public static void prochedura_2() {
		System.out.println("Программа берёт массив слов и работает с каждым отдельно. ");
		//Prochedura_1.slova
			for (int i = 0; i < Prochedura_1.slova.length; i++) {
		System.out.print("Сейчас берём слово: \""+Prochedura_1.slova[i]+"\". ");
		System.out.println("Добавляем к этому слову индвидуальный номер комнаты.");
		if (Prochedura_1.slova[i].equals("я"))
		{
			Prochedura_1.slova[i]="\\я";
			System.out.println("ВНИМАНИЕ: Обнаружен особый символ. Дополнительно добавляю черту-разделитель: "+"\\я");
		}
		Prochedura_1.slova[i]=Prochedura_1.slova[i].toLowerCase()+"T"+Perem.T;  //Таким образом массив Слова будет просто перезаписываться, без создания массива Слова+... Может так и надо.
		System.out.print("В результате мы получаем: ");
		System.out.println("\""+Prochedura_1.slova[i]+"\"");
		
		String path = "src//fails//Slovar";
		File file_slov = new File(path);
		String sear =Prochedura_1.slova[i];
	Scanner scanner_slov;
	try {
		scanner_slov = new Scanner(file_slov);
		boolean flag_slova=false;
		
        while (scanner_slov.hasNext()) {
            String search = scanner_slov.next();
            //System.out.println("ЭТО ТЕ ДАННЫЕ, ЧТО МЫ ПРОВЕРЯЕМ:"+search);

            if (search.equalsIgnoreCase(sear)) {
                System.out.println("Найдено: " +search);
                
                scanner_slov = new Scanner(file_slov);
        		String line_slov = scanner_slov.nextLine();
        		//System.out.println("line_slov "+line_slov);
        		System.out.println(Prochedura_1.slova[i]);
        		int poz_slova = line_slov.indexOf(Prochedura_1.slova[i]);
        		System.out.println(Prochedura_1.slova[i]);
        		System.out.println("Позиция слова: "+poz_slova);
        		int razmer = Prochedura_1.slova[i].length();
        		System.out.println("Размер слова: "+razmer);
        		int stopor=line_slov.indexOf("ST"+Prochedura_1.slova[i])+-1;
        		System.out.println("Позиция стопора: "+stopor);
        		System.out.println("Позиция ручного стопора: "+poz_slova+razmer+20);
        		String line_slova = line_slov.substring(poz_slova+razmer+1,stopor);
        		//System.out.println("liniya_slova");
        		//System.out.println(line_slova);
        		Prochedura_2.slova_plus = Arrays.stream(line_slova.split(",")).mapToInt(Integer::parseInt).toArray(); // ВОТ ЗДЕСЬ МАССИВ slova_plus!
        		System.out.println(Arrays.toString(Prochedura_2.slova_plus));
        		flag_slova=true;
        		Prochedura_3.prochedura_3();
                
            } 
            else  {
                //System.out.println("Такого слова программа не нашла.");
            	  }  
        }

        if (flag_slova==true) {
        	System.out.println("Флаг поднят, теперь я его опускаю");
        	flag_slova=false;
        }
        else { 
        	String text = " "+Prochedura_1.slova[i]+" "+"0,0,0,0,0,0,0,0,0,0"+" "+"ST"+Prochedura_1.slova[i];
        	System.out.println("Флаг опущен, а значит такого слова нет в Словаре.");
        	System.out.println("Добавляю слово в конец Словаря.");
	   	 	try {
	   	 		Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
	   	 	}
	   	 	catch (IOException e) {
	   	 		System.out.println(e);
	   	 	}
        }
        scanner_slov.close();	 		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
			System.out.println(Arrays.toString(Prochedura_1.slova));
			
	}
	
}
