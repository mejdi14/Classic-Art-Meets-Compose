import kotlinx.serialization.Serializable

@Serializable
data class AgentData(

    val id: Int,
    val api_model: String,
    val api_link: String,
    val title: String,
    val sort_title: String,
    val alt_titles: List<String>,
    val birth_date: String,
    val birth_place: String,
    val death_date: String,
    val death_place: String,
    val description: String,
    val ulan_id: String,
    val is_artist: Boolean,
    val agent_type_title: String,
    val agent_type_id: Int,
    val artwork_ids: List<Int>,
    val site_ids: List<String>,
    val suggest_autocomplete_all: SuggestAutocompleteAll,
    val last_updated_source: String,
    val last_updated: String,
    val timestamp: String
)
