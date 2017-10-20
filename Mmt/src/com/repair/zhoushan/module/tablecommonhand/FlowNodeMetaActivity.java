package com.repair.zhoushan.module.tablecommonhand;

import android.os.Bundle;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.maintainproduct.entity.GDFormBean;
import com.maintainproduct.entity.GDGroup;
import com.mapgis.mmt.BaseActivity;
import com.mapgis.mmt.common.util.NetUtil;
import com.mapgis.mmt.entity.ResultData;
import com.mapgis.mmt.global.MmtBaseTask;
import com.repair.zhoushan.common.Utils;
import com.repair.zhoushan.entity.FlowNodeMeta;
import com.repair.zhoushan.module.FlowBeanFragment;
import com.repair.zhoushan.module.devicecare.MaintenanceFeedBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liuyunfan on 2016/7/19.
 */
public class FlowNodeMetaActivity extends BaseActivity {

    protected String getViewDataUrl = "";

    protected List<FlowNodeMeta> mFlowNodeMetas = null;

    //用作包含字段集
    protected ArrayList<MaintenanceFeedBack> maintenanceFeedBacks = null;
    protected boolean isRead=true;

    protected FlowBeanFragment flowBeanFragment = new FlowBeanFragment();

    private GDFormBean gdFormBean = null;

    public GDFormBean getGdFormBean() {
        return gdFormBean;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getIntent().hasExtra("maintenanceFeedBacks")) {
            String maintenanceFeedBackStr = getIntent().getStringExtra("maintenanceFeedBacks");
            maintenanceFeedBacks = new Gson().fromJson(maintenanceFeedBackStr, new TypeToken<ArrayList<MaintenanceFeedBack>>() {
            }.getType());
        }

        getViewData();

        setBottonBtn();
    }

    protected void handViewData() {

        if (mFlowNodeMetas == null) {
            showErrorMsg("界面数据不存在");
            return;
        }

        if (mFlowNodeMetas.size() == 0) {
            showErrorMsg("界面数据为空");
            return;
        }

        List<GDFormBean> gdFormBeans = new ArrayList<>();

        for (FlowNodeMeta flowNodeMeta : mFlowNodeMetas) {
            gdFormBeans.add(flowNodeMeta.mapToGDFormBean(isRead));
        }

        if (gdFormBeans.size() == 0) {
            showErrorMsg("界面数据为空");
            return;
        }

        List<GDGroup> groups = new ArrayList<>();

        for (int i = 0; i < gdFormBeans.size(); i++) {

            GDFormBean gdFormBean1 = gdFormBeans.get(i);
            groups.addAll(Arrays.asList(gdFormBean1.Groups));

        }

        gdFormBean = new GDFormBean();
        gdFormBean.Groups = groups.toArray(new GDGroup[groups.size()]);


        initView();

    }

    protected void initView() {
        if (gdFormBean == null) {
            return;
        }

        flowBeanFragment.setFilterCriteria(maintenanceFeedBacks);
        Bundle args = new Bundle();
        args.putParcelable("GDFormBean", gdFormBean);

        flowBeanFragment.setArguments(args);

        addFragment(flowBeanFragment);
    }

    protected void getViewData() {

        if (mFlowNodeMetas != null) {
            handViewData();
            return;
        }

        if (TextUtils.isEmpty(getViewDataUrl)) {
            showErrorMsg("获取界面信息地址未指定");
            return;
        }

        new MmtBaseTask<Void, Void, String>(this) {
            @Override
            protected String doInBackground(Void... params) {
                return NetUtil.executeHttpGet(getViewDataUrl);
            }

            @Override
            protected void onSuccess(String s) {
                super.onSuccess(s);

                ResultData<FlowNodeMeta> resultData = Utils.json2ResultDataToast(FlowNodeMeta.class, context, s, "网络不通", false);
                if (resultData == null) {
                    return;
                }
                mFlowNodeMetas = resultData.DataList;

                handViewData();
            }
        }.mmtExecute();
    }

    protected void setBottonBtn() {

    }
}
