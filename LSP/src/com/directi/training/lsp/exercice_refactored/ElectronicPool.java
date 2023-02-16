package com.directi.training.lsp.exercice_refactored;

public class ElectronicPool {

    public void run()
    {
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(electricDuck);
        swim(electricDuck);
    }
    private void quack(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.turnOn();
            duck.quack();
            duck.turnOff();
        }
    }

    private void swim(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.turnOn();
            duck.swim();
            duck.turnOff();
        }
    }
    public static void main(String[] args)
    {
        ElectronicPool electronicPool = new ElectronicPool();
        electronicPool.run();
    }
}
