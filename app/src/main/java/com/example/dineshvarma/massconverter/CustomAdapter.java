package com.example.dineshvarma.massconverter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] codes={"t", "kg", "g", "mg", "µg", "q", "p", "oz", "ct", "gr", "uk.st", "dr", "dan", "jin", "qian"};
    String[] names={"Tonne t", "Kilogramme kg", "Gramme g", "milligramme mg ", "Microgramme µg", "Quintal q", "Pound p",
            "Ounce oz", "Carat ct", "Grain gr", "Stone uk.st", "Dram dr", "Dan dan", "Jin jin", "Qian qian"};
     CustomAdapter(Context c){
        context = c;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView txt = new TextView(context);
        txt.setTextSize(24);
        txt.setText(codes[i]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView txt = new TextView(context);
        txt.setPadding(16, 16, 16, 16);
        txt.setTextSize(28);
        txt.setText(names[position]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }
}
