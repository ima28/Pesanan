package com.example.pesan.Model;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.pesan.R;

public class ImageAdapter extends PagerAdapter {

    private Context mContext;

    public ImageAdapter(Context context){
        this.mContext = context;
    }
    @Override
    public int getCount() {
        return sliderImageid.length;
    }

    private int[] sliderImageid = new int[]{
            R.drawable.dom,
            R.drawable.vp2,
            R.drawable.vp1,
    };

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mImageView.setImageResource(sliderImageid[position]);
        container.addView(mImageView,0);
        return mImageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
