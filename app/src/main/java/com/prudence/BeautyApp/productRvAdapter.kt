package com.prudence.BeautyApp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.prudence.BeautyApp.databinding.ActivityHomeBinding.inflate
import com.squareup.picasso.Picasso

class productRvAdapter (var contactList:List<Product>): RecyclerView.Adapter<ProductViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var binding=productRvAdapter.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder:ProductViewHolder, position: Int) {
        var currentProduct=product.get(position)
        holder.binding.tvproduct.text=currentProduct.name
        holder.binding.btnButton.text=currentProduct.Buy

        Picasso.get()
            .load(currentProduct.Image)
            .resize(300,300)
            .centerCrop()
            .into(holder.binding.ivproduct)

        val context=holder.itemView.context
        holder.binding.ivcontact.setOnClickListener {
            Toast
                .makeText(context,"you have clicked an image", Toast.LENGTH_LONG)
                .show()
        }
        holder.binding.cvcontact.setOnClickListener {
            val intent= Intent(context,HomeActivity::class.java)
            intent.putExtra("IMAGE",currentProduct.image)
            intent.putExtra("PRODUCT",currentProduct.product)
            context.startActivity(intent)
            holder.binding.ivcontact.setOnClickListener{
                Toast.makeText(context,"You have clicked the person", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}
class ProductViewHolder(val binding: ): RecyclerView.ViewHolder(binding.root)
