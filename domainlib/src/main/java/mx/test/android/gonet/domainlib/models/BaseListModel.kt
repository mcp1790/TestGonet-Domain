package mx.test.android.gonet.domainlib.models


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class BaseListModel(
    var page: Int,
    var totalPages: Int,
    var totalResults: Int
): Parcelable {
    constructor(): this(
        page = -1,
        totalPages = -1,
        totalResults = -1
    )
}