package kata_8kyu;

/*
It's bonus time in the big city! The fatcats are rubbing their paws in anticipation...
but who is going to make the most money?

Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.

If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough
money and must receive only his stated salary.

Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3", JS, Go, and Java),
 "$" (C#, C++, Ruby, Clojure, Elixir, PHP and Python, Haskell, Lua) or "¥" (Rust).
 */

public class DoIGetBonus {
    public static String bonusTime(final int salary, final boolean bonus){
        int finalSalary = 0;
        if (bonus){
            finalSalary = salary * 10;
            return "\u00A3"+finalSalary;
        }
        return "\u00A3" + salary;
    }
}
