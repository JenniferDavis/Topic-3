
public class Ch6Ex12 {

	public static void main(String[] args) {

		int numberPerLine = 10;
		char ch1 = 49;
		char ch2 = 84;
		printChars(ch1, ch2, numberPerLine);
		//System.out.println(ch1 + " " + ch2);
		
	}//end main
	
	public static void printChars(char ch1, char ch2, int numberPerLine){
		char begChars = ch1;
		char endChars = ch2;
		while (begChars < endChars) {
			int i = 0;
			while (i < numberPerLine) {
				System.out.print(begChars + " ");
				begChars++;
				i++;
			}
			System.out.print("\n");
		}
	}	
			
}
