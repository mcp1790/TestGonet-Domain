package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DatesModel(
    var maximum: String,
    var minimum: String,
): Parcelable {
    constructor() : this(
        maximum = "",
        minimum = ""
    )
}