
public class Date {
	private int day;
	private int month;
	private int year;
	
	public void setDate(int dd, int mm, int yy) {
		
		year = yy;
		month = mm;
		
		if(mm < 1 || mm > 12) {
			month = 1;
			day = 1;
		}
		else {
			if((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
				if(mm == 2) {
					if(dd < 1 || dd > 29)
						day = 1;
					else
						day = dd;
				}
				else if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
					if(dd < 1 || dd > 31 )
						day = 1;
					else
						day = dd;
				}
				else {
					if(mm == 4 || mm == 6 || mm == 9 || mm == 11) {
						if(dd < 1 || dd > 30 )
							day = 1;
						else
							day = dd;
					}
				}
			}
			else {
				if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
					if(dd < 1 || dd > 31 )
						day = 1;
					else 
						day = dd;
				}
				else if(mm == 4 || mm == 6 || mm == 9 || mm == 11){
						if(dd < 1 || dd > 30 )
							day = 1;
						else
							day = dd;
					}
				else {
					if(mm == 2) {
						if(dd < 1 || dd > 28)
							day = 1;
						else 
							day = dd;
					}
				}
			}
		}
	}
	
	public void addDay(int n) {

		    int dd = day;
		    int mm = month;
		    int yy = year;

		    int maxDays = 0;

		    if (mm == 2) {
		        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
		            maxDays = 29;
		        else 
		            maxDays = 28;
		    }
		    else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
		        maxDays = 30;
		    else
		        maxDays = 31;

		    dd = dd + n;

		    while (dd > maxDays) {

		        dd = dd - maxDays;
		        mm++;

		        if (mm > 12) {
		            mm = 1;
		            yy++;
		        }

		        if (mm == 2) {
		            if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) 
		                maxDays = 29;
		            else
		                maxDays = 28;
		        }
		        else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
		            maxDays = 30;
		        else
		            maxDays = 31;
		    	}

		    day = dd;
		    month = mm;
		    year = yy;
	}
	
	void addMonth(int m) {
		    int dd = day;
		    int mm = month;
		    int yy = year;

		    for (int itemp = 1; itemp <= m; itemp++) {

		        mm++;

		        // December -> January
		        if (mm > 12) {
		            mm = 1;
		            yy++;
		        }
		    }

		    // Find maximum days in the new month
		    int maxDays;

		    if (mm == 2) {
		        // Check leap year
		        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
		            maxDays = 29;
		        else
		            maxDays = 28;
		    }
		    else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
		        maxDays = 30;
		    else 
		        maxDays = 31;

		    if (dd > maxDays)
		        dd = maxDays;

		    // Store the new date
		    day = dd;
		    month = mm;
		    year = yy;
	}
	
	public void addYear(int y) {
	    int dd = day;
	    int mm = month;
	    int yy = year;

	    for (int itemp = 1; itemp <= y; itemp++) {
	        yy++;
	    }

	    // Find maximum days in the new month
	    int maxDays;

	    if (mm == 2) {

	        // Check leap year
	        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
	            maxDays = 29;
	        else
	            maxDays = 28;
	    }
	    else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
	        maxDays = 30;
	    else 
	        maxDays = 31;

	    // If current day doesn't exist in the new month
	    if (dd > maxDays)
	        dd = maxDays;

	    // Store the new date
	    day = dd;
	    month = mm;
	    year = yy;
}
	
	public void display() {
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
}

//243














//public class Date {
//	private int day;
//	private int month;
//	private int year;
//	
//	int value_month[] = {1,2,3,4,5,6,7,8,9,10,11,12};
//	
//	public void setDate(int dd, int mm, int yy) {
//		
//		year = yy;
//		month = mm;
//		
//		if(mm < 1 || mm > 12) {
//			month = 1;
//			day = 1;
//		}
//		else {
//			if((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
//				if(mm == 2) {
//					if(dd < 1 || dd > 29)
//						day = 1;
//					else
//						day = dd;
//				}
//				else if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
//					if(dd < 1 || dd > 31 )
//						day = 1;
//					else
//						day = dd;
//				}
//				else {
//					if(mm == 4 || mm == 6 || mm == 9 || mm == 11) {
//						if(dd < 1 || dd > 30 )
//							day = 1;
//						else
//							day = dd;
//					}
//				}
//			}
//			else {
//				if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
//					if(dd < 1 || dd > 31 )
//						day = 1;
//					else 
//						day = dd;
//				}
//				else if(mm == 4 || mm == 6 || mm == 9 || mm == 11){
//						if(dd < 1 || dd > 30 )
//							day = 1;
//						else
//							day = dd;
//					}
//				else {
//					if(mm == 2) {
//						if(dd < 1 || dd > 28)
//							day = 1;
//						else 
//							day = dd;
//					}
//				}
//			}
//		}
//	}
//	
//	public void addDay(int n) {
//
//		    int dd = day;
//		    int mm = month;
//		    int yy = year;
//
//		    int maxDays = 0;
//
//		    if (mm == 2) {
//		        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
//		            maxDays = 29;
//		        else 
//		            maxDays = 28;
//		    }
//		    else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
//		        maxDays = 30;
//		    else
//		        maxDays = 31;
//
//		    dd = dd + n;
//
//		    while (dd > maxDays) {
//
//		        dd = dd - maxDays;
//		        mm++;
//
//		        if (mm > 12) {
//		            mm = 1;
//		            yy++;
//		        }
//
//		        if (mm == 2) {
//		            if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) 
//		                maxDays = 29;
//		            else
//		                maxDays = 28;
//		        }
//		        else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
//		            maxDays = 30;
//		        else
//		            maxDays = 31;
//		    	}
//
//		    day = dd;
//		    month = mm;
//		    year = yy;
//	}
//	
//	void addMonth(int m) {
//		    int dd = day;
//		    int mm = month;
//		    int yy = year;
//
//		    for (int itemp = 1; itemp <= m; itemp++) {
//
//		        mm++;
//
//		        // December -> January
//		        if (mm > 12) {
//		            mm = 1;
//		            yy++;
//		        }
//		    }
//
//		    // Find maximum days in the new month
//		    int maxDays;
//
//		    if (mm == 2) {
//		        // Check leap year
//		        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
//		            maxDays = 29;
//		        else
//		            maxDays = 28;
//		    }
//		    else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
//		        maxDays = 30;
//		    else 
//		        maxDays = 31;
//
//		    if (dd > maxDays)
//		        dd = maxDays;
//
//		    // Store the new date
//		    day = dd;
//		    month = mm;
//		    year = yy;
//	}
//	
//	public void addYear(int y) {
//	    int dd = day;
//	    int mm = month;
//	    int yy = year;
//
//	    for (int itemp = 1; itemp <= y; itemp++) {
//	        yy++;
//	    }
//
//	    // Find maximum days in the new month
//	    int maxDays;
//
//	    if (mm == 2) {
//
//	        // Check leap year
//	        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
//	            maxDays = 29;
//	        else
//	            maxDays = 28;
//	    }
//	    else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
//	        maxDays = 30;
//	    else 
//	        maxDays = 31;
//
//	    // If current day doesn't exist in the new month
//	    if (dd > maxDays)
//	        dd = maxDays;
//
//	    // Store the new date
//	    day = dd;
//	    month = mm;
//	    year = yy;
//}
//	
//	public void display() {
//		System.out.println(day);
//		System.out.println(month);
//		System.out.println(year);
//	}
//}
//
////243
