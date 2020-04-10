//Этот файл должен создавать переменную T, для файла Perem

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
     * Читаем файл, а потом по номеру комнаты достаёт описание комнаты.
     * Что тут плохо:
     * 1. Очень хреновый и неудобный формат файла. Его и редактировать неудобно и разбирать сложно.
     * И, судя по комментариям, он порождает какие-то сложности. Знать бы какие.
     */
    public String getRoom(int roomNumber) {
        String roomsResourcePath = "/fails/Komnaty";

        System.out.println("T" + roomNumber);
        String roomStartMarker = "T" + roomNumber;
        String roomEndMarker = "t" + roomNumber;

        int startOfRoom = data.indexOf(roomStartMarker) + roomStartMarker.length() + 1;
        int endOfRoom = data.indexOf(roomEndMarker);
        String room = data.substring(startOfRoom, endOfRoom);
        // Это пока не понятно:
        // Некоторые особые символы он не читает. Используй
        // буквенные сочетания!
        // ВМЕСТО 3 (ТРОЙКА) ДОЛЖНО БЫТЬ ЧТО-ТО ДРУГОЕ, ВЕДЬ С 3 (ТРОЙКОЙ) ОН НЕ СМОЖЕТ
        // ПРОЧИТАТЬ ДВУЗНАЧНЫЕ НАЗВАНИЯ КОМНАТ!!!
        System.out.println(room);
        System.out.println();
        return room;
    }



}
