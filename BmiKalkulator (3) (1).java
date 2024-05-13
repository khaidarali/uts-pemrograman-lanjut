import java.util.Scanner;

public class BmiKalkulator {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tinggi badan: ");
        double tinggiBadan = input.nextDouble();

        System.out.println("Masukan berat badan: ");
        double beratBadan = input.nextDouble();

        double tinggiBadanM = tinggiBadan / 100.0;

        double bmi = hitungBMI(tinggiBadanM, beratBadan);

        System.out.println("BMI kamu adalah: " + bmi);

        
        }
        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.println("Berat badan kamu normal");
        }
        else if (bmi >= 25 && bmi <= 29.9)
        {
            System.out.println("Kamu kelebihan berat badan");
        }
        else
        {
            System.out.println("Kamu obesitas");
        }
    }
    private static double hitungBMI(double tinggiBadanM, double beratBadan)
    {
        return beratBadan / (tinggiBadanM * tinggiBadanM);
    test 
      
