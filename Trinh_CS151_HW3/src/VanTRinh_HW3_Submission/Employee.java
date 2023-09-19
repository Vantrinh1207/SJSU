
public class Employee {
	private String firstName;
	private String lastName;
	private int id;
	private double hourlyPay;

	/**
	 * @param firstName The employee first name
	 * @param lastName  The employee last name
	 * @param id        The employee's id
	 * @param hourlyPay The employee pay
	 */
	public Employee(String firstName, String lastName, int id, double hourlyPay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.hourlyPay = hourlyPay;
	}

	public double computePay(int hourWorked) {
		double total = 0; // Return 0 if invalid
		try {
			if (hourWorked < 0) {
				String message = "NumberFormatException.  Worked hour cannot less than 0";
				throw new NumberFormatException(message);

			} else if (hourWorked > 40) {
				String message = "TooManyHoursWorkedException: Cannot exceed 40 hours";
				throw new TooManyHoursWorkedException(message);
			} else {
				total = hourWorked * getHourlyPay();
			}
		}

		catch (NumberFormatException | TooManyHoursWorkedException e) {
			System.out.println(e);
		}

		return total;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
}
