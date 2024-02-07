# LSP
LSP states that child class should be able to substitute parent class without breaking the code. 

This Vehicle Project is created to demonstrate the Liskov Substitution Principle
I have created two seperate folders,
1.Existing - to demonstrate the violation of LSP
2.Redefined - Effective Solution to overcome the violation of LSP.
*********************************************************************************
**Existing** 
**Parent class** - Vehicle class with 2 methods (hasengine(), getNumberofWheels())
**Child classes** - Car, Motorcycle, Bicycle (Bicycle class symbolizes Non-Engine Vehicles)
**Violation of LSP** - Bicycle class removes the capability(hasengine()) of its Parent class(Vehicle) which leads to Null Pointer Exception (Breaking of Client Code). 
**********************************************************************************
**Redefined**
To resolve this violation I have used Inheritance Properly
Parent class - Vehicle class containing only the generic methods(i.e. methods applicable to all its children). In this case getNumberofWheels is the generic method.
Child class- Enginevehicle class and vehicles that doesn't have an engine.
Under Enginevehicle class I have created classes of vehicle with engine.
**How it resolves the violation?**
Now as Non-Engine Vehicles __are not compelled__ to call the hasengine() method so that they can substitue their parent class without breaking the code.
