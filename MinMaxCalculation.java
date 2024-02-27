import java.util.Arrays;

public class MinMaxCalculation{
	public static void main(String[] args){
		int [] numbers={34, 7, 23, 32, 5, 62};
		int min=numbers[0];
		int max=numbers[0];
		for (int i=1;i<numbers.length;i++){
			if (numbers[i]<min){
				min=numbers[i];			
			}
			if (numbers[i]>max){ 
                                max=numbers[i];                   
                        }
		}
		system.out.println("Given numbers:"+Arrays.toString(numbers)
		system.out.println("Minimum:"+min)
		system.out.println("Maximum:"+max)
	}

}
