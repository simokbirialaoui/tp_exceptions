public class Main {
    public static void main(String[] args) {
        EntierNaturel number1 = new EntierNaturel(4);
        EntierNaturel number2 = new EntierNaturel(-2);
        EntierNaturel number3 = new EntierNaturel(1);
        try {
            number1.decrementer();
            number3.decrementer();
            number3.decrementer();
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());

        }

    }
}