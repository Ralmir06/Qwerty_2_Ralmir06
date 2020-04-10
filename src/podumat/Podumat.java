// Одна из основных процедур текстового квеста. Активируется при нажатии на кнопку "Подумать", отсюда и название.

// Вызывает поочерёдное срабатывания процедур:
/*
Процедура №1
Процедура №2
Процедура №3
Процедура массива
Значение массива
 */

package podumat;

import java.io.FileNotFoundException;

import osobya.Path_V;
import osobya.Perem;
import pervaya.Qwerty_2_class;

public class Podumat {
public static String predl;
	public void podumat(int roomNumber) {
		String text = Qwerty_2_class.textField.getText();
		
		text = text.replaceAll("( )\\1+", "$1"); //Это способ заменять определённые символы в строке. Забавно, что сами символы указываются в скобках (), затем все эти символы объединяются в групп 1.
												//А знак доллар и единица, позволяет заменять кучу повторяющихся символов из группы () на такой же, но 1. Знак доллара можно заменять на другие. См.в интернете.
		System.out.println(text);//"kesh"
		text = text.startsWith(" ") ? text.substring(1) : text; // А это регулярное выражение для замены исключительно первого символа в строке, если он равен символу в скобха... Очень помогает вместо цикла.
		System.out.println("Обнаружен пробел, удаляю его: " +text);
		Podumat.predl=text;
				
		System.out.println("Программа подхватила предложение: \""+Podumat.predl+"\"; и теперь обрабатывает его!");
		Qwerty_2_class.textField.setText("");
		Prochedura_1.prochedura_1();
		Znach_massiv.znach_massiv();
		
		System.out.println("Наибольший элемент массива, имеет номер (начиная с нуля): "+Proch_massiv.max_index);
		System.out.println("А значит в строку Сказать мы подставим вариант под номером: "+Proch_massiv.max_index);
		Perem.W=Proch_massiv.max_index;
		Perem.V=Perem.W;
		try {
			Path_V.path_V(roomNumber);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
