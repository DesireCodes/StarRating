package com.desirecodes.starrating

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.desirecodes.rating.RatingStarView

/**
 * Created by Danushke on 2024-02-02.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rsv_rating: RatingStarView = findViewById<View>(R.id.rsv_rating) as RatingStarView
        rsv_rating.setRating(1.5f)
    }
}