package bigmarbz.overwatch;

/**
 * Created by Matthew on 12/29/2016.
 */

public class RowItem {
    private String rank;
    private String elo;
    private int pic_id;

    public RowItem (String rank, String elo, int pic_id) {
        this.rank = rank;
        this.elo = elo;
        this.pic_id = pic_id;
    }

    public String getRank(){return rank;}
    public void setRank(String rank){this.rank = rank;}
    public int getPic_id(){return pic_id;}
    public void setPic_id(int pic_id){this.pic_id=pic_id;}
    public String getElo(){return elo;}
    public void setElo(String elo){this.elo=elo;}
}
