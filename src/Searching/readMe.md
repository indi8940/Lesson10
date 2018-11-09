SEARCHING THEORY
================

- 2 popular ways to search through a list (of Strings, objects, numbers, etc) :

LINEAR SEARCH -> Start at first item and move down 1 at a time until match is found
-> if there is no match it will not know until it goes through the entire list.

BINARY SEARCH -> Start at middle of the list. If item is higher, adjust left side to midpoint + 1.
If item is lower, adust right side to midpoint - 1.
Search at new midpoint and repeat until either item is found, OR left and right side collide with each other.

- Binary search can only be used if items are sorted in some way (alpha, numeric)

OBJECTS AND SEARCHING
=====================
Objects from classes can be searchable if the class implements Comparable:

public class Something() implements comparable <Something> {

-Then you decide which instance variable (property) will be used for searching / comparing purposes
- Lastly, you include a compareTo method that returns a comparison of the property with another same 
type of object's same property.
- compareTo returns an 'int' so if you are comparing 2 Strings you can use the String compareTo on that property
- For ints you can do a calculated difference between the 2 values, or just return +1, -1 or 0 depending on
which one is greater.

-Then the collection of objects you are searching through must be sorted by the compareTo property in order to do a
Binary search.

