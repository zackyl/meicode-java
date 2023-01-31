public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("db_music");
//        Database test = new Database("db_movies");
        System.out.println(database.toString());

    }
}