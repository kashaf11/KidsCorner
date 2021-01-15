package pk.edu.iiui.kidscorner;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] story_name_list;
    private int[] story_image_list;

    public MyAdapter(Context c, String[] story_name_list,int[] story_image_list) {
        context=c;
        this.story_name_list=story_name_list;
        this.story_image_list=story_image_list;
    }


    @Override
    public int getCount() {
        return story_name_list.length;
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
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView= inflater.inflate(R.layout.grid_view_item,null);
        }
        TextView textView = convertView.findViewById(R.id.textView);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        textView.setText(story_name_list[position]);
        imageView.setImageResource(story_image_list[position]);
        return convertView;
    }
}


