public class Practice{
	public static void main(String[] args){
		int count = 0;
		int flag = 0;
		for( int i = 6; i > 0; i--){
			
			for (int j = 0; j < i; j++){
				count++;
				if(count < 10 ){
					System.out.println(count);
				}
				else if(flag == 0){
					System.out.println(flag);
					flag = 9;
				}else{
					System.out.println(9);
					flag=0;
				}


			}
			System.out.println("\n");
		}
		
		for (int k = 1; k <= 5; k++){

			for(int l = 1; l<= k+1; l++){

				System.out.println("*");

			}
			System.out.println("\n");
		}
	}
}

