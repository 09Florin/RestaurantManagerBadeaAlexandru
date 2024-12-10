/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author alexa
 */
public class SuperClass {
    
    //==============================Quantity========================
    public double CheeseBurger;
    public double MashedPotatoes;
    public double KidsMenu;
    public double CaesarSalad;
    public double ChickenBurrito;
    public double QuattroFormaggiPizza;
    
    public double Cola;
    public double LiptonIce;
    public double Cappuccino;
    public double Water;
    public double SprinkleWater;
    public double MintTea;
    
    public double Meals;
    public double Drinks;
    public double TotalOfMealsAndDrinks;
   
    
    public double GetAmount(){ 
        
        Meals = CheeseBurger + MashedPotatoes + KidsMenu + CaesarSalad + ChickenBurrito + QuattroFormaggiPizza;
        Drinks = Cola + LiptonIce + Cappuccino + Water + SprinkleWater + MintTea;
        TotalOfMealsAndDrinks = Meals + Drinks;
        return TotalOfMealsAndDrinks;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
       int confirm = JOptionPane.showConfirmDialog(
        frame, // Use your JFrame as the parent component
        "Are you sure you want to exit?", // Message to display
        "Exit Confirmation", // Title of the dialog
        JOptionPane.YES_NO_OPTION // Options to display: Yes and No
        );
       if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0); // Exit the application
        }
    }
    
    // ==============================Price==============================
    
    public double CheeseBurgerPrice = 5.4;
    public double MashedPotatoesPrice = 2.1;
    public double KidsMenuPrice = 3.5;
    public double CaesarSaladPrice = 3.5;
    public double ChickenBurritoPrice = 6;
    public double QuattroFormaggiPizzaPrice = 5.5;
    
    public double ColaPrice = 2.2;
    public double LiptonIcePrice = 2.6;
    public double CappuccinoPrice = 3;
    public double WaterPrice = 0;
    public double SprinkleWaterPrice = 1;
    public double MintTeaPrice = 3;
    
    public double Tax = 0.08;
    
    public Double ComputeTax(double Amount){
        
        double ComputedTax = (Amount * Tax);
        return ComputedTax;
    }
    
}
