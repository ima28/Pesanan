package com.example.pesan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.pesan.Activity.Akun;
import com.example.pesan.Activity.Tentang;
import com.example.pesan.R;

public class LainFragment extends Fragment {
    ArrayAdapter<String> a;
    ListView listview;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentLain.
     */
    int[] iconList = new int[]{
            R.drawable.account,
            R.drawable.about,
            R.drawable.logout
    };

    String[] Headline = {"Account",
            "About Us",
            "Logout"
    };
    String[] Subhead = {"Edit Profil", "Tentang Perusahaan",
            "Keluar"

    };

    // TODO: Rename and change types and number of parameters
    public static LainFragment newInstance(String param1, String param2) {
        LainFragment fragment = new LainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater i, ViewGroup c, Bundle s) {
        View rootView = i.inflate(R.layout.fragmentlainnya, c, false);

        listview = (ListView)rootView.findViewById(R.id.list);

        // ArrayAdapter<T> = T Tergantung Dari Tipe Data Variabel,
        // Jika String Maka Isi String, Jika Integer Maka Tulis Integer
        a = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Headline);
        //ListAdapter la = new ListAdapter(this,iconList,Headline,Subhead);
        // set data
        listview.setAdapter(a);
        // klik item array
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pa, View v, int p, long id) {
               if (p == 0){
                    // klik intent
                    Intent i = new Intent(getActivity(), Akun.class);
                    i.putExtra("varEmployee", Headline[p]);
                    startActivity(i);
                }
               if (p == 1){
                   Intent in = new Intent(getActivity(), Tentang.class);
                   in.putExtra("varEmployee", Headline[p]);
                   startActivity(in);
               }
            }
        });

        return rootView;
    }
}

/**lv.findViewById(R.id.list);
ListAdapter listAdapter = new com.example.pesan.Adapter.ListAdapter(this, iconList, Headline, Subhead);
lv.setAdapter((android.widget.ListAdapter) listAdapter);
lv.setOnClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        if (position == 0) {
            Intent intent = new Intent(view.getContext(), Akun.class);
            startActivityForResult(intent, 0);
        }

        if (position == 2) {
            Intent i = new Intent(view.getContext(), Tentang.class);
            startActivityForResult(i, 0);

        }
        Toast.makeText(getApplicationContext(),
                "You have selected : " + Headline[position],
                Toast.LENGTH_SHORT).show();
    }
});
}
}*/





        /**btnakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnakun();
                return;
            }
        });

            btnlogout = (Button) btnlogout.findViewById(R.id.btnlogout);
            btnlogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    return;
                }
            });

            btntentang = (Button) btntentang.findViewById(R.id.btntentang);
            btntentang.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    btntentang();
                }
            });


        }

    private void btntentang() {
        Intent i1 = new Intent(getActivity(),Tentang.class);
        startActivity(i1);
        return;
    }

    private void btnakun() {
        Intent i2 = new Intent(getActivity(),Akun.class);
        startActivity(i2);
        return;
    }

       // if (getArguments() != null) {
            //mParam1 = getArguments().getString(ARG_PARAM1);
         //   mParam2 = getArguments().getString(ARG_PARAM2);
       // }*/






