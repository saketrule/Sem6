# Object Oriented Thinking Exercise - Bike repair workshop automation

Saket Joshi
TCSB034

## Problem:
Please recall the example of Bike-Workshop that I have presented in the previous OOAD class and gave it as assignment to you.

Consider you are automatic a mechanical workshop by robots. They accept a vehicle for service, take the service order, do the service and finally dispatch the vehicle. This is the broad scenario.

Now, you need to come up with "Object oriented thinking" on what API Bike should expose, what API workshop robots should expose, how they interact to achieve the service automatically.

The exercise now is,
1. List down various objects in the scenario (Objects may be physical or conceptual).
2. For each object indicate what is the API provided and for which functionality.

I would like to see 10 different object types, with each object having 2 API function calls (excepting constructor).

Each object type you detail, will fetch you 1 mark!


## First draft objects:

The bike is the main object, which has various bike parts. I think the relevant functionality can be combined using interfaces.

Within braces are methods and variables associated to object


interface Problem{
check_problem();
fix_problem();
}

interface Bike_parts{
Problem[] myproblems;
}

These inherit from Bike_parts and Problem

Bell{
ring();
}

Wheels{
Problem puncture;
}

Chain{
Problem oil,broken;
oil.check_problem = check_oil()
oil.fix_problem = add_oil()
}

Handle{
handle_orientation
check_handle_orientation()
correct_handle_orientation()
}

repair_bot
{
take_bike()
repair_bike()
analyze bike()
return_bike()
}




