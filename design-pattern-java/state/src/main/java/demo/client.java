package demo;

public class client {
	public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);

        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();

        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();

        mCandyMachine.printstate();
	}
}