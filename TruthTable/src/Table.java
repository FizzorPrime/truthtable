
public class Table {
	
	private boolean firstTruth;
	private boolean secondTruth;
	private boolean result;
	
	public Table() {
		setFirstTruth(true);
		setSecondTruth(true);
		setResult(true);
	}
	
	public boolean isResult() {
		return result;
	}

	private void setResult(boolean b) {
		this.result = b;
	}

	public boolean isFirstTruth() {
		return firstTruth;
	}

	public void setFirstTruth(boolean firstTruth) {
		this.firstTruth = firstTruth;
	}

	public boolean isSecondTruth() {
		return secondTruth;
	}

	public void setSecondTruth(boolean secondTruth) {
		this.secondTruth = secondTruth;
	}

	public void printTitle() {
		System.out.println("  A  |  B  |  (A&B)  |  (A|B)  |  (A&&B)  |  (A||B)  |  (A^B)  ");
		System.out.println("---------------------------------------------------------------");
	}
	
	public void printTruths(boolean first, boolean second) {
		firstTruth = first;
		secondTruth = second;
		System.out.println("  " + this.convert(firstTruth) + "  |  " + this.convert(secondTruth) + "  |    " + this.convert(this.and()) + "    |    " + this.convert(this.or()) + "    |    " + this.convert(this.lazyAnd()) + "     |    " + this.convert(this.lazyOr()) + "     |    " + this.convert(this.xOr()) + "    ");
	}
	
	public boolean and() {
		boolean result = true;
		result = this.isFirstTruth() & this.isSecondTruth();
		return result;
	}
	
	public boolean or() {
		boolean result = true;
		result = this.isFirstTruth() | this.isSecondTruth();
		return result;
	}
	
	public boolean lazyAnd() {
		boolean result = true;
		result = this.isFirstTruth() && this.isSecondTruth();
		return result;
	}
	
	public boolean lazyOr() {
		boolean result = true;
		result = this.isFirstTruth() || this.isSecondTruth();
		return result;
	}
	
	public boolean xOr() {
		boolean result = true;
		result = this.isFirstTruth() ^ this.isSecondTruth();
		return result;
	}
	
	public String convert(boolean value) {
		String newValue = "";
		if (value) {
			newValue = "T";
		}
		else {
			newValue = "F";
		}
		return newValue;
	}
}


//"  A  |  B  |  (A&B)  |  (A|B)  |  (A&&B)  |  (A||B)  |  (A^B)  "
//"---------------------------------------------------------------"
//"  T  |  T  |    T    |    T    |    T     |    T     |    F    "
//"  T  |  F  |    F    |    T    |    F     |    T     |    T    "
//"  F  |  T  |    F    |    T    |    F     |    T     |    T    "
//"  F  |  F  |    F    |    F    |    F     |    F     |    F    "


