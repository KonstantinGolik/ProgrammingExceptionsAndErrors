
class DataValidator {
    public static void validate(String[] data) throws DataFormatException {
        if (data.length != 6) {
            throw new DataFormatException("Неверное количество данных");
        }

        // Проверка формата даты рождения
        if (!data[3].matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new DataFormatException("Неверный формат даты рождения");
        }
        // Проверка формата номера телефона
        if (!data[4].matches("\\d+")) {
            throw new DataFormatException("Неверный формат номера телефона");
        }
        // Проверка формата пола
        if (!data[5].matches("[mwмж]")) {
            throw new DataFormatException("Неверный формат пола");
        }
    }
}