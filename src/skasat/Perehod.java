// �������� ������������ ���������  Skasat.
// ��� ������������ �5. ��������� � ������ ������������.
// ���� ���������� W � �� ������ � �������� ���� �� 10 ��������� �������� �������, ��������� � ����� �������. 
// � ����� ������� �������� ������ ������ ������ ������, ����� �������� ������ �������������� ����� ��������� �������. 
// ������� ������ ���������� � ������ Perem �, ����� ������� ������������ ������������ ������ ����� "���������" ������.
// � ������ ���������� ����� � ���� ������������� ������� ���������� ������� ������ Sintez. 

package skasat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import osobya.Path_T;
import osobya.Path_V;
import osobya.Perem;

public class Perehod {

    public static void perehod() throws FileNotFoundException {
        String path = "src//fails//Komnaty";
        File file = new File(path);

        Scanner scanner_slov = new Scanner(file);
        String line = scanner_slov.nextLine();
        System.out.println("���������� �");
        System.out.println("��������� ����� ��������: " + Path_V.konez_Varianta);
        System.out.println("��������� ������ ����� ��������: " + "s" + Path_V.konez_Varianta);
        String T = line.substring(
                line.indexOf(Path_V.konez_Varianta) + Path_V.konez_Varianta.length() + 1,
                line.indexOf("s" + Path_V.konez_Varianta) + -1);
        /*
         * String zT="s"+Path_V.konez_Varianta; System.out.println(zT); int
         * rT=Path_V.konez_Varianta.length()+1; String
         * T=line.substring(line.indexOf(Path_V.konez_Varianta),line.indexOf("s"+Path_V.
         * konez_Varianta));
         */
        System.out.println("��������� �������������� ����� ������� ��� ��������� � �����: " + T);
        Integer.parseInt(T);
        System.out.println("��������� �������������� ����� �������: " + T);// ��������� ������
                                                                           // ������� �� �� ������.
                                                                           // ��������� ���������
                                                                           // ���������!

        System.out.println("��������� ������� ������� � �������: " + Path_V.TOv);
        System.out.println();

        Perem.T = Integer.parseInt(T); // Perem.T ����� ����� �������� �� ��������� �� �����
                                       // �������� �� ������� �������, �� ����� �������.
        try {
            Path_T.path_T();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        scanner_slov.close();
    }

}
