// ���� �� �������� �������� ���������� ������. ������������ ��� ������� �� ������ "�������", ������ � ��������.

// �������� ���������� ������������ ��������:
/*
��������
�������
������
����������
�������
 */

package skasat;

import java.io.FileNotFoundException;

import osobya.Path_V;
import pervaya.Qwerty_2_class;

public class Skasat {
	public static void skasat() {
		System.out.println("��������� �������");
		Perezapis_p4.perezapis();
		try {
			Perehod.perehod();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
