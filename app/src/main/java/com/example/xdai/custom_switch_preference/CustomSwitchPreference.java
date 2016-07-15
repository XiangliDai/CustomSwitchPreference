package com.example.xdai.custom_switch_preference;


import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;


public class CustomSwitchPreference extends SwitchPreference {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public CustomSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomSwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomSwitchPreference(Context context) {
        super(context);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        Switch theSwitch = findSwitchInChildviews((ViewGroup) view);
        if (theSwitch != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                theSwitch.setThumbTintList(Utils.colorToStateList(getContext().getColor(R.color.mint),
                        getContext().getColor(R.color.white)));
                theSwitch.setTrackTintList(Utils.colorToStateList(getContext().getColor(R.color.mint),
                        getContext().getColor(R.color.dark_gray)));

            }
        }

        TextView titleView = (TextView) view.findViewById(android.R.id.title);
        titleView.setTextColor(getContext().getResources().getColor(R.color.blue_gray));
    }

    private Switch findSwitchInChildviews(ViewGroup view) {
        for (int i = 0; i < view.getChildCount(); i++) {
            View thisChildview = view.getChildAt(i);
            if (thisChildview instanceof Switch) {
                return (Switch) thisChildview;
            } else if (thisChildview instanceof ViewGroup) {
                Switch theSwitch = findSwitchInChildviews((ViewGroup) thisChildview);
                if (theSwitch != null) return theSwitch;
            }
        }
        return null;
    }
}