import exceptions.ExceptionSumm;

public class Main {
    public static void main(String[] args) {
        System.out.println(summaChisel(11.0, 8.0));
    }

    public static String summaChisel(Double first, Double second)  {
        try {
            //проверка на ошибку
            if (first + second > 10) {
                //выбрасываем ошибку если условие true
                throw new ExceptionSumm("Число больше десяти");
            }
            //для приведения к строковому типу
            Double summ = first + second;
            return summ.toString();//возвращение строки
        } catch (ExceptionSumm e) {
            return e.getMessage(); //получение ошибки и вывод ее
        }
    }
}