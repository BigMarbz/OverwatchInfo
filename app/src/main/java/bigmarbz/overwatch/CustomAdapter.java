package bigmarbz.overwatch;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Matthew on 12/29/2016.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<RowItem> rowItemList;

    CustomAdapter(Context context, List<RowItem>rowItemList){
        this.context=context;
        this.rowItemList=rowItemList;
    }
    @Override
    public int getCount() {
        return rowItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItemList.indexOf(getItem(position));
    }

    private class ViewHolder{
        TextView elo;
        TextView rank;
        ImageView pic;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;

        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            convertView = mInflater.inflate(R.layout.complist,null);
            holder = new ViewHolder();

            holder.rank = (TextView) convertView.findViewById(R.id.RankTitle);
            holder.elo = (TextView) convertView.findViewById(R.id.elo);
            holder.pic = (ImageView) convertView.findViewById(R.id.picture);

            RowItem row_pos = rowItemList.get(position);

            holder.pic.setImageResource(row_pos.getPic_id());
            holder.elo.setText(row_pos.getElo());
            holder.rank.setText(row_pos.getRank());
        }
        return convertView;
    }
}
