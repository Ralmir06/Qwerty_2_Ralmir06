package osobya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class RoomsReader {
    
    // константы называем заглавными буквами
    // если слов несколько, то через подчЄркивание
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
            //  од не замусорен обработкой, в которой всЄ равно не пон€тно, что делать.
            // ј если где-то надо всЄ-таки перехватить, то можно там и добавить try/catch
            throw new RuntimeException("Can not read resource '" + resourcePath + "'", ex);
        }
    }

}
