import java.util.HashMap;

public class holidayProblem {

    public static int findMinimumDays(int[] temperatures) {
        int n = temperatures.length;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0;
        int distinctTemperatures = 0;
        int minLength = n; // Initialize with a maximum value

        for (int right = 0; right < n; right++) {
            int currentTemperature = temperatures[right];

            // Update the frequency map
            int currentFrequency = frequencyMap.getOrDefault(currentTemperature, 0);
            frequencyMap.put(currentTemperature, currentFrequency + 1);

            // If it's the first occurrence, increment distinctTemperatures
            if (currentFrequency == 0) {
                distinctTemperatures++;
            }

            while (distinctTemperatures == frequencyMap.size()) {
                minLength = Math.min(minLength, right - left + 1);

                // Shrink the window from the left
                int leftTemperature = temperatures[left];
                int leftFrequency = frequencyMap.get(leftTemperature);
                frequencyMap.put(leftTemperature, leftFrequency - 1);

                if (leftFrequency == 1) {
                    frequencyMap.remove(leftTemperature);
                    distinctTemperatures--;
                }

                left++;
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int[] temperatures = {40, 40, 10, 10, 50, 50};
        int result = findMinimumDays(temperatures);
        System.out.println("Minimum consecutive days: " + result);
    }
}
