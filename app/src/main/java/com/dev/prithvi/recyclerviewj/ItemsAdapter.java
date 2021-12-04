package com.dev.prithvi.recyclerviewj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.itemViewHolder> {

    private String[] data;
    private String[] itemDesc;
    private String[] itemQuantity;
    private String[] itemPrice;

    public ItemsAdapter(String[] data, String[] itemDesc, String[] itemQuantity, String[] itemPrice) {
        this.data = data;
        this.itemDesc = itemDesc;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    @NotNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //creating view

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsAdapter.itemViewHolder holder, int position) {

        String title = data[position];
        String desc = itemDesc[position];
        String quantity = itemQuantity[position];
        String price = itemPrice[position];

        holder.textView.setText(title);
        holder.textView_desc.setText(desc);
        holder.textView_quantity.setText(quantity);
        holder.textView_price.setText(price);
    }

    @Override
    public int getItemCount() {
        return data.length; //pass the item count
    }

    public class itemViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView, textView_desc, textView_quantity, textView_price;

        public itemViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            textView = (TextView) itemView.findViewById(R.id.textView);
            textView_desc = (TextView) itemView.findViewById(R.id.textViewDesc);
            textView_quantity = (TextView) itemView.findViewById(R.id.textViewQuantity);
            textView_price = (TextView) itemView.findViewById(R.id.textViewPrice);


        }

    }

}
