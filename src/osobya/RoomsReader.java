package osobya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Читает файл с комнатами и возвращает объект для работы с ними
 */
public class RoomsReader {

    // константы называем заглавными буквами
    // если слов несколько, то через подчёркивание
    private static final Charset CHARSET = Charset.forName("Windows-1251");

    private final String resourcePath;

    public RoomsReader(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public Rooms readRooms() {
        try (InputStream ins = Rooms.class.getResourceAsStream(resourcePath);
                BufferedReader reader = new BufferedReader(new InputStreamReader(ins, CHARSET))) {
            return new Rooms(reader.readLine());
        } catch (IOException ex) {
            // просто перевыбрасываем как неперехватываемое исключение
            // в большинстве случаев - это как раз то, что нужно
            // Код не замусорен обработкой, в которой всё равно не понятно, что делать.
            // А если где-то надо всё-таки перехватить, то можно там и добавить try/catch
            throw new RuntimeException("Can not read resource '" + resourcePath + "'", ex);
        }
    }

}
