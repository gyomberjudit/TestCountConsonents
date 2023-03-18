package org.example;

public class Main {
    public static void main(String[] args) {


    }

// angol Stringben számoljuk meg a benne lévő mássalhangzókat
// ha számlálni akarunk, kel egy számláló
    //megszámoljuk a magánhangzókat és kivonjuk a string hosszából
    public int countConsonent(String str) {
        int count = 0;
        String vowel = "aeiou";                     //nagybetűt is figyelni kell!, ezért átalakítjuk a bejövő str-t kisbetűssé, a ciklus előtt
        str = str.toLowerCase();                    //ugyanaz a változó neve, str
        for (int i=0; i< str.length(); i++) {       //megszámolni a magánhangzókat, egyenként
            char n = str.charAt(i);                 // karaktereken végigmenni és elmenteni egy változóba
            if (vowel.indexOf(n) < 0) {             // indexOf, megmondja, hogy az adott karakter melyik pozícióban van, -1 ha nincs benne
                count++;
            }
        }
        return count;
    }

//A paraméterként adott Stringben minden magánhangzót alakítsunk nagybetűsre!
    public static String swap(String st){
        String vowels = "aeiou";
        String newString = "";
        for (int i=0; i<st.length(); i++) {
            char letter = st.charAt(i);
            if (vowels.indexOf(letter)>=0) {
                newString += Character.toUpperCase(letter);
            } else {
                newString += letter;
            }
        }
        return newString;
    }
}