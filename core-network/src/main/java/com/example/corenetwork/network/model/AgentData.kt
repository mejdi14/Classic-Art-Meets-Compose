
data class AgentData(

    var id: Int? = null,
    var apiModel: String? = null,
    var apiLink: String? = null,
    var title: String? = null,
    var sortTitle: String? = null,
    var altTitles: ArrayList<String> = arrayListOf(),
    var birthDate: Int? = null,
    var birthPlace: String? = null,
    var deathDate: String? = null,
    var deathPlace: String? = null,
    var description: String? = null,
    var ulanId: String? = null,
    var isArtist: Boolean? = null,
    var agentTypeTitle: String? = null,
    var agentTypeId: Int? = null,
    var artworkIds: ArrayList<Int> = arrayListOf(),
    var siteIds: ArrayList<String> = arrayListOf(),
    var suggestAutocompleteAll: SuggestAutocompleteAll?,
    var lastUpdatedSource: String? = null,
    var lastUpdated: String? = null,
    var timestamp: String? = null

)
