import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices : " + result[0] + ", " + result[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Utiliser une Map pour stocker les éléments et leurs indices correspondants
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Parcourir le tableau
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Vérifier si le complément existe déjà dans la Map
            if (numToIndex.containsKey(complement)) {
                // Retourner les indices actuel et celui du complément
                return new int[] { numToIndex.get(complement), i };
            }

            // Ajouter l'élément actuel à la Map
            numToIndex.put(nums[i], i);
        }

        // Aucune solution trouvée
        throw new IllegalArgumentException("Aucune solution possible.");
    }
}
