package logicbuilding;

public class LongestIncreasingSequence {
static int maxCounter=0;
static int oldCounter=0;
static int numInput = 5;
static int numArray[] ={4,2,5,8,10,3,4,5,6,7,8,12,1,2,3,4,5,6,7,8,9,10};
static int index=0;
	public static void main(String[] args) {
		int length = numArray.length;
		int oldMaxCounter=0;
		for (int i=1; i<length;i++){
			if (numArray[i]>numArray[i-1]){
				maxCounter++;
				index = i;
			}
			if (numArray[i]<numArray[i-1]){
				
				if (maxCounter >oldMaxCounter){
					oldMaxCounter = maxCounter;
					maxCounter =0;
				}
			}
			if (maxCounter>oldCounter){
			oldCounter = maxCounter;
			}
		}
		
		System.out.println("maxCOunt is "+(maxCounter+1) + " at index "+ (index-maxCounter));
		for (int i=index-maxCounter;i<=(maxCounter+(index-maxCounter));i++){ //counts from indexed index to +count
			System.out.print(numArray[i]+ " ");
		}
	}	
}