package kata_7kyu;

/*
Codewars Bar recommends you drink 1 glass of water per standard drink so you're not hungover tomorrow morning.

Your fellow coders have bought you several drinks tonight in the form of a string. Return a string suggesting
how many glasses of water you should drink to not be hungover.

Example parties:
Input 0:
"1 beer"

Output 0:
"1 glass of water"

Explaination 0:
You drank one standard drink

Input 1:
"1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"

Output 1:
"10 glasses of water"

Explaination 1:
You drank ten standard drinks

Note:

To keep the things simple, we'll considere that any "numbered thing" in the string is a drink.
Even "1 bear" => "1 glass of water" or "1 chainsaw and 2 pools" => "3 glasses of water"...
 */

public class ResponsibleDrinking {
    public String hydrate(String drinkString) {
        String[] listOfNumbersBeforeConversion = drinkString.replaceAll("[a-zA-Z,\\s+]", "")
                .split("");
        int total = 0;
        for (String a : listOfNumbersBeforeConversion) {
            total += Integer.parseInt(a);
        }
        if (total > 1) {
            return total + " glasses of water";
        } else {
            return total + " glass of water";
        }


        /* Stream solution
        long glassesOfWater Pattern.compile("[^\\d]+")
                .splitAsStream(drinkString)
                .mapToInt(s -> Integer.parseInt(s))
                .sum();
        return String.format("%d glass%s of water", glassesOfWater, glassesOfWater == 1 ? "" : "es");
         */
    }
}
