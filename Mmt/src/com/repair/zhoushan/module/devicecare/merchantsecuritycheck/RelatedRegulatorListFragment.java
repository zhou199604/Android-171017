package com.repair.zhoushan.module.devicecare.merchantsecuritycheck;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.mapgis.mmt.common.util.MmtViewHolder;
import com.mapgis.mmt.config.ServerConnectConfig;
import com.mapgis.mmt.entity.ResultData;
import com.mapgis.mmt.R;
import com.repair.zhoushan.module.BaseDetailFragment;

import java.util.List;

/**
 * 所属调压器列表
 */
public class RelatedRegulatorListFragment extends BaseDetailFragment<RegulatorModel> {

    private String id;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.id = getArguments().getString("ID");
    }

    @Override
    protected void fillContentView(ResultData<RegulatorModel> resultData) {

        ListView listView = new ListView(getActivity());
        listView.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT));
        listView.setSelector(R.drawable.item_focus_bg);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                RegulatorModel model = (RegulatorModel) parent.getAdapter().getItem(position);

                ((RelatedDeviceListFragment) getParentFragment()).naviToFeedback(model.ID, model.GISCode);
            }
        });

        RegulatorListAdapter listAdapter = new RegulatorListAdapter(getActivity(), resultData.DataList);
        // listView.setDividerHeight(DimenTool.dip2px(getActivity(), 8));
        listView.setAdapter(listAdapter);

        addContentView(listView);
    }

    @Override
    protected String getRequestUrl() {

        return ServerConnectConfig.getInstance().getBaseServerPath()
                + String.format("/Services/Zondy_MapGISCitySvr_CaseManage/REST/CaseManageREST.svc/Maintenance/GetRegulatorList?id=%s", id);
    }

    private class RegulatorListAdapter extends BaseAdapter {

        private LayoutInflater inflater;
        private Context context;
        private List<RegulatorModel> dataList;

        public RegulatorListAdapter(Context context, List<RegulatorModel> dataList) {
            this.context = context;
            this.dataList = dataList;
            this.inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return dataList.size();
        }

        @Override
        public Object getItem(int position) {
            return dataList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.base_list_item, null);
            }

            final RegulatorModel regulatorModel = dataList.get(position);

            ((TextView) MmtViewHolder.get(convertView, R.id.itemIndex))
                    .setText(context.getString(R.string.string_listitem_index, (position + 1)));

            ((TextView) MmtViewHolder.get(convertView, R.id.desc_top_left)).setText(regulatorModel.GISCode);
            ((TextView) MmtViewHolder.get(convertView, R.id.desc_mid_left)).setText(regulatorModel.Addr);

            MmtViewHolder.get(convertView, R.id.desc_top_right).setVisibility(View.GONE);
            MmtViewHolder.get(convertView, R.id.desc_mid_bottom_left).setVisibility(View.GONE);
            MmtViewHolder.get(convertView, R.id.desc_bottom_left).setVisibility(View.GONE);
            MmtViewHolder.get(convertView, R.id.desc_bottom_right).setVisibility(View.GONE);

            return convertView;
        }
    }
}
