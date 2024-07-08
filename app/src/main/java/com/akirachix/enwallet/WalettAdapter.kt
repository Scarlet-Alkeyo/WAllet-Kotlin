package com.akirachix.enwallet

import android.service.quickaccesswallet.WalletCard
import android.view.LayoutInflater
import android.view.SurfaceControl.Transaction
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.enwallet.databinding.WalletListItemBinding
import org.w3c.dom.Text

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

}


}
class WalletViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var MoneyIn=itemView.findViewById<TextView>(R.id.tvMoneyIn )
    var tvMoneyOut = itemView.findViewById<TextView>(R.id.tvMoneyOut)
    var  tvBalance= itemView.findViewById<TextView>(R.id.tvBalance)
    var Transaction = itemView.findViewById<TextView>(R.id.tvTransaction)
    var salary = itemView.findViewById<TextView>(R.id.tvSalary)
    var rent  = itemView .findViewById<TextView>(R.id.tvREnt)
    var electricity =itemView.findViewById<TextView>(R.id.tvElectricity)
    var internet =itemView.findViewById<TextView>(R.id.tvINternet)
    var dividend = itemView.findViewById<TextView>(R.id.tvDividend



}