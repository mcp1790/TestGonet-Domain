package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductionCountry(
    var iso31661: String,
    var name: String,
) : Parcelable {
    constructor() : this(
        iso31661 = "",
        name = ""
    )
}