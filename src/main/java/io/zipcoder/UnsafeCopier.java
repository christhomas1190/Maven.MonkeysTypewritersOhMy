package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        //creates loop to ensure the stringInterator has a next index
 while(stringIterator.hasNext()){
     //fills the empty copied variable with the next occurrence of a string and adds a " "
     copied+=stringIterator.next();
 }
    }
}
