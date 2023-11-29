package com.example.proyekpmob.fragment

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proyekpmob.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RiwayatParkir.newInstance] factory method to
 * create an instance of this fragment.
 */
class RiwayatParkir : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.d(ContentValues.TAG,"Ini ada di onCreate Riwayat Parkir")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_riwayat_parkir, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RiwayatParkir.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RiwayatParkir().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onStart() {
        super.onStart()
        Log.d(ContentValues.TAG,"Ini ada di onStart Riwayat Parkir")
    }
    override fun onResume() {
        super.onResume()
        Log.d(ContentValues.TAG,"Ini ada di onResume Riwayat Parkir")
    }
    override fun onPause() {
        super.onPause()
        Log.d(ContentValues.TAG,"Ini ada di onPause Riwayat Parkir")
    }
    override fun onStop() {
        super.onStop()
        Log.d(ContentValues.TAG,"Ini ada di onStop Riwayat Parkir")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ContentValues.TAG,"Ini ada di onDestroy Riwayat Parkir")
    }
}