import java.util.Scanner;

public class UniqueArray {
public static void uniqueElements(String str){
	
   
    String s=""+str.charAt(0);
    int i=1;
    
    
    while(i<str.length()){
    	
    	int j=0;
    	int count=0;
    	while(j<s.length()){
    		if(s.charAt(j)!=str.charAt(i))
    			{
    			j++;
    			}
    			
    		
    		else{
    			count++;
    			j++;
    		    
    	}
    	}
    	if(count==0)
    	{s=s+str.charAt(i);
    	}
    	i++;
    	}
    	
    
    System.out.println(s);
}
    
    	
    	
    
public static void main(String[] args) {
	Scanner t=new Scanner(System.in);
	String l=t.next();
	uniqueElements(l);
}
}

			
			
		
	
			
	
	
			
	

