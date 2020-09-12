import static javax.swing.JOptionPane.*;
System.out.println("Welcome to progrmaing");
System.out.println("Find the highest Number");
System.out.println("=======================================");
int a=Integer.parseInt(showInputDialog("Enter Number to check"));
int b=Integer.parseInt(showInputDialog("Enter Second Number to check"));
int c=Integer.parseInt(showInputDialog("Enter Third Number to check"));
if (a>=b)
{
    if(a>=c)
    {
        showMessageDialog(null,"A is highest");
    }
}else
{
    if(b>=c)
    {
        showMessageDialog(null,"B is highest");
    }else
    {
        showMessageDialog(null,"C is highest");
    }
}