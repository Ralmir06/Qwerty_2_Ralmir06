//���� ���� ������ ��������� ���������� T, ��� ����� Perem

package osobya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

public class Path_T {

    private static final Charset CHARSET = Charset.forName("Windows-1251");

    // ��� �� ������ ��� ������?
    // @todo ������������� �� ���-�� ���������� ����
    public static String path_T() {
        String roomsResourcePath = "/fails/Komnaty";
        List<String> roomFileLines = readRooms(roomsResourcePath);
        String line = roomFileLines.get(0);
        
        System.out.println("T" + Perem.T);
        String nomer_komnaty = "T" + Perem.T;
        String konez_komnaty = "t" + Perem.T;

        // ��� ����� tok?!
        String tok = line.substring(line.indexOf("T" + Perem.T) + nomer_komnaty.length() + 1,
                line.indexOf(konez_komnaty)); // ��������� ������ ������� �� �� ������. ���������
                                              // ��������� ���������!
        // ������ 3 (������) ������ ���� ���-�� ������, ���� � 3 (�������) �� �� ������
        // ��������� ���������� �������� ������!!!
        System.out.println(tok);
        System.out.println();
        return tok;
    }

    private static List<String> readRooms(String resourcePath) {
        try (InputStream ins = Path_T.class.getResourceAsStream(resourcePath);
                BufferedReader reader = new BufferedReader(new InputStreamReader(ins, CHARSET))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException ex) {
            // ������ ��������������� ��� ����������������� ����������
            // � ����������� ������� - ��� ��� ��� ��, ��� �����
            // ��� �� ��������� ����������, � ������� �� ����� �� �������, ��� ������.
            // � ���� ���-�� ���� ��-���� �����������, �� ����� ��� � �������� try/catch
            throw new RuntimeException("Can not read resource '" + resourcePath + "'", ex);
        }
    }

}
