import exceptions.ExceptionSumm;

public class Main {
    public static void main(String[] args) {
        System.out.println(summaChisel(11.0, 8.0));
    }

    public static String summaChisel(Double first, Double second)  {
        try {
            if (first + second > 10) {
                throw new ExceptionSumm("Число больше десяти");
            }
            Double summ = first + second;
            return summ.toString();
        } catch (ExceptionSumm e) {
            return e.getMessage();
        }
    }
}