public static int calculateCastles(int[] A) {
    var streamlined = new ArrayList<>(List.of(A[0]));

    // removing successive duplicates since they add no value in calculation
    for (int i = 1; i < A.length; i++) {
        if (A[i] != A[i - 1]) {
            streamlined.add(A[i]);
        }
    }

    // the graph contains only one point
    if (streamlined.size() == 1) {
        return 1;
    }
    
    var localMin = 0;
    var localMax = 0;
    
    // checking the graph extremes for local maxima & minima
    if (streamlined.get(0) < streamlined.get(1)) {
        localMin++;
    }

    if (streamlined.get(0) > streamlined.get(1)) {
        localMax++;
    }

    if (streamlined.get(streamlined.size() - 1) < streamlined.get(streamlined.size() - 2)) {
        localMin++;
    }

    if (streamlined.get(streamlined.size() - 1) > streamlined.get(streamlined.size() - 2)) {
        localMax++;
    }

    // checking the rest of the graph for local maxima & minima
    for (int i = 1; i < streamlined.size() - 1; i++) {
        if (streamlined.get(i + 1) < streamlined.get(i) && streamlined.get(i - 1) < streamlined.get(i)) {
            localMax++;
        }

        if (streamlined.get(i + 1) > streamlined.get(i) && streamlined.get(i - 1) > streamlined.get(i)) {
            localMin++;
        }
    }

    return localMax + localMin;
}

//number of castles

import java.util.ArrayList;
import java.util.List;

public class CastleCalculator {
    public static int calculateCastles(int[] A) {
        List<Integer> streamlined = new ArrayList<>();
        streamlined.add(A[0]);
        
        // removing successive duplicates since they add no value in calculation
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                streamlined.add(A[i]);
            }
        }
        
        // the graph contains only one point
        if (streamlined.size() == 1) {
            return 1;
        }
        
        int localMin = 0;
        int localMax = 0;
        
        // checking the graph extremes for local maxima & minima
        if (streamlined.get(0) < streamlined.get(1)) {
            localMin++;
        }
        
        if (streamlined.get(0) > streamlined.get(1)) {
            localMax++;
        }
        
        if (streamlined.get(streamlined.size() - 1) < streamlined.get(streamlined.size() - 2)) {
            localMin++;
        }
        
        if (streamlined.get(streamlined.size() - 1) > streamlined.get(streamlined.size() - 2)) {
            localMax++;
        }
        
        // checking the rest of the graph for local maxima & minima
        for (int i = 1; i < streamlined.size() - 1; i++) {
            if (streamlined.get(i + 1) < streamlined.get(i) && streamlined.get(i - 1) < streamlined.get(i)) {
                localMax++;
            }
            
            if (streamlined.get(i + 1) > streamlined.get(i) && streamlined.get(i - 1) > streamlined.get(i)) {
                localMin++;
            }
        }
        
        return localMax + localMin;
    }
}
