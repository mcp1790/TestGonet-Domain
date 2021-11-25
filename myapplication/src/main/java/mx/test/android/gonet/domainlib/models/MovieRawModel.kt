package mx.test.android.gonet.domainlib.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import mx.test.android.gonet.domainlib.models.child.Genre
import mx.test.android.gonet.domainlib.models.child.ProductionCompany
import mx.test.android.gonet.domainlib.models.child.ProductionCountry
import mx.test.android.gonet.domainlib.models.child.SpokenLanguage

@Parcelize
data class MovieRawModel(
    var adult: Boolean,
    var backdropPath: String,
    var budget: Int,
    var genres: List<Genre>,
    var homepage: String,
    var id: Int,
    var imdbId: String,
    var originalLanguage: String,
    var originalTitle: String,
    var overview: String,
    var popularity: Double,
    var posterPath: String,
    var productionCompanies: List<ProductionCompany>,
    var productionCountries: List<ProductionCountry>,
    var releaseDate: String,
    var revenue: Int,
    var runtime: Int,
    var spokenLanguages: List<SpokenLanguage>,
    var status: String,
    var tagline: String,
    var title: String,
    var video: Boolean,
    var voteAverage: Double,
    var voteCount: Int,
) : Parcelable {
    constructor() : this(
        adult = false,
        backdropPath = "",
        budget = -1,
        genres = listOf<Genre>(),
        homepage = "",
        id = -1,
        imdbId = "",
        originalLanguage = "",
        originalTitle = "",
        overview = "",
        popularity = -1.0,
        posterPath = "",
        productionCompanies = listOf<ProductionCompany>(),
        productionCountries = listOf<ProductionCountry>(),
        releaseDate = "",
        revenue = -1,
        runtime = -1,
        spokenLanguages = listOf<SpokenLanguage>(),
        status = "",
        tagline = "",
        title = "",
        video = false,
        voteAverage = -1.0,
        voteCount = -1
    )
}