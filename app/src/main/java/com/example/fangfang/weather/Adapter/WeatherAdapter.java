package com.example.fangfang.weather.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fangfang.weather.Model.HourlyWeather;
import com.example.fangfang.weather.R;

import java.util.List;

/**
 *
 */

public class WeatherAdapter extends ArrayAdapter<HourlyWeather> {
    private int resourceId;

    private Context context;

    public WeatherAdapter(Context context, int textViewResourceId, List<HourlyWeather> objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.resourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        HourlyWeather weather = getItem(position);
        View view = LayoutInflater.from(context).inflate(resourceId, null);

        TextView forecastTime = (TextView) view.findViewById(R.id.forecastTime);
        TextView forecastTemp = (TextView) view.findViewById(R.id.forecastTemp);
        TextView forecastPop = (TextView) view.findViewById(R.id.forecastPop);
        TextView forecastWind = (TextView) view.findViewById(R.id.forecastWind);

        forecastTime.setText(weather.getTime());
        forecastTemp.setText(weather.getTemp());
        forecastPop.setText(weather.getPop());
        forecastWind.setText(weather.getWind());
        return view;
    }

}
