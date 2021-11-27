package mx.test.android.gonet.domainlib.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import mx.test.android.gonet.domainlib.models.child.GenreModel

@Parcelize
data class TvShowRawModel(
    var backdropPath: String,
    var firstAirDate: String,
    var genres: List<GenreModel>,
    var id: Int,
    var name: String,
    var originCountry: List<String>,
    var originalLanguage: String,
    var originalName: String,
    var overview: String,
    var popularity: Double,
    var posterPath: String,
    var voteAverage: Double,
    var voteCount: Int,
) : Parcelable {
    constructor() : this(
        backdropPath = "",
        firstAirDate = "",
        genres = listOf<GenreModel>(),
        id = -1,
        name = "",
        originCountry = listOf<String>(),
        originalLanguage = "",
        originalName = "",
        overview = "",
        popularity = -1.0,
        posterPath = "",
        voteAverage = -1.0,
        voteCount = -1
    )
}