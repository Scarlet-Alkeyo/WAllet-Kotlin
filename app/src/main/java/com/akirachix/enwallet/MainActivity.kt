package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displaywallet()
    }
    fun displayConatcts(){

        val  wallet1 =wallet("Money in","kes 2000","")
        val  wallet2 =wallet("Money out","kes 3000","")
        val  wallet3 =wallet("Transaction","kes 400","")
        val  wallet4 =wallet("Abram","0786752345","@abram.com","")
        val  wallet5 =wallet("Abram","0786752345","@abram.com","")
        val  wallet6 =wallet("John","0786457345","@abram.com","")
        val  wallet7 =wallet("Alice","0786457345","@abram.com","")
        val  wallet8 =wallet("Alice","0786457345","@abram.com","")





        val walletList = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8)
        val WalettAdapter=WalettAdapter(walletList)
        binding.rvWallet.adapter=WalletAdapter

    }
}
}