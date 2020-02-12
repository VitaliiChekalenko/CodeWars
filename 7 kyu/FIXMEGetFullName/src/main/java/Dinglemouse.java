/*The code provided is supposed return a person's Full Name given their first and last names.

But it's not working properly.

Notes
The first and/or last names are never null (None in Python), but may be empty.

Task
Fix the bug so we can all go home early.



https://www.codewars.com/kata/597c684822bc9388f600010f/train/java

*/

public class Dinglemouse {

  private final String firstName;
  private final String lastName;

  public Dinglemouse(final String firstName, final String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFullName() {
    return (firstName + " " + lastName).trim();
  }

}