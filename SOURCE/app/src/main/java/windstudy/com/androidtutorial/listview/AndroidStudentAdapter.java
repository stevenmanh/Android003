package windstudy.com.androidtutorial.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import windstudy.com.androidtutorial.R;

public class AndroidStudentAdapter extends BaseAdapter {

    ArrayList<AndroidStudent> data;
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
        AndroidStudent androidStudent = data.get(i);
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.android_student_item_layout, viewGroup, false);
            viewHolder.tvName = view.findViewById(R.id.tv_name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tvName.setText(androidStudent.getName() + androidStudent.getPhoneNumber());
        return view;
    }

    class ViewHolder {
        TextView tvName;
    }

}
