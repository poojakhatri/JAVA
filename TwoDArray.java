class TwoDArray {

	 public static void main(String[] args) {

		int towD [] [] =  new int [4][5];
		int k =0 ;

		for (int i=0 ;i<4 ; i++ ) {
			for (int j=0;j<5 ;j++ ) {
				towD [i] [j] = k;
				k++;
			}
		}


		for (int i=0 ;i<4 ; i++ ) {
			for (int j=0;j<5 ;j++ ) {
				System.out.print(towD [i] [j] + " ");
			}
			System.out.println();
		}
 	}
}
