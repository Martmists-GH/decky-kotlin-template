@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

external enum class SideMenu {
    None /* = 0 */,
    Main /* = 1 */,
    QuickAccess /* = 2 */
}

external enum class QuickAccessTab {
    Notifications /* = 0 */,
    RemotePlayTogetherControls /* = 1 */,
    VoiceChat /* = 2 */,
    Friends /* = 3 */,
    Settings /* = 4 */,
    Perf /* = 5 */,
    Help /* = 6 */,
    Decky /* = 7 */
}

external enum class DisplayStatus {
    Invalid /* = 0 */,
    Launching /* = 1 */,
    Uninstalling /* = 2 */,
    Installing /* = 3 */,
    Running /* = 4 */,
    Validating /* = 5 */,
    Updating /* = 6 */,
    Downloading /* = 7 */,
    Synchronizing /* = 8 */,
    ReadyToInstall /* = 9 */,
    ReadyToPreload /* = 10 */,
    ReadyToLaunch /* = 11 */,
    RegionRestricted /* = 12 */,
    PresaleOnly /* = 13 */,
    InvalidPlatform /* = 14 */,
    PreloadComplete /* = 16 */,
    BorrowerLocked /* = 17 */,
    UpdatePaused /* = 18 */,
    UpdateQueued /* = 19 */,
    UpdateRequired /* = 20 */,
    UpdateDisabled /* = 21 */,
    DownloadPaused /* = 22 */,
    DownloadQueued /* = 23 */,
    DownloadRequired /* = 24 */,
    DownloadDisabled /* = 25 */,
    LicensePending /* = 26 */,
    LicenseExpired /* = 27 */,
    AvailForFree /* = 28 */,
    AvailToBorrow /* = 29 */,
    AvailGuestPass /* = 30 */,
    Purchase /* = 31 */,
    Unavailable /* = 32 */,
    NotLaunchable /* = 33 */,
    CloudError /* = 34 */,
    CloudOutOfDate /* = 35 */,
    Terminating /* = 36 */
}

external interface AppOverview {
    var appid: String
    var display_name: String
    var display_status: DisplayStatus
    var sort_as: String
}

@Suppress("EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface Router {
    fun CloseSideMenus()
    fun OpenQuickAccessMenu(quickAccessTab: QuickAccessTab = definedExternally)
    fun GetQuickAccessTab(): QuickAccessTab
    fun Navigate(path: String)
    fun NavigateBackOrOpenMenu()
    fun NavigateToAppProperties()
    fun NavigateToBugForum()
    fun NavigateToExternalWeb(url: String)
    fun NavigateToHelp()
    fun NavigateToInvites()
    fun NavigateToRunningApp(replace: Boolean = definedExternally)
    fun NavigateToStorage()
    fun NavigateToStore()
    fun NavigateToStoreApp(appId: Number)
    fun NavigateToStoreApp(appId: String)
    fun NavigateToStoreFreeToPlay()
    fun NavigateToStoreManual()
    fun NavigateToStoreNewReleases()
    fun NavigateToStoreOnSale()
    fun ToggleSideMenu(sideMenu: SideMenu)
    fun OpenSideMenu(sideMenu: SideMenu)
    fun OpenPowerMenu(unknown: Any = definedExternally)

    companion object : Router by definedExternally
}
