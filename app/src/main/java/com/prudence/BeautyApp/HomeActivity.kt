package com.prudence.BeautyApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prudence.BeautyApp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        CastView()
        setupBottomNav()
    }
    fun CastView(){
        binding.fcvHome
        binding.bottomNavigation

    }
    fun setupBottomNav(){
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.Product ->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome,ProductFragment())
                    transaction.commit()
                    true
                }
                R.id.Service->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome,ServiceFragment())
                    transaction.commit()
                    true
                }
                R.id.Booking->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,BookingFragment()).commit()
                    true
                }
                R.id.Profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
                    true
                }
                else->false
            }
        }
    }
}
