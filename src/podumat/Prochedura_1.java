// �������� ������������ ��������� Podumat.
// ��� ������������ �1. Ÿ ������ ��������� ����� �� ����������� ���������� � �������� � ������ slova[], ���� String. 

package podumat;

import java.util.Arrays;

public class Prochedura_1 {
	public static String [] slova;
	
	public static void prochedura_1() {
	Prochedura_1.slova = Podumat.predl.split(" ");
	System.out.print("��������� ��������� ����������� �� �����, � �������� ��������� ������ ������ (����� ����� �������): ");
	System.out.println(Arrays.toString(Prochedura_1.slova));
	Prochedura_2.prochedura_2();
	}
}
