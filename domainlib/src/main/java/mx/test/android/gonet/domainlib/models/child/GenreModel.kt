package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GenreModel(
    var id: Int,
    var name: String,
) : Parcelable {
    constructor() : this(
        id = -1,
        name = ""
    )
}