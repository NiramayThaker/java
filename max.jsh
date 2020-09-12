import static javax.swing.JOptionPane.*;
System.out.println("Welcome to progrmaing");
System.out.println("Find the highest Number");
System.out.println("=======================================");
int a=Integer.parseInt(showInputDialog("Enter Number to check"));
int b=Integer.parseInt(showInputDialog("Enter Second Number to check"));
if(a>b)
{
    showMessageDialog(null,"A is highest");
}else
{
    showMessageDialog(null,"B is highest");
}