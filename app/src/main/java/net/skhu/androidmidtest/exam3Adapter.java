package net.skhu.androidmidtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class exam3Adapter extends RecyclerView.Adapter<exam3Adapter.ViewHolder>{

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(View view){
            super(view);
            textView = view.findViewById(R.id.textView1);
        }
    }

    LayoutInflater layoutInflater;
    ArrayList<String> arrayList;

    public exam3Adapter(Context context, ArrayList<String> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @Override
    public exam3Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.title, viewGroup, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull exam3Adapter.ViewHolder viewHolder, int index) {
        viewHolder.textView.setText(arrayList.get(index));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
