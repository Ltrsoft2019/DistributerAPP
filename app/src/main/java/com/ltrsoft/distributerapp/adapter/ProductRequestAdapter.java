package com.ltrsoft.distributerapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ltrsoft.distributerapp.R;

import java.util.ArrayList;

public class ProductRequestAdapter extends RecyclerView.Adapter<ProductRequestAdapter.ViewHolder> {

    //This adapter class made for product request recycler view in distribute application..

    private Context context;
    private ArrayList<ProductRequestModel> productRequestModelArrayList ;//you need made pojo class for this adapter

    public ProductRequestAdapter(Context context , ArrayList<ProductRequestModel> productRequestModelArrayList)
    {
        this.context = context;
        this.productRequestModelArrayList = productRequestModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.product_request_row , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.productImage.setImageResource(productRequestModelArrayList.get(position).getProductImage());
        holder.tvProductName.setText(productRequestModelArrayList.get(position).getProductName());
        holder.tvProductIdCon.setText("Product Id :");
        holder.tvProductId.setText(productRequestModelArrayList.get(position).getProductId());

        holder.product_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Next activity", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return productRequestModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView productImage;
        private TextView tvProductName , tvProductId , tvProductIdCon;
        private CardView product_card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.productImage);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvProductId = itemView.findViewById(R.id.tvProductId);
            tvProductIdCon = itemView.findViewById(R.id.tvProductIdCon);
            product_card = itemView.findViewById(R.id.product_card);

        }
    }
}
