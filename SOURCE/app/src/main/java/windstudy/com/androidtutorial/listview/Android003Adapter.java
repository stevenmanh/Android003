package windstudy.com.androidtutorial.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import windstudy.com.androidtutorial.R;

public class Android003Adapter extends BaseAdapter {

    ArrayList<String> data;
    Context context;

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            // lay view tu file xml
            view = LayoutInflater.from(context).inflate(R.layout.listview_item_layout, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.tvPrefix = view.findViewById(R.id.tv_prefix);
            viewHolder.tvName = view.findViewById(R.id.tv_name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        // hien thi noi dung vao view
        String name = data.get(i);
        viewHolder.tvName.setText(name);
        String prefix = String.valueOf(name.charAt(0));
        viewHolder.tvPrefix.setText(prefix);
        return view;
    }
    
    // dung viewholder de tang hieu nang cho listview
    class ViewHolder {
        TextView tvPrefix;
        TextView tvName;
        public ViewHolder() {

        }
    }
}
