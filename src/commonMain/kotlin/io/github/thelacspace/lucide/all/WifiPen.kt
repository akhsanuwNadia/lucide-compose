package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,8.82f)
                curveTo(7.694013f,3.7271194f,16.305986f,3.7271194f,22.0f,8.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378f,16.626f)
                curveTo(22.201212f,15.795392f,22.198215f,14.45562f,21.371298f,13.628702f)
                curveTo(20.54438f,12.801784f,19.204609f,12.798788f,18.374f,13.622f)
                lineTo(14.364f,17.633999f)
                curveTo(14.126247f,17.87162f,13.952221f,18.165333f,13.858001f,18.487999f)
                lineTo(13.021001f,21.357998f)
                curveTo(12.969882f,21.533262f,13.0183525f,21.722456f,13.147447f,21.851551f)
                curveTo(13.276542f,21.980646f,13.465735f,22.029118f,13.641001f,21.977999f)
                lineTo(16.511002f,21.140999f)
                curveTo(16.833668f,21.046778f,17.12738f,20.872751f,17.365002f,20.634998f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.859f)
                curveTo(7.772405f,10.143786f,11.865338f,9.277643f,15.5f,10.637f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.429f)
                curveTo(9.311152f,15.633013f,10.369272f,15.137107f,11.5f,15.023001f)
            }
}

public val LucideIcons.All.WifiPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiPen: ImageVector
    @Composable get() = WifiPenDefinition.asImageVector()
