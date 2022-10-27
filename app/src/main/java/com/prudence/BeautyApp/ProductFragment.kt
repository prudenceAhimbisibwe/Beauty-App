package com.prudence.BeautyApp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.prudence.BeautyApp.R
import com.prudence.BeautyApp.databinding.ActivityHomeBinding


class ProductFragment : Fragment() {
    lateinit var binding:ActivityHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }
    fun displayProducts(){
        var product=Product("Prudence","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var product1=Product("dallen","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var product2=Product("speria","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var product3=Product("Ashly","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var product4=Product("Annena","prudeahimbisibwe@gmail.com","0784027930","uganda","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id497864320?b=1&k=20&m=497864320&s=170667a&w=0&h=jPVYG0ckQ9ObWvY7GT7MVZvn7GHOJ7hivIP3e_W0tYc=")
        var productList= listOf(product,product1,product2,product3,product4)

        var contactRvAdapter=productRvAdapter(productList)
        binding.rvproducts.layoutManager= LinearLayoutManager(this)
        binding.rvProducts.adapter=productRvAdapter
    }

}
