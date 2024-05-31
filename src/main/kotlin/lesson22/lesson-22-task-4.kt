package lesson22



class MainScreenViewModel() {
    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false
    )

    var state: MainScreenState = MainScreenState("")


    fun loadData(){
        println(state.toString())
        state = state.copy(isLoading = true)
        println(state.toString())
        state = state.copy(data = "Some data")
        println(state.toString())
    }
}

fun main(){
    val model = MainScreenViewModel()
    model.loadData()
}