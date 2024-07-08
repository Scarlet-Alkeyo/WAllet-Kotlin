package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding






class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvEnwallet.layoutManager = LinearLayoutManager(this)
        displayInfo()
    }
    fun displayInfo(){
        var  wallet = Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

        var  wallet2 = Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

        var  wallet3 = Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

        var  wallet4 = Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

        var  wallet5 = Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

        var  wallet6 = Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

        var  wallet7= Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

        var  wallet8= Wallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")
//



        var   walletList= listOf(wallet,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8)
        val  WalettAdapter =WalettAdapter(walletList)
        binding.rvEnwallet.adapter =  WalettAdapter





//

    }
}
