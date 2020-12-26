package kz.damirtokmashov.androidacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MoviesDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = MoviesDetailsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_movies_details, container, false)
    }

}