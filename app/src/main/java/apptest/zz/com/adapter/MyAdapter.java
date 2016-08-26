package apptest.zz.com.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import apptest.zz.com.myapplication.R;

/**
 * Created by Administrator on 2016/6/13.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;

    public MyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 2;
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

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_port_wait_buy_listview,
                    null);
            holder = new ViewHolder();
            holder.tv_buy_now_btn = (TextView) convertView.findViewById(R.id.tv_buy_now_btn);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        return convertView;

    }

    /**
     * 一个listView中多种布局
     * @param position
     * @return
     */

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    class ViewHolder {
        private TextView tv_buy_now_btn;
    }
}
