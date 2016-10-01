package com.peto.httprequests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class DatePuzzler {

	static HashMap<String, String> months = new HashMap();
	/*
	"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November" and "December"
	*/
	static {
		months.put("January", "December");
		months.put("February", "January");
		months.put("March", "February");
		months.put("April", "March");
		months.put("May", "April");
		months.put("June", "May");
		months.put("July", "June" );
		months.put("August", "July");
		months.put("September", "August");
		months.put("October", "September");
		months.put("November","October");
		months.put("December", "November");
	}
	
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {

			String sDate = br.readLine();
			sb.append(findPreviousDate(sDate)).append("\n");
        }

        System.out.println(sb.toString());
    }
    
    public static String findPreviousDate(String date) {
    	String[] ss = date.split(" ");
    	
    	StringBuilder prevDate = new StringBuilder();
    	
    	String dd = ss[0];
    	String mm = ss[1];
    	String yy = ss[2];
    	
    	if(mm.equals("January")) {
    		if(dd.equals("1")) {
    			prevDate.append("31").append(" ").append(months.get(mm)).append(" ").append(""+(Integer.parseInt(yy)-1));
    		}
    		else {
	    		prevDate.append(""+(Integer.parseInt(dd)-1)).append(" ").append(mm).append(" ").append(yy);
	    	}
    	}
    	
    	else if(mm.equals("March")) {
    		int iYY = Integer.parseInt(yy);
    		boolean isLeap = false;
    		
    		if (iYY%400 == 0)
			   isLeap = true;
			else if (iYY%100 == 0)
			   isLeap = true;
			else if (iYY%4 == 0 )
			   isLeap = true;
    
    
    		if(isLeap) {
	    		if(dd.equals("1")) {
	    			prevDate.append("29").append(" ").append(months.get(mm)).append(" ").append(yy);
	    		}	
	    		else {
		    		prevDate.append(""+(Integer.parseInt(dd)-1)).append(" ").append(mm).append(" ").append(yy);
		    	}
    		}
    		else {
    			if(dd.equals("1")) {
	    			prevDate.append("28").append(" ").append(months.get(mm)).append(" ").append(yy);
	    		}	
	    		else {
		    		prevDate.append(""+(Integer.parseInt(dd)-1)).append(" ").append(mm).append(" ").append(yy);
		    	}
	    	}
    	}
    	
    	else if(mm.equals("August")) {
    		if(dd.equals("1")) {
    			prevDate.append("31").append(" ").append(months.get(mm)).append(" ").append(""+(Integer.parseInt(yy)-1));
    		}
    		else {
	    		prevDate.append(""+(Integer.parseInt(dd)-1)).append(" ").append(mm).append(" ").append(yy);
	    	}
    	}
    	
    	else if(mm.equals("February") || mm.equals("April") || mm.equals("June") || mm.equals("September") || mm.equals("November")) {
    		
    		if(dd.equals("1")) {
    			prevDate.append("31").append(" ").append(months.get(mm)).append(" ").append(yy);
    		}
    		else {
	    		prevDate.append(""+(Integer.parseInt(dd)-1)).append(" ").append(mm).append(" ").append(yy);
	    	}
    	}
    	
    	else if(mm.equals("March") || mm.equals("May") || mm.equals("July") || mm.equals("October") || mm.equals("December")) {
    		
    		if(dd.equals("1")) {
    			prevDate.append("30").append(" ").append(months.get(mm)).append(" ").append(yy);
    		}
    		else {
	    		prevDate.append(""+(Integer.parseInt(dd)-1)).append(" ").append(mm).append(" ").append(yy);
	    	}
    	}
    	
    	else {
    		prevDate.append(""+(Integer.parseInt(dd)-1)).append(" ").append(mm).append(" ").append(yy);
    	}
    	return prevDate.toString();
    }
}
