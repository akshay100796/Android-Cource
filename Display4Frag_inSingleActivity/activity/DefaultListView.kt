package com.example.task19


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.task19.databinding.FragmentDefaultListViewBinding

class DefaultListView : Fragment() {

    private var binding : FragmentDefaultListViewBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  DataBindingUtil.inflate(layoutInflater,R.layout.fragment_default_list_view,
            null,false)

        binding?.idDefaultList?.adapter = activity?.applicationContext?.let {
            ArrayAdapter(it,android.R.layout.simple_list_item_1,resources.getStringArray(R.array.languages))
        }

        return binding?.root

    }
}