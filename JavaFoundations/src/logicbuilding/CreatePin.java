package logicbuilding;

public class CreatePin {

	public static int getUnit(int num) {
		while (num > 9) {
			num %= 10;
		}
		return num;
	}

	public static int getTens(int num) {

		if (num < 10) {
			return num;
		} else {
			num= (num/10) %10;
			/*
			 * while (num > 100) { num = num % 100; } num = num / 10;
			 */
		}
		return num;
	}

	public static int getHundred(int num) {
		if (num > 1000) {
			num= (num/100) %10;
		/*	while (num > 1000) {
				num = num % 1000;
			}
			num = num / 100;*/
		}
		return num;
	}

	public static int genPin(int alpha, int beta, int gamma) {
		// get units of alpha
		alpha = getUnit(alpha);

		// Get Tens of Beta
		beta = getTens(beta);

		if (gamma <= 99) {
			gamma = getUnit(gamma);
		}

		else if (gamma > 99) {
			if (getHundred(gamma) == 0) {
				gamma = 9;
			}
		}

		System.out.println("gamma hundreds is " + gamma);
		System.out.println("beta tens is " + beta);
		System.out.println("alpha unit is " + alpha);

		System.out.println("PIN is " + gamma + beta + alpha);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(7/10);
		genPin(0, 0, 1024);
	}

}
