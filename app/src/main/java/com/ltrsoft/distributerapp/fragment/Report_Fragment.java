package com.ltrsoft.distributerapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ltrsoft.distributerapp.Adapters.Report_Adapter;
import com.ltrsoft.distributerapp.MainActivity;
import com.ltrsoft.distributerapp.R;
import com.ltrsoft.distributerapp.pojoclasses.ReportPojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Report_Fragment extends Fragment {

    List<ReportPojo> reportList;
    Report_Adapter reportAdapter;
    RecyclerView recyclerView;
    ReportPojo reportPojo;

    public Report_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.report_fragment, container, false);

        recyclerView= view.findViewById(R.id.report_recycler);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        reportList = new ArrayList<>();

        reportList.add(new ReportPojo("TOTAL SALES","12,628"));
        reportList.add(new ReportPojo("EXPENSES","2,250"));
        reportList.add(new ReportPojo("PROJECTS","23"));
        reportList.add(new ReportPojo("AVAILABLE DEVICES","2000"));
        reportList.add(new ReportPojo("INVOICES","4"));
        reportList.add(new ReportPojo("SOLD DEVICES","1,030"));
        reportList.add(new ReportPojo("UPCOMING DEVICES","5"));
        reportList.add(new ReportPojo("PENDING ORDERS","5"));




        recyclerView.setAdapter(new Report_Adapter(getContext() , reportList));


        return view;
    }
}