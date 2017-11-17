package jonesrandom.smartphoneflagship;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jonesrandom on 10/24/17.
 *
 */

class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {

    private List<ModelSmartphone> data;
    private OnItemClickListener listener;

    Adapter(List<ModelSmartphone> data, OnItemClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_smartphone , parent , false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.bind(data.get(position) , listener);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.row_icon)
        ImageView icon;

        @BindView(R.id.row_nama)
        TextView nama;

        @BindView(R.id.row_harga)
        TextView harga;

        MyHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }

        void bind(final ModelSmartphone data, final OnItemClickListener listener) {

            icon.setImageResource(data.getGambar());
            nama.setText(data.getNama());
            harga.setText(data.getHarga());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) listener.onClick(data);
                }
            });
        }
    }

    interface OnItemClickListener {
        void onClick(ModelSmartphone smartphone);
    }
}
