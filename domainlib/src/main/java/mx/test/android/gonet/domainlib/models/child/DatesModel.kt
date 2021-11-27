package mx.test.android.gonet.domainlib.models.child

import kotlinx.android.parcel.Parcelize

@Parcelize
data class DatesModel(
    var maximum: String,
    var minimum: String,
) {
    constructor() : this(
        maximum = "",
        minimum = ""
    )
}