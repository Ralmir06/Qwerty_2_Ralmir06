//���� ���� ������ ��������� ���������� V, ��� ����� Perem

package osobya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Path_V {

    public static String TOv;
    public static String konez_Varianta = "t0v0";

    public static void path_V(int roomNumber) throws FileNotFoundException {
        // ��. ����� ������������ ���������������� ����!
        // @todo ���������� �� ������������ � Rooms
        String path = "src//fails//Komnaty";
        File file = new File(path);

        Scanner scanner_slov = new Scanner(file);
        String line = scanner_slov.nextLine();
        System.out.println("V" + Perem.V);
        String nomer_Varianta = "T" + roomNumber + "V" + Perem.V;
        konez_Varianta = "t" + roomNumber + "v" + Perem.V;
        // String konez_Varianta="t"+Perem.T+"v"+Perem.V;
        System.out.println(nomer_Varianta);
        System.out.println("������ ����� ��������: " + konez_Varianta);
        Path_V.TOv = line.substring(line.indexOf(nomer_Varianta) + nomer_Varianta.length() + 1,
                line.indexOf(Path_V.konez_Varianta)); // ��������� ������ ������� �� �� ������.
                                                      // ��������� ��������� ���������!
        System.out.println(Path_V.TOv);
        System.out.println();
        scanner_slov.close();
    }

}
