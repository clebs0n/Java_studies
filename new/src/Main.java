public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.test(5);  // This will throw an exception
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public void test(int number) throws Exception {
        if (number == 5) {
            throw new Exception("Number is 5");
        }
    }
}
