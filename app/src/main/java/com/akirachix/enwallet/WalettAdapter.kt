package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.enwallet.databinding.WalletListItemBinding








class WalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    class WalettAdapter(private val items: List<Wallet>) :
        RecyclerView.Adapter<WalletViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.wallet_list_item, parent, false)
            return WalletViewHolder(view)
        }


        override fun getItemCount(): Int {
            return items.size
        }

        override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
            val wallet = items[position]
//            holder.tvBalance.text = wallet.tvBalance
            holder.tvMoneyOut.text = wallet.tvMoneyOut
            holder.moneyIn.text = wallet.tvMoneyIn
            holder.rent.text = wallet.tvRent
            holder.salary.text = wallet.tvSalary
            holder.dividend.text = wallet.tvDividend
            holder.electricity.text = wallet.tvElectricity
        }
    }


    class WalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var moneyIn = itemView.findViewById<TextView>(R.id.tvMoneyin)
        var tvMoneyOut = itemView.findViewById<TextView>(R.id.tvMoneyOut)
//        var tvBalance = itemView.findViewById<TextView>(R.id.tvBalance)
        var transaction = itemView.findViewById<TextView>(R.id.tvTransaction)
        var salary = itemView.findViewById<TextView>(R.id.tvSalarary)
        var rent = itemView.findViewById<TextView>(R.id.tvREnt)
        var electricity = itemView.findViewById<TextView>(R.id.tvElectricity)
        var internet = itemView.findViewById<TextView>(R.id.tvINternet)
        var dividend = itemView.findViewById<TextView>(R.id.tvDividend)


    }
    }


