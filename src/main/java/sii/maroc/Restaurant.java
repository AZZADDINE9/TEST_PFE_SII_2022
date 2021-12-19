package sii.maroc;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Restaurant {
	
	

    
    private int mozarellaBalls;
    private int tomatoesNumber;
    private int KG_Flour_left;
    
	//private String order;
    private String quantityMozarella;
    private String  quantityTomatoes;
    private String quantityFlour;
    
    
    
    

	public Restaurant(String quantityMozarella, String quantityTomatoes, String olive0il, String pepper) {
		this.quantityMozarella=quantityMozarella;
		this.quantityTomatoes=quantityTomatoes;
		
	}

	public Restaurant(String quantityFlour, String quantityTomatoes, String seaSalt, String quantityMozarella, String olive0il, String water) {
		this.quantityFlour=quantityFlour;
		this.quantityMozarella=quantityMozarella;
		this.quantityTomatoes=quantityTomatoes;
	}

	public int quantity_Mozarella() {
		String MozaExra="";
		Pattern pattern =Pattern.compile("\\d+"); 
		Matcher match= pattern.matcher(quantityMozarella);
		if (match.find()) {
			MozaExra= match.group(0);}
		mozarellaBalls=Integer.parseInt(MozaExra);
           return Integer.parseInt(MozaExra);
		
	}
	
	public int quantity_Tomatoes() {
		String tomatosExra="";
		Pattern pattern =Pattern.compile("\\d+"); 
		Matcher match = pattern.matcher(quantityTomatoes);
		if (match.find()) {
			tomatosExra= match.group(0);}
		tomatoesNumber=Integer.parseInt(tomatosExra);
           return Integer.parseInt(tomatosExra);
	}
	
	public int quantity_Flour() {
		
		String flourExra="";
		Pattern pattern =Pattern.compile("\\d+"); 
		Matcher match = pattern.matcher(quantityFlour);
		if (match.find()) {
			flourExra= match.group(0);}
		KG_Flour_left=Integer.parseInt(flourExra);
           return Integer.parseInt(flourExra);
	}
	
	public Ticket order(String order) {
		int number_Salad_ToMake=0, number_Pizza_ToMake=0;
		String StringExracted=""; 
		
		Ticket ticket=new Ticket();
		
		if(order.contains("Salad")) {
		
			Pattern pattern =Pattern.compile("\\d+"); 
			Matcher match = pattern.matcher(order);
			if (match.find()) {
			   StringExracted= match.group(0);}
			number_Salad_ToMake=Integer.parseInt(StringExracted);
			
		    if ((mozarellaBalls>=number_Salad_ToMake) && (tomatoesNumber>=(2*number_Salad_ToMake))) {
		    	ticket.setOrder_Accepted(true);
		    }
		    return ticket;
		    
		    
		}else if(order.contains("Pizza")) {
			
			Pattern pattern =Pattern.compile("\\d+"); 
			Matcher m = pattern.matcher(order);
			if (m.find()) {
			   StringExracted= m.group(0);}
			number_Pizza_ToMake=Integer.parseInt(StringExracted);
			
			if((mozarellaBalls>=number_Pizza_ToMake)&& (tomatoesNumber>=(4*number_Pizza_ToMake))&& (KG_Flour_left>=300*number_Pizza_ToMake)) {
				ticket.setOrder_Accepted(true);
			}
		return ticket;
		}
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		Meal meal =new Meal();
		
		if(ticket.isOrder_Accepted()==true) { 
			meal.setMealInPreparationLine(true);
		}
		else 
		{meal.setMealInPreparationLine(true);}
		
		return meal;
		
	}
}
