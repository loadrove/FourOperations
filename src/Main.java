import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class Main {
	public static void main(String[] args) throws ScriptException  {
		Main test = new Main();
		ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
		char [] instruction = {'+','-','*','/'};
		Random random = new Random();
		//保存算式
		List<String> equations=new ArrayList<String>();
		System.out.println("201571030329");
		System.out.println("生成几个算式？");
		Scanner number = new Scanner(System.in);
        int n=number.nextInt();
        System.out.println("======================");
        for(int i=0;i<n;i++)
        {
        	int ins=random.nextInt(3)+3;
        	int a=(int) (Math.random()*100+1);
        	StringBuilder equation= new StringBuilder();
        	equation.append(a);
        	int x=a;
            //通过循环生成若干数学算式
            for(int j=0;j<ins;j++)
            {
            	char c=instruction[random.nextInt(4)];
            	int y=(int) (Math.random()*100+1);
            	if(c=='+') 
            	{
            		a=a+y;
            	}
            	if(c=='-')
            	{
            		if(x-y<0)
            		{
            			y=(int) (Math.random()*a+1);
            		}
            		a=a-y;
            	}
            	if(c=='*')
            	{
            		a=a*y; 
            	}
            	if(c=='/')
            	{
	            		do {
	            			y=(int) (Math.random()*a+1);
            				if(y==0){
	            				continue;
	            			}
	            		}while(x%y!=0);
            			a=a/y;
            	}
        		equation.append(c);
        		equation.append(y);      
        }
        	String ex=equation.toString();
        	Double result=Double.valueOf(se.eval(ex).toString());
        	if(result<0||result%1!=0||result>500){
        		i--;
        		continue;
        	}
        	equations.add(ex);
	}
        try {  
	        FileWriter fw = new FileWriter("result.txt");  
	        BufferedWriter bw = new BufferedWriter(fw);  
	        bw.append("201571030329"); 
	        bw.newLine();
	        for(String e:equations) {
	     	   e=e+"="+se.eval(e.toString());
	     	   System.out.println(e);
	     	   bw.write(e.toString()); 
	     	   bw.newLine();
	         }
	         bw.close();  
	 	       fw.close(); 
	    } catch (Exception ee) {   
	        ee.printStackTrace();  
	    }  
      System.out.println("========================");  
	}
}
