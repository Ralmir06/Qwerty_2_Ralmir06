//���� ���� ������ ��������� ���������� T, ��� ����� Perem

package osobya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Path_T {

    // ��� �� ������ ��� ������?
    // @todo ������������� �� ���-�� ���������� ����
	public static String path_T() throws FileNotFoundException {
		String path = "src\\fails\\Komnaty";
		File file = new File(path);

		String line = readRooms(file);
		System.out.println("T" + Perem.T);
		String nomer_komnaty = "T" + Perem.T;
		String konez_komnaty = "t" + Perem.T;
		
		// ��� ����� tok?!
	    String tok = line.substring(line.indexOf("T" + Perem.T) + nomer_komnaty.length() + 1,
				line.indexOf(konez_komnaty)); // ��������� ������ ������� �� �� ������. ��������� ��������� ���������!
		// ������ 3 (������) ������ ���� ���-�� ������, ���� � 3 (�������) �� �� ������
		// ��������� ���������� �������� ������!!!
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
