package osobya;

/**
 * ������ ������ � �������� � ��������� ����� ���� � ������������� (������
 * ������ ����) ������ � ���� ������.
 */
public class Rooms {

    private String data;

    public Rooms(String data) {
        this.data = data;
    }

    /**
     * �� ������ ������� ������ �������� �������.
     * 
     * ��� ��� �����:
     * 
     * 1. ����� �������� � ��������� ������ �����. ��� � ������������� �������� �
     * ��������� ������. �, ���� �� ������������, �� ��������� �����-�� ���������.
     * ����� �� �����.
     */
    public String getRoom(int roomNumber) {
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

    /**
     * �� ������� �������� ���������� ��������� ����� �������
     * 
     * ��� ��� �����:
     * 
     * 1. �������, ��� ���� ��������� ����� ����� ��������, �� ��� ���� ������
     * ����������� ������ �� ���������� ����������.
     * 
     * 2. ��������, ����� ����� ���������� �������� ��������� �������, �� ��� ����
     * ����� �����-�� ����������.
     */
    public int getRoomNumberByVariantMarker(String variantMarker) {
        int startOfVariant = data.indexOf(variantMarker) + variantMarker.length() + 1;
        int endOfVariant = data.indexOf("s" + variantMarker) + -1;
        String roomNumStr = data.substring(startOfVariant, endOfVariant);
        return Integer.parseInt(roomNumStr);
    }

}
