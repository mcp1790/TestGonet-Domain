package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LastEpisodeToAir(
    var airDate: String,
    var episodeNumber: Int,
    var id: Int,
    var name: String,
    var overview: String,
    var productionCode: String,
    var seasonNumber: Int,
    var stillPath: String,
    var voteAverage: Double,
    var voteCount: Int,
) : Parcelable {
    constructor() : this(
        airDate = "",
        episodeNumber = -1,
        id = -1,
        name = "",
        overview = "",
        productionCode = "",
        seasonNumber = -1,
        stillPath = "",
        voteAverage = -1.0,
        voteCount = -1
    )
}