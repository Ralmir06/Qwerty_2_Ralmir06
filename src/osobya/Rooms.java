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

    private String data;

    public Rooms(String data) {
        this.data = data;
    }

    /**
     * ������ ����, � ����� �� ������ ������� ������ �������� �������.
     * ��� ��� �����:
     * 1. ����� �������� � ��������� ������ �����. ��� � ������������� �������� � ��������� ������.
     * �, ���� �� ������������, �� ��������� �����-�� ���������. ����� �� �����.
     */
    public String getRoom(int roomNumber) {
        String roomsResourcePath = "/fails/Komnaty";
        
        System.out.println("T" + roomNumber);
        String roomStartMarker = "T" + roomNumber;
        String roomEndMarker = "t" + roomNumber;

        int startOfRoom = data.indexOf(roomStartMarker) + roomStartMarker.length() + 1;
        int endOfRoom = data.indexOf(roomEndMarker);
        String room = data.substring(startOfRoom, endOfRoom);
        // ��� ���� �� �������:
        // ��������� ������ ������� �� �� ������. ���������
        // ��������� ���������!
        // ������ 3 (������) ������ ���� ���-�� ������, ���� � 3 (�������) �� �� ������
        // ��������� ���������� �������� ������!!!
        System.out.println(room);
        System.out.println();
        return room;
    }

    

}
