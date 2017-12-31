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
 * Created by mks on 11/15/2017.
 */

public class NPResponseCustomAdapter extends BaseAdapter {
    private class ViewHolder {
        ImageView imageView;
        TextView textView;
    }

    private Context mContext;
    private final ArrayList<Result> places_name;
    private final int[] Imageid;
    private final int ppos;

    public NPResponseCustomAdapter(Context c, ArrayList<Result> places_name, int[] Imageid, int ppos) {
        mContext = c;
        this.places_name = places_name;
        this.Imageid=Imageid;
        this.ppos=ppos;
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
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if(view==null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.np_response_itemsingle, null, true);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.npr_item_image);
            viewHolder.textView = (TextView) view.findViewById(R.id.npr_item_text);
            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.imageView.setImageResource(Imageid[ppos]);
        viewHolder.textView.setText(places_name.get(position).getName());
        return view;
    }
}
