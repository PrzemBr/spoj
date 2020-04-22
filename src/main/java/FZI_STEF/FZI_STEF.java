package FZI_STEF;

import java.util.ArrayList;

public class FZI_STEF {

    public Integer SumOfAllElements(ArrayList<Integer> profitsList) {
        Integer sum = 0;
        for (Integer element : profitsList) {
            sum = sum + element;
        }
        return sum;
    }
    public ArrayList<Integer> profitFromCities(ArrayList<Integer> profitsFromCities) {
        int forwardIterator = 0;
        int forwardSum = 0;
        for (int j = 0; j <= profitsFromCities.size() - 1; j++) {

            if (profitsFromCities.get(j) < 0) {
                for (int k = 0; k <= forwardIterator; k++) {
                    forwardSum = forwardSum + profitsFromCities.get(k);
                    if (forwardSum < 0) {
                        for (int l = 0; l <= forwardIterator; l++) {
                            profitsFromCities.set(l, 0);
                        }
                    } if (k == forwardIterator) {
                        forwardSum = 0;
                    }
                }
            }

            forwardIterator++;
        }

        int backwardIterator = profitsFromCities.size() - 1;
        int backwardSum = 0;

        for (int j = profitsFromCities.size() - 1; j >= 0; j--) {

            if (profitsFromCities.get(j) < 0) {
                for (int k = profitsFromCities.size() - 1; k >= backwardIterator; k--) {
                    backwardSum = backwardSum + profitsFromCities.get(k);

                    if (backwardSum < 0) {
                        for (int l = profitsFromCities.size() - 1; l >= backwardIterator; l--) {
                            profitsFromCities.set(l, 0);
                        }
                    } if (k == backwardIterator) {
                        backwardSum = 0;
                    }
                }
            }
            backwardIterator--;
        }
        return profitsFromCities;
    }

    public ArrayList<Integer> profitFromCities(ArrayList<Integer> profitsFromCities, boolean isHalfList) {

        if (isHalfList) {
            if (profitsFromCities.size()%2 != 0) {
                profitsFromCities.add(0);
            }

            int forwardIterator = 0;
            int forwardSum = 0;
            for (int j = 0; j <= (profitsFromCities.size() - 1)/2; j++) {

                if (profitsFromCities.get(j) < 0) {
                    for (int k = 0; k <= forwardIterator; k++) {
                        forwardSum = forwardSum + profitsFromCities.get(k);
                        if (forwardSum < 0) {
                            for (int l = 0; l <= forwardIterator; l++) {
                                profitsFromCities.set(l, 0);
                            }
                        } if (k == forwardIterator) {
                            forwardSum = 0;
                        }
                    }
                }

                forwardIterator++;
            }

            int backwardIterator = profitsFromCities.size() - 1;
            int backwardSum = 0;

            for (int j = profitsFromCities.size() - 1; j >= 0; j--) {

                if (profitsFromCities.get(j) < 0) {
                    for (int k = profitsFromCities.size() - 1; k >= backwardIterator; k--) {
                        backwardSum = backwardSum + profitsFromCities.get(k);

                        if (backwardSum < 0) {
                            for (int l = profitsFromCities.size() - 1; l >= backwardIterator; l--) {
                                profitsFromCities.set(l, 0);
                            }
                        } if (k == backwardIterator) {
                            backwardSum = 0;
                        }
                    }
                }
                backwardIterator--;

                if (j==(profitsFromCities.size()/2)) {
                    break;
                }
            }
            return profitsFromCities;
        } else {
            return profitsFromCities;
        }
    }
}
