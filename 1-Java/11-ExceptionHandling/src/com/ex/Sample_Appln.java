package com.ex;

class AccountBalanceException extends Exception {
	public AccountBalanceException(String message) {
		super(message);
	}
}

// TxrModule

// -----------------------------------------------------

class TxrServiceImpl {
	public void txr(double amount, String fromAccNum, String toAccNum) throws AccountBalanceException {
		// load from & to accounts
		double fromAccountBalance = 1000.00;
		if (fromAccountBalance <= amount)
			throw new AccountBalanceException("No enough  balance in your account");
		// debit & credit
		// update accounts
		System.out.println("Txr successfull");
	}
}

// -----------------------------------------------------

// TicketBooking module
// ------------------------------------------------------

class TicketBooking {
	private TxrServiceImpl txrService = new TxrServiceImpl();

	public void bookTicket(double amount, String userAccountNum) {
		try {
			txrService.txr(amount, userAccountNum, "34567890");
			System.out.println("Your Ticket confirmed");
		} catch (AccountBalanceException e) {
			System.out.println("Booking failed :" + e.getMessage());
			// e.printStackTrace();
		}
	}
}

// ------------------------------------------------------

public class Sample_Appln {

	public static void main(String[] args) {

		TicketBooking booking = new TicketBooking();
		booking.bookTicket(5000.00, "345345345345");

	}

}
