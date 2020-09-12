println("Creating and Working with Object");
class Piggy
{
    int balance;
    int lt;
    void statement()
    {
        println("Balance = " + balance);
        println("Last Transaction = " + lt);
    }
    void deposit(int v)
    {
        balance = balance + v;
        lt = v;
    }
    void withdraw(int v)
    {
        if(balance >= v){
            balance = balance - v;
            lt = -v;
        }else{
            println("Insufficient Balance");
        }
    }
}

var redPiggy = new Piggy();
redPiggy.statement();
redPiggy.deposit(10);
redPiggy.withdraw(5);
redPiggy.statement();

println("Thankyou for visiting");
