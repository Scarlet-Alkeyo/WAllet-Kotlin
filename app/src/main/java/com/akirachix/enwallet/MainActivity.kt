package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        displaywallet()
    }
    fun displayConatcts(){

        val  wallet1 =wallet("Abram","0786752345","@abram.com","")
        val  wallet2 =wallet("Abram","0786752345","@abram.com","")
        val  wallet3 =wallet("Abram","0786752345","@abram.com","")
        val  wallet4 =wallet("Abram","0786752345","@abram.com","")
        val  wallet5 =wallet("Abram","0786752345","@abram.com","")
        val  wallet6 =wallet("John","0786457345","@abram.com","")
        val  wallet7 =wallet("Alice","0786457345","@abram.com","")
        val  wallet8 =wallet("Alice","0786457345","@abram.com","")





        val walletList = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8)
        val contactAdapter=WalettAdapter(WalletList)
        binding.rvWallet.adapter=WalletAdapter

    }
}
}