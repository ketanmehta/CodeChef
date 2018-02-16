import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/FEB18/problems/CHEFPTNT
 */ 
strictfp class CHEFPTNT{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        CHEFPTNT c = new CHEFPTNT();
        c.getClass().isInstance(t);
        while ((t--)>0)
        {
        	String[] toks = br.readLine().trim().split(" ");
            int n= Integer.parseInt(toks[0]);
            int m= Integer.parseInt(toks[1]);
            int limitPerPatent= Integer.parseInt(toks[2]);
            Integer.parseInt(toks[3]);
            String s=br.readLine().trim();
            int evenWorkers=0,oddWorkers=0;
            for (int i=0;i<s.length();i++)
                if (s.charAt(i)=='E')
                    evenWorkers++;
                else oddWorkers++;    
            int evenMonths,oddMonths;
            if (m%2==0)
            {
                evenMonths=m/2;
                oddMonths=evenMonths;
            }
            else {
                evenMonths=m/2;
                oddMonths=evenMonths+1;
            }
            int oddProjectCompleted,evenProjectCompleted;
            if(limitPerPatent == 0){
            	System.out.println("no");
            	continue;
            }
            int oddPossibleProjects=(oddWorkers/limitPerPatent);
            int evenPossibleProjects=(evenWorkers/limitPerPatent);
 
            if (oddMonths<=oddPossibleProjects){
            	oddProjectCompleted=oddMonths*limitPerPatent;
            }
            else {
            	oddProjectCompleted=oddPossibleProjects*limitPerPatent+(oddWorkers%limitPerPatent);
            }
            if (evenMonths<=evenPossibleProjects){
            	evenProjectCompleted=evenMonths*limitPerPatent;
            }
            else{
            	evenProjectCompleted=evenPossibleProjects*limitPerPatent+(evenWorkers%limitPerPatent);
            }
 
 
            int totalWork=oddProjectCompleted+evenProjectCompleted;
            if (totalWork<n)
                System.out.println("no");
            else System.out.println("yes");
        }
        br.close();
	}
	
}
