package com.example.proyekpmob

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.proyekpmob.databinding.ActivityMainBinding
import com.example.proyekpmob.fragment.CariParkiran
import com.example.proyekpmob.fragment.DetailParkiranFragment
//import com.example.proyekpmob.fragment.DetailParkiran
import com.example.proyekpmob.fragment.RiwayatParkir
import com.example.proyekpmob.fragment.UserDetailFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity() {
    private lateinit var menuQRScan: NavigationBarView
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentManager: FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        menuQRScan = binding.bottomNavigation

        menuQRScan.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_parkiran -> {
                    toFragment(CariParkiran())
                    true
                }
                R.id.menu_riwayat -> {
                    toFragment(RiwayatParkir())
                    true
                }
                R.id.menu_user -> {
                    toFragment(UserDetailFragment())
                    true
                }

                else -> false
            }
        }

        Log.d(TAG, "Ini ada di onCreate Main Activity")
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Ini ada di onStart Main Activity")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Ini ada di onResume Main Activity")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Ini ada di onPause Main Activity")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Ini ada di onStop Main Activity")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Ini ada di onRestart Main Activity")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Ini ada di onDestroy Main Activity")
    }

    private fun toFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(binding.fragmentContainerView.id, fragment).commit()
    }

    private fun showBottomSheetDialog(dialogFragment: BottomSheetDialogFragment) {
        val bottomSheetDialog: DetailParkiranFragment = DetailParkiranFragment()
        bottomSheetDialog.show(supportFragmentManager, "Bottom Sheet Dialog Fragment")

    }

}