package sg.edu.rp.c346.id20031826.p05_ndp_songs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id20031826.p05_ndp_songs.R;
import sg.edu.rp.c346.id20031826.p05_ndp_songs.songs;

    public class CustomAdapter extends ArrayAdapter {

        Context parent_context;
        int layout_id;
        ArrayList<songs> List;

        public CustomAdapter(Context context, int resource, ArrayList<songs> objects) {

            super(context, resource, objects);

            parent_context = context;
            layout_id = resource;
            List = objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Obtain the LayoutInflater object
            LayoutInflater inflater = (LayoutInflater)
                    parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            // "Inflate" the View for each row
            View rowView = inflater.inflate(layout_id, parent, false);

            // Obtain the UI components and do the necessary binding
            TextView tvTitle = rowView.findViewById(R.id.textViewtitle);
            TextView tvDate = rowView.findViewById(R.id.textViewsinger);

            // Obtain the Android Version information based on the position
            songs currentVersion = List.get(position);

            // Set values to the TextView to display the corresponding information
            tvTitle.setText(currentVersion.getTitle());
            tvDate.setText(currentVersion.getSingers().toString());

            return rowView;
        }

    }


