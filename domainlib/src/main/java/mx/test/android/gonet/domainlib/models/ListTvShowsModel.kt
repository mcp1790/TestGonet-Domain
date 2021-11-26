package mx.test.android.gonet.domainlib.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListTvShowsModel(
    var results: List<TvShowRawModel>,
    var page: Int,
    var totalPages: Int,
    var totalResults: Int
) : Parcelable{
    constructor() : this(
        results = listOf<TvShowRawModel>(),
        page = -1,
        totalPages = -1,
        totalResults = -1
    )
}