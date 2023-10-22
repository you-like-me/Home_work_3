public class Main {

    public static void main(String[] args) {
        Pair<Integer, Double> num = new Pair<>(20, 30.0);
        System.out.println(num);

        Database db = new Db();
        db.initDatabase();
        db.creatRecord();
        db.getAllRecord();
        db.updateRecord(2);
        db.deleteRecord(1);
    }

}