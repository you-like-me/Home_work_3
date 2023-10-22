import java.util.List;

/**
 * Интерфейс работы с базой данных
 */
public interface Database {
    /**
     * Инициализация базы данных
     */
    void initDatabase();

    /**
     * Сохранение записи в БД
     */
    void creatRecord();

    /**
     * Получение всех записей из БД
     */
    <T> List<T> getAllRecord();

    /**
     * Изменить запись в БД
     *
     * @param id - номер записи в БД для изменения
     */
    void updateRecord(int id);

    /**
     * Удаление записи в БД
     *
     * @param id - номер удаляемой записи в БД
     */
    void deleteRecord(int id);
}
