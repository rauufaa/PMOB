package com.example.proyekpmob.fragment

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.proyekpmob.R
import com.example.proyekpmob.databinding.FragmentUserDetailBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UserDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var opsi = listOf("Ganti Akun", "Keluar")
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentUserDetailBinding ?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUserDetailBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.list.adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1, opsi)



    }
    override fun onStart() {
        super.onStart()
        Log.d(ContentValues.TAG,"Ini ada di onStart User Detail")
    }
    override fun onResume() {
        super.onResume()
        Log.d(ContentValues.TAG,"Ini ada di onResume User Detail")
    }
    override fun onPause() {
        super.onPause()
        Log.d(ContentValues.TAG,"Ini ada di onPause User Detail")
    }
    override fun onStop() {
        super.onStop()
        Log.d(ContentValues.TAG,"Ini ada di onStop User Detail")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ContentValues.TAG,"Ini ada di onDestroy User Detail")
    }



}