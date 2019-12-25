import java.io.*;

class My_class {

    String data;
    String filename;
    String choice;
    String choice2;
    RandomAccessFile fio;
    BufferedReader in;

    public My_class() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
    }

    public void runConsol() throws IOException {
        while (true) {
            printMenu();
            choice = in.readLine();
            if (choice.compareTo("1") == 0) {
                textIntoFile();
            } else if (choice.compareTo("2") == 0) {
                printRedactMenu();
                choice2 = in.readLine();
                if (choice2.compareTo("1") == 0) {
                    addStart();
                } else if (choice2.compareTo("2") == 0) {
                    addEnd();
                } else if (choice2.compareTo("3") == 0) {
                    addRandom();
                }
            } else if (choice.compareTo("3") == 0) {
                textFromfile();
            } else if (choice.compareTo("4") == 0) {
                return;
            }
        }
    }

    public void printMenu() {
        System.out.println("Введите ваш выбор:");
        System.out.println("1.Ввести текст и записать его в файл");
        System.out.println("2.Редактировать текст в файле");
        System.out.println("3.Прочитать текст из файла и выполнить над ним действия");
        System.out.println("4.Выход");
    }

    public void textIntoFile() throws IOException {
        System.out.println("Введите текст:");
        data = in.readLine();
        System.out.println("Введите имя файла:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        fio.writeBytes(data);
        fio.close();
        System.out.println("Выш текст сохранен.");
    }

    public void printRedactMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - добавление текста в начало файла");
        System.out.println("2 - добавление текста в конец файла");
        System.out.println("3 - добавление текста в произвольную позицию в файле");
    }

    public void addStart() throws IOException {
        System.out.println("Введите имя файла:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();
        System.out.println("Введите строку для добавления в начало:");
        String s;
        s = in.readLine();
        fio.seek(0);
        fio.writeBytes(s);
        fio.seek(s.length());
        fio.writeBytes(data);
        fio.close();
        System.out.println("Cтрока записана в начало файла.");
    }

    public void addEnd() throws IOException {
        System.out.println("Введите имя файла:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        data = fio.readLine();
        System.out.println("Введите строку для добавления в конец:");
        String s;
        s = in.readLine();
        fio.seek(fio.length());
        fio.writeBytes(s);
        fio.close();
        System.out.println("Cтрока записана в конец файла.");
    }

    public void addRandom() throws IOException {
        System.out.println("Введите имя файла:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        System.out.println("Введите строку для добавления в указанную позицию в файле:");
        String s;
        s = in.readLine();
        System.out.println("Введите необходимую позицию в файле:");
        int n;
        n = Integer.parseInt(in.readLine());
        fio.seek(n);
        data = fio.readLine();
        fio.seek(n);
        fio.writeBytes(s);
        fio.writeBytes(data);
        fio.close();
        System.out.println("Cтрока записана в файл.");
    }

    /*public void textFromfile() throws IOException {
        System.out.println("Введите имя файла:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "r");
        data = fio.readLine();
        fio.close();
        System.out.println("Информация из файла: " + data);
        System.out.println("Изменённый текст: "+data.replaceAll("^[\\d]+", ""));
    }*/

    public void textFromfile() throws IOException{
        System.out.println("Введите имя файла:");
        filename = in.readLine();
        fio = new RandomAccessFile(new File(filename), "rw");
        data[] = fio.readLine();
        fio.close();
        for (int i = 0; i < fio.length(); i++){
            if (i % 2 == 0)
                System.out.println(data[i]+',');
        }
    }
    public static void main(String args[]) throws UnsupportedEncodingException, IOException {
        My_class n = new My_class();
        n.runConsol();
    }
}
