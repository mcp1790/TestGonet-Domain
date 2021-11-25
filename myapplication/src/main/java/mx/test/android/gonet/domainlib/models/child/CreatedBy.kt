package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CreatedBy(
    var creditId: String,
    var gender: Int,
    var id: Int,
    var name: String,
    var profilePath: String,
) : Parcelable {
    constructor() : this(
        creditId = "",
        gender = -1,
        id = -1,
        name = "",
        profilePath = ""
    )
}