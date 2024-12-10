package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int index = str.indexOf(ext);
        String fileName = str.substring(0, index);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + ext);
    }
}
