/****************
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
****************/
class Pattern1{
	public static void main(String args[]){
		int i,j;
		int count;
		for(i=1;i<=5;i++){
			count=0;
			for(j=5;count<i;j--){
				System.out.print(j+" ");
				++count;
			}
			System.out.println("\n");
		}
	}
}