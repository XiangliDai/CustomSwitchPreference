package com.example.xdai.custom_switch_preference;

import android.content.res.ColorStateList;
import android.support.annotation.ColorInt;

public class Utils {
    public static ColorStateList colorToStateList(@ColorInt int color, @ColorInt int disabledColor) {
        return new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_enabled},
                        new int[]{-android.R.attr.state_checked},
                        new int[]{},
                },
                new int[]{
                        disabledColor,
                        disabledColor,
                        color,
                });
    }
}
