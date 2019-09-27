package model;

public class Rank {
    private static final int[] ranks = {1, 8};
    private static final int MIN_RANK = ranks[0];
    private static final int MAX_RANK = ranks[1];
    private int rank;

    public Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public static int[] getRanks() {
        return ranks;
    }

    public static int getMinRank() {
        return MIN_RANK;
    }

    public static int getMaxRank() {
        return MAX_RANK;
    }

    public boolean isRank(){
        for ( int rank : ranks ) {
          if (MIN_RANK <= rank && rank <= MAX_RANK) {
              return true;
          }
        }
        return false;
    }

    @Override
    public String toString() {
        return rank + "";
    }
}
