package Model;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Meals {
    private final List<Meal> appetizers=new ArrayList<>();
    private final List<Meal> mainCourses=new ArrayList<>();
    private final List<Meal> desserts=new ArrayList<>();

    private static Map<String,Integer> appetizersQuantity=new TreeMap<>();
    private static  Map<String,Integer> mainCourseQuantity=new TreeMap<>();
    private static  Map<String,Integer> dessertsQuantity=new TreeMap<>();

    public static Map<String, Integer> getAppetizersQuantity() {
        return appetizersQuantity;
    }

    public static Map<String, Integer> getMainCourseQuantity() {
        return mainCourseQuantity;
    }

    public static Map<String, Integer> getDessertsQuantity() {
        return dessertsQuantity;
    }

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
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        while((data=bufferedReader.readLine())!=null) {

            transformedData=data.trim();
            words=transformedData.split("-");

            mid=words[0];
            mealName=words[1];
            mealPrice=(Double.parseDouble(words[2].substring(3)));
            cuisineId=mid.substring(0,2);
            typeOfMealId=mid.substring(2,3);
            if(Main.INCuisine && cuisineId.equals("IN")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);

                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);

                } else {
                    desserts.add(new Meal(mid, mealName, mealPrice));
                    dessertsQuantity.put(mid, 0);

                }
            }
            if(Main.ITCuisine && cuisineId.equals("IT")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);

                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);

                } else {
                    desserts.add(new Meal(mid, mealName, mealPrice));
                    dessertsQuantity.put(mid, 0);

                }
            }
            if(Main.FRCuisine && cuisineId.equals("FR")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);

                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);

                } else {
                    desserts.add(new Meal(mid, mealName, mealPrice));
                    dessertsQuantity.put(mid, 0);

                }
            }
            if(Main.MECuisine && cuisineId.equals("ME")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);

                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);

                } else {
                    desserts.add(new Meal(mid, mealName, mealPrice));
                    dessertsQuantity.put(mid, 0);
                }
            }
            if(Main.JACuisine && cuisineId.equals("JA")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);

                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);

                } else {
                    desserts.add(new Meal(mid, mealName, mealPrice));
                    dessertsQuantity.put(mid, 0);

                }
            }
            if(Main.CHCuisine && cuisineId.equals("CH")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);

                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);

                } else {
                    desserts.add(new Meal(mid, mealName, mealPrice));
                    dessertsQuantity.put(mid, 0);

                }
            }
            if(Main.ENCuisine && cuisineId.equals("EN")){
                if (typeOfMealId.equals("A")) {
                    appetizers.add(new Meal(mid, mealName, mealPrice));
                    appetizersQuantity.put(mid, 0);

                } else if (typeOfMealId.equals("M")) {
                    mainCourses.add(new Meal(mid, mealName, mealPrice));
                    mainCourseQuantity.put(mid, 0);

                } else {
                    desserts.add(new Meal(mid, mealName, mealPrice));
                    dessertsQuantity.put(mid, 0);

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

    public List<Meal> getDesserts() {
        return desserts;
    }

    public List<Meal> getAppetizers(){

        return appetizers;
    }


    public List<Meal> getMeals(){
        List<Meal> meals= new ArrayList<>(appetizers);
        meals.addAll(mainCourses);
        meals.addAll(desserts);
        for(Meal meal:meals){

        }
        return meals;
    }


}
