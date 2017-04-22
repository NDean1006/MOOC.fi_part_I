
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    
    
    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        if (cashGiven >= 2.5){
            this.cashInRegister += 2.5;
            this.economicalSold++;
        }
        if (cashGiven < 2.5){
            return cashGiven;
        }
        else{
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven - 2.5;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4){
            this.cashInRegister += 4;
            this.gourmetSold++;
        }
        if (cashGiven < 4){
            return cashGiven;
        }
        else{
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven - 4;
        }
    }
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        if (card.pay(2.5)== true){
            this.economicalSold++;   
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.pay(4)== true){
            this.gourmetSold++;
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0){
        card.loadMoney(sum);
        this.cashInRegister +=sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}