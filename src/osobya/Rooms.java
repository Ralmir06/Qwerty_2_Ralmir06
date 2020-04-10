package osobya;

/**
 * Хранит данные о комнатах и переходах между ними и инкапсулирует (прячет
 * внутри себя) доступ к этим данным.
 */
public class Rooms {

    private String data;

    public Rooms(String data) {
        this.data = data;
    }

    /**
     * По номеру комнаты достаёт описание комнаты.
     *
     * Что тут плохо:
     *
     * 1. Очень хреновый и неудобный формат файла. Его и редактировать неудобно и
     * разбирать сложно. И, судя по комментариям, он порождает какие-то сложности.
     * Знать бы какие.
     */
    public String getRoom(int roomNumber) {
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

    /**
     * По маркеру варианта возвращает следующий номер комнаты
     *
     * Что тут плохо:
     *
     * 1. Кажется, что надо принимать сразу номер варианта, но это надо дальше
     * распутывать клубок из глобальных переменных.
     *
     * 2. Возможно, стоит сразу возвращать описание следующей комнаты, но тут тоже
     * нужна какая-то подготовка.
     */
    public int getRoomNumberByVariantMarker(String variantMarker) {
        int startOfVariant = data.indexOf(variantMarker) + variantMarker.length() + 1;
        int endOfVariant = data.indexOf("s" + variantMarker) + -1;
        String roomNumStr = data.substring(startOfVariant, endOfVariant);
        return Integer.parseInt(roomNumStr);
    }

}
