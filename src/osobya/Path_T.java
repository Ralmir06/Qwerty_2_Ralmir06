//���� ���� ������ ��������� ���������� T, ��� ����� Perem

package osobya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Path_T {

	public static String TOk;

	public static void path_T() throws FileNotFoundException {
		String path = "src\\fails\\Komnaty";
		File file = new File(path);

		Scanner scanner_slov_1 = new Scanner(file);
		String line = scanner_slov_1.nextLine();
		System.out.println("T" + Perem.T);
		String nomer_komnaty = "T" + Perem.T;
		String konez_komnaty = "t" + Perem.T;
		Path_T.TOk = line.substring(line.indexOf("T" + Perem.T) + nomer_komnaty.length() + 1,
				line.indexOf(konez_komnaty)); // ��������� ������ ������� �� �� ������. ��������� ��������� ���������!
		// ������ 3 (������) ������ ���� ���-�� ������, ���� � 3 (�������) �� �� ������
		// ��������� ���������� �������� ������!!!
		System.out.println(Path_T.TOk);
		System.out.println();

	}

}
