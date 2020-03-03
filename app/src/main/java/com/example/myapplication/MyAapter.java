package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAapter extends RecyclerView.Adapter<MyAapter.ViewHolder> {
    private List<String>values;


    public MyAapter(List<String> myDataset){
        values=myDataset;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        LayoutInflater inflater= LayoutInflater.from ( parent.getContext () );
        View v= inflater.inflate ( R.layout.sinleitem,parent,false );
        ViewHolder vh= new ViewHolder ( v );

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder , final int position) {
        final  String   name = values.get ( position );
        holder.txtheader.setText ( name );
        holder.txtheader.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                remove (position);

            }
        } );
        holder.txtfooter.setText ( "king khaN"+name );

    }
    public void remove(int position){
        values.remove ( position );
        notifyItemRemoved ( position );
    }

    @Override
    public int getItemCount() {
        return values.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtheader;
        public TextView txtfooter;
        public View layout;


        public ViewHolder(@NonNull View itemView) {
            super ( itemView );
            txtheader =(TextView)itemView.findViewById ( R.id.maintext );
            txtfooter =(TextView)itemView.findViewById ( R.id.subtext );



        }
    }
}
