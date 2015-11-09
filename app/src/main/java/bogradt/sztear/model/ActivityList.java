package bogradt.sztear.model;

import java.util.ArrayList;

import bogradt.sztear.R;

public class ActivityList {
    private ArrayList<ActivityPropertyBean> activityPropertyBeanList = new ArrayList<ActivityPropertyBean>();

    public ActivityList() {

        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.ImageTargets,
                R.drawable.button,R.drawable.button,"Sample Image target",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.CloudRecognition,
                R.drawable.button,R.drawable.button,"Using clouds",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.CylinderTarget,
                R.drawable.button,R.drawable.button,"Cylinder targets",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.FrameMarkers,
                R.drawable.button,R.drawable.button,"Frame markers",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.TextRecognition,
                R.drawable.button,R.drawable.button,"Text recognition with Vuforia",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.UserDefinedTarget,
                R.drawable.button,R.drawable.button,"User defined targets",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.VirtualButtons,
                R.drawable.button,R.drawable.button,"Virtual buttons",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description",ActivityNames.ExtendedTracking,
                R.drawable.button,R.drawable.button,"Extended tracking sample",new String[]{""}));
    }

    public ArrayList<ActivityPropertyBean> getActivityPropertyBeanList() {
        return activityPropertyBeanList;
    }
}
