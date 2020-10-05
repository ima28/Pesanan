package com.example.pesan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.pesan.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class ImageAdapter extends SliderViewAdapter<ImageAdapter.SliderAdapterVH> {
    private Context context;

    public ImageAdapter(Context context){
        this.context=context;

    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragmenthome,null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        switch (position){
            case 0:
                viewHolder.imageViewBackground.setImageResource(R.drawable.db);
                break;
            case 1:
                viewHolder.imageViewBackground.setImageResource(R.drawable.nomad);
                break;
            default:
            case 2:
                viewHolder.imageViewBackground.setImageResource(R.drawable.produk);
                break;
        }

    }

    @Override
    public int getCount() {

        return 3;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {
        View itemView;
        ImageView imageViewBackground;
        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground=itemView.findViewById(R.id.iv_auto_image_slider);

            this.itemView=itemView;
        }
    }

}

