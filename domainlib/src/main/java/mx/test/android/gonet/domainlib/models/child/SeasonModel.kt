package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SeasonModel(
    var airDate: String,
    var episodeCount: Int,
    var id: Int,
    var name: String,
    var overview: String,
    var posterPath: String,
    var seasonNumber: Int,
) : Parcelable {
    constructor() : this(
        airDate = "",
        episodeCount = -1,
        id = -1,
        name = "",
        overview = "",
        posterPath = "",
        seasonNumber = -1,
    )
}