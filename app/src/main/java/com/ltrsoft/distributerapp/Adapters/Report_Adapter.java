package com.ltrsoft.distributerapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ltrsoft.distributerapp.R;
import com.ltrsoft.distributerapp.fragment.Report_Fragment;
import com.ltrsoft.distributerapp.pojoclasses.ReportPojo;

import java.util.List;

public class Report_Adapter extends RecyclerView.Adapter<Report_Adapter.ViewHolder> {

    private List<ReportPojo> reportList;
    private Context context;

    public Report_Adapter(Context context , List<ReportPojo> reportList) {
        this.reportList = reportList;
        this.context = context;
    }

    @NonNull
    @Override
    public Report_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reportcard , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Report_Adapter.ViewHolder holder, int position) {

        holder.title.setText(reportList.get(position).getTitle());
        holder.cost.setText(reportList.get(position).getCost());
    }

    @Override
    public int getItemCount() {
        return reportList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,cost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            cost = itemView.findViewById(R.id.cost);
        }
    }
}
