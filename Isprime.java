
import java.util.*;
class Isprime{
	
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	
	int len=sc.nextInt();
	
	int arr[]=new int[len];
	
	for(int i=0;i<len;i++){
		
		arr[i]=sc.nextInt();
	}

	ArrayList<Integer> ans=new ArrayList<>();


	for(int i=0;i<len;i++){
		
		
		boolean flag=false;
			
		for(int j=2;j<arr[i];j++){
			
			if(arr[i]%j==0){
				
				flag=true;
			}
		}

		if(!flag){
			
			ans.add(arr[i]);
			
		}	
	}

	for(int i=0;i<ans.size();i++){
	System.out.print(ans.get(i)+",");
	}
    }
}

