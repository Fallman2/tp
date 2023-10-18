package seedu.address.model.person;

import java.util.Comparator;

/**
 * Represents a comparator that can be used to sort a list of persons based on a specific sort key.
 * This is an abstract class that should be extended by concrete implementations that define the actual
 * sort key and comparison logic.
 */
public abstract class SortKeyComparator implements Comparator<Person> {

    protected boolean sortActive;
    protected boolean reverse;
    protected int index;

    /**
     * Constructor for {@code SortKeyComparator} to work with SortCommand.
     * @param sortActive specifies if the sort should be used.
     * @param reverse specifies if the sort should be reversed.
     * @param index specifies the priority of the sort (lower higher priority).
     */
    public SortKeyComparator(boolean sortActive, boolean reverse, int index) {
        this.sortActive = sortActive;
        this.reverse = reverse;
        if (sortActive) {
            this.index = index;
        } else {
            this.index = -1;
        }
    }

    /**
     * Returns true if the sort should be used. Otherwise, return false.
     */
    public boolean isActive() {
        return this.sortActive;
    }

    /**
     * Getter for the index.
     */
    public int getSortIndex() {
        return index;
    }

    public boolean isReverse() {
        return this.reverse;
    }
}
