import java.util.HashMap;
import java.util.HashSet;


public class ContainsDuplicate_LeetCode_217 {


    // //https://leetcode.com/problems/contains-duplicate/description/
    // https://www.google.com/search?q=%24120%2C000+to+%24160%2C000%2B+annually++in+india&sca_esv=136eabc9db6c0ef3&sxsrf=APpeQnt7WKLgh6iJYrLUsKHhe6q0rSUpCg%3A1791964170637&source=hp&ei=CjTPapK9JOzXseMP9o_BoAs&iflsig=ABILxe8AAAAAas9CGh_KjYnd6i2RYUQ4VSJZTzh_J4A4&ved=0ahUKEwiS6tregrmXAxXsa2wGHfZHELQQ4dUDCCs&uact=5&oq=%24120%2C000+to+%24160%2C000%2B+annually++in+india&gs_lp=Egdnd3Mtd2l6IigkMTIwLDAwMCB0byAkMTYwLDAwMCsgYW5udWFsbHkgIGluIGluZGlhMgUQIRifBTIFECEYnwUyBRAhGJ8FSJGIAVAAWO6FAXAGeACQAQCYAbEBoAHmEKoBBDAuMTW4AQPIAQD4AQL4AQGYAhWgAqsRwgIIEAAYgAQYogTCAgUQABjvBcICBBAhGBXCAgQQIRgKmAMAkgcENi4xNaAHtj2yBwQwLjE1uAeaEcIHBjguMTIuMcgHG4AIAQ&sclient=gws-wiz&mstk=AUtExfAUGDbgFURB9oB0Vktg4TonEH6hK5_MCqENvGkH5EAQQjNPIEfklyLPi6azj4WFqJjc3k5xNZoa4gtebNSUSCQZZ817vnqZtmT7iEA4oy-sOKmP9gPnh2E8MdPABHVHDXPK8V30ubPOEBMHrv0pjjHL1G3fjSc6yZ7uyHWKaenmS8JMfxZxxFd7TTuXcwQivud0s8eQH2GbyRkZqyfYBH4GQgZIGH14EhkOx8-XOPK8ZeiJUqtyxafR4c6liakkQeWJ9DDGk92ocFkr1Gfz5xPga9bZbC28a22RzFP996pea7NMIg&csuir=1&aioh=3&udm=50#aof=1
    public static void main(String[] args) {
        ContainsDuplicate_LeetCode_217 solution = new ContainsDuplicate_LeetCode_217();
        int[] nums = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums));
    }
    
    public boolean containsDuplicate(int[] nums) {

        // Solution-1 Using HashTable

        // HashSet<Integer> uniqueElements = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        //     uniqueElements.add(nums[i]);
        // }

        // if (nums.length != uniqueElements.size()) {
        //     return true;
        // }

        // return false;




        // Solution-2  Using HashMap
        // https://leetcode.com/problems/contains-duplicate/description/

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            
            if(map.containsKey(nums[i])) {
                return true;
            } 
            map.put(nums[i], i);
        }

            return false;


         // Solution-3  The Brute Force Approach

    // public boolean containsDuplicate(int[] nums) {

    //     for(int i=0 ; i < nums.length; i++) {
    //         for(int j = i+1; j < nums.length; j++) {
    //             if(nums[i] == nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    }

}
