//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Perfect
{
 private int number;

    public Perfect(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPerfect() {
        int sum = 0;
        for(int i = 1; i < number; ++i) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
	 public String toString() {
        if(isPerfect()) {
            return number + " is perfect.";
        } else {
            return number + " is not perfect.";
        }
    }
}
