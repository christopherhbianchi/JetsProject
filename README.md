#Jets Project

##Week 2 Project
This project is a fleet of Jet objects. Jets can have pilots.

##Topics Covered

* Object-oriented Design
* Inheritance
* Arrays
* UML

#Overview
This project is an application built around a fleet of Jet objects. This application is able to list the fleet of jets, view the fastest jet, view the the jet with the longest range, and add a jet to the fleet. Each Jet object has a model, speed, range, and price. 

#The Application
First I created 5 models of jets and stored them in a Jet array, and then I stored that array in a Hangar object. By creating a hangar object that has a Jet Array as a field, I can store multiple fleets of jets in multiple hangar objects and keep them organized. It also made the menu options, and adding jets to the fleet simpler (more on that later).

Second, I developed a listMenu method that listed a user's options and prompted them for a choice. To enact their decision, the user's choice was then used as the argument for a switch statement that called upon different methods depending on what they wanted to do.

Third, I used my Hangar object in each of these methods to achieve their result. Because my Hangar object was storing an array of Jet objects, or my "Fleet of Jets", it was easy to call in the hangar and have a local Jet array point to the same objects in the Hangar's Jet array. For example, that is what I did with the viewFastestJet method, and I then had a loop iterate through each Jet object within the array to find the fastest one.

Fourth, the most complicated method I worked with was addJetToFleet. I called in my Jet Fleet and set it equal to a local jetFleet array, and I then created a new Jet object (j1), and used Jet methods to set this object's attributes (model, speed, price, range). The tricky part is when I then use my h1 hangar object to call my addJet method with my new j1 Jet object in for its argument. I create a temporary Jet array equal to the length of the current array + 1. Next, I set up a for loop starting with an integer i at 0, and I have the body set each array space of my old jet array to the new temporary array. Then, I set my passed in j1 object equal to the last slot in the new array (which has 1 extra slot than the old one). Finally, I set the new array equal to the old array, and now the jetFleet array field is updated with our new Jet. This is confirmed when you select to re-list the jets or search for the new fastest Jet, etc..

Fifth, I created a JetApp object named app, that can run all of the methods within the JetApp class, and I created a run method that initializes my array objects and runs the program for as long as the user doesn't elect to quit. This allows the Jet Application to be run across any class within the package as long as JetApp has been created within that class. 

