package SimpleAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class ElecctronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int currentTotal;
        int maxAllowedTotal = -1;
        for(int keyboard : keyboards){
            for(int drive : drives){
                currentTotal = drive + keyboard;
                if(currentTotal == budget) return currentTotal;
                maxAllowedTotal = currentTotal > maxAllowedTotal && currentTotal < budget ? currentTotal : maxAllowedTotal;

            }
        }
        return maxAllowedTotal;
    }
}
