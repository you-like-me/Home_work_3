import java.util.ArrayList;
import java.util.List;

public class Db implements Database {

    @Override
    public void initDatabase() {
        System.out.println("База данных создана");
    }

    @Override
    public void creatRecord() {
        System.out.println("Запись сохранена");
    }

    @Override
    public List<String> getAllRecord() {
        List<String> list = new ArrayList<>();
        list.add("Все записи получены из БД");
        return list;
    }

    @Override
    public void updateRecord(int id) {
        System.out.printf("Запись " + id + " успешно обновлена\n");
    }

    @Override
    public void deleteRecord(int id) {
        System.out.printf("Запись " + id + " успешно удалена\n");
    }

}
