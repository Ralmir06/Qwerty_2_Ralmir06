//���� ���� ������ ��������� ���������� T, ��� ����� Perem

package osobya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

public class Rooms {

    private static final Charset CHARSET = Charset.forName("Windows-1251");

    /**
     * ������ ����, � ����� �� ������ ������� ������ �������� �������.
     * ��� ��� �����:
     * 1. ������� ��������� ������������ ����
     * 2. ����� �������� � ��������� ������ �����. ��� � ������������� �������� � ��������� ������.
     * �, ���� �� ������������, �� ��������� �����-�� ���������. ����� �� �����.
     */
    public static String getRoom(int roomNumber) {
        String roomsResourcePath = "/fails/Komnaty";
        String line = readRooms(roomsResourcePath);
        
        System.out.println("T" + roomNumber);
        String roomStartMarker = "T" + roomNumber;
        String roomEndMarker = "t" + roomNumber;

        int startOfRoom = line.indexOf(roomStartMarker) + roomStartMarker.length() + 1;
        int endOfRoom = line.indexOf(roomEndMarker);
        String room = line.substring(startOfRoom, endOfRoom);
        // ��� ���� �� �������:
        // ��������� ������ ������� �� �� ������. ���������
        // ��������� ���������!
        // ������ 3 (������) ������ ���� ���-�� ������, ���� � 3 (�������) �� �� ������
        // ��������� ���������� �������� ������!!!
        System.out.println(room);
        System.out.println();
        return room;
    }

    private static String readRooms(String resourcePath) {
        try (InputStream ins = Rooms.class.getResourceAsStream(resourcePath);
                BufferedReader reader = new BufferedReader(new InputStreamReader(ins, CHARSET))) {
            return reader.readLine();
        } catch (IOException ex) {
            // ������ ��������������� ��� ����������������� ����������
            // � ����������� ������� - ��� ��� ��� ��, ��� �����
            // ��� �� ��������� ����������, � ������� �� ����� �� �������, ��� ������.
            // � ���� ���-�� ���� ��-���� �����������, �� ����� ��� � �������� try/catch
            throw new RuntimeException("Can not read resource '" + resourcePath + "'", ex);
        }
    }

}
