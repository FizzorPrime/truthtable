
public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Table dataSet = new Table();
		dataSet.printTitle();
		dataSet.printTruths(true, true);
		dataSet.printTruths(true, false);
		dataSet.printTruths(false, true);
		dataSet.printTruths(false, false);
	}

}
