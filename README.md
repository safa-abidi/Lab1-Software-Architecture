# SOLID Principles

This work was done in the first Software Architecure lab.
<!---
> **Note**
> You can find it [here](https://github.com/safa-abidi/TP1-archi-logicielles/blob/master/README.md).
--->

## SRP (Single Responsability Principle):

- __Problem:__  

    ![SRP_prob](assets/SRP_prob.png)  

    Each class should have one responsibility.
    The CarManager class includes data as well as 3 methods getCarNames() , getBestCar(), getCarById() which makes it vulnerable to too much modification when we want to change these methods.
    The SRP states that a class should have one and only one reason to change.
    
- __Solution:__   

    ![SRP_sol](assets/SRP_sol.png)   

    We have applied SRP so that the class CarDao contains the array of cars, CarRater implements the method getBestCar() and CarFormatter implements getCarsNames().

## OCP (Open Closed Principle):
- __Problem:__   

    ![OCP_prob](assets/OCP_prob.png)   

    ResourceAllocator contains all the logic and functionalities of Time and Space. Modifying any existing method or adding a new one (for a new resource for example) implies a change of the whole class.
    The OCP states that a class should be open for extension but closed for modification.
- __Solution:__    

    ![OCP_sol](assets/OCP_sol.png)   

    So we created an interface IResource and classes that implement it. Each future modification only results in changes in the corresponding class.

## LSP (Liskov Substitution Principle):
- __Problem:__   

    ![LSP_prob](assets/LSP_prob.png)   

    Calling quack() or swim() for electronicDuck causes exceptions.
    The LSP states that a subclass should be able to replace its superclass without any unexpected behavior.

- __Solution:__   

    ![LSP_sol](assets/LSP_sol.png)

## ISP (Interface Segregation Principle):
- __Problem:__   

    ![ISP_prob](assets/ISP_prob.png)   

    The Door interface has 2 methods timeOutCallback() and proximityCallback(). Timer only uses the timeOutCallback() method and Sensor only uses the proximityCallback() method. 
    The ISP states that a client should not be forced to depend on methods it does not use.
- __Solution:__    

    ![ISP_sol](assets/ISP_sol.png)   

    We apply ISP to distinguish 2 types of Doors. Each implements the method it needs.

## DIP (Dependency Inversion Principle):
- __Problem:__   

    ![DIP_prob](assets/DIP_prob.png)   

    EncodingModule depends on MyDatabase. If we want to change the database, we will have to modify EncodingModule.
    The DIP states that high level classes should not depend on low level classes but on abstractions.
    
- __Solution:__   

    ![DIP_sol](assets/DIP_sol.png)   
    
    To remedy this, we created an interface Database that MyDatabase implements and that EncodingModule uses.
    