
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = amountOfNumbers;
    }

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        this.sum+=number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    public int sum() {
        // code here
       
        return this.sum;
    }

    public double average() {
        // code here
        if (this.amountOfNumbers == 0) {
            return 0;
        }
       double ave = (double)this.sum/(double)this.amountOfNumbers;
       return ave;
    }
}
