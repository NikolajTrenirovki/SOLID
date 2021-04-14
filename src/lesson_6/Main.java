package lesson_6;

public class Main {
    public static void main(String[] args) {

    }
}

interface DAO {
    void execute();
}

class DataAccess implements DAO {
    @Override
    public void execute() {
        System.out.println("execute");
    }
}

class Client {
    DAO dataAccess = new DataAccess();
    void doJob() {
        dataAccess.execute();
    }
}
