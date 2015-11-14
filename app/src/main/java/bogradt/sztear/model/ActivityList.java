package bogradt.sztear.model;

import java.util.ArrayList;

import bogradt.sztear.R;

public class ActivityList {
    private ArrayList<ActivityPropertyBean> activityPropertyBeanList = new ArrayList<ActivityPropertyBean>();

    public ActivityList() {

        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.ImageTargets,
                R.drawable.button,R.drawable.preview,"Sample Image target",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.CloudRecognition,
                R.drawable.button,R.drawable.preview,"Using clouds",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.CylinderTarget,
                R.drawable.button,R.drawable.preview,"Cylinder targets",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.FrameMarkers,
                R.drawable.button,R.drawable.preview,"Frame markers",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.TextRecognition,
                R.drawable.button,R.drawable.preview,"Text recognition with Vuforia",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.UserDefinedTarget,
                R.drawable.button,R.drawable.preview,"User defined targets",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.VirtualButtons,
                R.drawable.button,R.drawable.preview,"Virtual buttons",new String[]{""}));
        activityPropertyBeanList.add(new ActivityPropertyBean("Short description","A little bit longer description", ActivityName.ExtendedTracking,
                R.drawable.button,R.drawable.preview,"Extended tracking sample",new String[]{""}));
    }

    public ArrayList<ActivityPropertyBean> getActivityPropertyBeanList() {
        return activityPropertyBeanList;
    }
}
