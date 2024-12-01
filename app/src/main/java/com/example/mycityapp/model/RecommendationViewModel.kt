package com.example.mycityapp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R

class RecommendationViewModel : ViewModel() {

    private val _recommendations = MutableLiveData<List<Recommendation>>()
    val recommendations: LiveData<List<Recommendation>> = _recommendations
    fun loadRecommendations(category: String) {
        val sampleData = when (category) {
            "Coffee Shops" -> listOf(
                Recommendation(
                    "Esquires Coffee",
                    "Esquires Coffee is a global coffeehouse chain known for its high-quality, " +
                            "ethically sourced coffee and welcoming atmosphere. It offers a variety " +
                            "of drinks and food options, including vegan and gluten-free choices, " +
                            "while focusing on sustainability and community.",
                    R.drawable.esquires_coffee,
                    R.drawable.ec_food1,
                    R.drawable.ec_food2
                ),
                Recommendation(
                    "Pascal Coffee House",
                    "Pascal Coffee House is a cozy, welcoming café nestled in the heart of " +
                            "the city, known for its rich, aromatic blends and intimate ambiance. " +
                            "With its warm, rustic décor and carefully curated menu of specialty " +
                            "brews and homemade treats, it’s the perfect spot to unwind or catch up " +
                            "with friends.",
                    R.drawable.pascal_coffee_house,
                    R.drawable.pch_food1,
                    R.drawable.pch_food2
                ),
                Recommendation(
                    "Jungle Cafe Galway",
                    "Jungle Cafe in Galway offers a vibrant escape, blending tropical " +
                            "ambiance with cozy comfort. Nestled in the heart of the city, it serves " +
                            "a fusion of fresh, locally sourced dishes and refreshing beverages, all " +
                            "in a lush, jungle-inspired setting. ",
                    R.drawable.jungle_cafe_galway,
                    R.drawable.jcg_food1,
                    R.drawable.jcg_food2
            ),
                Recommendation(
                    "Coffee Werk + Press",
                    "Coffee Werk + Press is a cozy, vibrant café where the art of brewing " +
                            "meets the craft of conversation. Whether you're savoring a perfectly " +
                            "crafted espresso or enjoying a casual moment in its unique, industrial-chic " +
                            "space.",
                    R.drawable.coffee_werk___press,
                    R.drawable.cwp_food1,
                    R.drawable.cwp_food2
                )
            )
            "Restaurants" -> listOf(
                Recommendation(
                    "John Keogh's Gastropub",
                    "John Keogh's Gastropub is a charming blend of classic Irish warmth " +
                            "and contemporary flair, offering a cozy atmosphere with a menu that " +
                            "celebrates locally sourced ingredients. It's the perfect spot for those " +
                            "seeking both comfort and creativity in their dining experience. ",
                    R.drawable.john_keogh_s_gastropub,
                    R.drawable.jkg_food1,
                    R.drawable.jkg_food2
                ),
                Recommendation(
                    "The Quay Street Kitchen",
                    "It is a cozy, vibrant eatery that combines modern Irish cuisine with a " +
                            "warm, welcoming atmosphere. Known for its fresh, locally sourced ingredients, " +
                            "it offers a menu that blends traditional flavors with contemporary twists. ",
                    R.drawable.the_quay_street_kitchen,
                    R.drawable.qsk_food1,
                    R.drawable.qsk_food2
            ),
                Recommendation(
                    "O'Grady's on the Pier",
                    "O'Grady's on the Pier offers a cozy and scenic dining experience " +
                            "right by the water's edge in Limerick. Known for its fresh, locally " +
                            "sourced seafood and inviting atmosphere, it’s a hidden gem perfect for " +
                            "enjoying a relaxing meal with a view. ",
                    R.drawable.o_grady_s_on_the_pier,
                    R.drawable.ogp_food1,
                    R.drawable.ogp_food2
                ),
                Recommendation(
                    "Ruibin",
                    "Ruibin in Galway offers a cozy, contemporary dining experience with a " +
                            "focus on fresh, locally sourced ingredients. Known for its modern twist " +
                            "on traditional Irish dishes, the restaurant provides a warm, inviting " +
                            "atmosphere perfect for intimate meals or casual gatherings.",
                    R.drawable.ruibin,
                    R.drawable.rn_food1,
                    R.drawable.rn_food2
                )
            )
            "Shopping Centers" -> listOf(
                Recommendation(
                    "Galway Market",
                    "Galway Market, is a vibrant hub where local vendors and artisans " +
                            "come together to offer an eclectic mix of fresh produce, handmade " +
                            "crafts, and tasty street food. Set against the backdrop of Galway’s " +
                            "historic streets, the market buzzes with energy,providing a true " +
                            "taste of the city’s creativity and culture.",
                    R.drawable.galway_market,
                    R.drawable.gm_shop1,
                    R.drawable.gm_shop2
                ),
                Recommendation(
                    "Tiny Traders Village",
                    "Tiny Traders Village in Galway is a vibrant, community-focused " +
                            "marketplace showcasing local artisans, crafters, and food vendors. Known " +
                            "for its eclectic mix of handmade goods, art, vintage items, and delicious " +
                            "street food, it offers a unique and creative shopping experience.",
                    R.drawable.tiny_traders_village,
                    R.drawable.ttv_shop1,
                    R.drawable.ttv_shop2
                ),
                Recommendation(
                    "The Claddagh Ring Museum",
                    "The Claddagh Ring Museum in Galway celebrates the history of the iconic " +
                            "Claddagh ring, a symbol of love, loyalty, and friendship. Visitors can " +
                            "learn about their origins, and see demonstrations of traditional Irish " +
                            "jewelry-making.",
                    R.drawable.the_claddagh_ring_museum,
                    R.drawable.crm_shop1,
                    R.drawable.crm_shop2
                ),
                Recommendation(
                    "Thomas Dillon's Claddagh Gold",
                    "It is Ireland's oldest jewelry shop, established in 1750. Visitors can " +
                            "explore its small museum showcasing historical Claddagh rings and enjoy " +
                            "the shop’s legacy of fine craftsmanship and Irish heritage.",
                    R.drawable.thomas_dillon_s_claddagh_gold,
                    R.drawable.tdcg_shop1,
                    R.drawable.tdcg_shop2
                )
            )
            "Tourist Spots" -> listOf(
                Recommendation(
                    "Ride the Corrib Princess",
                    "The Corrib Princess is a scenic cruise boat that offers a relaxing " +
                            "journey along the River Corrib and Lough Corrib in Galway, Ireland. It " +
                            "provides stunning views of Galway’s countryside, historical landmarks, " +
                            "and wildlife.",
                    R.drawable.corrib_princess,
                    R.drawable.cp_tour1,
                    R.drawable.cp_tour2
                ),
                Recommendation(
                    "Day Trip to the Cliffs of Moher",
                    "A day trip to the Cliffs of Moher from Galway offers breathtaking views " +
                            "of Ireland's rugged coastline. Visitors can enjoy scenic walks, learn " +
                            "about the area's history at the visitor center, and experience the wild " +
                            "charm of the country.",
                    R.drawable.day_trip_to_the_cliffs_of_moher,
                    R.drawable.cm_tour1,
                    R.drawable.cm_tour2
                ),
                Recommendation(
                    "Walk through Eyre Square",
                    "It features lush greenery, historical monuments, and artistic sculptures, " +
                            "including the iconic Browne Doorway and Galway Hooker sails. A walk through " +
                            "Eyre Square offers a mix of modern urban life shops, and street performers " +
                            "creating a lively atmosphere.",
                    R.drawable.walk_through_eyre_square,
                    R.drawable.es_tour1,
                    R.drawable.es_tour2
                ),
                Recommendation(
                    "Admire the Galway Cathedral",
                    "The Galway Cathedral, located in Galway, Ireland, is a stunning example " +
                            "of Romanesque and Gothic architecture. Completed in 1965, it stands as " +
                            "one of the largest and most impressive buildings in the city",
                    R.drawable.admire_the_galway_cathedral,
                    R.drawable.gc_tour1,
                    R.drawable.gc_tour2
                )
            )
            else -> emptyList()
        }
        _recommendations.value = sampleData
    }
}
