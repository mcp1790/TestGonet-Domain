package mx.test.android.gonet.domainlib.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListTvShowsModel(
    var results: List<TvShowRawModel>,
) : Parcelable, BaseListModel() {
    constructor() : this(
        results = listOf<TvShowRawModel>()
    )
}