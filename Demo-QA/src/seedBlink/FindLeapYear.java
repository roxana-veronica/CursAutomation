package seedBlink;

import java.time.Year;
import java.util.ArrayList;


public class FindLeapYear {


		    public static int[] getLeapYears(int startYear) {
		        int currentYear = Year.now().getValue();
		        ArrayList<Integer> leapYears = new ArrayList<>();
			
		        for (int year = startYear; year <= currentYear; year++) {
		            if (isLeapYear(year)) {
		                leapYears.add(year);
		            }
		        }

		        int[] result = new int[leapYears.size()];
		        for (int i = 0; i < leapYears.size(); i++) {
		            result[i] = leapYears.get(i);
		        }

		        return result;
		    }

		    private static boolean isLeapYear(int year) {
		        if (year % 4 != 0) {
		            return false;
		        } else if (year % 100 != 0) {
		            return true;
		        } else if (year % 400 != 0) {
		            return false;
		        } else {
		            return true;
		        }
		    }

		    public static void main(String[] args) {
		        int startYear = 2000; // Replace with your desired start year
		        int[] leapYears = getLeapYears(startYear);

		        System.out.println("Leap years between " + startYear + " and current year:");
		        for (int year : leapYears) {
		            System.out.println(year);
		        
		    }
	}

}
