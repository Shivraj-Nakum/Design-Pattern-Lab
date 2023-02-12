package com.adapter;

public class Kitchen {

    private Recipes r;

    public Recipes getR() {
        return r;
    }

    public void setR(Recipes r) {
        this.r = r;
    }

    public void cookFood(String str){
        r.cook(str);
    }
}
