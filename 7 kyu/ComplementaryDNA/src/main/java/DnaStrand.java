/*Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

DnaStrand.makeComplement("ATTGC") // return "TAACG"

DnaStrand.makeComplement("GTAT") // return "CATA"*/

public class DnaStrand {
  public static String makeComplement(String dna) {
    String[] arr= dna.split("");
    for(int i=0; i<arr.length; i++){
      if ("A".equals(arr[i])) {
        arr[i] = "T";
        continue;
      }
      if (arr[i].equals("T")){
        arr[i]="A";
        continue;
      }
      if (arr[i].equals("G")){
        arr[i]="C";
        continue;
      }
      if (arr[i].equals("C")){
        arr[i]="G";
      }
    }
    return String.join("", arr);
  }
}