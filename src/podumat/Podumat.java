// ���� �� �������� �������� ���������� ������. ������������ ��� ������� �� ������ "��������", ������ � ��������.

// �������� ���������� ������������ ��������:
/*
��������� �1
��������� �2
��������� �3
��������� �������
�������� �������
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
		
		text = text.replaceAll("( )\\1+", "$1"); //��� ������ �������� ����������� ������� � ������. �������, ��� ���� ������� ����������� � ������� (), ����� ��� ��� ������� ������������ � ����� 1.
												//� ���� ������ � �������, ��������� �������� ���� ������������� �������� �� ������ () �� ����� ��, �� 1. ���� ������� ����� �������� �� ������. ��.� ���������.
		System.out.println(text);//"kesh"
		text = text.startsWith(" ") ? text.substring(1) : text; // � ��� ���������� ��������� ��� ������ ������������� ������� ������� � ������, ���� �� ����� ������� � ������... ����� �������� ������ �����.
		System.out.println("��������� ������, ������ ���: " +text);
		Podumat.predl=text;
				
		System.out.println("��������� ���������� �����������: \""+Podumat.predl+"\"; � ������ ������������ ���!");
		Qwerty_2_class.textField.setText("");
		Prochedura_1.prochedura_1();
		Znach_massiv.znach_massiv();
		
		System.out.println("���������� ������� �������, ����� ����� (������� � ����): "+Proch_massiv.max_index);
		System.out.println("� ������ � ������ ������� �� ��������� ������� ��� �������: "+Proch_massiv.max_index);
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
