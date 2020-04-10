package skasat;

import osobya.Path_V;
import osobya.Rooms;

public class Skasat {

    /**
     * ���� �� �������� �������� ���������� ������. ������������ ��� ������� ��
     * ������ "�������", ������ � ��������.
     * 
     * �������� ���������� ������������ ��������: ��������, �������, ������,
     * ���������� � �������
     * 
     * @return ����� ��������� �������
     */
    public static int skasat(Rooms rooms) {
        System.out.println("��������� �������");
        // ��� ����� ��������� ������� ���� Slovar, ��� ��� � ���� �������, ����� ��
        // ��������
        // @todo ��������, ��� � ���� ������ � ��������
        // Perezapis_p4.perezapis();
        return perehod(rooms);
    }

    /**
     * 
     * @return ����� ��������� �������
     */
    public static int perehod(Rooms rooms) {
        String variantMarker = Path_V.konez_Varianta;
        System.out.println("��������� ����� ��������: " + variantMarker);
        System.out.println("��������� ������ ����� ��������: " + "s" + variantMarker);

        System.out.println("��������� ������� ������� � �������: " + Path_V.TOv);
        System.out.println();

        int nextRoom = rooms.getRoomNumberByVariantMarker(variantMarker);
        // nextRoom ����� ����� �������� �� ��������� �� �����
        // �������� �� ������� �������, �� ����� �������.

        System.out.println("��������� �������������� ����� �������: " + nextRoom);
        // ����� ��, � ��� ���:
        // ��������� ������ ������� �� �� ������.
        // ��������� ��������� ���������!

        return nextRoom;
    }

}
