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

    private static final Charset CHARSET = Charset.forName("Windows-1251");

    /**
     * Читаем файл, а потом по номеру комнаты достаёт описание комнаты.
     * Что тут плохо:
     * 1. Незачем постоянно перечитывать файл
     * 2. Очень хреновый и неудобный формат файла. Его и редактировать неудобно и разбирать сложно.
     * И, судя по комментариям, он порождает какие-то сложности. Знать бы какие.
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
        // Это пока не понятно:
        // Некоторые особые символы он не читает. Используй
        // буквенные сочетания!
        // ВМЕСТО 3 (ТРОЙКА) ДОЛЖНО БЫТЬ ЧТО-ТО ДРУГОЕ, ВЕДЬ С 3 (ТРОЙКОЙ) ОН НЕ СМОЖЕТ
        // ПРОЧИТАТЬ ДВУЗНАЧНЫЕ НАЗВАНИЯ КОМНАТ!!!
        System.out.println(room);
        System.out.println();
        return room;
    }

    private static String readRooms(String resourcePath) {
        try (InputStream ins = Rooms.class.getResourceAsStream(resourcePath);
                BufferedReader reader = new BufferedReader(new InputStreamReader(ins, CHARSET))) {
            return reader.readLine();
        } catch (IOException ex) {
            // просто перевыбрасываем как неперехватываемое исключение
            // в большинстве случаев - это как раз то, что нужно
            // Код не замусорен обработкой, в которой всё равно не понятно, что делать.
            // А если где-то надо всё-таки перехватить, то можно там и добавить try/catch
            throw new RuntimeException("Can not read resource '" + resourcePath + "'", ex);
        }
    }

}
