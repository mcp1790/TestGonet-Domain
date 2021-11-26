package mx.test.android.gonet.domainlib.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListMoviesModel(
    var results: List<MovieRawModel>,
) : Parcelable, BaseListModel() {
    constructor() : this(
        results = listOf<MovieRawModel>()
    )
}