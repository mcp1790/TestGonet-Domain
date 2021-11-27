package mx.test.android.gonet.domainlib.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import mx.test.android.gonet.domainlib.models.child.DatesModel

@Parcelize
data class ListMoviesModel(
    var results: List<MovieRawModel>,
    var page: Int,
    var totalPages: Int,
    var totalResults: Int,
    var dates: List<DatesModel>
) : Parcelable{
    constructor() : this(
        results = listOf<MovieRawModel>(),
        page = -1,
        totalPages = -1,
        dates = listOf<DatesModel>(),
        totalResults = -1
    )
}