

public class MAXNUM_REC {
	public static void main(String[] args){
		String s = "2192";
		StringBuffer sb = new StringBuffer(s);
		int k = 5;
		doRecursion(sb, k, 0);
	}
	public static void doRecursion(StringBuffer sb, int k, int startInd){
		if(k <= 0){
			// base case
			System.out.println(sb);
			return ;
		}
		char digit = '0';
		int actualIndex, indexToSwap = 0;
		boolean found = false;
		for(int i=0; i<=k; i++){
			actualIndex = startInd + i;
			if((actualIndex) < sb.length() && digit < sb.charAt(actualIndex)){
				digit = sb.charAt(actualIndex);
				indexToSwap = actualIndex;
				found = true;
			}
		}
		if(digit != sb.charAt(startInd) && found){
			sb.insert(startInd, sb.charAt(indexToSwap));
			sb.deleteCharAt(indexToSwap+1);
		}
		doRecursion(sb, k-indexToSwap, startInd + 1);
	}
}