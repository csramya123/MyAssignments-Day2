package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8, firstNum = 0, secNum = 1, sum;
		
        System.out.print("Fibonacci Series of "+range+" numbers are :");

        for (int i = 1; i <= range; ++i)
        {
            System.out.print(firstNum+" ");

            sum = firstNum + secNum;
            firstNum = secNum;
            secNum = sum;
            
		}

			}

		

	}

