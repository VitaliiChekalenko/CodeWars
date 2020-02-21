/*For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.

The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page. The types of values contained within the collection/array are not relevant.

The following are some examples of how this class is used:

PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
helper.pageCount(); //should == 2
helper.itemCount(); //should == 6
helper.pageItemCount(0); //should == 4
helper.pageItemCount(1); // last page - should == 2
helper.pageItemCount(2); // should == -1 since the page is invalid

// pageIndex takes an item index and returns the page that it belongs on
helper.pageIndex(5); //should == 1 (zero based index)
helper.pageIndex(2); //should == 0
helper.pageIndex(20); //should == -1
helper.pageIndex(-10); //should == -1*/

import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    private List<I> c;
    private double it;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.c = collection;
        this.it = itemsPerPage;
    }

    public int itemCount() {
        return c.size();
    }

    public int pageCount() {
        return (int) Math.ceil(c.size() / it);

    }

    public int pageItemCount(int pageIndex) {

        if (pageIndex > (int) Math.floor(c.size() / it) || pageIndex < 1) {
            return -1;
        }
        if (pageIndex == (int) Math.floor(c.size() / it)) {
            return (int) (c.size() % it);
        }
        return (int) it;
    }

    public int pageIndex(int itemIndex) {

        if (itemIndex > c.size() || itemIndex < 0 || c.isEmpty()) return -1;

        return (int) Math.floor(itemIndex / it);
    }
}