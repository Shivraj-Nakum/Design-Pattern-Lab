package com.adapter;

import com.random.NewRecipes;

public class RecipeAdapter implements Recipes{

    NewRecipes nr = new NewRecipes();
    @Override
    public void cook(String str) {
        nr.khana(str);
    }
}
