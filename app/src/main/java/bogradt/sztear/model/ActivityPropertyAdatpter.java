package bogradt.sztear.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bogradt.sztear.R;

public class ActivityPropertyAdatpter extends BaseAdapter {
    private final List<ActivityPropertyBean> activityPropertyBeans;

    public ActivityPropertyAdatpter(final Context context, List<ActivityPropertyBean> activityPropertyBeans) {
        this.activityPropertyBeans = activityPropertyBeans;
    }

    @Override
    public int getCount() {
        return activityPropertyBeans.size();
    }

    @Override
    public Object getItem(int position) {
        return activityPropertyBeans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ActivityPropertyBean activityProperty = activityPropertyBeans.get(position);
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_row,null);

        ImageView thumbnailImageView = (ImageView)itemView.findViewById(R.id.thumbnail);
        thumbnailImageView.setImageResource(activityProperty.getSmallThumbnail());

        TextView title = (TextView)itemView.findViewById(R.id.title);
        title.setText(activityProperty.getActivityTitle());

        TextView description = (TextView)itemView.findViewById(R.id.short_description);
        description.setText(activityProperty.getShortDescription());

        return itemView;
    }
}
