//4) How many ways to initialize String  in java? Explain role of String literal pool.
As we all know String is immutable in java so do it gives birth to two ways of initialization as we do have the concept of String Pool in java.

Ways: Initializing Strings in Java

    1.Direct initialization
    1.Indirect initialization
****************************************************************
//Way 1: Direct Initialization(String Constant)
In this method, a String constant object will be created in String pooled area which is inside the heap area in memory. 
As it is a constant, we can’t modify it, i.e. String class is immutable.
**********
//Way 2: Object Initialization (Dynamic)

In this method, a String object will be created in the heap area (not inside String pooled area as in the upper case). We can’t modify it(like in the upper case). Also with the same value, a String constant is also created in the String pooled area, but the variable will point to the String object in the heap area only.



***************************
//Methods: Comparing Strings and their References

    equals() method: It compares values of string for equality. Return type is boolean. In almost all the situation you can use useObjects.equals().
    == operator: It compares references not values. Return type is boolean. == is used in rare situations where you know you’re dealing with interned strings.
    compareTo() method: It compares values lexicographically and returns an integer value that describes if first string is less than, equal to, or greater than the second string. For example, if str1 and str2 are two string variables then refer below as follows:
        str1 == str2 : return 0
        str1 > str2 : return a positive value
        str1 < str2 : return a negative value

    Note: The positive and negative values returned by compareTo method is the difference of first unmatched character in the two strings.
