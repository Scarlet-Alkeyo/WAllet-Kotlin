package com.akirachix.enwallet

import android.service.quickaccesswallet.WalletCard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.enwallet.databinding.WalletListItemBinding

class WalettAdapter {
}
override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder { var itemView=
    LayoutInflater.from(parent.context)
    .inflate(R.layout.wallet_list_item,parent,false)
    return  WalletViewHolder((itemView))
}

override fun getItemCount(): Int {
    return WalletList.size
}

override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
    val wallet=WalletList[position]
    holder.tvBalance.text =wallet.Balance
    holder.tvMoneyOut.text =wallet.MoneyOut
    holder.tvTransactioin.text=wallet.Transaction
}


}
class WalletViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var MoneyIn=itemView.findViewById<TextView>(R.id.tvMoneyIn )
    var tvMoneyOut = itemView.findViewById<TextView>(R.id.tvMoneyOut)
    var  tvBalance= itemView.findViewById<TextView>(R.id.tvBalance)


}