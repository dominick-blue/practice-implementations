/*
*  Implementation of the Factory Method design pattern
*
*/

interface Vehicle
{
    String getType();
}

class Car implements Vehicle
{
    @Override
    public String getType()
    {
        return "Car";
    }
}

class Bike implements Vehicle
{
    @Override
    public String getType()
    {
        return "Bike";
    }
}

class Truck implements Vehicle
{
    @Override
    public String getType()
    {
        return "Truck";
    }
}

abstract class VehicleFactory
{
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory
{

}

class BikeFactory extends VehicleFactory
{

}

class TruckFactory extends VehicleFactory
{

}