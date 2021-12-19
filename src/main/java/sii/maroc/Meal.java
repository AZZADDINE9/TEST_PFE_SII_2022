package sii.maroc;

public class Meal {

	private Restaurant res;
    private boolean MealInPreparationLine=false;
   // private int qua =res.quantity_Tomatoes();
   
    
    public Meal() {}
    public Meal(boolean MealInPreparationLine) {
    	this.MealInPreparationLine=MealInPreparationLine;
    }
    
	public boolean isMealInPreparationLine(boolean MealInPreparationLine) {
		this.MealInPreparationLine=MealInPreparationLine;
		return MealInPreparationLine;
	}

	public void setMealInPreparationLine(boolean mealInPreparationLine2) {
		this.MealInPreparationLine = mealInPreparationLine2;
		
	}
	public int servedDishes() {
		if (MealInPreparationLine==true) {
		return 1;}
		else return 0;
	}

	public int cookingDuration() {
	//	int som=6;
		//for(int i=2;i<=qua;i++) {
			//som+=3;
		//}
           // return som;
		return 0;
	}

}
