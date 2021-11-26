package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductionCompanyModel(
    var id: Int,
    var logoPath: String,
    var name: String,
    var originCountry: String,
) : Parcelable {
    constructor() : this(
        id = -1,
        logoPath = "",
        name = "",
        originCountry = "",
    )
}