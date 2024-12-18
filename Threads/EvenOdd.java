/*write a  program to create a 
two threads and print even and odd number from 1 to 20
*/

package javatask;

class Even extends Thread {
    public void run() 
    {
        System.out.println("EVEN NUMBERS:");
        for (int i = 1; i <= 20; i++)
        {
            if (i % 2 == 0) 
            {
                System.out.println(i);
            }
        }
    }
}

class Odd extends Thread {
    public void run() 
    {
        System.out.println("ODD NUMBERS:");
        for (int i = 1; i <= 20; i++) 
        {
            if (i % 2 == 1) 
            {
                System.out.println(i);
            }
        }
    }
}

public class EvenOdd {
    public static void main(String args[]) {
        Even t1 = new Even();
        Odd t2 = new Odd();
        t1.start();
        t2.start();
    }
}



