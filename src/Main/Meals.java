package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Meals {
    private final List<Meal> appetizers=new ArrayList<Meal>();
    private final List<Meal> mainCourses=new ArrayList<Meal>();
    private final List<Meal> desertsNDrinks=new ArrayList<Meal>();

    private final Map<String,Integer> appetizersQuantity=new TreeMap<String,Integer>();
    private final Map<String,Integer> mainCourseQuantity=new TreeMap<String,Integer>();
    private final Map<String,Integer> desertsNDrinksQuantity=new TreeMap<String,Integer>();



    public Meals(){
        this.initData();
    }
    private void initData()  {
        String file="D:/Software Development/java/ThePermian/src/Data/menu.txt";
        String data,transformedData;
        String [] words;

        String mid,cuisineId,typeOfMealId;
        String mealName;
        Double mealPrice;
    try {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
        Main obj=new Main();
        while((data=bufferedReader.readLine())!=null) {

            transformedData=data.trim();
            words=transformedData.split("-");

            mid=words[0];
            mealName=words[1];
            mealPrice=(Double.parseDouble(words[2].substring(3)));
            cuisineId=mid.substring(0,2);
            typeOfMealId=mid.substring(2,3);
            System.out.println(typeOfMealId);
            if(obj.INCuisine==true && cuisineId.equals("IN")){
                if (typeOfMealId.equals("A")) {
                    this.appetizers.add(new Meal(mid, mealName, mealPrice));
                    this.appetizersQuantity.put(mid, 0);
                } else if (typeOfMealId.equals("M")) {
                    this.mainCourses.add(new Meal(mid, mealName, mealPrice));
                    this.mainCourseQuantity.put(mid, 0);
                } else {
                    this.desertsNDrinks.add(new Meal(mid, mealName, mealPrice));
                    this.desertsNDrinksQuantity.put(mid, 0);
                }
            }
            if(obj.ITCuisine==true && cuisineId.equals("IT")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);
                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);
                } else {
                    desertsNDrinks.add(new Meal(mid, mealName, mealPrice));
                    desertsNDrinksQuantity.put(mid, 0);
                }
            }
            if(obj.FRCuisine==true && cuisineId.equals("FR")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);
                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);
                } else {
                    desertsNDrinks.add(new Meal(mid, mealName, mealPrice));
                    desertsNDrinksQuantity.put(mid, 0);
                }
            }
            if(obj.MECuisine==true && cuisineId.equals("ME")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);
                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);
                } else {
                    desertsNDrinks.add(new Meal(mid, mealName, mealPrice));
                    desertsNDrinksQuantity.put(mid, 0);
                }
            }
            if(obj.JACuisine==true && cuisineId.equals("JA")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);
                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);
                } else {
                    desertsNDrinks.add(new Meal(mid, mealName, mealPrice));
                    desertsNDrinksQuantity.put(mid, 0);
                }
            }
            if(obj.CHCuisine==true && cuisineId.equals("CH")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);
                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);
                } else {
                    desertsNDrinks.add(new Meal(mid, mealName, mealPrice));
                    desertsNDrinksQuantity.put(mid, 0);
                }
            }if(obj.ENCuisine==true && cuisineId.equals("EN")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);
                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);
                } else {
                    desertsNDrinks.add(new Meal(mid, mealName, mealPrice));
                    desertsNDrinksQuantity.put(mid, 0);
                }
            }
        }
        bufferedReader.close();
      }catch (Exception e){
        e.printStackTrace();
    }

    }

    public List<Meal> getMainCourses() {
        return mainCourses;
    }

    public List<Meal> getDesertsNDrinks() {
        return desertsNDrinks;
    }

    public List<Meal> getAppetizers(){

        return appetizers;
    }


    public List<Meal> getMeals(){
        List<Meal> meals= new ArrayList<Meal>(appetizers);
        meals.addAll(mainCourses);
        meals.addAll(desertsNDrinks);
        return meals;
    }


}
