package mx.test.android.gonet.domainlib.models.child

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SpokenLanguageModel(
    var englishName: String,
    var iso6391: String,
    var name: String,
) : Parcelable {
    constructor() : this(
        englishName = "",
        iso6391 = "",
        name = ""
    )
}