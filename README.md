LSP states that child class should be able to substitute its parent class without affecting its behaviour. 

This Vehicle Project is created to demonstrate the Liskov Substitution Principle (LSP)

I have created two seperate folders,

1.Existing - to demonstrate the violation of LSP

2.Redefined - Effective Solution to resolve the violation of LSP.
*********************************************************************************
**Existing** 

![Screenshot 2024-02-07 163600](https://github.com/Saakira22/LSP/assets/145532751/262fcc50-96da-466f-8e33-9f099899a71f)

**Parent class** - Vehicle class with 2 methods (hasengine(), getNumberofWheels())

Behaviour: A vehicle must have an engine and wheels to move

**Child classes** - Car, Motorcycle, Bicycle (Bicycle class symbolizes all Non-Engine Vehicles)

**Violation of LSP** - Bicycle violates the behaviour of vehicle class as it moves without engine.
**********************************************************************************
**Redefined**

![Screenshot 2024-02-07 164241](https://github.com/Saakira22/LSP/assets/145532751/7280ca8a-6309-4fa8-8905-898ae9e595c7)

To resolve this violation I have used Inheritance Properly

**Parent class** - Vehicle class is redefined that it can also function without an engine.

**Child class**- Enginevehicle class and vehicles that doesn't have an engine.

 EngineVehicle class is inherited from vehicle class and all engine vehicles are inherited from EngineVehicle class.
 
 Non Engine vehicles are directly inherited from Vehicle class.
 
 So behaviour of the parent class (Vehicle class) is not affected.

************************************************************************************
**How it resolves the violation?**

In the existing version of this project violation was arised because the Non-Engine Vehicle class (Bicycle) affects the behaviour of Parent class (Vehicle).

Now in the Redefined version behaviour of parent class(Vehicle) is not affected by the non engine vehicle subclasses.
