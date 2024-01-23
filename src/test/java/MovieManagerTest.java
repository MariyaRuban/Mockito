import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void Add0() {

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Add1() {
        manager.addMovie("1 Бладшот");
        String[] actual = manager.findAll();
        String[] expected = {"1 Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        manager.addMovie("1 Бладшот");
        manager.addMovie("2 Вперёд");
        manager.addMovie("3 Отель Белград");
        manager.addMovie("4 Джентельмены");
        manager.addMovie("5 Человек-невидимка");
        manager.addMovie("6 Тролли. Мировой тур");
        manager.addMovie("7 Номер один");
        String[] actual = manager.findAll();
        String[] expected = {"1 Бладшот", "2 Вперёд", "3 Отель Белград", "4 Джентельмены", "5 Человек-невидимка", "6 Тролли. Мировой тур", "7 Номер один"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        manager.addMovie("1 Бладшот");
        manager.addMovie("2 Вперёд");
        manager.addMovie("3 Отель Белград");
        manager.addMovie("4 Джентельмены");
        manager.addMovie("5 Человек-невидимка");
        manager.addMovie("6 Тролли. Мировой тур");
        manager.addMovie("7 Номер один");
        String[] actual = manager.findLast();
        String[] expected = {"7 Номер один", "6 Тролли. Мировой тур", "5 Человек-невидимка", "4 Джентельмены", "3 Отель Белград",};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitedMin() {
        MovieManager manager_limited = new MovieManager(3);

        manager_limited.addMovie("1 Бладшот");
        manager_limited.addMovie("2 Вперёд");
        manager_limited.addMovie("3 Отель Белград");
        manager_limited.addMovie("4 Джентельмены");
        manager_limited.addMovie("5 Человек-невидимка");
        manager_limited.addMovie("6 Тролли. Мировой тур");
        manager_limited.addMovie("7 Номер один");
        String[] actual = manager_limited.findLast();
        String[] expected = {"7 Номер один", "6 Тролли. Мировой тур", "5 Человек-невидимка",};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitedMax() {
        MovieManager manager_limited = new MovieManager(8);

        manager_limited.addMovie("1 Бладшот");
        manager_limited.addMovie("2 Вперёд");
        manager_limited.addMovie("3 Отель Белград");
        manager_limited.addMovie("4 Джентельмены");
        manager_limited.addMovie("5 Человек-невидимка");
        manager_limited.addMovie("6 Тролли. Мировой тур");
        manager_limited.addMovie("7 Номер один");
        String[] actual = manager_limited.findLast();
        String[] expected = {"7 Номер один", "6 Тролли. Мировой тур", "5 Человек-невидимка", "4 Джентельмены", "3 Отель Белград", "2 Вперёд", "1 Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitedNormal() {
        MovieManager manager_limited = new MovieManager(7);

        manager_limited.addMovie("1 Бладшот");
        manager_limited.addMovie("2 Вперёд");
        manager_limited.addMovie("3 Отель Белград");
        manager_limited.addMovie("4 Джентельмены");
        manager_limited.addMovie("5 Человек-невидимка");
        manager_limited.addMovie("6 Тролли. Мировой тур");
        manager_limited.addMovie("7 Номер один");
        String[] actual = manager_limited.findLast();
        String[] expected = {"7 Номер один", "6 Тролли. Мировой тур", "5 Человек-невидимка", "4 Джентельмены", "3 Отель Белград", "2 Вперёд", "1 Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMin() {
        manager.addMovie("1 Бладшот");
        manager.addMovie("2 Вперёд");
        manager.addMovie("3 Отель Белград");
        String[] actual = manager.findLast();
        String[] expected = {"3 Отель Белград", "2 Вперёд", "1 Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
