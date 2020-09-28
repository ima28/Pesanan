package com.example.pesan.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
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
                Glide.with(viewHolder.itemView)
                        .load("https://awsimages.detik.net.id/community/media/visual/2017/10/09/c699ee52-da4d-49cb-bbd5-206c02badb64.jpg?a=1")
                        .into(viewHolder.imageViewBackground);
                break;

            case 1:
                Glide.with(viewHolder.itemView)
                        .load("https://majalahayah.com/wp-content/uploads/2020/01/mie-goreng-saus-tiram.jpg")
                        .into(viewHolder.imageViewBackground);
                break;

            default:
            case 2:
                Glide.with(viewHolder.itemView)
                        .load("https://majalahayah.com/wp-content/uploads/2020/01/mie-goreng-saus-tiram.jpg")
                        .into(viewHolder.imageViewBackground);

        }

    }

    @Override
    public int getCount() {
        return 10;
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

