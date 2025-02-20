package sh.christian.ozone.user

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import sh.christian.ozone.api.ApiProvider
import sh.christian.ozone.app.Supervisor
import sh.christian.ozone.model.FullProfile

class MyProfileRepository(
  private val apiProvider: ApiProvider,
  private val userDatabase: UserDatabase,
) : Supervisor {
  private val profileFlow = MutableStateFlow<FullProfile?>(null)

  @OptIn(ExperimentalCoroutinesApi::class)
  override suspend fun CoroutineScope.onStart() {
    apiProvider.auth().flatMapLatest { auth ->
      auth?.did
        ?.let { did -> userDatabase.profile(UserReference.Did(did)) }
        ?: flowOf(null)
    }.collect(profileFlow)
  }

  fun me(): StateFlow<FullProfile?> = profileFlow

  fun isMe(userReference: UserReference): Boolean {
    return when (userReference) {
      is UserReference.Did -> userReference.did == profileFlow.value!!.did
      is UserReference.Handle -> userReference.handle == profileFlow.value!!.handle
    }
  }
}
