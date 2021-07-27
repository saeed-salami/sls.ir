import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Calculate {

    public void findDuplicateNumberInArray(ArrayList<Integer> arrayList) {
        Set<Integer> nonDuplicate = new HashSet<>();
        for (int i : arrayList) {
            if (!nonDuplicate.add(i)) {
                System.out.println(i);
            }
        }
    }

    public void findSumOfANumberInArray(ArrayList<Integer> arrayList, int targetNumber) {
        for (int i = 1; i <= targetNumber / 2; i++) {
            if (arrayList.contains(targetNumber - i) && arrayList.contains(i)) {
                System.out.println(targetNumber - i + " + " + i + " = " + targetNumber);
            }
        }
    }

}
