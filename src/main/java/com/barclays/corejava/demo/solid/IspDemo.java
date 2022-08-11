package com.barclays.corejava.demo.solid;

//interface Rbi {

//
//	public abstract void chargeInterestOnLoans();
//
//	public abstract void payInterestOnDeposits();
//
//}
//
//class HdfcBank implements Rbi {
//
//	@Override
//	public void chargeInterestOnLoans() {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void payInterestOnDeposits() {
//		// TODO Auto-generated method stub
//	} // Bank
//
//}
//
//class BajajFinance implements Rbi {
//
//	@Override
//	public void chargeInterestOnLoans() {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void payInterestOnDeposits() {
//		// TODO Auto-generated method stub
//	} // NBFC
//
//}

interface RbiRulesForDeposits {

	public abstract void payInterestOnDeposits();

}

interface RbiRulesForLoans {

	public abstract void chargeInterestOnLoans();

}

class HdfcBank implements RbiRulesForDeposits, RbiRulesForLoans {

	@Override
	public void chargeInterestOnLoans() {
		// TODO Auto-generated method stub
	}

	@Override
	public void payInterestOnDeposits() {
		// TODO Auto-generated method stub
	} // Bank

}

class BajajFinance implements RbiRulesForLoans {

	@Override
	public void chargeInterestOnLoans() {
		// TODO Auto-generated method stub
	}

}

public class IspDemo {

	public static void main(String[] args) {

	}

}
