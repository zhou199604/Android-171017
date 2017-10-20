package com.shortcutbadger.implement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import com.shortcutbadger.Badger;
import com.shortcutbadger.BroadCastHelper;
import com.shortcutbadger.ShortCutBadgeException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxixiang
 */

public class DefaultBadger implements Badger {
    public static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    public static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    public static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";
    public static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";

    @Override
    public void executeBadge(Context context, ComponentName componentName, int badgerCount) throws ShortCutBadgeException {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, badgerCount);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        if (BroadCastHelper.canResolveBroadCast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new ShortCutBadgeException("unable to resolve intent:" + intent.toString());
        }

    }

    @Override
    public List<String> getSupportLaunchers() {
        return new ArrayList<>(0);
    }

    @Override
    public void setLaucherClass(Class clazz) {

    }


    boolean isSupported(Context context) {
        Intent intent = new Intent(INTENT_ACTION);
        return BroadCastHelper.canResolveBroadCast(context, intent);
    }
}