package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    String [] programNameList;
    String [] programPriceList;
    int [] images;

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        TextView rowName;
        TextView rowPrice;
        ImageView rowImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rowName=itemView.findViewById(R.id.txtview1);
            rowPrice=itemView.findViewById(R.id.txtview2);
            rowImage=itemView.findViewById(R.id.imageView1);
        }
    }

    public  ProgramAdapter(Context context,String []programNameList,String [] programPriceList,int []images)
    {
        this.context=context;
        this.programNameList=programNameList;
        this.programPriceList=programPriceList;
        this.images=images;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.single_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.rowName.setText("Name : "+programNameList[position]);
        holder.rowPrice.setText("Price   : "+programPriceList[position]+"$");
        holder.rowImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return programNameList.length;
    }


}
