package com.prudence.salonapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prudence.salonapplication.databinding.ActivityHomeBinding

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
        binding.bnvHome

    }
    fun setupBottomNav(){
        binding.bnvHome.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.ivproduct ->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome,ProductFragment())
                    transaction.commit()
                    true
                }
                R.id.ivservice->{
                    val transaction=supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome,ServiceFragment())
                    transaction.commit()
                    true
                }
                R.id.ivbooking->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,BookingFragment()).commit()
                    true
                }
                R.id.ivprofile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
                    true
                }
                else->false
            }
        }
    }
}
