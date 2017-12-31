package a32ndbatch.rubuya09.uuproject2.travelguideuu.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import a32ndbatch.rubuya09.uuproject2.travelguideuu.MapPojoModels.Result;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.R;

/**
 * Created by n on 11/21/2017.
 */

public class TAResponseCustomAdapter extends BaseAdapter {
    private class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
    private Context mContext;
    private final ArrayList<Result>places_name;
    public TAResponseCustomAdapter(Context c,ArrayList<Result>places_name){
        mContext=c;
        this.places_name=places_name;
    }
    @Override
    public int getCount() {
        return places_name.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       TAResponseCustomAdapter.ViewHolder viewHolder;
        if(convertView==null){
            LayoutInflater inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.ta_response_itemsingle,null,true);
            viewHolder=new TAResponseCustomAdapter.ViewHolder();
            viewHolder.imageView=(ImageView)convertView.findViewById(R.id.npr_item_image);
            viewHolder.textView=(TextView) convertView.findViewById(R.id.npr_item_text);
            convertView.setTag(viewHolder);

        }else{
            viewHolder=(TAResponseCustomAdapter.ViewHolder)convertView.getTag();

        }
        viewHolder.imageView.setImageResource(R.mipmap.agency);
        viewHolder.textView.setText(places_name.get(position).getName());
        return convertView;
    }
}
