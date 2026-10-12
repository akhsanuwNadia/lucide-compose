package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudBackup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,15.25100040435791)
                curveTo(22.042572021484375,13.901710510253906,22.232955932617188,12.079051971435547,21.491727828979492,10.543437004089355)
                curveTo(20.750497817993164,9.007821083068848,19.204994201660156,8.023061752319336,17.5,8.0)
                lineTo(15.710000038146973,8.0)
                curveTo(14.932446479797363,5.404519081115723,12.726898193359375,3.4908416271209717,10.047710418701172,3.0870296955108643)
                curveTo(7.3685221672058105,2.6832175254821777,4.696902751922607,3.8617990016937256,3.1888797283172607,6.112793922424316)
                curveTo(1.6808565855026245,8.363788604736328,1.6072850227355957,11.282896995544434,3.0,13.607000350952148)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,11.0)
                lineTo(7.0,15.0)
                lineTo(11.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                curveTo(9.291291236877441,20.721721649169922,11.539427757263184,21.423986434936523,13.581138610839844,20.74341583251953)
                curveTo(15.622849464416504,20.062847137451172,17.0,18.152151107788086,17.0,16.0)
                curveTo(17.0,13.514719009399414,14.985280990600586,11.5,12.5,11.5)
                curveTo(11.221302032470703,11.49907398223877,9.994638442993164,12.00628662109375,9.09000015258789,12.90999984741211)
                lineTo(7.0,15.0)
            }
}

public val LucideIcons.All.CloudBackupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudBackup: ImageVector
    @Composable get() = CloudBackupDefinition.asImageVector()
