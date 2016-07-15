# CustomSwitchPreference
It's trick to customize a SwitchPreference, in this repository I would like to introduce 3 different ways of doing it.

1, Create your own SwitchPreference layout if you want to not only customize the switch but also the style of title and/or summary;

2, Create your own Switch layout if you only want to customize the switch itself;

3, Create a custom SwithchPreference Class to extend SwitchPreference, you can customize the switch and title/summary at once this way, but you will lose the animation comes with SwitchPreference

For the first two approaches, the tricky part is that, in the settings xml file, use CheckBoxPrefernce instead of SwitchPrefernce, since we can't refer     android:id="@android:id/switchWidget" in the customized layout file, we only have access of         android:id="@android:id/checkbox". Difference between them is, when apply the first layout put             android:layout="@layout/custom_preference_switch_layout"
while for the second one, put             android:widgetLayout="@layout/custom_switch_layout"
 



