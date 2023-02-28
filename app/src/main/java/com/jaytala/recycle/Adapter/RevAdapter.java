package com.jaytala.recycle.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jaytala.recycle.MainActivity;
import com.jaytala.recycle.Modal.RevModal;
import com.jaytala.recycle.R;

import java.util.ArrayList;

public class RevAdapter extends RecyclerView.Adapter<RevAdapter.ViewHolder>{

    MainActivity mainActivity;
    ArrayList<RevModal> arrayList;

    public RevAdapter(MainActivity mainActivity, ArrayList<RevModal> arrayList) {

        this.mainActivity=mainActivity;
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_rev,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }
 
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(arrayList.get(position).getName());
        holder.textView1.setText(arrayList.get(position).getSurname());

    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    
        TextView textView = itemView.findViewById(R.id.tvname);
        TextView textView1 = itemView.findViewById(R.id.tvsurname);
    }
}