package com.example.proyekpmob.fragment

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.proyekpmob.R
import com.example.proyekpmob.databinding.FragmentDetailParkiranListDialogItemBinding
import com.example.proyekpmob.databinding.FragmentDetailParkiranListDialogBinding
import com.google.android.material.tabs.TabLayoutMediator

class DetailParkiranFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentDetailParkiranListDialogBinding? = null


    private val binding get() = _binding!!
    private lateinit var viewDetailAdapter: AdapterDetailFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailParkiranListDialogBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDetailAdapter = AdapterDetailFragment(this)

        with(binding){
            viewPager2.adapter = viewDetailAdapter
            TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
                when(position){
                    0 -> tab.text = "Detail"
                    1 -> tab.text = "Foto Sekitar"
                }

            }.attach()
        }



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG,"Ini ada di onCreate Detail Parkiran")
    }

    override fun onStart() {
        super.onStart()
        Log.d(ContentValues.TAG,"Ini ada di onStart Detail Parkiran")
    }
    override fun onResume() {
        super.onResume()
        Log.d(ContentValues.TAG,"Ini ada di onResume Detail Parkiran")
    }
    override fun onPause() {
        super.onPause()
        Log.d(ContentValues.TAG,"Ini ada di onPause Detail Parkiran")
    }
    override fun onStop() {
        super.onStop()
        Log.d(ContentValues.TAG,"Ini ada di onStop Detail Parkiran")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ContentValues.TAG,"Ini ada di onDestroy Detail Parkiran")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}