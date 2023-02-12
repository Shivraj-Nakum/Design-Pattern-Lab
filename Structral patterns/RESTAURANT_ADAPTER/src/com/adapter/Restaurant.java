package com.adapter;

import com.random.NewRecipes;

public class Restaurant {
    public static void main(String[] args) {

        //NewRecipes nr = new NewRecipes();
        Recipes r = new RecipeAdapter();
        Kitchen kw = new Kitchen();
        kw.setR(r);
        kw.cookFood("I Know to cook recipes");
    }
}
