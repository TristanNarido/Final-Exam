import java.util.Scanner;
import java.text.DecimalFormat;

public class Tristan
{
    public static void main(String args[]) 
    {
        
      System.out.print("Please Enter Your Annual Salary: ");
      Scanner tan = new Scanner(System.in);
      double x = tan.nextDouble();
        
        do {     
          if (x >= 250000 && x < 400000)
          {
            double t_d = x - 250000 * .20;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            //Formula for computing values
            double m_r = x / 12;
            System.out.println("\nYour Monthly Rate: " + Double.valueOf(decimalFormat.format(m_r)));
            double d_r = m_r / 22;
            System.out.println("Your Daily Rate: " + Double.valueOf(decimalFormat.format(d_r)));
            double h_r = d_r / 8;
            System.out.println("Your Hourly Rate: " + Double.valueOf(decimalFormat.format(h_r)));
            double a_t_d = t_d;
            System.out.println("Annual Tax Deduction: " + Double.valueOf(decimalFormat.format(a_t_d)));
            double m_t_d = a_t_d / 12;
            System.out.println("Your Monthly Tax Deduction: " + Double.valueOf(decimalFormat.format(m_t_d)));
            double n_p = m_r - m_t_d;
            System.out.println("Net pay: " + Double.valueOf(decimalFormat.format(n_p)));            
          }
          else if (x >= 400000 && x < 800000)
          {
            double t_x = x - 400000;
            double t_d = 0.25 * (t_x + 30000);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            //Formula for computing values
            double m_r = x / 12;
            System.out.println("\nYour Monthly Rate: " + Double.valueOf(decimalFormat.format(m_r)));
            double d_r = m_r / 22;
            System.out.println("Your Daily Rate: " + Double.valueOf(decimalFormat.format(d_r)));
            double h_r = d_r / 8;
            System.out.println("Your Hourly Rate: " + Double.valueOf(decimalFormat.format(h_r)));
            double a_t_d = t_d;
            System.out.println("Annual Tax Deduction: " + Double.valueOf(decimalFormat.format(a_t_d)));
            double m_t_d = a_t_d / 12;
            System.out.println("Your Monthly Tax Deduction: " + Double.valueOf(decimalFormat.format(m_t_d)));
            double n_p = m_r - m_t_d;
            System.out.println("Net pay: " + Double.valueOf(decimalFormat.format(n_p)));                 
          }
          else if (x >= 800000 && x < 2000000)
          {
            double t_x = x - 800000;
            double t_d = 0.25 * (t_x + 130000);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            //Formulas for computing values
            double m_r = x / 12;
            System.out.println("\nYour Monthly Rate: " + Double.valueOf(decimalFormat.format(m_r)));
            double d_r = m_r / 22;
            System.out.println("Your Daily Rate: " + Double.valueOf(decimalFormat.format(d_r)));
            double h_r = d_r / 8;
            System.out.println("Your Hourly Rate: " + Double.valueOf(decimalFormat.format(h_r)));
            double a_t_d = t_d;
            System.out.println("Annual Tax Deduction: " + Double.valueOf(decimalFormat.format(a_t_d)));
            double m_t_d = a_t_d / 12;
            System.out.println("Your Monthly Tax Deduction: " + Double.valueOf(decimalFormat.format(m_t_d)));
            double n_p = m_r - m_t_d;
            System.out.println("Net pay: " + Double.valueOf(decimalFormat.format(n_p)));               
          }
          else if (x >= 2000000 && x < 8000000)
          {
            double t_x = x - 2000000;
            double t_d = 0.25 * (t_x + 490000);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            //Formula for computing values
            double m_r = x / 12;
            System.out.println("\nYour Monthly Rate: " + Double.valueOf(decimalFormat.format(m_r)));
            double d_r = m_r / 22;
            System.out.println("Your Daily Rate: " + Double.valueOf(decimalFormat.format(d_r)));
            double h_r = d_r / 8;
            System.out.println("Your Hourly Rate: " + Double.valueOf(decimalFormat.format(h_r)));
            double a_t_d = t_d;
            System.out.println("Annual Tax Deduction: " + Double.valueOf(decimalFormat.format(a_t_d)));
            double m_t_d = a_t_d / 12;
            System.out.println("Your Monthly Tax Deduction: " + Double.valueOf(decimalFormat.format(m_t_d)));
            double n_p = m_r - m_t_d;
            System.out.println("Net pay: " + Double.valueOf(decimalFormat.format(n_p)));
          }
          else if (x >= 8000000)
          {
            double t_x = x - 8000000;
            double t_d = 0.25 * (t_x + 2410000);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            //Formula for computing values
            double m_r = x / 12;
            System.out.println("\nYour Monthly Rate: " + Double.valueOf(decimalFormat.format(m_r)));
            double d_r = m_r / 22;
            System.out.println("Your Daily Rate: " + Double.valueOf(decimalFormat.format(d_r)));
            double h_r = d_r / 8;
            System.out.println("Your Hourly Rate: " + Double.valueOf(decimalFormat.format(h_r)));
            double a_t_d = t_d;
            System.out.println("Annual Tax Deduction: " + Double.valueOf(decimalFormat.format(a_t_d)));
            double m_t_d = a_t_d / 12;
            System.out.println("Your Monthly Tax Deduction: " + Double.valueOf(decimalFormat.format(m_t_d)));
            double n_p = m_r - m_t_d;
            System.out.println("Net pay: " + Double.valueOf(decimalFormat.format(n_p)));
          }
        } while (x < 250000);
    }
}
