package kz.damirtokmashov.androidacademy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class MoviesListFragment : Fragment() {

    lateinit var imageView:ImageView

    companion object {
        fun newInstance() = MoviesListFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragment2 : MoviesDetailsFragment = MoviesDetailsFragment.newInstance()
        val fragmentManager = (activity as FragmentActivity).supportFragmentManager

        var binding = inflater.inflate(R.layout.fragment_movies_list, container, false)
        imageView = binding.findViewById(R.id.imageView)
        imageView.setOnClickListener {
            fragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment2, "fragment_name")
                .commit()
        }
        return binding



    }


}