import static javax.swing.JOptionPane.*;
System.out.println("Welcome to progrmaing");
System.out.println("Find whether the number is odd or even");
System.out.println("=======================================");
int Number=Integer.parseInt(showInputDialog("Enter Number to check"));
System.out.println("Number you enter must not be Less then 30");
System.out.println("========================================================");
if(Number>30)
{
     showMessageDialog(null,"The Number you Entered is Invalid");
}else
{
    if (Number==1)
    {
         showMessageDialog(null,"It is not composite number plus it is not a prime number");
    }
    if(Number% 2==0 && Number!= 2)
    {
         showMessageDialog(null,"The number you entered is not a prime number");
    }else
    {
          if(Number%3==0 &&Number!=3)
          {
               showMessageDialog(null,"The number you entered is not a prime number");
          }
    }
    
    }else
    {
           zif(Number%5==0 &&Number!=5)
          {
               showMessageDialog(null,"The number you entered is not a prime number");
          }
    }
}