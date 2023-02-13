package com.directi.training.lsp.exercice_refactored;

public class BasicDuck implements Duck {
    @Override
    public void quack()
    {
        System.out.println("Quack...");
    }
    @Override
    public void swim()
    {
        System.out.println("Swim...");
    }
}
