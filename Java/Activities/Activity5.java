import java.util.Arrays;

class Activity4 {
    static void ascendingSort(int array[]) {
        int size = array.length, i;

        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        ascendingSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
Activity 5
        In this activity we use the Abstract Class to show implementation of Abstraction.

        For this activitiy:

        Create an abstract class Book that has:
        title of type String
        an abstract method setTitle() that takes one String argument.
        a concrete method getTitle() that returns the value of title.
        Create another class that extends the abstract class called MyBook.
        MyBook defines the setTitle() method to assign the value of title as the argument.
public void setTitle(String s) {
        title = s;
        }
        Activity 5
        In the main method, create an object of MyBook class - newNovel.
        Use the setTitle() method to book title to the variable title.
        Use the getTitle() method to print the name of the book
//Set title
        newNovel.setTitle(title);

//Print result
        System.out.println("The title is: " + newNovel.getTitle());
        Activity 6
        In this activity we show implementation of Encapsulation.

        There is a plane that can onboard passengers. Whenever plane takes off the date of taking off has to be updated. Same with landing.

        Below is an implementation where everything is public, there are no methods and every operation requires changing the fields directly.

        Our job is to make this implementation OOP friendly.

class Plane {
    public List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public Date lastTimeLanded;
}
23 . 4


