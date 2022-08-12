import com.example.core.network.model.Contexts
import kotlinx.serialization.Serializable

@Serializable
data class SuggestAutocompleteAll(
    val input: List<String>,
    val weight: Int,
    val contexts: Contexts
)
