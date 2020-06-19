package kata_8kyu;

/*
Write a function that merges two sorted arrays into a single one. The arrays only contain integers.
Also, the final outcome must be sorted and not have any duplicate.
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergingSortedIntegerArrays {
    public static int[] mergeArraysStream(int[] first, int[] second) {
        Set<Integer> mergedArraysSet = new HashSet<Integer>();
        mergedArraysSet.addAll(IntStream.of(first)
                .boxed()
                .collect(Collectors.toList()));

        mergedArraysSet.addAll((IntStream.of(second)
                .boxed()
                .collect(Collectors.toList())));

        List<Integer> mergedArrayList = mergedArraysSet.stream()
                .sorted()
                .collect(Collectors.toList());

        return mergedArrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted().toArray();
    }
}
