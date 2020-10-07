package com.example.pesan.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.pesan.Activity.Akun;
import com.example.pesan.Activity.Tentang;
import com.example.pesan.R;

public class LainFragment extends Fragment {
    ListView lv;
    Button btnakun,btnlogout,btntentang;
    View view;

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

    public void onCreateView(LayoutInflater inflater, Bundle savedInstanceState, ViewGroup container) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragmentlainnya, container, false);
        lv.findViewById(R.id.list);
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
    }





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
       // }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the l ayout for this fragment
        return inflater.inflate(R.layout.fragmentlainnya, container, false);
    }
}**/
