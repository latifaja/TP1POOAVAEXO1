Student Grade Management
In this exercise, two classes were instantiated to manage the storage and processing of student grades.
Classes:
Main:
Contains the main method for data input and user interaction.
GererNotes:
Responsible for operations related to grades, such as sorting, calculating the average, displaying the maximum and minimum grades, and counting students with a specific grade.
Implementation Details
Inputting Grades:
The Main class starts by asking the user how many grades they want to enter (variable n).
A float array named notes is created to store these values.
Using a for loop, grades are input one by one and stored in the array.
Managing Grades:
An instance of the GererNotes class is created to perform various operations on the notes array.
The method TrierEtAfficher(float[] notes) sorts the array using Arrays.sort() and displays the sorted grades.
The method AfficherNotesMoyenne(float[] notes) calculates the average of the grades by summing all the values in the array and dividing by the total number of grades. The result is then displayed.
The method MaxMinNotes(float[] notes) determines and displays the maximum and minimum grades by iterating through the array and comparing each grade.
Finally, the method NbreEtudiants(float[] notes, float not) counts the number of students who have a grade specified by the user, using a loop to check each grade in the array.
