package com.example.affirmations.model

//com.example.affirmations.model is a package for class that model(or represent) the data, will contain any data-related in this app.
//a class called "Affirmation" contains the "resourceID" of the string defined in this app.
//make Affirmation a data class by adding the "data" keyword before the class definition, and must have at least one property defined .
data class Affirmation(val stringResourceId: Int) {

}